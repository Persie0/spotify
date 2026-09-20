# Playback and player state

Spotify's player model is one of the least-obfuscated and most useful parts of the APK.

## Core model

Primary source area:

`decompiled/sources/com/spotify/player/model/`

Important classes:

- `PlayerState`
- `ContextTrack`
- `Restrictions`
- command classes under `com.spotify.player.model.command`

## ContextTrack

`ContextTrack` is the semantic representation of a playable queue/context item.

It contains:

- URI
- UID
- provider
- a metadata map

The metadata keys are extremely valuable because many retain meaningful original names.

Examples include:

```text
ad_id
ad_type
advertiser
is_advertisement
is_podcast_advertisement
ad.is_skippable
ad.skippable_ad_delay
duration
image_url
media.manifest_id
context_uri
audio.fade_in_duration
audio.fade_out_duration
actions.skipping_next_past_track
```

Source:

`decompiled/sources/com/spotify/player/model/ContextTrack.java`

## URI model

Recognized playable/synthetic URI families include:

```text
spotify:track:
spotify:episode:
spotify:ad:
spotify:interruption:
spotify:delimiter
spotify:local:
spotify:meta:
spotify:live:
```

Examples:

- `p204p/rky0.java` contains a list of synthetic/special prefixes.
- `p204p/so0.java` constructs `spotify:ad:<id>`.
- `p204p/uqe1.java` also builds ad URIs from ad IDs.

This demonstrates that advertisements are represented inside the player as first-class context items rather than merely as an overlay over a normal track.

## PlayerState

`PlayerState` combines:

- current track
- playback ID
- play/pause state
- position
- context
- restrictions
- additional player capabilities/state

Many UI and Android integration layers observe `PlayerState` and derive smaller view models from it.

## Restrictions

Source:

`decompiled/sources/com/spotify/player/model/Restrictions.java`

The player exposes explicit sets of reasons that disallow operations.

Important examples:

```text
disallowSkippingNextReasons
disallowSkippingPrevReasons
disallowSeekingReasons
disallowPausingReasons
disallowResumingReasons
disallowTogglingShuffleReasons
disallowSetQueueReasons
disallowAddToQueueReasons
disallowTransferringPlaybackReasons
disallowRemoteControlReasons
```

This is an important design detail: capability is not just a boolean. Spotify preserves *why* an action is restricted.

## Commands

Command classes include:

- `SkipToNextTrackCommand`
- `ResumeCommand`
- other player command models

Example:

`decompiled/sources/com/spotify/player/model/command/SkipToNextTrackCommand.java`

Obfuscated call sites such as `p204p/wx7.java` and `p204p/l8k.java` construct player commands and submit them to a player-command dispatcher.

## Skip command flow

A representative path in `p204p/l8k.java` checks:

```java
playerState.restrictions()
    .disallowSkippingNextReasons()
    .isEmpty()
```

before building:

```java
SkipToNextTrackCommand.builder()
```

This confirms that at least some skip UI/control paths obey `PlayerState.restrictions`.

## Important implication

For external integrations:

- MediaSession may expose "next" only when the player considers it valid.
- Calling "next" from outside Spotify does not necessarily bypass the core restriction layer.
- A visible skip button and actual command acceptance are separate concerns.

## Data flow mental model

```text
server/player core
      |
      v
PlayerState
  |       \
  |        \
  v         v
track     Restrictions
  |          |
  v          v
UI       enabled actions
  |
  v
player command
  |
  v
player core
```
