# Reverse-engineering scope and limitations

## Input

The source tree was produced from:

- APK: `spotify-9-1-84-2205.apk`
- release: `r1`
- JADX: `1.5.6`
- deobfuscation: enabled
- bad-code output: enabled

See `decompiled/README.md` and `decompiled/jadx.log`.

## Important limitation: this is not original source

JADX reconstructs Java-like source from DEX bytecode. The result is useful for control-flow analysis, strings, constants, protobuf models, Android component wiring, and call relationships, but it is not a perfect representation of Spotify's original Kotlin/Java source.

Several effects matter:

1. R8/ProGuard-obfuscated classes appear under `p204p` with names such as `er3`, `s9x`, `l8k`, etc.
2. Kotlin compiler-generated state machines and lambdas are often flattened into switch-heavy classes.
3. One synthetic class may contain several unrelated methods after shrinking/merging.
4. JADX reported hundreds of reconstruction errors for this APK.
5. Generated aliases are best-effort and must not be treated as authoritative original identifiers.

## What is trustworthy

The following are generally high-confidence:

- literal strings
- manifest declarations
- protobuf field names and field numbers
- Android framework API names
- package names that survived shrinking
- public model classes such as `ContextTrack`, `PlayerState`, `Restrictions`
- direct method calls visible in successfully reconstructed code
- service/method strings passed to Esperanto/Cosmos transports

Examples:

```text
"is_advertisement"
"ad.is_skippable"
"ad.skippable_ad_delay"
"android.media.metadata.ADVERTISEMENT"
"spotify.ads.esperanto.proto.Events"
"postEvent"
"postUnmanagedEvent"
"subEvent"
```

## What needs caution

Use caution with:

- intent inferred from an obfuscated method name
- classes that combine several unrelated switch branches
- incomplete methods marked by JADX warnings
- code paths where decompilation dropped branches
- assumptions that a client-side condition is the only enforcement point

A recurring example is playback skipping: the UI checks `Restrictions.disallowSkippingNextReasons()`, but the ultimate command may still be validated by deeper player/server logic.

## Repository layout relevant to analysis

```text
app/src/main/                 decoded APK structure/resources
resources/                    decoded manifest/resources copy
decompiled/sources/           JADX source reconstruction
decompiled/spotify.jobf       JADX deobfuscation mapping
decompiled/jadx.log           decompiler warnings/errors
spotify-muter/                companion app built from findings
docs/                         this documentation
```

## Method used for these docs

The analysis prioritizes stable semantic anchors:

- Android manifest component names
- protobuf schemas
- model classes
- URI prefixes
- metadata keys
- RPC service/method strings
- Android MediaSession keys
- restriction sets
- player command classes

This is more reliable than trying to assign meaning to every `p204p.*` class name.
