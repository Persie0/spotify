# Decompiled Spotify sources

- Input release: `r1`
- Input APK: `spotify-9-1-84-2205.apk`
- Input SHA-256: `b278db0357e6b1d2f9fc21491ddd7d6df1b82459cd82b7df4b0200252f839501`
- JADX: `1.5.6`
- Deobfuscation: JADX `--deobf`, generated mapping in `spotify.jobf`
- JADX exit code: `3` (non-zero can occur when individual methods/classes cannot be perfectly reconstructed; see `jadx.log`)
- Resources are intentionally not duplicated here; decoded resources already live in this repository.

JADX deobfuscation improves generated identifiers but cannot recover original names that were removed by R8/ProGuard without an original mapping file.
