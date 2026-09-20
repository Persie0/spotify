package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ezc;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/ChatChannelEvent$UnpinMessageEvent", "Lp/ezc;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ChatChannelEvent$UnpinMessageEvent implements ezc {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5156a;

    /* JADX INFO: renamed from: b */
    public final UnpinMessage f5157b;

    public ChatChannelEvent$UnpinMessageEvent(CommonEventFields commonEventFields, UnpinMessage unpinMessage) {
        this.f5156a = commonEventFields;
        this.f5157b = unpinMessage;
    }

    @Override // p204p.ezc
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonEventFields getF5156a() {
        return this.f5156a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatChannelEvent$UnpinMessageEvent)) {
            return false;
        }
        ChatChannelEvent$UnpinMessageEvent chatChannelEvent$UnpinMessageEvent = (ChatChannelEvent$UnpinMessageEvent) obj;
        return wj50.m88271j(this.f5156a, chatChannelEvent$UnpinMessageEvent.f5156a) && wj50.m88271j(this.f5157b, chatChannelEvent$UnpinMessageEvent.f5157b);
    }

    public final int hashCode() {
        return this.f5157b.f5258a.hashCode() + (this.f5156a.hashCode() * 31);
    }
}
