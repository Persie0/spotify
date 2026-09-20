package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ekd0;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/MediaPlaybackChannelEvent$PlayEvent", "Lp/ekd0;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class MediaPlaybackChannelEvent$PlayEvent implements ekd0 {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5209a;

    /* JADX INFO: renamed from: b */
    public final String f5210b;

    /* JADX INFO: renamed from: c */
    public final PlayMessage f5211c;

    public MediaPlaybackChannelEvent$PlayEvent(CommonEventFields commonEventFields, String str, PlayMessage playMessage) {
        this.f5209a = commonEventFields;
        this.f5210b = str;
        this.f5211c = playMessage;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonEventFields getF5209a() {
        return this.f5209a;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF5210b() {
        return this.f5210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackChannelEvent$PlayEvent)) {
            return false;
        }
        MediaPlaybackChannelEvent$PlayEvent mediaPlaybackChannelEvent$PlayEvent = (MediaPlaybackChannelEvent$PlayEvent) obj;
        return wj50.m88271j(this.f5209a, mediaPlaybackChannelEvent$PlayEvent.f5209a) && wj50.m88271j(this.f5210b, mediaPlaybackChannelEvent$PlayEvent.f5210b) && wj50.m88271j(this.f5211c, mediaPlaybackChannelEvent$PlayEvent.f5211c);
    }

    public final int hashCode() {
        int iHashCode = this.f5209a.hashCode() * 31;
        String str = this.f5210b;
        return this.f5211c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
