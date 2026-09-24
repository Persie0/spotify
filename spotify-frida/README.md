# Spotify Autoskip — Frida script (root only, no LSPosed)

Same auto-skip as `../spotify-autoskip`, but driven from a laptop over
Frida instead of an on-device Xposed module. Needs a **rooted** device
(Magisk `su` or KernelSU) to run `frida-server`, plus the Frida client
(`pip install frida-tools`) on a matching-arch `frida-server` binary from
the Frida releases page.

Status: **UNTESTED script.** Hook points are DEX-verified
(`../analysis/adblock-inprocess-hook-spec.md`); nothing here has run against
a live app.

## Run

```bash
# one-time: match the binary to the device arch (arm64-v8a usually)
adb push frida-server-*-android-arm64 /data/local/tmp/frida-server
adb shell "su -c 'chmod 755 /data/local/tmp/frida-server'"

# each session (KernelSU: replace `su -c` with the KSU su as needed)
adb shell "su -c '/data/local/tmp/frida-server &'"
frida -U -f com.spotify.music -l skip.js --no-pause
```

Play Spotify until an ad with a Skip Ad countdown appears. On readiness the
script logs `[spotify-autoskip] fired skip-ad` and the ad should end early.
Watch for `[spotify-autoskip] track class:` on first sight — if `isAd()`
guesses the wrapper shape wrong it fail-closes (logs, never fires); fix the
mapping in `skip.js` accordingly.

## Fire rule (same as the module)

Fire **iff** `PlayerState.signals()` contains `"skip-ad"` **and** the current
track metadata has `is_advertisement == "true"`, at most once per episode
(rearms when the signal disappears). The fired RPC is the genuine
`ContextPlayer/Signal("skip-ad")`, indistinguishable from a tap.

## Layout

```text
spotify-frida/
  skip.js    # the whole implementation (Java.perform hooks + fire logic)
  README.md  # this file
```

## Risks

Same as the module: `librootChecker.so` ships in Spotify (test on a
secondary account), milestone telemetry still reports each skip, obfuscated
names (`p.hrw`, `p.b8p0`, `AutoValue_PlayerState`) must be re-resolved per
Spotify release. Frida-server itself is trivially detectable by a hostile
app — fine for personal use, not stealth.
