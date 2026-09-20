package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import java.util.List;
import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/BatchedChatChannelEvent;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class BatchedChatChannelEvent {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5147a;

    /* JADX INFO: renamed from: b */
    public final List f5148b;

    public BatchedChatChannelEvent(CommonEventFields commonEventFields, List list) {
        this.f5147a = commonEventFields;
        this.f5148b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchedChatChannelEvent)) {
            return false;
        }
        BatchedChatChannelEvent batchedChatChannelEvent = (BatchedChatChannelEvent) obj;
        return wj50.m88271j(this.f5147a, batchedChatChannelEvent.f5147a) && wj50.m88271j(this.f5148b, batchedChatChannelEvent.f5148b);
    }

    public final int hashCode() {
        return this.f5148b.hashCode() + (this.f5147a.hashCode() * 31);
    }
}
