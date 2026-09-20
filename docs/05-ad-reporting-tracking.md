# Ad reporting and tracking

The APK contains a substantial reporting system. Ad playback, viewability, interaction, and completion are represented by explicit event types rather than one local `viewed` boolean.

## Exact ad event-type enum

Confirmed source:

`decompiled/sources/p204p/qm0.java`

The reconstructed enum contains **38 event types** and their wire strings:

| Enum | Wire string |
|---|---|
| BACKGROUNDED | `backgrounded` |
| CLICKED | `clicked` |
| COLLAPSED | `collapsed` |
| CONTINUOUS_VIEWABILITY | `viewability` |
| DISMISSED | `dismissed` |
| ENDED | `ended` |
| ERROR | `errored` |
| EXPANDED | `expanded` |
| FIRST_QUARTILE | `first_quartile` |
| FOREGROUNDED | `foregrounded` |
| IMPRESSION | `viewed` |
| ITEM_CLICKED | `item_clicked` |
| ITEM_IMPRESSION | `item_impression` |
| MIDPOINT | `midpoint` |
| MINIMIZED | `minimized` |
| MUTED | `muted` |
| NONCONTINUOUS_VIEWABILITY | `video_viewed` |
| OBSCURED | `obscured` |
| PAUSED | `paused` |
| PROGRESS | `progress` |
| REPLAYED | `replayed` |
| RESUMED | `resumed` |
| SKIPPED | `skipped` |
| STARTED | `started` |
| SURVEY_SUBMITTED | `survey_submitted` |
| TERMINATED | `terminated` |
| THIRD_QUARTILE | `third_quartile` |
| UNMUTED | `unmuted` |
| LOADED | `loaded` |
| UNLOADED | `unloaded` |
| UNOBSCURED | `unobscured` |
| VIEWABILITY_0 | `visible_0` |
| VIEWABILITY_GREATER_THAN_0 | `visible_gt_0` |
| VIEWABILITY_50 | `visible_50` |
| VIEWABILITY_50_LESS | `visible_50_less` |
| VIEWABILITY_100 | `visible_100` |
| VOLUME_CHANGE | `volume_change` |
| UNKNOWN | `unknown` |

Two naming details matter:

- Spotify's enum name `IMPRESSION` is sent as **`viewed`**.
- The normal completion-style lifecycle event is **`ENDED -> "ended"`**. There is no `"complete"` entry in this enum.

## One-shot milestones vs repeatable events

Confirmed source:

`decompiled/sources/p204p/fh0.java`

Each registered ad creates a synchronized set initially containing:

```text
STARTED
FIRST_QUARTILE
MIDPOINT
THIRD_QUARTILE
ENDED
UNLOADED
NONCONTINUOUS_VIEWABILITY
CONTINUOUS_VIEWABILITY
IMPRESSION
```

The event dispatcher in:

`decompiled/sources/p204p/om0.java`

checks that set before emission. For those events, the enum value is removed from the set when first emitted. Later attempts to emit the same one-shot event for that ad instance are suppressed.

Conceptually:

```text
event requested
    |
    +-- one-shot milestone?
    |       |
    |       +-- still in pending set -> remove + emit
    |       |
    |       +-- already removed      -> suppress
    |
    +-- repeatable event -> emit
```

Events such as `PROGRESS` and `VOLUME_CHANGE` are not in the one-shot set and may occur repeatedly.

## Concrete event call sites

Observed examples include:

- `p204p/ttr.java` — impression-related emission
- `p204p/gb9.java` — `IMPRESSION` and `PROGRESS`
- `p204p/b22.java` — `VOLUME_CHANGE`, plus `MUTED` / `UNMUTED` when volume crosses zero
- `p204p/sh0.java` — `DISMISSED` and `UNLOADED`
- `p204p/gur.java` — `VIEWABILITY_50`
- `p204p/str.java` — `VIEWABILITY_50_LESS`
- `p204p/ztr.java` — `ERROR`
- `p204p/r12.java` — `FOREGROUNDED` / `BACKGROUNDED`
- `p204p/t961.java` — `SURVEY_SUBMITTED`

Not every event family necessarily applies to every ad format.

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

Observed fields include:

```text
ad_id
event_type
playback_position
event_reason
lineitem_id
creative_id
request_id
product_name
slot_id
event_source
format
tracking_urls
duration_seconds
asset_id
```

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

The corresponding response contains an ad-event object. This is strong evidence of an event-driven ads subsystem rather than a single local playback timer.

## Ad opportunity V2 reporting

The APK also contains:

`PostEventV2Request`

sent by `p204p/ss0.java` to:

```text
service: spotify.ads.esperanto.proto.AdOpportunity
method:  postEventV2
```

This is a distinct RPC family from `Events.postEvent`.

## Tracking events attached to ad objects

The ad protobuf itself contains:

`tracking_events`

so reporting instructions can also arrive as part of the ad payload.

Embedded-ad metadata models preserve tracking-event maps as well.

## Viewability

Ads can contain:

`viewable_threshold_ms`

The client has separate viewability events:

```text
visible_0
visible_gt_0
visible_50
visible_50_less
visible_100
viewability
video_viewed
viewed
```

These should not be conflated with audio playback completion.

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

The reporting model therefore contains considerably more state than a local `viewed=true` flag.

## Remaining unknowns

Now resolved:

- exact event enum and wire strings
- start/quartile/end/skip/mute/unmute event names
- impression wire name
- one-shot milestone deduplication behavior

Still not fully traced:

- which specific event family is authoritative for advertiser billing
- server-side cross-checking against playback telemetry
- exact audio-ad milestone producer path for every placement
- Connect-device reporting differences
- placement-specific completion rules

## Integrity boundary

These docs document reporting for reverse engineering and debugging. The repository does not fabricate ad impression/completion requests. False reporting would corrupt measurement/billing data and is outside the companion muter's design.

## High-level reporting model

```text
ad item enters player
      |
      +--> ad playback identity
      +--> tracking events
      +--> playback position/duration
      +--> viewability
      |
      v
event enum / builders
      |
      +--> Events.postEvent
      +--> Events.postUnmanagedEvent
      +--> Events.subEvent
      +--> AdOpportunity.postEventV2
      |
      v
Spotify backend
```

For the bytecode-level trace tying these findings together, see [14-deep-trace-ad-events-media-skip.md](14-deep-trace-ad-events-media-skip.md).
