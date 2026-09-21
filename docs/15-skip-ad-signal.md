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

1. accesses a current signal/player-state object,
2. calls virtual slot `+0x70` on the dependency at state `+0x20`,
3. requires the state byte at `+0x68` to be nonzero,
4. calls virtual slot `+0x140` on the dependency held at state `+0x40`,
5. exposes `"skip-ad"` only when that `+0x140` call returns zero,
6. passes the string to `0xd23a2c`, the signal-collection insertion path used here.

This is the first native producer tied directly to the same string Android later sees in `PlayerState.signals()`.

The adapter/handler that owns this virtual method is now structurally identified. A native constructor installs:

```text
object+0x18 vptr -> 0x1841fc0
object+0x20 vptr -> 0x18421b0
```

and allocates/copies an approximately `0x88`-byte wrapper around that interface family. Relative to the primary address point `0x1841fc0`:

```text
+0x70  -> 0xfd381a   available-signal producer
+0x128 -> 0xfd38d6   incoming Signal discriminator
```

This wrapper must not be confused with the larger restriction owner or with the separate object stored at signal-state `+0x40`. The semantic identity of the `+0x140` method on that separate dependency is still being decoded.

### 3.2 Incoming signal discriminator at 0xfd38d6

The immediately following function compares an incoming signal ID against the exact seven-byte string `"skip-ad"`.

On a match it calls the **same state+0x40 dependency at virtual slot `+0x140`**. A key correction is now proven: a zero return is **not** a rejection. Instead it enters the Skip Ad-specific bookkeeping block at `0xfd397f`, which:

```text
requires state+0x68 != 0
requires execution-context+0x60 != 0
checks execution-context+0x58 inside the state +0x58/+0x60 range
optionally calls state+0x30 virtual slot +0x20 with state+0x60 + 1
then rejoins the normal Signal dispatch path
```

A nonzero `+0x140` result simply bypasses that extra bookkeeping and also continues through the generic Signal dispatch.

The native symmetry is therefore more precise:

```text
availability producer
    -> state+0x40 / +0x140
    -> zero result exposes "skip-ad"

incoming Signal("skip-ad")
    -> state+0x40 / +0x140
    -> zero result performs extra Skip Ad bookkeeping
    -> both outcomes continue through common Signal dispatch
```

So `+0x140` is currently best described as a **mode/state discriminator**, not an allow/deny predicate.

### 3.3 Secondary discriminator at 0x12044d8

A second native subsystem also compares an input string against `"skip-ad"` at `0x12044d8`.

The containing method `0x1204218` is structurally tied to a distinct native vtable:

```text
address point 0x185bf88
+0xc0 -> 0x1204218
```

On an exact `"skip-ad"` match the branch is short and direct:

```text
dependency = [dispatcher-this + 0x8]
dependency->vtable[+0x68]()
    -> create async completion state
    -> submit through the common dispatcher completion path
```

The constructor provenance for that dependency is now recovered. The secondary-dispatcher vptr is installed at a large object's `+0x18`, and the dependency is stored immediately after it at object `+0x20`. Because the virtual method receives `this = object+0x18`, the runtime load `[this+0x8]` is exactly that object `+0x20` field.

The large constructor at `0x11ef334` receives this dependency as **SysV argument 9**. Caller-side stack reconstruction closes its source chain:

```text
b8f02e(root)
    -> verify registry ID 0xb8 is present
    -> rootTable[0xb8] / rootTable+0x5c0
    -> service-184 object
    -> service-184 virtual +0x28()
    -> execution dependency
    -> constructor argument 9
    -> secondary dispatcher object+0x20
    -> [dispatcher-this+0x8]
    -> virtual +0x68() on "skip-ad"
```

The accessor `b8f02e` is now structurally decoded further. It passes ID `0xb8` to `b622de`; that helper is a byte-search/validation routine over the registry's ID buffer, **not** the service factory. After the ID check, `b8f02e` reads the instance from `rootTable+0x5c0`, exactly `0xb8 * 8`. Thus this dependency originates from registry service **184**.

A provenance correction is important here. Two attractive numeric-offset trails were investigated and disproven:

- the raw store at `0x1333835 -> object+0x5c0` belongs to a different large playback object and is **not** registry-table population merely because its offset equals `0xb8 * 8`;
- the map/holder path around `0x1334484 -> 0x15da3b7 -> 0x17dbc9a` is a formatted-string/error path. The constant passed at `0x32f434` is `"List could not be created from '%s': %s"`, and the downstream `0x17db9e4` calls `__vsnprintf_chk` and `basic_string::append`. Its observed `+0x10` word is part of a 24-byte string aggregate, not a service pointer.

