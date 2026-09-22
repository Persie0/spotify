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
    -> if signal == "skip-ad": virtual +0x68() (this-only)
```

The accessor `b8f02e` is now structurally decoded further. It passes ID `0xb8` to `b622de`; that helper is a byte-search/validation routine over the registry's ID buffer, **not** the service factory. After the ID check, `b8f02e` reads the instance from `rootTable+0x5c0`, exactly `0xb8 * 8`. Thus this dependency originates from registry service **184**.

A provenance correction is important here. Two attractive numeric-offset trails were investigated and disproven:

- the raw store at `0x1333835 -> object+0x5c0` belongs to a different large playback object and is **not** registry-table population merely because its offset equals `0xb8 * 8`;
- the map/holder path around `0x1334484 -> 0x15da3b7 -> 0x17dbc9a` is a formatted-string/error path. The constant passed at `0x32f434` is `"List could not be created from '%s': %s"`, and the downstream `0x17db9e4` calls `__vsnprintf_chk` and `basic_string::append`. Its observed `+0x10` word is part of a 24-byte string aggregate, not a service pointer.

The registry facade remains the authoritative lookup anchor: `facade[0] -> service table -> table[184]`. That anchor is now tied to a concrete registered provider and object construction path rather than stopping at the table lookup. The earlier false `+0x5c0` object-offset trails remain rejected; see `analysis/service184-provenance-corrections.md`.

At the caller, the service-184 object is first stored at a local stack slot and then replaced by the return of its `+0x28` method before being pushed as argument 9. The ABI mapping is exact rather than heuristic: the result occupies physical caller cell `S0+0x60`; among the 36 pushes before `0x11ef334`, push #34 reads it as `[rsp+0x168]` while RSP is `S0-0x108`, so it becomes SysV argument 9. The callee prologue maps argument 9 to `[rsp+0x650]`, which is written to dispatcher outer `+0x20`. Because address point `0x185bf88` begins at outer `+0x18`, its `[this+0x8]` load is the same pointer later invoked at virtual `+0x68` when the dispatcher has matched the `"skip-ad"` signal. The call at `0x12044f2` is a **this-only** virtual call: the literal `"skip-ad"` selects the branch; it is not passed as a string argument to `+0x68`.

The concrete service and dependency objects are now resolved. `TimelineConductorSetupImpl::factory` constructs the `0xf0`-byte service object with primary address point `0x1867c98`. Its `+0x28` slot is `0xc2e960`, a two-instruction getter that returns `[this+0xc8]`. During construction, `&TimelineConductor::c8` is saved in stack slot `rsp+0x60`, and the exact install at `0x135fd57` writes the dependency pointer into that field.

That dependency is the same `0xbd0`-byte object allocated at `0x135f2b8` and retained in `r14` through the install. Its primary vptr/address point is written at `0x135f494` as **`0x1868200`** (with secondary interface address points at `0x18683c8`, `0x18683f8`, and `0x18684c0`). On the primary interface, virtual slot **`+0x68` resolves exactly to `0x1371d90`**. Therefore the lower-level native action reached by the exact `"skip-ad"` branch is no longer an ABI candidate: it is the concrete `0x1371d90` method on the dependency returned by `TimelineConductor+0x28`. That method contains the fixed literals **`smartSkipEmbeddedPodcastAd`** and **`smart-skip-embedded-podcast-ad`**, tying this execution path specifically to Spotify's smart embedded-podcast-ad skip behavior.

The same dependency is reused elsewhere during player construction through virtual slots such as `+0x98`, `+0xb8`, and `+0xc0`, so it is a broader playback/control object rather than an ad-only helper.

The semantics of `0x1371d90` are now resolved far enough to name the operation. Its two literal identifiers are:

```text
smartSkipEmbeddedPodcastAd
smart-skip-embedded-podcast-ad
```

The exact native `"skip-ad"` discriminator at `0x12044d8` invokes dependency `+0x68` as a **this-only** call; the command string is consumed by the dispatcher and is not passed to `0x1371d90`. Inside `0x1371d90`, the camelCase identifier is used at the start of the conductor operation and the kebab-case identifier is used later in the transition/reporting path. One direct callee, `0x137cb68`, contains the explicit strings `"Seeking to position: %lldms"`, `"Seeking by playing clip %s with start offset"`, and `"Seeking within current clip"`. Thus this path is concretely a **TimelineConductor smart-seek/clip transition for embedded podcast ads**, not ordinary `SkipNext`.

The target-selection logic is also recovered. `0x1371d90` obtains the active item, converts its current rational playback time to milliseconds, then probes two interval sources held at dependency `+0xb08` and `+0xb10`. Their lookup helpers `0x13a1a4a` and `0x13a392c` both iterate 16-byte `(start_ms, end_ms)` pairs and match exactly when `start_ms <= current_ms < end_ms`. On success, the helper copies that pair to the caller and `0x1371d90` loads the pair's second qword, **`end_ms`**, into the seek-target register. It tries the `+0xb08` source first and falls back to `+0xb10`; if neither contains the current position, it does not immediately issue the seek on that pass. The successful path calls `0x137cb68(this, end_ms, 0, 0, 1)`. In other words, the smart-skip action seeks to the **end boundary of the interval containing the current playback position**.

This also narrows the scope of the branch: the native implementation selected by this `"skip-ad"` action is specifically `smartSkipEmbeddedPodcastAd`. It should not be generalized to every advertising format without separate evidence.

The two interval sources now have concrete upstream registry provenance. `TimelineConductorSetupImpl::factory` obtains the primary source through accessor `b632ca`; that accessor validates service ID **`0x2f`**, reads table slot `0x178`, and the registered provider descriptor for ID `0x2f` is **`DownloadSetupImpl`**. The factory stores this result at `rsp+0x1b8`, passes it as constructor `rcx`, and the conductor builds the primary 0x110-byte helper at `TimelineConductor+0xb0` with address point `0x1869ea8`. That helper family exposes the string `timeline_conductor_video`.

The fallback source is symmetrical but distinct. Factory accessor `b9150c` validates service ID **`0x32`**, reads table slot `0x190`, and provider ID `0x32` resolves to **`DspSetupImpl`**. Its result is stored at factory `rsp+0x190`, passed through the constructor's stack argument path, and feeds the second 0x110-byte helper at `TimelineConductor+0xb8` with address point `0x186a0b8`. That helper family exposes the string `list_player`.

These names describe the upstream playback/service sources, **not two advertising categories**. The recovered smart-skip logic still treats them simply as ordered interval providers: probe the Download-derived primary source first, then the DSP-derived fallback source if no containing interval is found.

The successful seek also has a recovered post-action path. After `0x137cb68` seeks to the selected `end_ms`, the conductor builds transition state at `0x1382662` and calls `0x13825fa` with the literal **`smart-skip-embedded-podcast-ad`**. That wrapper is shared with ordinary TimelineConductor actions such as seek/play/pause/resume and forwards through `0x1382113 -> 0x1624e22`. The evidence therefore supports a structured TimelineConductor action/report with that exact label. It does **not** support reusing the unrelated `ad_skipped` app-open metric as the playback Skip Ad event name.

A second correction applies to the first ABI-based service184 vtable shortlist. The initial addresses `0x18228d8`, `0x1821448`, `0x1822988`, and `0x181f788` were selected by method-shape scanning before enforcing the Itanium vtable header. Inspection of their surrounding qwords shows that several are shifted into the middle of larger vtable groups rather than true address points. For example, `0x1821440` is preceded by the characteristic `offset-to-top = 0` / null-typeinfo header, while `0x1821448` is already the second method slot. Therefore slot labels such as “candidate +0x28” from the original shortlist are not class-identity evidence and must not be used to name service184.

The follow-up scan now requires a valid Itanium-style header first and only then evaluates the observed ABI (`+0x28` pointer return, `+0x30` pointer return, `+0x38` sret-style output). The embedded `0x18228d8` hypothesis is additionally weakened by direct state inspection: the region its apparent getter returned (`this+0x218`) behaves as container/state storage with moves, zeroing, and copies, and no stable first-word vptr has been established there. The corrected header-validated scan is authoritative for the next class-identification step.

The first strong header-valid candidate, address point `0x1817068`, has now been rejected by following its actual `+0x28` dependency end to end. Its constructor allocates the service-shaped object at `0xc2c5f6`, initializes `owner+0x10` to null, then allocates a 16-byte polymorphic object at `0xc2c7dc`, installs vptr `0x1884978`, and stores that pointer into `owner+0x10` at `0xc2c7fc`. The candidate's `+0x28` method returns exactly that field. However, the returned object's true vtable has `+0x68 -> 0x15c286a`, and that method is a destructor/delete path: it invokes the destructor helper `0x15c2856` and tail-jumps to `operator delete`. The proven Skip Ad path invokes its dependency's `+0x68` as an operation, so this candidate is incompatible with that call contract and is no longer considered service184.

The registry identity for service ID `0xb8` is now resolved independently of those ABI guesses. The native provider registration framework calls each provider's tiny ID method at vtable slot `+0x10`; exactly one registered provider returns `0xb8`: address point `0x1867c58`. Its metadata method at `+0x18` decodes to **`TimelineConductorSetupImpl`**, and its factory is `0x135c878`. The registration site is `0xb60ce8`, where an 8-byte provider object with vptr `0x1867c58` is passed into `addb16`. This is now the authoritative identity of the provider that populates/produces registry service 184.

The factory path is concrete: `TimelineConductorSetupImpl::factory` allocates `0xf0` bytes at `0x135cc69`, passes that object as the first argument to `0x135d056` at `0x135ce8b`, and stores the resulting object pointer into the factory output at `0x135cebf`. Constructor `0x135d056` writes the service object's primary address point **`0x1867c98`** at `0x135d08c`; its `+0x28` slot is the exact `[this+0xc8]` getter `0xc2e960`. The nearby address point `0x1867b28` remains a disproven false lead: its materializer allocates a different `0xe0`-byte object and does not represent this service.

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
dependency AP 0x1868200 / virtual +0x68
        |
        v
0x1371d90
        |
        v
smartSkipEmbeddedPodcastAd
        |
        v
TimelineConductor seek/clip transition
        |
        v
"smart-skip-embedded-podcast-ad" transition/reporting path
```

