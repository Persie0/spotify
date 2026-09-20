package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$DidCreatePlaylist", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$DidCreatePlaylist extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final int f6750c;

    /* JADX INFO: renamed from: d */
    public final String f6751d;

    /* JADX INFO: renamed from: e */
    public final String f6752e;

    public VtecAndroidToWebMessage$DidCreatePlaylist(int i, String str, String str2) {
        this.f6750c = i;
        this.f6751d = str;
        this.f6752e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$DidCreatePlaylist)) {
            return false;
        }
        VtecAndroidToWebMessage$DidCreatePlaylist vtecAndroidToWebMessage$DidCreatePlaylist = (VtecAndroidToWebMessage$DidCreatePlaylist) obj;
        return this.f6750c == vtecAndroidToWebMessage$DidCreatePlaylist.f6750c && wj50.m88271j(this.f6751d, vtecAndroidToWebMessage$DidCreatePlaylist.f6751d) && wj50.m88271j(this.f6752e, vtecAndroidToWebMessage$DidCreatePlaylist.f6752e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f6750c) * 31;
        String str = this.f6751d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6752e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
