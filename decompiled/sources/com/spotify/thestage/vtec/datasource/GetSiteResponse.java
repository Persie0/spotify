package com.spotify.thestage.vtec.datasource;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/thestage/vtec/datasource/GetSiteResponse;", "", "Lcom/spotify/thestage/vtec/datasource/Site;", "site", "<init>", "(Lcom/spotify/thestage/vtec/datasource/Site;)V", "copy", "(Lcom/spotify/thestage/vtec/datasource/Site;)Lcom/spotify/thestage/vtec/datasource/GetSiteResponse;", "a", "Lcom/spotify/thestage/vtec/datasource/Site;", "getSite", "()Lcom/spotify/thestage/vtec/datasource/Site;", "getSite$annotations", "()V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class GetSiteResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Site site;

    public GetSiteResponse(@gk60(name = "site") Site site) {
        this.site = site;
    }

    @gk60(name = "site")
    public static /* synthetic */ void getSite$annotations() {
    }

    public final GetSiteResponse copy(@gk60(name = "site") Site site) {
        return new GetSiteResponse(site);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSiteResponse) && wj50.m88271j(this.site, ((GetSiteResponse) obj).site);
    }

    public final int hashCode() {
        return this.site.hashCode();
    }
}
