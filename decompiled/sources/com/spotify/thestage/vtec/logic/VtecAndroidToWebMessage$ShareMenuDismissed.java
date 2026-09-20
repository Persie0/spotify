package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.ok60;
import p204p.v3d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$ShareMenuDismissed", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$ShareMenuDismissed extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final int f6768c;

    /* JADX INFO: renamed from: d */
    public final boolean f6769d;

    public VtecAndroidToWebMessage$ShareMenuDismissed(int i, boolean z) {
        this.f6768c = i;
        this.f6769d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$ShareMenuDismissed)) {
            return false;
        }
        VtecAndroidToWebMessage$ShareMenuDismissed vtecAndroidToWebMessage$ShareMenuDismissed = (VtecAndroidToWebMessage$ShareMenuDismissed) obj;
        return this.f6768c == vtecAndroidToWebMessage$ShareMenuDismissed.f6768c && this.f6769d == vtecAndroidToWebMessage$ShareMenuDismissed.f6769d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6769d) + (Integer.hashCode(this.f6768c) * 31);
    }
}
