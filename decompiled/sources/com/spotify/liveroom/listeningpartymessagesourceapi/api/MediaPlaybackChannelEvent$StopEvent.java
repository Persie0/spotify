package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ekd0;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/MediaPlaybackChannelEvent$StopEvent", "Lp/ekd0;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class MediaPlaybackChannelEvent$StopEvent implements ekd0 {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5212a;

    /* JADX INFO: renamed from: b */
    public final String f5213b;

    /* JADX INFO: renamed from: c */
    public final StopMessage f5214c;

    public MediaPlaybackChannelEvent$StopEvent(CommonEventFields commonEventFields, String str, StopMessage stopMessage) {
        this.f5212a = commonEventFields;
        this.f5213b = str;
        this.f5214c = stopMessage;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonEventFields getF5212a() {
        return this.f5212a;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF5213b() {
        return this.f5213b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackChannelEvent$StopEvent)) {
            return false;
        }
        MediaPlaybackChannelEvent$StopEvent mediaPlaybackChannelEvent$StopEvent = (MediaPlaybackChannelEvent$StopEvent) obj;
        return wj50.m88271j(this.f5212a, mediaPlaybackChannelEvent$StopEvent.f5212a) && wj50.m88271j(this.f5213b, mediaPlaybackChannelEvent$StopEvent.f5213b) && wj50.m88271j(this.f5214c, mediaPlaybackChannelEvent$StopEvent.f5214c);
    }

    public final int hashCode() {
        int iHashCode = this.f5212a.hashCode() * 31;
        String str = this.f5213b;
        return this.f5214c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
