package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$ToolbarVisibilityRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$ToolbarVisibilityRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6836a;

    /* JADX INFO: renamed from: b */
    public final boolean f6837b;

    public VtecWebToAndroidMessage$ToolbarVisibilityRequested(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6836a = (i & 1) != 0 ? "didRequestToolbarVisible" : str;
        this.f6837b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$ToolbarVisibilityRequested)) {
            return false;
        }
        VtecWebToAndroidMessage$ToolbarVisibilityRequested vtecWebToAndroidMessage$ToolbarVisibilityRequested = (VtecWebToAndroidMessage$ToolbarVisibilityRequested) obj;
        return wj50.m88271j(this.f6836a, vtecWebToAndroidMessage$ToolbarVisibilityRequested.f6836a) && this.f6837b == vtecWebToAndroidMessage$ToolbarVisibilityRequested.f6837b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6837b) + (this.f6836a.hashCode() * 31);
    }
}
