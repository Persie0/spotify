# Adblock candidate: seek-to-end during ads — REJECTED (proven statically)

## Verdict (2026-09-25): REJECTED. Do not implement, no runtime test needed.

Two independent seals, both in decompiled Java:

1. **Command stripped:** `gjx.m44992A1` builds the available-command set (`a7p0`).
   During ads (`mo43901p() == true`, i.e. `!zMo43901p == false`), commands
   4–12 are all removed, including command **5 (seek)**:
   `m24989c(5, zMo43844K0 && !zMo43901p)`, and 8/9 (skip-next) likewise.
   So `ACTION_SEEK_TO` (`0x100`, from command 5) and `ACTION_SKIP_TO_NEXT`
   (`0x20`, from 8/9) are both absent from the MediaSession mask during ads.
2. **Execution ignores:** `gjx.mo44997c1` (concrete `ox8.mo44997c1`, reached via
   `onSeekTo → tpd0(f=1) → pdp0.mo43883f → ox8.m68197d1(5, j)` with NO
   pre-check, unlike skip-next) contains:
   ```java
   if (mo43901p()) {
       yif1.m93819w0("seekTo ignored because an ad is playing");
       ... return;  // seek dropped
   }
   ```
   Even an unadvertised `seekTo()` (actions are advisory; `onSeekTo` has no
   `W()` gate) is dropped at execution while an ad plays.

`mo43901p()` == "ad is playing" is confirmed by both the log string and the
command gating (seek/skip/4/6/7/10/11/12 all require `!ad`).

## Prior evidence (kept for provenance)

## What is proven statically

1. Ad items carry a `seekable` metadata flag. Native getter `+0xd8 = 0x14e24b8`
   (`add rdi,0x20`; key `\x10seekable` at `0x4389c8`; compare `true` at `0x451c20`).
   Siblings on the same ad-object interface (AP `0x1879950`): `+0xc8` raw `skippable`
   (`0x14e2472`), `+0xd0` derived predicate (`0x14e248a`), `+0xe0` `interruptible`
   (`0x14e24d0`, key `\x1ainterruptible`), `+0xe8` delay parser (`0x14e24e8`).
2. The restriction builder (`0x10a6464..0x10a7f52`) calls them virtually:
   `10a688e:+0xd8`, `10a68d4:+0xc8`, `10a69f2:+0xe8` (MFT branch),
   `10a7591:+0xd0`, `10a75df:+0xd8`, `10a762d:+0xe0` (ad branch).
3. During ads the builder inserts `ad_disallow` (string `0x36dd45`) into 7 slots —
   and NONE of them is seeking:
   `+0x14a0` skip-next, `+0x14b8` (schema `0xa8`), `+0x15c0` inserting-context,
   `+0x14d0` (schema `0xc0`), `+0x14e8` repeat-context (skipped if `+0xd0`),
   `+0x1488` skipping-prev (skipped if `+0xd8` seekable),
   `+0x15a8` inserting-next (skipped if `+0xe0` interruptible).
4. Full reason-field schema recovered from deserializer `fe9a77..fea5b8`
   (offsets: pausing `0x00`, resuming `0x18`, **seeking `0x30`**, peeking_prev `0x48`,
   peeking_next `0x60`, skipping_prev `0x78`, skipping_next `0x90`,
   repeat_context `0xd8`, repeat_track `0xf0`, shuffle `0x108`, set_queue `0x120`,
   add_to_queue `0x138`, interrupting `0x150`, transferring `0x168`,
   remote_control `0x180`, inserting_next `0x198`, inserting_context `0x1b0`,
   reordering_next `0x1c8`, reordering_context `0x1e0`, removing_next `0x1f8`,
   removing_context `0x210`, updating_context `0x228`).
   No builder write to the seeking slot exists (only the merge read
   `b499d2(dst=[r14+0x1808], src=[r14+0x1440])` at `0x10a7a45`).
5. Android path exists end to end: `pqd0.onSeekTo(J)` (smali `10466`) dispatches
   internal command **5** via `tpd0(f=1)` → `pdp0.mo43883f(long)` → wrapped player.
   Command 5 maps to action `0x100` (`ACTION_SEEK_TO`); the bit is stripped only if
   `!hasCommand(16) || pdp0.a1()` (`a1()` → player iface `g7p0.a1()`).

## What is NOT proven (the gap)

Whether the native Seek execution handler honors a seek to (or past) the ad's end
while an ad item is current: it may (a) complete the item early (ad skipped —
CANDIDATE WINS), (b) clamp inside the ad (useless), or (c) reject with an error
like `SKIP_TO_NEXT_RESTRICTED`. The `seekable` flag provably does NOT gate seeking
(it gates prev-skip); no other static gate was found — but absence of a restriction
is not proof the handler allows it.

## Falsification protocol (needs device + ad playback, ~5 minutes)

```bash
# 1. During a Spotify audio ad, dump MediaSession state:
adb shell dumpsys media_session | rg -A30 'com.spotify.music'
# Record: PlaybackState actions bitmask (is 0x100/SEEK_TO set?), metadata
# ADVERTISEMENT flag, duration/position.

# 2. From a test controller (or adb media_session dispatch), issue:
# MediaController.TransportControls.seekTo(<ad duration ms>)
# then observe: position jumps? ad ends early? error toast/logcat?

adb logcat -s SpotifyAdMuter | head
```

- If the ad ends early and music resumes → candidate CONFIRMED; implement
  opt-in `seekTo(duration)` on ad-detect when `0x100` is present, keeping mute
  as fallback, then re-verify across ad formats (audio vs embedded-podcast).
- If the seek clamps/rejects (position unchanged or error) → candidate REJECTED;
  verdict stays mute-only; record the observed behavior here.
- Also record the `seekable` value per ad if visible, and whether `0x100` was
  present — this decides the `hasCommand(16)`/`a1()` question empirically.

## Safety notes

- Do NOT auto-seek without the `0x100` bit present and a confirmed ad marker;
  blind seeks risk skipping user content.
- Early ad completion may alter ad reporting (`ended`/`skipped` milestones);
  backend cross-checks are out of scope here but should be noted before shipping.
- Mute remains the default regardless; seek would be an optimization, not a replacement.
