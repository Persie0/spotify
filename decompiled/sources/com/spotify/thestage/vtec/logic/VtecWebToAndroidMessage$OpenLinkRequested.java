package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$OpenLinkRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$OpenLinkRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6813a;

    /* JADX INFO: renamed from: b */
    public final String f6814b;

    /* JADX INFO: renamed from: c */
    public final String f6815c;

    public VtecWebToAndroidMessage$OpenLinkRequested(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6813a = (i & 1) != 0 ? "didRequestOpenLink" : str;
        this.f6814b = str2;
        this.f6815c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$OpenLinkRequested)) {
            return false;
        }
        VtecWebToAndroidMessage$OpenLinkRequested vtecWebToAndroidMessage$OpenLinkRequested = (VtecWebToAndroidMessage$OpenLinkRequested) obj;
        return wj50.m88271j(this.f6813a, vtecWebToAndroidMessage$OpenLinkRequested.f6813a) && wj50.m88271j(this.f6814b, vtecWebToAndroidMessage$OpenLinkRequested.f6814b) && wj50.m88271j(this.f6815c, vtecWebToAndroidMessage$OpenLinkRequested.f6815c);
    }

    public final int hashCode() {
        return this.f6815c.hashCode() + s571.m77243b(this.f6813a.hashCode() * 31, 31, this.f6814b);
    }
}