The final **availability-export** edge is still open at one specific pointer boundary: the exact state propagation from `adObject+0x1b8` into the concrete object later used as signal-state `+0x40` / virtual `+0x140`. The corrected constructor ABI now resolves the upstream source of `owner+0x428`: caller `e8c697` obtains registry service **ID `0x55`** through accessor `b87f94`, stores it at caller `rsp+0x90`, and that value maps to constructor argument 47, which is the input installed into `owner+0x428`. Provider descriptor AP `0x1825060` identifies service `0x55` as **`MetadataSetupImpl`**. This names the upstream service but does not yet identify the later concrete `P+0x40` receiver or its scalar virtual `+0x140` predicate. The raw 0x6b0 state record and the TimelineAds `0x18678f8` wrapper are both rejected as that final receiver: the former came from a superseded ABI interpretation (the relevant `e99d07 [rsp+0x1338]` value is an incoming argument, not the unrelated 0x6b0-stride record), while `0x18678f8:+0x140 -> 0xa3fa60` always returns 1 even though `fd381a` exposes `"skip-ad"` only when its receiver returns 0.

A second table-coordinate correction is important for the downstream state family. The authoritative primary address point is **`0x1841fc0`**. In that contiguous table, `fd381a` is AP+`0x70`, `fd38d6` is AP+`0x128`, and `fd4a92` is AP+`0x1d8`. The address `0x1842150` is **not** a second class/address point; it is merely AP+`0x190` inside the same table. Consequently, any older report that treated `0x1842150` as a standalone vtable must not be used for class identity.

