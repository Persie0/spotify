package com.spotify.thestage.vtec.logic;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.lau;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$CompleteEditProfile", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$CompleteEditProfile extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final transient String f6748c;

    /* JADX INFO: renamed from: d */
    public final List f6749d;

    public VtecAndroidToWebMessage$CompleteEditProfile(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "didCompleteEditProfile" : str;
        list = (i & 2) != 0 ? lau.f131415a : list;
        this.f6748c = str;
        this.f6749d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$CompleteEditProfile)) {
            return false;
        }
        VtecAndroidToWebMessage$CompleteEditProfile vtecAndroidToWebMessage$CompleteEditProfile = (VtecAndroidToWebMessage$CompleteEditProfile) obj;
        return wj50.m88271j(this.f6748c, vtecAndroidToWebMessage$CompleteEditProfile.f6748c) && wj50.m88271j(this.f6749d, vtecAndroidToWebMessage$CompleteEditProfile.f6749d);
    }

    public final int hashCode() {
        return this.f6749d.hashCode() + (this.f6748c.hashCode() * 31);
    }
}
