package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatMessage;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ChatMessage {

    /* JADX INFO: renamed from: a */
    public final String f5167a;

    /* JADX INFO: renamed from: b */
    public final TextMessage f5168b;

    /* JADX INFO: renamed from: c */
    public final ChatMetadata f5169c;

    /* JADX INFO: renamed from: d */
    public final User f5170d;

    /* JADX INFO: renamed from: e */
    public final String f5171e;

    public ChatMessage(String str, TextMessage textMessage, ChatMetadata chatMetadata, User user, String str2) {
        this.f5167a = str;
        this.f5168b = textMessage;
        this.f5169c = chatMetadata;
        this.f5170d = user;
        this.f5171e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return wj50.m88271j(this.f5167a, chatMessage.f5167a) && wj50.m88271j(this.f5168b, chatMessage.f5168b) && wj50.m88271j(this.f5169c, chatMessage.f5169c) && wj50.m88271j(this.f5170d, chatMessage.f5170d) && wj50.m88271j(this.f5171e, chatMessage.f5171e);
    }

    public final int hashCode() {
        int iHashCode = this.f5167a.hashCode() * 31;
        TextMessage textMessage = this.f5168b;
        return this.f5171e.hashCode() + ((this.f5170d.hashCode() + ((this.f5169c.hashCode() + ((iHashCode + (textMessage == null ? 0 : textMessage.f5255a.hashCode())) * 31)) * 31)) * 31);
    }
}