The `fd4a92` materialization path is now exact through its helpers: it advances its second argument by `0x10`, `c8be5a` locks the resulting weak/shared pair, `f2505a` embeds that locked pair at wrapper+`0x10`, and `fd4c04` copies `[[wrapper+0x10]+0x40]` into the new Skip-Ad adapter at outer+`0x58`. Since the adapter is addressed as outer+`0x18`, that copied pointer is exactly the adapter's `this+0x40` receiver later used by `fd381a`.

The corrected source/carrier provenance is now concrete one layer farther. The pair propagated through the `e99d07` readiness argument comes from the `0x58`-byte carrier allocated at `0xe948ff`. Its secondary interface at carrier `+0x18` has address point **`0x1843bf8`**; `0xe94925` stores the pointer `P` at carrier `+0x20`. `P` is not the rejected 0x6b0 record: it is `outer+0x18` of the separate `0xb0`-byte object allocated at `0xe947b0`, and its concrete interface address point is **`0x1832be8`**. Carrier virtual `+0x10` (`0xfec736`) reloads that stored `P` pointer and dispatches `P` virtual `+0x10` (`0xec5b7c`). In the final materialized Skip-Ad state, the dependency copied for `fd381a` is **`P+0x40 = outer+0x58`**. Construction at `0xe947fd..0xe94802` initially zeros the surrounding `outer+0x40..0x5f` region, so this final receiver field starts null and is populated later.

This closes the identity of the corrected readiness carrier and the concrete source interface, but it does **not** yet prove the runtime vptr of the object eventually written to `P+0x40`, nor that object's real `+0x140` implementation. The remaining availability task is therefore narrowly defined: recover the later writer/populator of `P+0x40` (`outer+0x58`), identify the object written there, and resolve its ABI-compatible scalar `+0x140` method. The `d85524 -> d8a488 -> d8a5c2` family remains a parallel/rejected route for this final receiver.

