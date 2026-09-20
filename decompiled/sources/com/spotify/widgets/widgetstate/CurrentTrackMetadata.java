package com.spotify.widgets.widgetstate;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.pkl;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"Jl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010\u0011J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u0010\"¨\u00065"}, m24212d2 = {"Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "Landroid/os/Parcelable;", "", "uri", "contextUri", "artwork", "downloadableUrl", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "extractedColor", "albumUri", "", "isAudiobook", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/widgets/widgetstate/CurrentTrackMetadata;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getContextUri", "getArtwork", "getDownloadableUrl", "getTitle", "getSubtitle", "getExtractedColor", "getAlbumUri", "Z", "src_main_java_com_spotify_widgets_widgetstate-widgetstate"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class CurrentTrackMetadata implements Parcelable {
    public static final Parcelable.Creator<CurrentTrackMetadata> CREATOR = new pkl(12);
    private final String albumUri;
    private final String artwork;
    private final String contextUri;
    private final String downloadableUrl;
    private final String extractedColor;
    private final boolean isAudiobook;
    private final String subtitle;
    private final String title;
    private final String uri;

    public CurrentTrackMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.uri = str;
        this.contextUri = str2;
        this.artwork = str3;
        this.downloadableUrl = str4;
        this.title = str5;
        this.subtitle = str6;
        this.extractedColor = str7;
        this.albumUri = str8;
        this.isAudiobook = z;
    }

    public static /* synthetic */ CurrentTrackMetadata copy$default(CurrentTrackMetadata currentTrackMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentTrackMetadata.uri;
        }
        if ((i & 2) != 0) {
            str2 = currentTrackMetadata.contextUri;
        }
        if ((i & 4) != 0) {
            str3 = currentTrackMetadata.artwork;
        }
        if ((i & 8) != 0) {
            str4 = currentTrackMetadata.downloadableUrl;
        }
        if ((i & 16) != 0) {
            str5 = currentTrackMetadata.title;
        }
        if ((i & 32) != 0) {
            str6 = currentTrackMetadata.subtitle;
        }
        if ((i & 64) != 0) {
            str7 = currentTrackMetadata.extractedColor;
        }
        if ((i & 128) != 0) {
            str8 = currentTrackMetadata.albumUri;
        }
        if ((i & 256) != 0) {
            z = currentTrackMetadata.isAudiobook;
        }
        String str9 = str8;
        boolean z2 = z;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return currentTrackMetadata.copy(str, str2, str13, str4, str12, str10, str11, str9, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContextUri() {
        return this.contextUri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtwork() {
        return this.artwork;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDownloadableUrl() {
        return this.downloadableUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExtractedColor() {
        return this.extractedColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAlbumUri() {
        return this.albumUri;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAudiobook() {
        return this.isAudiobook;
    }

    public final CurrentTrackMetadata copy(String uri, String contextUri, String artwork, String downloadableUrl, String title, String subtitle, String extractedColor, String albumUri, boolean isAudiobook) {
        return new CurrentTrackMetadata(uri, contextUri, artwork, downloadableUrl, title, subtitle, extractedColor, albumUri, isAudiobook);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentTrackMetadata)) {
            return false;
        }
        CurrentTrackMetadata currentTrackMetadata = (CurrentTrackMetadata) other;
        return wj50.m88271j(this.uri, currentTrackMetadata.uri) && wj50.m88271j(this.contextUri, currentTrackMetadata.contextUri) && wj50.m88271j(this.artwork, currentTrackMetadata.artwork) && wj50.m88271j(this.downloadableUrl, currentTrackMetadata.downloadableUrl) && wj50.m88271j(this.title, currentTrackMetadata.title) && wj50.m88271j(this.subtitle, currentTrackMetadata.subtitle) && wj50.m88271j(this.extractedColor, currentTrackMetadata.extractedColor) && wj50.m88271j(this.albumUri, currentTrackMetadata.albumUri) && this.isAudiobook == currentTrackMetadata.isAudiobook;
    }

    public final String getAlbumUri() {
        return this.albumUri;
    }

    public final String getArtwork() {
        return this.artwork;
    }

    public final String getContextUri() {
        return this.contextUri;
    }

    public final String getDownloadableUrl() {
        return this.downloadableUrl;
    }

    public final String getExtractedColor() {
        return this.extractedColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.uri.hashCode() * 31, 31, this.contextUri), 31, this.artwork), 31, this.downloadableUrl), 31, this.title), 31, this.subtitle), 31, this.extractedColor);
        String str = this.albumUri;
        return Boolean.hashCode(this.isAudiobook) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isAudiobook() {
        return this.isAudiobook;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uri);
        dest.writeString(this.contextUri);
        dest.writeString(this.artwork);
        dest.writeString(this.downloadableUrl);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.extractedColor);
        dest.writeString(this.albumUri);
        dest.writeInt(this.isAudiobook ? 1 : 0);
    }

    public /* synthetic */ CurrentTrackMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? false : z);
    }
}
