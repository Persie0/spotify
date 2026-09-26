#!/bin/bash
# MediaSession state-dump helper (read-only).
# NOTE: the seek hypothesis this was written for is REJECTED
# (analysis/adblock-seek-candidate.md: commands stripped during ads AND
# "seekTo ignored because an ad is playing"). Kept as an observation tool.
set -u
PKG=com.spotify.music

echo "=== 1. MediaSession state during ad ==="
adb shell dumpsys media_session | rg -B2 -A40 "$PKG" | head -n 80

echo
echo "=== 2. PlaybackState actions (look for 0x100 SEEK_TO) ==="
adb shell dumpsys media_session | rg -i "actions|state=" | head -n 10

echo
echo "=== 3. Metadata (ADVERTISEMENT flag, duration) ==="
adb shell dumpsys media_session | rg -i "advertisement|duration|media_id|media_uri" | head -n 10

echo
echo "=== 4. Attempt seekTo(ad_duration_ms) ==="
echo "Fill AD_DURATION_MS from step 3, then run:"
echo "  adb shell media_session dispatch seek-to <AD_DURATION_MS>  # if supported, else use an MCT test app"
echo "Observe: (a) ad ends early + music resumes = CANDIDATE CONFIRMED"
echo "         (b) position clamps / error / no-op = CANDIDATE REJECTED"
echo
echo "=== 5. Muter log ==="
adb logcat -d -s SpotifyAdMuter | tail -n 10