Therefore the authoritative service184 provenance currently stops at the validated registry facade: `facade[0] -> service table -> table[184]`. Any candidate constructor must be tied back to that table base before its `+0x5c0` field is interpreted as service184. See `analysis/service184-provenance-corrections.md`.

At the caller, the service-184 object is first stored at a local stack slot and then replaced by the return of its `+0x28` method before being pushed as argument 9. The ABI mapping is now exact rather than heuristic: the result occupies physical caller cell `S0+0x60`; among the 36 pushes before `0x11ef334`, push #34 reads it as `[rsp+0x168]` while RSP is `S0-0x108`, so it becomes SysV argument 9. The callee prologue maps argument 9 to `[rsp+0x650]`, which is written to dispatcher outer `+0x20`. Because address point `0x185bf88` begins at outer `+0x18`, its `[this+0x8]` load is the same pointer later invoked at virtual `+0x68` in the `"skip-ad"` branch.

The same resulting dependency is reused elsewhere during player construction through virtual slots such as `+0x98`, `+0xb8`, and `+0xc0`, so it is a broader playback/control interface rather than an ad-only helper.

The `+0x68` virtual call remains the strongest current candidate for the actual lower-level Skip Ad playback action. The concrete provider/dependency vtable and side effect of `+0x68` are the next target.

A second correction applies to the first ABI-based service184 vtable shortlist. The initial addresses `0x18228d8`, `0x1821448`, `0x1822988`, and `0x181f788` were selected by method-shape scanning before enforcing the Itanium vtable header. Inspection of their surrounding qwords shows that several are shifted into the middle of larger vtable groups rather than true address points. For example, `0x1821440` is preceded by the characteristic `offset-to-top = 0` / null-typeinfo header, while `0x1821448` is already the second method slot. Therefore slot labels such as “candidate +0x28” from the original shortlist are not class-identity evidence and must not be used to name service184.

The follow-up scan now requires a valid Itanium-style header first and only then evaluates the observed ABI (`+0x28` pointer return, `+0x30` pointer return, `+0x38` sret-style output). The embedded `0x18228d8` hypothesis is additionally weakened by direct state inspection: the region its apparent getter returned (`this+0x218`) behaves as container/state storage with moves, zeroing, and copies, and no stable first-word vptr has been established there. The corrected header-validated scan is authoritative for the next class-identification step.

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

The exact request serialization is recovered from the SignalCommand branch:

```text
SignalCommand.signalId()
    -> EsSignalRequest.signal_id

generated LoggingParams
    -> EsSignalRequest.logging_params

SignalCommand.parameters()
    -> EsSignalRequest.parameters only when present
```

For `SignalCommand.create("skip-ad")`, no custom parameter string is supplied, so the request is essentially the `"skip-ad"` signal ID plus generated logging metadata.

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
native "skip-ad" discriminator
        |
        v
secondary dispatcher
        |
        v
dependency virtual +0x68
        |
        v
lower playback transition (exact implementation under trace)
```

Two native edges remain open: the exact state propagation from `adObject+0x1b8` into the available-signal producer, and the concrete implementation/side effects of the downstream `+0x68` call. The timer, Android signal export, UI test, command serialization, ContextPlayer endpoint, and native signal-name handling are independently proven.

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

1. recover the concrete interface/type behind the signal-state `+0x40` dependency and its virtual `+0x140` mode/state discriminator,
2. prove whether that state directly observes `adObject+0x1b8` or receives a derived/copied readiness value,
3. recover the real registry service-table population, then resolve the concrete vtable behind validated service 184 (`table[184] = table+0x5c0`) and its `+0x28() -> execution dependency` chain,
4. identify that dependency's virtual `+0x68` implementation and decode the exact playback state transition it causes,
5. identify the playback-ad reporting event emitted after a successful native skip (the currently recovered `fr0 -> "ad_skipped"` label belongs to the separate `android-ad-on-app-open` performance flow and must not be reused as proof here),
6. map the equivalent path during Connect/remote playback.

Evidence reports:

- `analysis/native-ad-skip-command-path.md`
- `analysis/skip-ad-ui-command.md`
- `analysis/skip-ad-click-handler.md`
- `analysis/skip-ad-player-dispatch.md`
- `analysis/skip-ad-signal-native.md`
- `analysis/native-disallow-signals.md`
- `analysis/native-skip-ad-availability-dispatch-v2.md`
- `analysis/native-skip-ad-vtables.md`
- `analysis/native-skip-ad-owner-raw.md`
- `analysis/skip-ad-stack-arg.md`
- `analysis/skip-ad-arg9-source.md`
- `analysis/skip-ad-execution-dependency-compact.md`
- `analysis/skip-ad-execution-provider-fast.md`
- `analysis/skip-ad-service-184-compact.md`
- `analysis/orbit-registry-helper-b622de.md`
- `analysis/service184-skipad-stackarg-proof.md`
