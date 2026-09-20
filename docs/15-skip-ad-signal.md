# Skip Ad readiness and signal execution

This document isolates Spotify's timed **Skip Ad** path from ordinary next-track skipping.

## 1. Readiness begins in native ad timing state

The nested ad runtime object exposes:

```text
vtable +0xe8 -> skippable_ad_delay parser
vtable +0xd0 -> derived skippability predicate
```

For a positive delay, Orbit schedules an event named:

```text
ad_skip
```

at `delay * 1000` milliseconds. The concrete subtype-6 stores are at `0x139ba71` and `0x139be38`, both scheduling through `0x139c09a`.

When subtype 6 reaches the restriction/player owner at `0x10a9668`, it sets:

```text
adObject+0x1b8 = 1
```

and rebuilds player state/restrictions. The ad object's derived `+0xd0` predicate then returns true immediately.

## 2. Android does not infer Skip Ad readiness from the countdown

The public player state carries an explicit list of available signals.

In `analysis/smali-targets/p4h1.smali`:

```text
EsContextPlayerState.getSignalsCount()
EsContextPlayerState.getSignalsList()
    -> PlayerState.Builder.signals(...)
```

The Skip Ad state reducer in `g511.smali` performs the exact check:

```text
PlayerState.signals().contains("skip-ad")
```

The resulting Boolean is passed directly to the `jk21` Skip Ad UI-state constructor.

Therefore the Android button follows the player core's exported available-signal list. It does not locally decide that the countdown has expired.

## 3. Native Orbit owns the "skip-ad" signal name

`liborbit-jni-spotify.so` contains the exact string:

```text
skip-ad
```

at VA `0x34708a`, with three direct executable references.

### 3.1 Available-signal producer at 0xfd381a

The function `0xfd381a..0xfd38d6`:

1. accesses a current player/ad state object,
2. checks a local state byte at `+0x68`,
3. calls virtual slot `+0x140` on an object held at `+0x40`,
4. when the tested condition passes, constructs the literal `"skip-ad"`,
5. passes it to `0xd23a2c`, which is used here as the signal-collection insertion path.

This is the first native producer tied directly to the same string Android later sees in `PlayerState.signals()`.

The exact semantic identity of the `+0x140` predicate is still being decoded; it should not yet be renamed as a particular ad flag.

### 3.2 Incoming signal discriminator at 0xfd38d6

The immediately following function compares an incoming signal ID against the exact seven-byte string `"skip-ad"`.

On a match it calls the **same virtual slot `+0x140`** on the same state/interface family before selecting the subsequent dispatch path.

This gives a native symmetry:

```text
availability producer
    -> +0x140 predicate
    -> expose "skip-ad"

incoming Signal("skip-ad")
    -> compare exact signal ID
    -> +0x140 predicate
    -> dispatch / reject path
```

The shared predicate is therefore a high-value enforcement point for both advertisement signal availability and execution.

### 3.3 Secondary discriminator at 0x12044d8

A second native subsystem also compares an input string against `"skip-ad"` at `0x12044d8`.

When it matches, it invokes virtual slot `+0x68` on another interface and enters a dedicated processing path. This appears to be downstream signal/command handling, but the concrete owner type and exact transition are still under trace.

## 4. Android execution path

When the user activates Skip Ad, the UI creates:

```text
SignalCommand.create("skip-ad")
```

and sends it through:

```text
jo20
  -> p8p0
  -> b8p0(SignalCommand)
  -> hrw
  -> zqw
  -> EsSignalRequest$SignalRequest
  -> ClientBase.callSingle(
       "spotify.player.esperanto.proto.ContextPlayer",
       "Signal",
       request)
```

The ordinary next-track command goes through a separate `ContextPlayer / SkipNext` path.

Thus timed Skip Ad is not `MediaController.skipToNext()` and is not represented by Android's `ACTION_SKIP_TO_NEXT`.

## 5. Confirmed end-to-end architecture

```text
ad.skippable_ad_delay
        |
        v
native "ad_skip" timer
        |
        v
subtype 6
        |
        v
adObject+0x1b8 = 1
        |
        v
native player state recomputed
        |
        v
available signals include "skip-ad"
        |
        v
EsContextPlayerState.signals_
        |
        v
PlayerState.signals()
        |
        v
Skip Ad UI enabled
        |
        v
SignalCommand("skip-ad")
        |
        v
ContextPlayer / Signal
        |
        v
native "skip-ad" discriminator / enforcement
```

The only unproven edge in that diagram is the exact native state path from `adObject+0x1b8` into the `+0x140` predicate / available-signal producer. The timer, Android signal export, UI test, command serialization, and native signal-name handling are independently proven.

## 6. Relationship to ordinary next-track restrictions

Orbit still inserts `ad_disallow` into `disallowSkippingNextReasons` based on the presence of the nested ad-state optionals.

That path is separate:

```text
ordinary next / MediaSession
    -> disallowSkippingNextReasons
    -> next command 8/9
    -> ACTION_SKIP_TO_NEXT

timed Skip Ad
    -> PlayerState.signals contains "skip-ad"
    -> ContextPlayer / Signal("skip-ad")
```

An external MediaSession client therefore cannot assume that the appearance of Spotify's **Skip Ad** button will also expose `ACTION_SKIP_TO_NEXT`.

## 7. Remaining targets

1. recover the concrete interface/type behind the shared native `+0x140` call,
2. prove whether that predicate directly observes `adObject+0x1b8` or a derived copied state,
3. decode the special branch after the incoming `"skip-ad"` comparison,
4. decode the secondary `0x12044d8` handler and its `+0x68` virtual call,
5. link successful native execution to the later `ad_skipped` reporting/event model,
6. map the equivalent path during Connect/remote playback.

Evidence reports:

- `analysis/native-ad-skip-command-path.md`
- `analysis/skip-ad-ui-command.md`
- `analysis/skip-ad-click-handler.md`
- `analysis/skip-ad-player-dispatch.md`
- `analysis/skip-ad-signal-native.md`
- `analysis/native-disallow-signals.md`
