package com.spotify.browse.clientnative.mobius;

import p204p.cgm;
import p204p.crs;
import p204p.hc80;
import p204p.k0e1;
import p204p.luk;
import p204p.pz90;
import p204p.rmx;
import p204p.yab;

/* JADX INFO: renamed from: com.spotify.browse.clientnative.mobius.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C0318b {

    /* JADX INFO: renamed from: a */
    public final luk f3112a;

    /* JADX INFO: renamed from: b */
    public final luk f3113b;

    /* JADX INFO: renamed from: c */
    public final pz90 f3114c;

    /* JADX INFO: renamed from: d */
    public final yab f3115d;

    /* JADX INFO: renamed from: e */
    public final yab f3116e;

    public C0318b(luk lukVar, luk lukVar2, pz90 pz90Var, hc80 hc80Var, rmx rmxVar, cgm cgmVar) {
        this.f3112a = lukVar;
        this.f3113b = lukVar2;
        this.f3114c = pz90Var;
        this.f3115d = k0e1.m54985d(rmxVar.m75985d().skip(1L).map(C0317a.f3111a));
        this.f3116e = k0e1.m54985d(cgmVar.m32730a(true).skip(1L).distinctUntilChanged().map(crs.f41392Z));
    }
}
