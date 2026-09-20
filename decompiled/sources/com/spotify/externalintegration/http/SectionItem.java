package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/externalintegration/http/SectionItem;", "", "Lcom/spotify/externalintegration/http/Image;", "image", "Lcom/spotify/externalintegration/http/Links;", "links", "", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "spotifyUri", "<init>", "(Lcom/spotify/externalintegration/http/Image;Lcom/spotify/externalintegration/http/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/spotify/externalintegration/http/Image;Lcom/spotify/externalintegration/http/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/externalintegration/http/SectionItem;", "e", "Ljava/lang/String;", "getSpotifyUri", "()Ljava/lang/String;", "getSpotifyUri$annotations", "()V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SectionItem {

    /* JADX INFO: renamed from: a */
    public final Image f4065a;

    /* JADX INFO: renamed from: b */
    public final Links f4066b;

    /* JADX INFO: renamed from: c */
    public final String f4067c;

    /* JADX INFO: renamed from: d */
    public final String f4068d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String spotifyUri;

    public SectionItem(Image image, Links links, String str, String str2, @gk60(name = "spotify_uri") String str3) {
        this.f4065a = image;
        this.f4066b = links;
        this.f4067c = str;
        this.f4068d = str2;
        this.spotifyUri = str3;
    }

    @gk60(name = "spotify_uri")
    public static /* synthetic */ void getSpotifyUri$annotations() {
    }

    public final SectionItem copy(Image image, Links links, String title, String subtitle, @gk60(name = "spotify_uri") String spotifyUri) {
        return new SectionItem(image, links, title, subtitle, spotifyUri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionItem)) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        return wj50.m88271j(this.f4065a, sectionItem.f4065a) && wj50.m88271j(this.f4066b, sectionItem.f4066b) && wj50.m88271j(this.f4067c, sectionItem.f4067c) && wj50.m88271j(this.f4068d, sectionItem.f4068d) && wj50.m88271j(this.spotifyUri, sectionItem.spotifyUri);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f4065a.f4057a.hashCode() * 31, 31, this.f4066b.f4060a), 31, this.f4067c);
        String str = this.f4068d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spotifyUri;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
