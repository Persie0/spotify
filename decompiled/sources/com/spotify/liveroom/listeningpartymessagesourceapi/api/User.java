package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.wj50;
import p204p.yqa1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/User;", "", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class User {

    /* JADX INFO: renamed from: a */
    public final yqa1 f5261a;

    /* JADX INFO: renamed from: b */
    public final String f5262b;

    /* JADX INFO: renamed from: c */
    public final String f5263c;

    public User(yqa1 yqa1Var, String str, String str2) {
        this.f5261a = yqa1Var;
        this.f5262b = str;
        this.f5263c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return wj50.m88271j(this.f5261a, user.f5261a) && wj50.m88271j(this.f5262b, user.f5262b) && wj50.m88271j(this.f5263c, user.f5263c);
    }

    public final int hashCode() {
        int iHashCode = this.f5261a.hashCode() * 31;
        String str = this.f5262b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5263c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
