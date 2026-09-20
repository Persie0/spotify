# Research index and open questions

This file tracks useful next investigations and the best source anchors for each.

## 1. Exact ad milestone event types

Known:

- `EventRequest.event_type`
- `postEvent`
- `postUnmanagedEvent`
- `subEvent`
- `postEventV2`

Still to map:

- start
- impression
- first quartile
- midpoint
- third quartile
- complete
- skip
- mute/unmute
- error

Best anchors:

- `com.spotify.ads.esperanto.proto.EventRequest`
- `UnmanagedEventRequest`
- `PostEventV2Request`
- `SubEventRequest/Response`
- `tracking_events` consumers

## 2. Relationship between ad metadata and Restrictions

Known fields:

```text
ad.is_skippable
ad.skippable_ad_delay
Restrictions.disallowSkippingNextReasons()
```

Question:

Does an internal timer mutate the restriction set when the delay expires, or are these exposed independently to separate UIs?

Best anchors:

- `ContextTrack.java`
- `sc11.java`
- `Restrictions.java`
- skip-button UI modules
- MediaSession playback-state action builder

## 3. MediaSession action-mask generation

Goal:

Trace exactly where Spotify decides whether Android receives `ACTION_SKIP_TO_NEXT`.

Best anchors:

- PlaybackState builder code
- `a4p0.java` wrappers around `PlaybackState.Builder.setActions`
- MediaSession adapter classes
- `disallowSkippingNextReasons` consumers

## 4. Player command error handling

Goal:

Determine what happens when a skip command is submitted while restricted.

Best anchors:

- `SkipToNextTrackCommand`
- `wx7.java`
- `l8k.java`
- player Esperanto command request/response
- error enums containing `SKIP_TO_NEXT_RESTRICTED`

## 5. Native player / JNI boundary

The Java/Kotlin layer is not necessarily the final enforcement layer.

Questions:

- which player operations cross JNI?
- which restrictions originate from the native player?
- what state is server-provided vs calculated locally?

This matters before concluding that patching a Java restriction check would change real behavior.

## 6. Connect-device behavior

Questions:

- are ads represented with the same `ContextTrack` metadata on remote playback?
- does the phone export advertisement metadata when another device is the active renderer?
- are skip restrictions device-specific?

## 7. Ad viewability vs audio completion

Known:

- `viewable_threshold_ms`
- fallback around 3000 ms
- "viewable impression timing" logging
- tracking event maps

Need to distinguish:

- display impression
- audio started
- audible duration
- playback completion
- ad break completion

## 8. Ad caching and prefetch

Potential anchors:

- ad-on-app-open feature flags
- cached ad expiration
- preview/fetch RPCs
- media manifest IDs

## 9. App-wide architecture

Further documentation targets:

- authentication/session lifecycle
- offline/download state machine
- Connect/cast path
- library synchronization
- experiments/remote config
- analytics/logging stack
- search/home data flow

## 10. Decompilation quality improvements

Possible future Actions work:

- run CFR/FernFlower-style secondary decompiler for comparison
- extract smali for methods JADX failed to reconstruct
- index strings and xrefs automatically
- produce package/class statistics
- generate call graphs for selected semantic anchors
- preserve method bytecode offsets beside docs

The current docs should be updated whenever a new Spotify APK is added so behavior changes can be diffed across versions.
