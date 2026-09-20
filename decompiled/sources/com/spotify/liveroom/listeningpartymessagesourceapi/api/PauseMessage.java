package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/PauseMessage;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PauseMessage {

    /* JADX INFO: renamed from: a */
    public final String f5242a;

    public PauseMessage(String str) {
        this.f5242a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PauseMessage) && wj50.m88271j(this.f5242a, ((PauseMessage) obj).f5242a);
    }

    public final int hashCode() {
        String str = this.f5242a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
