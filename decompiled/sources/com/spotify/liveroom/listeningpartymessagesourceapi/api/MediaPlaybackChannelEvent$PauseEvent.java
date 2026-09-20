package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ekd0;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/MediaPlaybackChannelEvent$PauseEvent", "Lp/ekd0;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class MediaPlaybackChannelEvent$PauseEvent implements ekd0 {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5206a;

    /* JADX INFO: renamed from: b */
    public final String f5207b;

    /* JADX INFO: renamed from: c */
    public final PauseMessage f5208c;

    public MediaPlaybackChannelEvent$PauseEvent(CommonEventFields commonEventFields, String str, PauseMessage pauseMessage) {
        this.f5206a = commonEventFields;
        this.f5207b = str;
        this.f5208c = pauseMessage;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonEventFields getF5206a() {
        return this.f5206a;
    }

    @Override // p204p.ekd0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF5207b() {
        return this.f5207b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackChannelEvent$PauseEvent)) {
            return false;
        }
        MediaPlaybackChannelEvent$PauseEvent mediaPlaybackChannelEvent$PauseEvent = (MediaPlaybackChannelEvent$PauseEvent) obj;
        return wj50.m88271j(this.f5206a, mediaPlaybackChannelEvent$PauseEvent.f5206a) && wj50.m88271j(this.f5207b, mediaPlaybackChannelEvent$PauseEvent.f5207b) && wj50.m88271j(this.f5208c, mediaPlaybackChannelEvent$PauseEvent.f5208c);
    }

    public final int hashCode() {
        int iHashCode = this.f5206a.hashCode() * 31;
        String str = this.f5207b;
        return this.f5208c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
