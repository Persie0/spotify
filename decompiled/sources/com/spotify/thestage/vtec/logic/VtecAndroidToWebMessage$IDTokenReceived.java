package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$IDTokenReceived", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$IDTokenReceived extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final String f6753c;

    /* JADX INFO: renamed from: d */
    public final String f6754d;

    public VtecAndroidToWebMessage$IDTokenReceived(String str, String str2) {
        this.f6753c = str;
        this.f6754d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$IDTokenReceived)) {
            return false;
        }
        VtecAndroidToWebMessage$IDTokenReceived vtecAndroidToWebMessage$IDTokenReceived = (VtecAndroidToWebMessage$IDTokenReceived) obj;
        return wj50.m88271j(this.f6753c, vtecAndroidToWebMessage$IDTokenReceived.f6753c) && wj50.m88271j(this.f6754d, vtecAndroidToWebMessage$IDTokenReceived.f6754d);
    }

    public final int hashCode() {
        String str = this.f6753c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6754d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
