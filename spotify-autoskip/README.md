# Spotify Autoskip — LSPosed module (scaffold)

True skip (ad gone, music resumes) by auto-firing Spotify's genuine timed
Skip Ad signal in-process. Companion to `../spotify-muter` (no-root mute);
this one needs LSPosed (Zygisk) + a rooted device (Magisk or KernelSU).

Status: **scaffold, javac-verified but never run.** `SkipHook.java` compiles
clean against `io.github.libxposed:api:102.0.0` + `android-36` (checked
2026-09-25); the Gradle build itself was never executed (no wrapper vendored)
and nothing here has run against a live app. Do not ship as-is.

## What it does

1. Captures the `p8p0` command API by hooking the `p.hrw` constructor.
2. Observes `AutoValue_PlayerState.signals()`; when the list contains
   `"skip-ad"` **and** the current track is an ad
   (`is_advertisement == "true"`), fires once per episode:
   `hrw.mo48412a(new b8p0(SignalCommand.create("skip-ad")))` → `ignoreElement()`.
3. Rearms when `"skip-ad"` disappears. Fail-closed everywhere (any surprise →
   no fire, log line).

Firing only at genuine readiness makes each RPC protocol-identical to a tap.

## Build (needs Android SDK + Gradle + a rooted test device)

```bash
cd spotify-autoskip
# generate a wrapper once (needs a local Gradle install), or open in Android Studio
gradle wrapper --gradle-version 8.10
./gradlew assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Then enable the module in LSPosed Manager scoped to `com.spotify.music`,
force-stop Spotify, and trigger an ad. Watch logcat/LSPosed logs for
`[spotify-autoskip]`.

Gradle setup mirrors `../spotify-muter` (AGP via version catalog there;
`compileOnly "de.robv.android.xposed:api:82"` here — legacy API, stable and
LSPosed-compatible).

## Before first run

- Re-resolve names per Spotify release: `hrw implements p8p0`,
  `SignalCommand.create`, `PlayerState.signals()`
  (see `../analysis/adblock-inprocess-hook-spec.md` §4).
- Check `adb logcat` for `[spotify-autoskip] track class:` — if the
  `isAd()` unwrap is wrong for the build, fix the mapping (fail-closed keeps
  it safe but silent).
- Test on a secondary account first (`librootChecker.so` ships in Spotify;
  milestone telemetry still reports every skip).

## Layout

```text
spotify-autoskip/
  settings.gradle  build.gradle  gradle.properties
  app/build.gradle  (compileOnly io.github.libxposed:api:102.0.0)
  app/src/main/AndroidManifest.xml  (xposedmodule meta)
  app/src/main/resources/META-INF/xposed/java_init.list  (modern entry point)
  app/src/main/java/com/persie/spotifyskipper/SkipHook.java
```
