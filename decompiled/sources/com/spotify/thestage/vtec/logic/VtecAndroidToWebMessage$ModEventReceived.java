package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.ok60;
import p204p.v3d1;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$ModEventReceived", "Lp/v3d1;", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class VtecAndroidToWebMessage$ModEventReceived extends v3d1 {

    /* JADX INFO: renamed from: c */
    public final ModPayload f6755c;

    public VtecAndroidToWebMessage$ModEventReceived(ModPayload modPayload) {
        this.f6755c = modPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VtecAndroidToWebMessage$ModEventReceived) && wj50.m88271j(this.f6755c, ((VtecAndroidToWebMessage$ModEventReceived) obj).f6755c);
    }

    public final int hashCode() {
        return this.f6755c.hashCode();
    }
}