The **execution-side readiness propagation is now proven farther downstream**, however. `TimelineAdsSetupImpl` (registry ID `0xb7`) samples the AdsRuntime byte at `0x1352547`. On the true branch it installs the 0x90 readiness state at TimelineAds owner `+0x20` and the AP `0x18678f8` wrapper at owner `+0x10`. Later in the same factory, `0x1352de2..0x1352df2` reloads owner `+0x10` and inserts that wrapper pointer as the head of the second 0x20-byte intermediate element. That two-element intermediate is normalized before construction of a 0x8e8-byte object (primary AP `0x18674c8`, secondary AP `0x1867550`, embedded AP `0x1867980`); the normalized state is copied into that object's `+0x58/+0x68` region, and the object is installed at TimelineAds owner `+0x50` at `0x1353121..0x1353129`. TimelineAds virtual `+0x28` (`0xaa712a`) returns exactly owner `+0x50`, and TimelineConductor consumes it at `0x135cbe5..0x135cbf0`. Thus the AdsRuntime readiness transition is demonstrably carried into the object graph used by Skip Ad execution, without claiming that the intermediate TimelineAds wrapper is itself the final availability discriminator.

The execution edge is concrete through `TimelineConductorSetupImpl -> 0x1867c98:+0x28 -> [this+0xc8] -> 0x1868200:+0x68 -> 0x1371d90 -> interval end_ms -> 0x137cb68 seek -> "smart-skip-embedded-podcast-ad" action/report`. The interval source provenance is also resolved at the registry layer: ID `0x2f` / `DownloadSetupImpl` feeds the primary source and ID `0x32` / `DspSetupImpl` feeds the fallback.


A further ABI check eliminates the three inline readiness-variant tables previously surfaced by the broad final-receiver resolver. The final availability call at `fd384d` / `fd3926` supplies only `rdi = receiver` and immediately tests the scalar value in `eax`. By contrast, `0x183d258:+0x140 -> 0xf7835e` consumes additional `rsi/rdx/rcx` arguments and builds complex state, `0x183d3b0:+0x140 -> 0xf7431e` is a deleting-destructor path, and `0x183d470:+0x140 -> 0xa50370` is effectively an `operator delete` tail. None is ABI-compatible with the final Skip-Ad readiness discriminator. These remain useful neighboring type-family evidence only and must not be used as the receiver identity.


The later `d85524 -> d8a488 -> d8a5c2` carrier hypothesis is now also rejected as the final readiness route. It had a strong superficial layout match: the object passed to `d85524` is tested at `+0x210`, dereferenced at `+0x258`, and its vtable `+0x1d8` is eventually invoked; the `ef91cc` owner family independently initializes/owns those same `+0x210/+0x258` offsets. However the decisive vtable check shows `0x18365e0:+0x1d8 -> 0xf00edc`, which is a teardown/destructor-style method, while the authoritative Skip-Ad state AP is `0x1841fc0:+0x1d8 -> fd4a92`. Therefore the d8 carrier is a parallel state/object family and must not be used as the source of the final `state+0x40` readiness receiver.

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

1. recover the later writer of the proven `P+0x40 = outer+0x58` final signal-state dependency, identify the concrete object written there, and resolve its ABI-compatible scalar virtual `+0x140` mode/state discriminator; continue from `owner+0x428 -> e99d07 -> 0x1843bf8 carrier -> P (0x1832be8) -> P+0x40`, not the rejected raw-0x6b0 / d8 / TimelineAds-wrapper aliases,
2. connect the proven AdsRuntime/TimelineAds readiness graph (`AdsRuntime+0x1b8 -> TimelineAds owner+0x20/+0x10 -> owner+0x50`) to that final `owner+0x428` availability-state source and determine the exact derived/copied value crossing that boundary,
3. determine the exact semantic payload carried from `DownloadSetupImpl` and `DspSetupImpl` into their TimelineConductor interval-helper subobjects, beyond the now-proven registry identities,
4. classify the final common TimelineConductor action sink `0x1624e22` more precisely (transport/logging/state bus), without conflating it with the unrelated `ad_skipped` app-open metric,
5. map the equivalent path during Connect/remote playback and verify whether it reuses the same TimelineConductor operation.

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
- `analysis/timeline-conductor-service-object.md`
- `analysis/timeline-conductor-c8-dependency.md`
- `analysis/timeline-conductor-c8-final-r14.md`
- `analysis/timeline-conductor-dependency-vtable.md`
- `analysis/timeline-conductor-skip-action-literals.md`
- `analysis/timeline-conductor-skipad-semantics.md`
- `analysis/timeline-smart-skip-target.md`
- `analysis/timeline-action-sink-classification.md`
- `analysis/smart-skip-post-seek-report.md`
- `analysis/smart-skip-provider-classes.md`
- `analysis/smart-skip-accessor-ids.md`
- `analysis/smart-skip-provider-names.md`
- `analysis/timelineads-owner50-readiness-bridge.md`
- `analysis/adssetup-readiness-source-proof.md`
- `analysis/skip-ad-state-capability-source.md`
- `analysis/final-rsp770-definition.md`
- `analysis/skipad-state-virtual-family.md`
