package com.spotify.externalintegration.http;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/externalintegration/http/Links;", "", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Links {

    /* JADX INFO: renamed from: a */
    public final String f4060a;

    public Links(String str) {
        this.f4060a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Links) && wj50.m88271j(this.f4060a, ((Links) obj).f4060a);
    }

    public final int hashCode() {
        return this.f4060a.hashCode();
    }
}
