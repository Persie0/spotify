package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;
import p204p.yqa1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/UserIdentifier$Host", "Lp/yqa1;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class UserIdentifier$Host implements yqa1 {

    /* JADX INFO: renamed from: a */
    public final String f5265a;

    public UserIdentifier$Host(String str) {
        this.f5265a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserIdentifier$Host) && wj50.m88271j(this.f5265a, ((UserIdentifier$Host) obj).f5265a);
    }

    public final int hashCode() {
        return this.f5265a.hashCode();
    }
}
