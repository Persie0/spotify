package com.spotify.externalintegration.http;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;
import p204p.wt30;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenSubtitle;", "", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class HydrogenSubtitle {

    /* JADX INFO: renamed from: a */
    public final String f4052a;

    /* JADX INFO: renamed from: b */
    public final wt30 f4053b;

    public HydrogenSubtitle(String str, wt30 wt30Var) {
        this.f4052a = str;
        this.f4053b = wt30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HydrogenSubtitle)) {
            return false;
        }
        HydrogenSubtitle hydrogenSubtitle = (HydrogenSubtitle) obj;
        return wj50.m88271j(this.f4052a, hydrogenSubtitle.f4052a) && this.f4053b == hydrogenSubtitle.f4053b;
    }

    public final int hashCode() {
        return this.f4053b.hashCode() + (this.f4052a.hashCode() * 31);
    }
}
