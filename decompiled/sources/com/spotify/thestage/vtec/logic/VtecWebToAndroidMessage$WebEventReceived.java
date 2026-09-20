package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$WebEventReceived", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$WebEventReceived extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6838a;

    /* JADX INFO: renamed from: b */
    public final String f6839b;

    /* JADX INFO: renamed from: c */
    public final String f6840c;

    /* JADX INFO: renamed from: d */
    public final String f6841d;

    /* JADX INFO: renamed from: e */
    public final String f6842e;

    public VtecWebToAndroidMessage$WebEventReceived(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6838a = (i & 1) != 0 ? "didSendEvent" : str;
        this.f6839b = str2;
        this.f6840c = str3;
        this.f6841d = str4;
        this.f6842e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$WebEventReceived)) {
            return false;
        }
        VtecWebToAndroidMessage$WebEventReceived vtecWebToAndroidMessage$WebEventReceived = (VtecWebToAndroidMessage$WebEventReceived) obj;
        return wj50.m88271j(this.f6838a, vtecWebToAndroidMessage$WebEventReceived.f6838a) && wj50.m88271j(this.f6839b, vtecWebToAndroidMessage$WebEventReceived.f6839b) && wj50.m88271j(this.f6840c, vtecWebToAndroidMessage$WebEventReceived.f6840c) && wj50.m88271j(this.f6841d, vtecWebToAndroidMessage$WebEventReceived.f6841d) && wj50.m88271j(this.f6842e, vtecWebToAndroidMessage$WebEventReceived.f6842e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f6838a.hashCode() * 31, 31, this.f6839b), 31, this.f6840c);
        String str = this.f6841d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6842e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
