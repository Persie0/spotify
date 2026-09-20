package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$BetaMessage", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$BetaMessage extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final String f6745c;

    /* JADX INFO: renamed from: d */
    public final Object f6746d;

    public VtecAndroidToWebMessage$BetaMessage(String str, Object obj) {
        this.f6745c = str;
        this.f6746d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecAndroidToWebMessage$BetaMessage)) {
            return false;
        }
        VtecAndroidToWebMessage$BetaMessage vtecAndroidToWebMessage$BetaMessage = (VtecAndroidToWebMessage$BetaMessage) obj;
        return wj50.m88271j(this.f6745c, vtecAndroidToWebMessage$BetaMessage.f6745c) && wj50.m88271j(this.f6746d, vtecAndroidToWebMessage$BetaMessage.f6746d);
    }

    public final int hashCode() {
        int iHashCode = this.f6745c.hashCode() * 31;
        Object obj = this.f6746d;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public /* synthetic */ VtecAndroidToWebMessage$BetaMessage(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj);
    }
}
