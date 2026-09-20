package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import java.util.List;
import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/PlayMessage;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PlayMessage {

    /* JADX INFO: renamed from: a */
    public final String f5245a;

    /* JADX INFO: renamed from: b */
    public final String f5246b;

    /* JADX INFO: renamed from: c */
    public final List f5247c;

    public PlayMessage(String str, List list, String str2) {
        this.f5245a = str;
        this.f5246b = str2;
        this.f5247c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayMessage)) {
            return false;
        }
        PlayMessage playMessage = (PlayMessage) obj;
        return wj50.m88271j(this.f5245a, playMessage.f5245a) && wj50.m88271j(this.f5246b, playMessage.f5246b) && wj50.m88271j(this.f5247c, playMessage.f5247c);
    }

    public final int hashCode() {
        String str = this.f5245a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5246b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5247c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
