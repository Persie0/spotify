package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$PlaybackStatusChanged", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$PlaybackStatusChanged extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final String f6756c;

    /* JADX INFO: renamed from: d */
    public final String f6757d;

    public VtecAndroidToWebMessage$PlaybackStatusChanged(String str, String str2) {
        this.f6756c = str;
        this.f6757d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$PlaybackStatusChanged)) {
            return false;
        }
        VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged = (VtecAndroidToWebMessage$PlaybackStatusChanged) obj;
        return wj50.m88271j(this.f6756c, vtecAndroidToWebMessage$PlaybackStatusChanged.f6756c) && wj50.m88271j(this.f6757d, vtecAndroidToWebMessage$PlaybackStatusChanged.f6757d);
    }

    public final int hashCode() {
        return this.f6757d.hashCode() + (this.f6756c.hashCode() * 31);
    }
}
