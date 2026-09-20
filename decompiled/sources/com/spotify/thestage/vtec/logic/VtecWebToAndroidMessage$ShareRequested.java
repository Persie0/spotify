package com.spotify.thestage.vtec.logic;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.mt60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$ShareRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$ShareRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6823a;

    /* JADX INFO: renamed from: b */
    public final int f6824b;

    /* JADX INFO: renamed from: c */
    public final String f6825c;

    /* JADX INFO: renamed from: d */
    public final String f6826d;

    /* JADX INFO: renamed from: e */
    public final String f6827e;

    /* JADX INFO: renamed from: f */
    public final String f6828f;

    /* JADX INFO: renamed from: g */
    public final List f6829g;

    /* JADX INFO: renamed from: h */
    public final String f6830h;

    /* JADX INFO: renamed from: i */
    public final String f6831i;

    /* JADX INFO: renamed from: j */
    public final Boolean f6832j;

    /* JADX INFO: renamed from: k */
    public final String f6833k;

    public VtecWebToAndroidMessage$ShareRequested(String str, int i, String str2, String str3, String str4, String str5, List list, String str6, String str7, Boolean bool, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i2 & 1) != 0 ? "didRequestShare" : str;
        str4 = (i2 & 16) != 0 ? null : str4;
        list = (i2 & 64) != 0 ? null : list;
        str6 = (i2 & 128) != 0 ? null : str6;
        str7 = (i2 & 256) != 0 ? null : str7;
        bool = (i2 & 512) != 0 ? null : bool;
        str8 = (i2 & 1024) != 0 ? null : str8;
        this.f6823a = str;
        this.f6824b = i;
        this.f6825c = str2;
        this.f6826d = str3;
        this.f6827e = str4;
        this.f6828f = str5;
        this.f6829g = list;
        this.f6830h = str6;
        this.f6831i = str7;
        this.f6832j = bool;
        this.f6833k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$ShareRequested)) {
            return false;
        }
        VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested = (VtecWebToAndroidMessage$ShareRequested) obj;
        return wj50.m88271j(this.f6823a, vtecWebToAndroidMessage$ShareRequested.f6823a) && this.f6824b == vtecWebToAndroidMessage$ShareRequested.f6824b && wj50.m88271j(this.f6825c, vtecWebToAndroidMessage$ShareRequested.f6825c) && wj50.m88271j(this.f6826d, vtecWebToAndroidMessage$ShareRequested.f6826d) && wj50.m88271j(this.f6827e, vtecWebToAndroidMessage$ShareRequested.f6827e) && wj50.m88271j(this.f6828f, vtecWebToAndroidMessage$ShareRequested.f6828f) && wj50.m88271j(this.f6829g, vtecWebToAndroidMessage$ShareRequested.f6829g) && wj50.m88271j(this.f6830h, vtecWebToAndroidMessage$ShareRequested.f6830h) && wj50.m88271j(this.f6831i, vtecWebToAndroidMessage$ShareRequested.f6831i) && wj50.m88271j(this.f6832j, vtecWebToAndroidMessage$ShareRequested.f6832j) && wj50.m88271j(this.f6833k, vtecWebToAndroidMessage$ShareRequested.f6833k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f6824b, this.f6823a.hashCode() * 31, 31), 31, this.f6825c), 31, this.f6826d);
        String str = this.f6827e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6828f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f6829g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f6830h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6831i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f6832j;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f6833k;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
