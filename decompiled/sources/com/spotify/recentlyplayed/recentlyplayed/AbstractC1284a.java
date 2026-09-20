package com.spotify.recentlyplayed.recentlyplayed;

import java.util.List;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.xl60;

/* JADX INFO: renamed from: com.spotify.recentlyplayed.recentlyplayed.a */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC1284a {

    /* JADX INFO: renamed from: a */
    public static final xl60.C2578b f6611a;

    /* JADX INFO: renamed from: b */
    public static final hk60 f6612b;

    /* JADX INFO: renamed from: c */
    public static final hk60 f6613c;

    /* JADX INFO: renamed from: d */
    public static final hk60 f6614d;

    static {
        p0i0 p0i0VarM68713e = new p0i0.C2237b().m68709a(RecentlyPlayedEntity.INSTANCE).m68713e();
        f6611a = xl60.C2578b.m91389a("length", "loaded", "items");
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        f6612b = p0i0VarM68713e.m68706f(cls, gbuVar, "length");
        f6613c = p0i0VarM68713e.m68706f(Boolean.TYPE, gbuVar, "loaded");
        f6614d = p0i0VarM68713e.m68706f(mp91.m62457j(List.class, RecentlyPlayedEntity.class), gbuVar, "items");
    }
}
