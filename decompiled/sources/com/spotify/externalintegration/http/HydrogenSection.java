package com.spotify.externalintegration.http;

import java.util.List;
import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenSection;", "", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class HydrogenSection {

    /* JADX INFO: renamed from: a */
    public final String f4047a;

    /* JADX INFO: renamed from: b */
    public final List f4048b;

    public HydrogenSection(String str, List list) {
        this.f4047a = str;
        this.f4048b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HydrogenSection)) {
            return false;
        }
        HydrogenSection hydrogenSection = (HydrogenSection) obj;
        return wj50.m88271j(this.f4047a, hydrogenSection.f4047a) && wj50.m88271j(this.f4048b, hydrogenSection.f4048b);
    }

    public final int hashCode() {
        return this.f4048b.hashCode() + (this.f4047a.hashCode() * 31);
    }
}
