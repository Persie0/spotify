package com.spotify.localfiles.mediastore;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/localfiles/mediastore/MediaStoreReaderOptions;", "", "includeAlarms", "", "includeAudiobooks", "includeMusic", "includeNotifications", "includePodcasts", "includeRingtones", "durationMin", "", "<init>", "(ZZZZZZI)V", "getIncludeAlarms", "()Z", "getIncludeAudiobooks", "getIncludeMusic", "getIncludeNotifications", "getIncludePodcasts", "getIncludeRingtones", "getDurationMin", "()I", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MediaStoreReaderOptions {
    private final int durationMin;
    private final boolean includeAlarms;
    private final boolean includeAudiobooks;
    private final boolean includeMusic;
    private final boolean includeNotifications;
    private final boolean includePodcasts;
    private final boolean includeRingtones;

    public MediaStoreReaderOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.includeAlarms = z;
        this.includeAudiobooks = z2;
        this.includeMusic = z3;
        this.includeNotifications = z4;
        this.includePodcasts = z5;
        this.includeRingtones = z6;
        this.durationMin = i;
    }

    public final int getDurationMin() {
        return this.durationMin;
    }

    public final boolean getIncludeAlarms() {
        return this.includeAlarms;
    }

    public final boolean getIncludeAudiobooks() {
        return this.includeAudiobooks;
    }

    public final boolean getIncludeMusic() {
        return this.includeMusic;
    }

    public final boolean getIncludeNotifications() {
        return this.includeNotifications;
    }

    public final boolean getIncludePodcasts() {
        return this.includePodcasts;
    }

    public final boolean getIncludeRingtones() {
        return this.includeRingtones;
    }
}
