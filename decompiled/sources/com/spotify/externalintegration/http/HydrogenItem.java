package com.spotify.externalintegration.http;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.fh30;
import p204p.g6f;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;
import p204p.wt30;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJV\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenItem;", "", "", "uri", ContextTrack.Metadata.KEY_TITLE, "", "Lcom/spotify/externalintegration/http/HydrogenSubtitle;", ContextTrack.Metadata.KEY_SUBTITLE, "Lcom/spotify/externalintegration/http/HydrogenImage;", "image", "Lcom/spotify/externalintegration/http/HydrogenEnhancingAttributes;", "enhancingAttributes", "contextUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/spotify/externalintegration/http/HydrogenImage;Lcom/spotify/externalintegration/http/HydrogenEnhancingAttributes;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/spotify/externalintegration/http/HydrogenImage;Lcom/spotify/externalintegration/http/HydrogenEnhancingAttributes;Ljava/lang/String;)Lcom/spotify/externalintegration/http/HydrogenItem;", "a", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "getUri$annotations", "()V", "e", "Lcom/spotify/externalintegration/http/HydrogenEnhancingAttributes;", "getEnhancingAttributes", "()Lcom/spotify/externalintegration/http/HydrogenEnhancingAttributes;", "getEnhancingAttributes$annotations", "f", "getContextUri", "getContextUri$annotations", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class HydrogenItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: b */
    public final String f4034b;

    /* JADX INFO: renamed from: c */
    public final List f4035c;

    /* JADX INFO: renamed from: d */
    public final HydrogenImage f4036d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final HydrogenEnhancingAttributes enhancingAttributes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String contextUri;

    /* JADX INFO: renamed from: g */
    public final String f4039g;

    public HydrogenItem(@gk60(name = "spotify_uri") String str, String str2, List<HydrogenSubtitle> list, HydrogenImage hydrogenImage, @gk60(name = "enhancing_attributes") HydrogenEnhancingAttributes hydrogenEnhancingAttributes, @gk60(name = ContextTrack.Metadata.KEY_CONTEXT_URI) String str3) {
        this.uri = str;
        this.f4034b = str2;
        this.f4035c = list;
        this.f4036d = hydrogenImage;
        this.enhancingAttributes = hydrogenEnhancingAttributes;
        this.contextUri = str3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            HydrogenSubtitle hydrogenSubtitle = (HydrogenSubtitle) obj;
            if (hydrogenSubtitle.f4053b == wt30.TEXT && hydrogenSubtitle.f4052a.length() > 0) {
                arrayList.add(obj);
            }
        }
        this.f4039g = g6f.m43753y0(arrayList, " • ", null, null, fh30.f69560f, 30);
    }

    @gk60(name = ContextTrack.Metadata.KEY_CONTEXT_URI)
    public static /* synthetic */ void getContextUri$annotations() {
    }

    @gk60(name = "enhancing_attributes")
    public static /* synthetic */ void getEnhancingAttributes$annotations() {
    }

    @gk60(name = "spotify_uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    public final HydrogenItem copy(@gk60(name = "spotify_uri") String uri, String title, List<HydrogenSubtitle> subtitle, HydrogenImage image, @gk60(name = "enhancing_attributes") HydrogenEnhancingAttributes enhancingAttributes, @gk60(name = ContextTrack.Metadata.KEY_CONTEXT_URI) String contextUri) {
        return new HydrogenItem(uri, title, subtitle, image, enhancingAttributes, contextUri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HydrogenItem)) {
            return false;
        }
        HydrogenItem hydrogenItem = (HydrogenItem) obj;
        return wj50.m88271j(this.uri, hydrogenItem.uri) && wj50.m88271j(this.f4034b, hydrogenItem.f4034b) && wj50.m88271j(this.f4035c, hydrogenItem.f4035c) && wj50.m88271j(this.f4036d, hydrogenItem.f4036d) && wj50.m88271j(this.enhancingAttributes, hydrogenItem.enhancingAttributes) && wj50.m88271j(this.contextUri, hydrogenItem.contextUri);
    }

    public final int hashCode() {
        int iHashCode = (this.f4036d.hashCode() + s571.m77244c(s571.m77243b(this.uri.hashCode() * 31, 31, this.f4034b), 31, this.f4035c)) * 31;
        HydrogenEnhancingAttributes hydrogenEnhancingAttributes = this.enhancingAttributes;
        int iHashCode2 = (iHashCode + (hydrogenEnhancingAttributes == null ? 0 : hydrogenEnhancingAttributes.spotifyUrl.hashCode())) * 31;
        String str = this.contextUri;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ HydrogenItem(String str, String str2, List list, HydrogenImage hydrogenImage, HydrogenEnhancingAttributes hydrogenEnhancingAttributes, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, hydrogenImage, hydrogenEnhancingAttributes, (i & 32) != 0 ? null : str3);
    }
}
