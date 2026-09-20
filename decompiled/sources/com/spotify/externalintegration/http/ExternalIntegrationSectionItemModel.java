package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0086\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0014\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010\u0019\u001a\u0004\b\b\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010#\u0012\u0004\b'\u0010\u0019\u001a\u0004\b\t\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0019\u001a\u0004\b*\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010)\u0012\u0004\b/\u0010\u0019\u001a\u0004\b.\u0010+R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0019\u001a\u0004\b2\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u0015\u0012\u0004\b7\u0010\u0019\u001a\u0004\b6\u0010\u0017¨\u00068"}, m24212d2 = {"Lcom/spotify/externalintegration/http/ExternalIntegrationSectionItemModel;", "", "", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "uri", "imageUrl", "", "isExplicit", "is19Plus", "", "episodeReleaseDate", "duration", "", "numItems", "backgroundHexColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spotify/externalintegration/http/ExternalIntegrationSectionItemModel;", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "b", "getSubtitle", "getSubtitle$annotations", "c", "getUri$annotations", "d", "getImageUrl", "getImageUrl$annotations", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isExplicit$annotations", "f", "is19Plus$annotations", "g", "Ljava/lang/Long;", "getEpisodeReleaseDate", "()Ljava/lang/Long;", "getEpisodeReleaseDate$annotations", "h", "getDuration", "getDuration$annotations", "i", "Ljava/lang/Integer;", "getNumItems", "()Ljava/lang/Integer;", "getNumItems$annotations", "j", "getBackgroundHexColor", "getBackgroundHexColor$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ExternalIntegrationSectionItemModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Boolean isExplicit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Boolean is19Plus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Long episodeReleaseDate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Long duration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Integer numItems;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String backgroundHexColor;

    public ExternalIntegrationSectionItemModel(@gk60(name = ContextTrack.Metadata.KEY_TITLE) String str, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String str2, @gk60(name = "uri") String str3, @gk60(name = "image_url") String str4, @gk60(name = ContextTrack.Metadata.KEY_IS_EXPLICIT) Boolean bool, @gk60(name = ContextTrack.Metadata.KEY_IS_19_PLUS) Boolean bool2, @gk60(name = "episode_release_date") Long l, @gk60(name = "duration") Long l2, @gk60(name = "num_items") Integer num, @gk60(name = "background_hex_color") String str5) {
        this.title = str;
        this.subtitle = str2;
        this.uri = str3;
        this.imageUrl = str4;
        this.isExplicit = bool;
        this.is19Plus = bool2;
        this.episodeReleaseDate = l;
        this.duration = l2;
        this.numItems = num;
        this.backgroundHexColor = str5;
    }

    @gk60(name = "background_hex_color")
    public static /* synthetic */ void getBackgroundHexColor$annotations() {
    }

    @gk60(name = "duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @gk60(name = "episode_release_date")
    public static /* synthetic */ void getEpisodeReleaseDate$annotations() {
    }

    @gk60(name = "image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @gk60(name = "num_items")
    public static /* synthetic */ void getNumItems$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_IS_19_PLUS)
    public static /* synthetic */ void is19Plus$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_IS_EXPLICIT)
    public static /* synthetic */ void isExplicit$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final ExternalIntegrationSectionItemModel copy(@gk60(name = ContextTrack.Metadata.KEY_TITLE) String title, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String subtitle, @gk60(name = "uri") String uri, @gk60(name = "image_url") String imageUrl, @gk60(name = ContextTrack.Metadata.KEY_IS_EXPLICIT) Boolean isExplicit, @gk60(name = ContextTrack.Metadata.KEY_IS_19_PLUS) Boolean is19Plus, @gk60(name = "episode_release_date") Long episodeReleaseDate, @gk60(name = "duration") Long duration, @gk60(name = "num_items") Integer numItems, @gk60(name = "background_hex_color") String backgroundHexColor) {
        return new ExternalIntegrationSectionItemModel(title, subtitle, uri, imageUrl, isExplicit, is19Plus, episodeReleaseDate, duration, numItems, backgroundHexColor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalIntegrationSectionItemModel)) {
            return false;
        }
        ExternalIntegrationSectionItemModel externalIntegrationSectionItemModel = (ExternalIntegrationSectionItemModel) obj;
        return wj50.m88271j(this.title, externalIntegrationSectionItemModel.title) && wj50.m88271j(this.subtitle, externalIntegrationSectionItemModel.subtitle) && wj50.m88271j(this.uri, externalIntegrationSectionItemModel.uri) && wj50.m88271j(this.imageUrl, externalIntegrationSectionItemModel.imageUrl) && wj50.m88271j(this.isExplicit, externalIntegrationSectionItemModel.isExplicit) && wj50.m88271j(this.is19Plus, externalIntegrationSectionItemModel.is19Plus) && wj50.m88271j(this.episodeReleaseDate, externalIntegrationSectionItemModel.episodeReleaseDate) && wj50.m88271j(this.duration, externalIntegrationSectionItemModel.duration) && wj50.m88271j(this.numItems, externalIntegrationSectionItemModel.numItems) && wj50.m88271j(this.backgroundHexColor, externalIntegrationSectionItemModel.backgroundHexColor);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isExplicit;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is19Plus;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.episodeReleaseDate;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.duration;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.numItems;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.backgroundHexColor;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ ExternalIntegrationSectionItemModel(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l, Long l2, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.FALSE : bool2, (i & 64) != 0 ? 0L : l, (i & 128) != 0 ? 0L : l2, (i & 256) != 0 ? 0 : num, (i & 512) != 0 ? null : str5);
    }
}
