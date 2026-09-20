package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;
import p204p.yqa1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/UserJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/User;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class UserJsonAdapter extends hk60<User> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5276a = xl60.C2578b.m91389a("ident", "displayName", "avatar");

    /* JADX INFO: renamed from: b */
    public final hk60 f5277b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5278c;

    public UserJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5277b = p0i0Var.m68706f(yqa1.class, gbuVar, "ident");
        this.f5278c = p0i0Var.m68706f(String.class, gbuVar, "displayName");
    }

    @Override // p204p.hk60
    public final User fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        yqa1 yqa1Var = null;
        String str = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5276a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K != 0) {
                hk60 hk60Var = this.f5278c;
                if (iMo51071K == 1) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                yqa1Var = (yqa1) this.f5277b.fromJson(xl60Var);
                if (yqa1Var == null) {
                    throw f0b1.m40470x("ident", "ident", xl60Var);
                }
            }
        }
        xl60Var.mo51078f();
        if (yqa1Var != null) {
            return new User(yqa1Var, str, str2);
        }
        throw f0b1.m40461o("ident", "ident", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, User user) {
        User user2 = user;
        if (user2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("ident");
        this.f5277b.toJson(rm60Var, user2.f5261a);
        rm60Var.mo56894s("displayName");
        String str = user2.f5262b;
        hk60 hk60Var = this.f5278c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("avatar");
        hk60Var.toJson(rm60Var, user2.f5263c);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(26, "GeneratedJsonAdapter(User)");
    }
}
