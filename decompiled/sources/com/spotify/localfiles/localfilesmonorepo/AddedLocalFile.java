package com.spotify.localfiles.localfilesmonorepo;

import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "", "duration", "", "albumName", "", "artistName", "trackTitle", "localTrackUri", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDuration", "()I", "getAlbumName", "()Ljava/lang/String;", "getArtistName", "getTrackTitle", "getLocalTrackUri", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class AddedLocalFile {
    private final String albumName;
    private final String artistName;
    private final int duration;
    private final String localTrackUri;
    private final String trackTitle;

    public AddedLocalFile(int i, String str, String str2, String str3, String str4) {
        this.duration = i;
        this.albumName = str;
        this.artistName = str2;
        this.trackTitle = str3;
        this.localTrackUri = str4;
    }

    public static /* synthetic */ AddedLocalFile copy$default(AddedLocalFile addedLocalFile, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addedLocalFile.duration;
        }
        if ((i2 & 2) != 0) {
            str = addedLocalFile.albumName;
        }
        if ((i2 & 4) != 0) {
            str2 = addedLocalFile.artistName;
        }
        if ((i2 & 8) != 0) {
            str3 = addedLocalFile.trackTitle;
        }
        if ((i2 & 16) != 0) {
            str4 = addedLocalFile.localTrackUri;
        }
        String str5 = str4;
        String str6 = str2;
        return addedLocalFile.copy(i, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlbumName() {
        return this.albumName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtistName() {
        return this.artistName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrackTitle() {
        return this.trackTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocalTrackUri() {
        return this.localTrackUri;
    }

    public final AddedLocalFile copy(int duration, String albumName, String artistName, String trackTitle, String localTrackUri) {
        return new AddedLocalFile(duration, albumName, artistName, trackTitle, localTrackUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddedLocalFile)) {
            return false;
        }
        AddedLocalFile addedLocalFile = (AddedLocalFile) other;
        return this.duration == addedLocalFile.duration && wj50.m88271j(this.albumName, addedLocalFile.albumName) && wj50.m88271j(this.artistName, addedLocalFile.artistName) && wj50.m88271j(this.trackTitle, addedLocalFile.trackTitle) && wj50.m88271j(this.localTrackUri, addedLocalFile.localTrackUri);
    }

    public final String getAlbumName() {
        return this.albumName;
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getLocalTrackUri() {
        return this.localTrackUri;
    }

    public final String getTrackTitle() {
        return this.trackTitle;
    }

    public int hashCode() {
        return this.localTrackUri.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.duration) * 31, 31, this.albumName), 31, this.artistName), 31, this.trackTitle);
    }

    public String toString() {
        return super.toString();
    }
}
