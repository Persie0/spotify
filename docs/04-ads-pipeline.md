# Advertising pipeline

This document describes how advertisements appear to enter and move through the Spotify Android playback model.

## Ad protobuf/domain objects

Important package:

`com.spotify.ads.esperanto.proto`

Notable models include:

- `Ad` (decompiled as `C0295Ad`)
- `EventRequest`
- `UnmanagedEventRequest`
- `PostEventV2Request`
- `SubEventRequest`
- preview/capability/state/targeting request/response types

The reconstructed `Ad` protobuf contains fields including:

```text
ad_id
metadata
cover_art
audio
video
display
clickthrough_url
tracking_events
slot
request_id
format
is_dsa_eligible
companions
verifications
```

Source:

`decompiled/sources/com/spotify/ads/esperanto/proto/C0295Ad.java`

## Conversion into player tracks

A key source is:

`decompiled/sources/p204p/gt0.java`

It constructs player-track metadata and explicitly sets:

```java
metadata.put(KEY_AD_ID, ...)
metadata.put(KEY_IS_ADVERTISEMENT, "true")
metadata.put("ad_playback_id", ...)
```

It then creates a player item.

This is one of the clearest bridges from the ads subsystem into the generic player model.

## Resulting player representation

Once inserted, an ad looks like a special `ContextTrack` carrying fields such as:

```text
uri = spotify:ad:<id>
is_advertisement = true
ad_id = ...
ad_playback_id = ...
duration = ...
media.manifest_id = ...
ad.is_skippable = ...
ad.skippable_ad_delay = ...
```

Not every ad necessarily has every field.

## Dedicated ad URI

Ad URIs are generated in multiple places:

```text
spotify:ad:<ad-id>
```

Examples:

- `p204p/so0.java`
- `p204p/uqe1.java`

## Ad-specific behavior

The code contains many ad-specific modules, including:

- `com.spotify.ads`
- `com.spotify.adsdisplay`
- `com.spotify.adshome`
- `com.spotify.adsinternal`
- `com.spotify.adonappopen`
- now-playing ad mode packages
- embedded-ad event models

This suggests separate products/placements share common player and reporting infrastructure.

## Viewability metadata

Ads can contain metadata:

`viewable_threshold_ms`

Source:

`decompiled/sources/p204p/fh0.java`

Related logic in `p204p/cvx.java` clamps/calculates a viewable threshold and uses approximately 3000 ms when the value is unavailable.

This appears to relate primarily to visual/viewable impression timing, not necessarily the full audio-ad completion state.

## Ad display vs playback

The code distinguishes:

- ad playback inside the player
- ad display surfaces/cards
- viewability
- tracking events
- ad feedback
- ad opportunity/state/capability services

So "an ad was played", "an ad was visible", and "an ad was completed" should not be assumed to be the same event.

## High-level flow

```text
ad opportunity / ad service
        |
        v
Ad protobuf
        |
        v
metadata conversion
        |
        v
ContextTrack
  is_advertisement=true
  ad_id
  ad_playback_id
        |
        v
player queue/state
        |
        +--> audio playback
        +--> now-playing ad UI
        +--> MediaSession advertisement flag
        +--> ad tracking/reporting
```

## Important observation

The current muter leaves this entire pipeline intact. Spotify still receives and plays the ad item from the player's perspective; Android output volume is changed externally.
