package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$IDTokenRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$IDTokenRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6809a;

    public VtecWebToAndroidMessage$IDTokenRequested(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6809a = (i & 1) != 0 ? "didRequestIDToken" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VtecWebToAndroidMessage$IDTokenRequested) && wj50.m88271j(this.f6809a, ((VtecWebToAndroidMessage$IDTokenRequested) obj).f6809a);
    }

    public final int hashCode() {
        return this.f6809a.hashCode();
    }
}
