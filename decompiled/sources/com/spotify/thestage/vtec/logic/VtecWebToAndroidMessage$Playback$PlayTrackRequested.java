package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7d1;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$Playback$PlayTrackRequested", "Lp/a7d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecWebToAndroidMessage$Playback$PlayTrackRequested extends a7d1 {

    /* JADX INFO: renamed from: a */
    public final transient String f6817a;

    /* JADX INFO: renamed from: b */
    public final String f6818b;

    public VtecWebToAndroidMessage$Playback$PlayTrackRequested(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f6817a = (i & 1) != 0 ? "didRequestPlayTrack" : str;
        this.f6818b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtecWebToAndroidMessage$Playback$PlayTrackRequested)) {
            return false;
        }
        VtecWebToAndroidMessage$Playback$PlayTrackRequested vtecWebToAndroidMessage$Playback$PlayTrackRequested = (VtecWebToAndroidMessage$Playback$PlayTrackRequested) obj;
        return wj50.m88271j(this.f6817a, vtecWebToAndroidMessage$Playback$PlayTrackRequested.f6817a) && wj50.m88271j(this.f6818b, vtecWebToAndroidMessage$Playback$PlayTrackRequested.f6818b);
    }

    public final int hashCode() {
        return this.f6818b.hashCode() + (this.f6817a.hashCode() * 31);
    }
}
