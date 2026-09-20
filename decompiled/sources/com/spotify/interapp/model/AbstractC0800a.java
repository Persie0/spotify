package com.spotify.interapp.model;

import p204p.c6x0;
import p204p.p0i0;
import p204p.s6x0;
import p204p.ub70;

/* JADX INFO: renamed from: com.spotify.interapp.model.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0800a {

    /* JADX INFO: renamed from: a */
    public static final AppProtocol$Empty f4604a = new AppProtocol$Empty();

    /* JADX INFO: renamed from: b */
    public static final p0i0 f4605b = new p0i0.C2237b().m68711c(new ub70()).m68713e();

    public final String toString() {
        Object c6x0Var;
        try {
            c6x0Var = f4605b.m68704d(getClass()).toJson(this);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            c6x0Var = "{}";
        }
        return (String) c6x0Var;
    }
}
