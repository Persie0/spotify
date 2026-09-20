package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/OccupancyChannelEvent;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class OccupancyChannelEvent {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5232a;

    /* JADX INFO: renamed from: b */
    public final Occupancy f5233b;

    public OccupancyChannelEvent(CommonEventFields commonEventFields, Occupancy occupancy) {
        this.f5232a = commonEventFields;
        this.f5233b = occupancy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OccupancyChannelEvent)) {
            return false;
        }
        OccupancyChannelEvent occupancyChannelEvent = (OccupancyChannelEvent) obj;
        return wj50.m88271j(this.f5232a, occupancyChannelEvent.f5232a) && wj50.m88271j(this.f5233b, occupancyChannelEvent.f5233b);
    }

    public final int hashCode() {
        return this.f5233b.hashCode() + (this.f5232a.hashCode() * 31);
    }
}
