package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/ModPayload;", "", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ModPayload {

    /* JADX INFO: renamed from: a */
    public final String f6739a;

    /* JADX INFO: renamed from: b */
    public final String f6740b;

    public ModPayload(String str, String str2) {
        this.f6739a = str;
        this.f6740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModPayload)) {
            return false;
        }
        ModPayload modPayload = (ModPayload) obj;
        return wj50.m88271j(this.f6739a, modPayload.f6739a) && wj50.m88271j(this.f6740b, modPayload.f6740b);
    }

    public final int hashCode() {
        int iHashCode = this.f6739a.hashCode() * 31;
        String str = this.f6740b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ ModPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
