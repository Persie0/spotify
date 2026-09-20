# Runtime and framework stack

Spotify Android 9.1.84.2205 is a mixed-generation Android codebase. The decompile shows several major framework families coexisting.

## Kotlin + Java

Large parts of the app were written in Kotlin. Kotlin metadata survives in many decompiled classes and often preserves original module/source labels even when the runtime class name was obfuscated.

Java and Java-compatible generated code are also widespread.

## Android Views and Fragments

Traditional Android UI remains heavily used:

- Activities
- Fragments
- XML layouts
- View-based custom controls

`SpotifyMainActivity` is still an Activity-based root host.

## Jetpack Compose

Compose classes/imports are present throughout newer UI modules.

The app therefore uses a hybrid UI architecture rather than a full Compose rewrite.

## RxJava 3

Many modules use:

`io.reactivex.rxjava3.*`

Observed types include:

- `Single`
- `Observable`
- `Flowable`
- `Maybe`
- disposables
- functions/consumers

RxJava remains a major glue mechanism in older and mid-generation modules.

## Kotlin coroutines

Esperanto's `CoroutineClientBase` exposes suspend-style RPC operations and many obfuscated classes are generated coroutine state machines.

Coroutines coexist with RxJava rather than replacing it globally.

## Mobius

Spotify Mobius types appear in multiple features, indicating reducer/update-loop style state machines in parts of the app.

## Protocol Buffers

Protobuf is central to Spotify internal service APIs.

This is particularly visible under packages ending in:

`*.proto`

and in Esperanto request/response models.

## Esperanto

Spotify's internal protobuf RPC abstraction.

Core entry point:

`com.spotify.esperanto.esperanto.CoroutineClientBase`

Supports:

- unary calls
- streams
- synchronous calls

## Cosmos

A second internal request/router system.

Observed primitives include:

- `Request`
- `Response`
- `CallbackRouter`
- `ResolveCallback`
- `Lifetime`
- `SharedCosmosRouterApi`

There is an explicit Esperanto/Cosmos bridge, so both stacks remain active.

## Android Media3 / ExoPlayer lineage

The APK bundles Media3 and legacy media compatibility code.

Used for:

- MediaSession
- playback state
- MediaBrowser
- codec/playback support
- external transport controls

## AndroidX WorkManager

Manifest components include WorkManager scheduler/alarm/foreground services.

This is used for deferrable/background jobs.

## Room / databases

Room components are present, including multi-instance invalidation and feature databases such as media-browser denylist storage.

## Firebase / Google services

Confirmed from classes/manifest:

- Firebase Messaging
- Firebase Sessions
- Google API components
- Google Sign-In
- DataTransport
- ML Kit

## Facebook SDK

Facebook authentication/activity classes are bundled.

## Wear / Car / Cast

The APK contains integrations for:

- Wear OS
- Android Auto
- Chromecast / MediaRouter
- Bluetooth
- widgets / Glance

## Why this matters when tracing code

A feature can cross several async paradigms:

```text
Compose/View UI
    |
RxJava / Flow / Mobius
    |
domain model
    |
Esperanto or Cosmos
    |
protobuf / transport
```

When JADX output becomes unreadable, stable framework boundaries and protobuf names are often better anchors than short obfuscated class names.
