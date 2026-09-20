# Ad reporting and tracking

The APK contains a substantial reporting system. There is no evidence that "viewed" is represented by one simple local boolean.

## EventRequest

Source:

`decompiled/sources/com/spotify/ads/esperanto/proto/EventRequest.java`

Fields include:

```text
ad_id
event_type
playback_position
event_reason
event_source
slot_id
client_payload
playback_duration
asset_id
```

The request is sent by:

`decompiled/sources/p204p/s9x.java`

through:

```text
service: spotify.ads.esperanto.proto.Events
method:  postEvent
```

## UnmanagedEventRequest

Spotify also defines:

`com.spotify.ads.esperanto.proto.UnmanagedEventRequest`

Its schema includes additional ad/creative/playback data.

`p204p/s9x.java` sends it through:

```text
service: spotify.ads.esperanto.proto.Events
method:  postUnmanagedEvent
```

## Streaming ad-event subscription

`p204p/kpc1.java` constructs:

```text
SubEventRequest("started")
```

and opens a stream using:

```text
service: spotify.ads.esperanto.proto.Events
method:  subEvent
```

This is strong evidence of a bidirectional/event-driven ad state pipeline rather than a single client-side timer.

The corresponding response type contains an ad-event field.

## Ad opportunity V2 reporting

The APK also contains:

`PostEventV2Request`

sent by `p204p/ss0.java` to:

```text
service: spotify.ads.esperanto.proto.AdOpportunity
method:  postEventV2
```

This appears to be a separate event family from the older/general `Events.postEvent` path.

## Tracking events attached to ad objects

The ad protobuf itself contains:

`tracking_events`

This means reporting instructions can be supplied as part of the ad payload.

Embedded-ad metadata models also preserve tracking-event maps.

## Viewability

Ads can contain:

`viewable_threshold_ms`

The app has logic for detecting viewable-impression timing and logging failures when that calculation cannot be made.

This should be treated separately from audio completion.

## IDs used to correlate ad events

Observed identifiers include:

- `ad_id`
- `ad_playback_id`
- `request_id`
- `creative_id`
- `asset_id`
- `slot_id`
- playback position/duration
- event source/reason
- client payload

That amount of correlation data makes it unlikely that "viewed" can be faithfully represented by changing a single local field.

## What is confirmed vs unknown

Confirmed:

- ad event requests exist
- multiple reporting RPCs exist
- event requests carry playback position/duration
- ads contain tracking-event data
- ad events can be streamed/subscribed
- viewability thresholds exist

Not yet fully traced:

- exact event-type strings used for every audio-ad milestone
- which events are authoritative for billing
- whether server-side playback telemetry is cross-checked
- exact completion rules for every placement
- whether Connect playback reports through identical paths

## Safety / integrity note

These docs document the reporting architecture for understanding and debugging. The repository does not implement fabricated ad impression/completion events. Faking those events would create false measurement/billing data and is intentionally outside the companion muter's design.

## High-level reporting model

```text
ad item enters player
      |
      +--> ad playback identity
      |
      +--> tracking events
      |
      +--> playback position/duration
      |
      +--> viewability state
      |
      v
event builders
      |
      +--> Events.postEvent
      +--> Events.postUnmanagedEvent
      +--> Events.subEvent
      +--> AdOpportunity.postEventV2
      |
      v
Spotify backend
```
