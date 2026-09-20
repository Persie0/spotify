# Networking: Esperanto and Cosmos

Spotify Android contains two especially important internal communication abstractions: **Esperanto** and **Cosmos**.

## Esperanto

Core classes:

`com.spotify.esperanto.esperanto.*`

A key class is:

`CoroutineClientBase`

It wraps a `CoroutineTransport` and exposes:

```text
callSingle(service, method, protobuf)
callStream(service, method, protobuf)
callSync(service, method, protobuf)
```

Generated/obfuscated client stubs subclass it.

### Example: ad event request

`p204p/s9x.java`

uses:

```text
spotify.ads.esperanto.proto.Events / postEvent
spotify.ads.esperanto.proto.Events / postUnmanagedEvent
```

### Example: ad event stream

`p204p/kpc1.java`

opens:

```text
spotify.ads.esperanto.proto.Events / subEvent
```

### Example: ad-opportunity event

`p204p/ss0.java`

uses:

```text
spotify.ads.esperanto.proto.AdOpportunity / postEventV2
```

## Protobuf-heavy API layer

Many Esperanto packages contain protobuf-generated classes with stable semantic names even when the surrounding client class is obfuscated.

For reverse engineering, these are excellent anchors because they reveal:

- request fields
- response fields
- enums
- service families
- RPC method names

## Cosmos

The APK also contains:

`com.spotify.cosmos.*`

and many obfuscated classes importing:

- `Request`
- `Response`
- `CallbackRouter`
- `ResolveCallback`
- `Lifetime`
- `SharedCosmosRouterApi`

Cosmos appears as another internal request/router abstraction and is heavily used by older or parallel feature stacks.

There is also an Esperanto/Cosmos bridge:

`com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter`

which demonstrates that the systems coexist rather than one having fully replaced the other.

## Simplified mental model

```text
feature code
   |
   +--> protobuf model
   |
   +--> Esperanto generated client
   |       |
   |       +--> callSingle
   |       +--> callStream
   |       +--> callSync
   |
   +--> Cosmos Request/CallbackRouter
   |
   v
internal Spotify transport layer
   |
   v
Spotify services/backend
```

## Why this matters for analysis

When tracing a feature:

1. identify the semantic protobuf
2. find its builder usages
3. identify the generated client wrapper
4. read literal service/method strings
5. trace how the response is mapped into domain/player state

This is often much faster than following obfuscated dependency-injection wiring from the UI downward.

## Security note

The existence of an RPC schema in the APK does not mean a standalone app can invoke it. Authentication, transport setup, device identity, session state and backend authorization may be handled below these generated stubs.
