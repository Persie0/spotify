# Subsystem / package map

The Spotify APK contains a very large number of feature packages. This page provides a practical map of the major areas rather than an exhaustive class-by-class listing.

## App shell

- `com.spotify.music`
- `com.spotify.app`

Responsibilities include:

- application startup
- main activity
- root navigation/UI hosting
- app lifecycle

Key files:

- `com/spotify/music/SpotifyApplication.java`
- `com/spotify/music/SpotifyMainActivity.java`

## Player

- `com.spotify.player.model`
- `com.spotify.player.model.command`
- `com.spotify.player.esperanto.proto`

Responsibilities:

- current playback state
- context tracks
- restrictions
- queue/context
- player commands
- player RPC schemas

## Android media integration

- `com.spotify.mediasession`
- `com.spotify.mediabrowserservice`
- `com.spotify.externalintegration`

Responsibilities:

- MediaSession
- media buttons
- MediaBrowserService / MediaLibraryService
- Android Auto / external media clients
- system metadata

## Spotify Connect / device playback

- `com.spotify.connect`
- cast-related packages
- device/discovery packages

Responsibilities include:

- remote devices
- Cast
- transferring playback
- controller/device state

Player restrictions explicitly include remote-control and transfer restrictions.

## Ads

Major packages include:

- `com.spotify.ads`
- `com.spotify.adsdisplay`
- `com.spotify.adshome`
- `com.spotify.adsinternal`
- `com.spotify.adonappopen`
- now-playing ad-mode modules
- embedded-ad modules

Responsibilities:

- ad opportunity/fetch/state
- ad creative models
- player injection
- display surfaces
- feedback
- viewability
- tracking/reporting

## Networking / internal RPC

- `com.spotify.esperanto`
- `com.spotify.cosmos`

Responsibilities:

- protobuf RPC
- streams
- callback routing
- internal transport abstraction

## Offline / storage

Packages with `offline`, `storage`, and download-related names contain:

- offline state
- download coordination
- local storage
- cache/database layers

The APK includes generated offline protobufs and Room-like database classes in several modules.

## Library / collection

Examples:

- `com.spotify.yourlibrary`
- `com.spotify.your_library_esperanto`
- collection-related Cosmos/Esperanto models
- add-to-playlist modules

Responsibilities:

- saved music
- playlist/library organization
- collection metadata and sync

## Search / home / feed

Examples include:

- search packages
- home packages
- watchfeed packages
- browse/content presentation modules

These are largely UI/domain layers backed by multiple service APIs.

## Authentication / account

Examples:

- `com.spotify.login`
- `com.spotify.useraccount`
- account switching
- app authorization

The APK retains signup/login data models and SSO-related UI/resources.

## Podcasts, audiobooks, video

The player model contains keys and restrictions for:

- episodes
- audiobook chapters
- video
- transcripts
- playback speed
- explicit/age-restricted content

These media types share the generic player but add their own feature modules.

## AI / recommendation features

The package tree contains features such as:

- `aipartner`
- `aiplaylist`
- `aiplaylistcoverart`

These appear as independently modularized features.

## Wearables / widgets / external surfaces

Examples:

- `com.spotify.wear`
- `com.spotify.widget`
- `com.spotify.widgets`
- voice assistant packages

These generally consume player/session state through shared platform APIs.

## UI frameworks

The APK includes:

- Android Views/XML
- Fragments
- Jetpack Compose
- Media3
- Material components

## Cross-cutting infrastructure

The obfuscated `p204p` package contains a huge amount of:

- dependency-injection glue
- adapters
- coroutine state machines
- Rx functions
- protobuf builders
- generated callbacks
- feature bindings

When a semantic class references `p204p.*`, search by stable strings and called model types rather than relying on the short class name.
