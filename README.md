# Spotify mods

Three independent projects for Spotify playback on Android:

- [Spotify Ad Muter](spotify-muter/README.md): Android app that mutes ads using MediaSession metadata, without root.
- [Spotify Autoskip](spotify-autoskip/README.md): experimental LSPosed module for rooted Android devices.
- [Spotify Frida](spotify-frida/README.md): experimental Frida script for rooted Android devices.

See each project for installation and build instructions. The two autoskip projects are untested on a device.

Build the Android muter with the Android SDK and Gradle installed:

    gradle -p spotify-muter :app:testDebugUnitTest :app:assembleDebug

Build the LSPosed module:

    gradle -p spotify-autoskip :app:assembleDebug
