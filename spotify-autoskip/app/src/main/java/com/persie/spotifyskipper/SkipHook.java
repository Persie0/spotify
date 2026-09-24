package com.persie.spotifyskipper;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * UNCOMPILED SCAFFOLD — see README. Fires Spotify's genuine timed Skip Ad
 * signal in-process as soon as it becomes available during an ad.
 *
 * Verified against Spotify 9.1.84.2205 (Ultra/analysis docs):
 * - p.hrw implements p.p8p0; mo48412a(h8p0) -> Single (12-visitor dispatch incl. zqw/Signal)
 * - p.b8p0 extends p.h8p0; single ctor (Object) taking the SignalCommand
 * - com.spotify.player.model.AutoValue_PlayerState.signals() -> List<String>
 * - fire rule: signals() contains "skip-ad" AND current track is an ad
 */
public final class SkipHook implements IXposedHookLoadPackage {

    private static final String TAG = "[spotify-autoskip]";
    private static final String SPOTIFY = "com.spotify.music";

    /** Captured p8p0 (hrw) instance. Volatile: written on UI thread, read anywhere. */
    private static volatile Object playerCommands;

    /** Latch: one fire per ad-readiness episode; rearms when "skip-ad" disappears. */
    private static final AtomicBoolean fired = new AtomicBoolean(false);
    private static final AtomicBoolean inFlight = new AtomicBoolean(false);
    private static volatile boolean loggedTrackShape;

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!SPOTIFY.equals(lpparam.packageName)) {
            return;
        }
        final ClassLoader cl = lpparam.classLoader;

        // H1: capture the p8p0 implementation (hrw ctor: (Object, Object, boolean)).
        try {
            XposedHelpers.findAndHookConstructor(
                    "p.hrw", cl, Object.class, Object.class, boolean.class,
                    new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) {
                            playerCommands = param.thisObject;
                        }
                    });
        } catch (Throwable t) {
            XposedBridge.log(TAG + " hrw capture hook failed: " + t);
        }

        // H2: readiness observer on the concrete PlayerState impl.
        try {
            XposedHelpers.findAndHookMethod(
                    "com.spotify.player.model.AutoValue_PlayerState", cl,
                    "signals",
                    new XC_MethodHook() {
                        @Override
                        @SuppressWarnings("unchecked")
                        protected void afterHookedMethod(MethodHookParam param) {
                            Object result = param.getResult();
                            if (!(result instanceof List)) {
                                return;
                            }
                            boolean ready = ((List<?>) result).contains("skip-ad");
                            if (!ready) {
                                fired.set(false);
                                return;
                            }
                            if (fired.get() || !isAd(param.thisObject, cl)) {
                                return;
                            }
                            fire(cl);
                        }
                    });
        } catch (Throwable t) {
            XposedBridge.log(TAG + " signals observer hook failed: " + t);
        }
    }

    private static void fire(ClassLoader cl) {
        Object p8p0 = playerCommands;
        if (p8p0 == null || !inFlight.compareAndSet(false, true)) {
            return;
        }
        try {
            Class<?> signalCmd = Class.forName(
                    "com.spotify.player.model.command.SignalCommand", false, cl);
            Object cmd = signalCmd.getMethod("create", String.class).invoke(null, "skip-ad");

            Class<?> b8p0 = Class.forName("p.b8p0", false, cl);
            Constructor<?> ctor = null;
            for (Constructor<?> c : b8p0.getDeclaredConstructors()) {
                if (c.getParameterTypes().length == 1) {
                    ctor = c;
                    break;
                }
            }
            if (ctor == null) {
                return;
            }
            ctor.setAccessible(true);
            Object h8p0 = ctor.newInstance(cmd);

            Object single = XposedHelpers.callMethod(p8p0, "mo48412a", h8p0);
            Object completable = XposedHelpers.callMethod(single, "ignoreElement");
            XposedHelpers.callMethod(completable, "subscribe");
            fired.set(true);
            XposedBridge.log(TAG + " fired skip-ad (genuine Signal path)");
        } catch (Throwable t) {
            XposedBridge.log(TAG + " fire failed: " + t);
        } finally {
            inFlight.set(false);
        }
    }

    /**
     * Best-effort in-process ad check: PlayerState.track() -> ContextTrack metadata
     * key "is_advertisement" == "true". Logs the track object's shape once so the
     * mapping can be corrected per build. Fail-closed (false) on any surprise.
     */
    private static boolean isAd(Object playerState, ClassLoader cl) {
        try {
            Object track = XposedHelpers.callMethod(playerState, "track");
            if (track == null) {
                return false;
            }
            if (!loggedTrackShape) {
                loggedTrackShape = true;
                XposedBridge.log(TAG + " track class: " + track.getClass().getName());
            }
            // Optional-like wrapper (xul0): unwrap if present.
            try {
                Object present = XposedHelpers.callMethod(track, "isPresent");
                if (present instanceof Boolean && !((Boolean) present)) {
                    return false;
                }
                track = XposedHelpers.callMethod(track, "get");
            } catch (Throwable ignored) {
                // Not a wrapper; use as-is.
            }
            Object metadata = XposedHelpers.callMethod(track, "metadata");
            if (metadata instanceof Map) {
                Object v = ((Map<?, ?>) metadata).get("is_advertisement");
                return "true".equals(String.valueOf(v));
            }
            Object v = XposedHelpers.callMethod(metadata, "get", "is_advertisement");
            return "true".equals(String.valueOf(v));
        } catch (Throwable t) {
            return false;
        }
    }
}
