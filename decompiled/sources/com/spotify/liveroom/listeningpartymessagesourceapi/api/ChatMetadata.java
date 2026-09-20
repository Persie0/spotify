package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatMetadata;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ChatMetadata {

    /* JADX INFO: renamed from: a */
    public final Integer f5177a;

    /* JADX INFO: renamed from: b */
    public final Boolean f5178b;

    public ChatMetadata(Boolean bool, Integer num) {
        this.f5177a = num;
        this.f5178b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMetadata)) {
            return false;
        }
        ChatMetadata chatMetadata = (ChatMetadata) obj;
        return wj50.m88271j(this.f5177a, chatMetadata.f5177a) && wj50.m88271j(this.f5178b, chatMetadata.f5178b);
    }

    public final int hashCode() {
        Integer num = this.f5177a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f5178b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
