package com.persie.spotifyskipper;

import android.util.Log;

import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * UNCOMPILED-BY-GRADLE SCAFFOLD (javac-checked against api:102.0.0) — see README.
 * Fires Spotify's genuine timed Skip Ad signal in-process as soon as it is
 * available during an ad. Verified hook points for 9.1.84-2205:
 * analysis/adblock-inprocess-hook-spec.md
 */
public final class SkipHook extends XposedModule {

    private static final String TAG = "spotify-autoskip";
    private static final String SPOTIFY = "com.spotify.music";

    private static volatile Object playerCommands; // p.hrw instance (p8p0 impl)
    private static final AtomicBoolean fired = new AtomicBoolean(false);
    private static final AtomicBoolean inFlight = new AtomicBoolean(false);
    private static volatile boolean loggedTrackShape;

    public SkipHook() {
        super();
    }

    private void log(int prio, String msg) {
        try {
            log(prio, TAG, msg);
        } catch (Throwable ignored) {
        }
    }

    @Override
    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam param) {
        if (!SPOTIFY.equals(param.getPackageName())) {
            return;
        }
        final ClassLoader cl;
        try {
            cl = param.getDefaultClassLoader();
        } catch (Throwable t) {
            log(Log.WARN, "no classloader: " + t);
            return;
        }

        // H1: capture p8p0 — hook every p.hrw constructor overload.
        // (p.xx41 decorates hrw; captured below. Raw hrw always exists first.)
        try {
            Class<?> hrw = Class.forName("p.hrw", false, cl);
            for (Constructor<?> ctor : hrw.getDeclaredConstructors()) {
                hook(ctor).intercept(chain -> {
                    Object result = chain.proceed();
                    if (playerCommands == null) {
                        playerCommands = chain.getThisObject();
                    }
                    return result;
                });
            }
            log(Log.INFO, "hrw capture installed");
        } catch (Throwable t) {
            log(Log.WARN, "hrw hook failed: " + t);
        }

        // H1b: prefer the decorated p8p0 (p.xx41 wraps hrw and adds a
        // subscribe-time yf41 side effect). Overwrites the raw capture so a
        // fire behaves exactly like the UI path, side effects included.
        try {
            Class<?> xx41 = Class.forName("p.xx41", false, cl);
            for (Constructor<?> ctor : xx41.getDeclaredConstructors()) {
                hook(ctor).intercept(chain -> {
                    Object result = chain.proceed();
                    playerCommands = chain.getThisObject();
                    return result;
                });
            }
            log(Log.INFO, "xx41 capture installed");
        } catch (Throwable t) {
            log(Log.WARN, "xx41 hook failed (non-fatal): " + t);
        }

        // H2: readiness observer on the concrete PlayerState impl.
        try {
            Class<?> ps = Class.forName(
                    "com.spotify.player.model.AutoValue_PlayerState", false, cl);
            Method signals = ps.getDeclaredMethod("signals");
            hook(signals).intercept(chain -> {
                Object list = chain.proceed();
                try {
                    boolean ready = list instanceof List
                            && ((List<?>) list).contains("skip-ad");
                    if (!ready) {
                        fired.set(false);
                        return list;
                    }
                    if (!fired.get() && isAd(chain.getThisObject())) {
                        fire(cl);
                    }
                } catch (Throwable t) {
                    log(Log.WARN, "observer failed: " + t);
                }
                return list;
            });
            log(Log.INFO, "signals observer installed");
        } catch (Throwable t) {
            log(Log.WARN, "signals hook failed: " + t);
        }
    }

    private void fire(ClassLoader cl) {
        Object p8p0 = playerCommands;
        if (p8p0 == null || !inFlight.compareAndSet(false, true)) {
            return;
        }
        try {
            Class<?> signalCmd = Class.forName(
                    "com.spotify.player.model.command.SignalCommand", false, cl);
            Object cmd = signalCmd.getMethod("create", String.class)
                    .invoke(null, "skip-ad");

            Class<?> b8p0 = Class.forName("p.b8p0", false, cl);
            Constructor<?> ctor = null;
            for (Constructor<?> c : b8p0.getDeclaredConstructors()) {
                if (c.getParameterTypes().length == 1) {
                    ctor = c;
                    break;
                }
            }
            if (ctor == null) {
                log(Log.WARN, "no 1-arg b8p0 ctor");
                return;
            }
            ctor.setAccessible(true);
            Object h8p0 = ctor.newInstance(cmd);

            Method a = null;
            for (Method m : p8p0.getClass().getMethods()) {
                if (m.getName().equals("mo48412a") && m.getParameterTypes().length == 1) {
                    a = m;
                    break;
                }
            }
            if (a == null) {
                log(Log.WARN, "mo48412a not found");
                return;
            }
            Object single = a.invoke(p8p0, h8p0);
            Object completable = single.getClass().getMethod("ignoreElement")
                    .invoke(single);
            completable.getClass().getMethod("subscribe").invoke(completable);
            fired.set(true);
            log(Log.INFO, "fired skip-ad (genuine Signal path)");
        } catch (Throwable t) {
            log(Log.WARN, "fire failed: " + t);
        } finally {
            inFlight.set(false);
        }
    }

    /** Calls the first existing zero-arg method from {@code names}. */
    private static Object callZeroArg(Object target, String... names)
            throws NoSuchMethodException {
        NoSuchMethodException last = null;
        for (String name : names) {
            try {
                return target.getClass().getMethod(name).invoke(target);
            } catch (NoSuchMethodException e) {
                last = e;
            } catch (Throwable t) {
                return null;
            }
        }
        throw last != null ? last : new NoSuchMethodException("(empty)");
    }

    /**
     * Best-effort in-process ad check: PlayerState.track() -> ContextTrack
     * metadata key "is_advertisement" == "true". Fail-closed. Logs the track
     * shape once for per-build correction.
     */
    private boolean isAd(Object playerState) {
        try {
            Method trackM = null;
            for (Method m : playerState.getClass().getMethods()) {
                if (m.getName().equals("track") && m.getParameterTypes().length == 0) {
                    trackM = m;
                    break;
                }
            }
            if (trackM == null) {
                return false;
            }
            Object track = trackM.invoke(playerState);
            if (track == null) {
                return false;
            }
            if (!loggedTrackShape) {
                loggedTrackShape = true;
                log(Log.INFO, "track class: " + track.getClass().getName());
            }
            try {
                // xul0 optional: c() == isPresent, b() == get in 9.1.84-2205
                // (decompiled p.xul0: mo49279c/mo49278b). Fall back to
                // proguard-kept names on other builds.
                Object present = callZeroArg(track, "c", "isPresent");
                if (present instanceof Boolean && !((Boolean) present)) {
                    return false;
                }
                track = callZeroArg(track, "b", "get");
                if (track == null) {
                    return false;
                }
            } catch (NoSuchMethodException e) {
                return false;
            }
            Object metadata;
            try {
                metadata = track.getClass().getMethod("metadata").invoke(track);
            } catch (NoSuchMethodException e) {
                return false;
            }
            if (metadata instanceof Map) {
                return "true".equals(String.valueOf(((Map<?, ?>) metadata).get("is_advertisement")));
            }
            try {
                Object v = metadata.getClass().getMethod("get", Object.class)
                        .invoke(metadata, "is_advertisement");
                return "true".equals(String.valueOf(v));
            } catch (NoSuchMethodException e) {
                return false;
            }
        } catch (Throwable t) {
            return false;
        }
    }
}
