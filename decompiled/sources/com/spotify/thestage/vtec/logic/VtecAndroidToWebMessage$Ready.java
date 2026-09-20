package com.spotify.thestage.vtec.logic;

import java.util.List;
import kotlin.Metadata;
import p204p.ok60;
import p204p.s571;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$Ready", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$Ready extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final Capabilities f6758c;

    /* JADX INFO: renamed from: d */
    public final boolean f6759d;

    /* JADX INFO: renamed from: e */
    public final VtecAndroidToWebMessage$PlaybackStatusChanged f6760e;

    /* JADX INFO: renamed from: f */
    public final boolean f6761f;

    /* JADX INFO: renamed from: g */
    public final String f6762g;

    /* JADX INFO: renamed from: h */
    public final String f6763h;

    /* JADX INFO: renamed from: i */
    public final String f6764i;

    /* JADX INFO: renamed from: j */
    public final String f6765j;

    /* JADX INFO: renamed from: k */
    public final List f6766k;

    public VtecAndroidToWebMessage$Ready(Capabilities capabilities, boolean z, VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged, boolean z2, String str, String str2, String str3, String str4, List list) {
        this.f6758c = capabilities;
        this.f6759d = z;
        this.f6760e = vtecAndroidToWebMessage$PlaybackStatusChanged;
        this.f6761f = z2;
        this.f6762g = str;
        this.f6763h = str2;
        this.f6764i = str3;
        this.f6765j = str4;
        this.f6766k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$Ready)) {
            return false;
        }
        VtecAndroidToWebMessage$Ready vtecAndroidToWebMessage$Ready = (VtecAndroidToWebMessage$Ready) obj;
        return wj50.m88271j(this.f6758c, vtecAndroidToWebMessage$Ready.f6758c) && this.f6759d == vtecAndroidToWebMessage$Ready.f6759d && wj50.m88271j(this.f6760e, vtecAndroidToWebMessage$Ready.f6760e) && this.f6761f == vtecAndroidToWebMessage$Ready.f6761f && wj50.m88271j(this.f6762g, vtecAndroidToWebMessage$Ready.f6762g) && wj50.m88271j(this.f6763h, vtecAndroidToWebMessage$Ready.f6763h) && wj50.m88271j(this.f6764i, vtecAndroidToWebMessage$Ready.f6764i) && wj50.m88271j(this.f6765j, vtecAndroidToWebMessage$Ready.f6765j) && wj50.m88271j(this.f6766k, vtecAndroidToWebMessage$Ready.f6766k);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f6758c.hashCode() * 31, 31, this.f6759d);
        VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged = this.f6760e;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77245d((iM77245d + (vtecAndroidToWebMessage$PlaybackStatusChanged == null ? 0 : vtecAndroidToWebMessage$PlaybackStatusChanged.hashCode())) * 31, 31, this.f6761f), 31, this.f6762g), 31, this.f6763h);
        String str = this.f6764i;
        return this.f6766k.hashCode() + s571.m77243b((iM77243b + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6765j);
    }
}
