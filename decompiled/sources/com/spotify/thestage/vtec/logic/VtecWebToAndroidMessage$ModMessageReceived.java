package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$ModMessageReceived", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$ModMessageReceived extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6811a;

    /* JADX INFO: renamed from: b */
    public final ModPayload f6812b;

    public VtecWebToAndroidMessage$ModMessageReceived(String str, ModPayload modPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6811a = (i & 1) != 0 ? "didSendModMessage" : str;
        this.f6812b = modPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$ModMessageReceived)) {
            return false;
        }
        VtecWebToAndroidMessage$ModMessageReceived vtecWebToAndroidMessage$ModMessageReceived = (VtecWebToAndroidMessage$ModMessageReceived) obj;
        return wj50.m88271j(this.f6811a, vtecWebToAndroidMessage$ModMessageReceived.f6811a) && wj50.m88271j(this.f6812b, vtecWebToAndroidMessage$ModMessageReceived.f6812b);
    }

    public final int hashCode() {
        return this.f6812b.hashCode() + (this.f6811a.hashCode() * 31);
    }
}
