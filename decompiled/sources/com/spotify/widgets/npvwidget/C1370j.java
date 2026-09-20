package com.spotify.widgets.npvwidget;

import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.j */
/* JADX INFO: loaded from: classes11.dex */
public final class C1370j extends ibk {

    /* JADX INFO: renamed from: a */
    public String f7033a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371k f7035c;

    /* JADX INFO: renamed from: d */
    public int f7036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370j(C1371k c1371k, ibk ibkVar) {
        super(ibkVar);
        this.f7035c = c1371k;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7034b = obj;
        this.f7036d |= Integer.MIN_VALUE;
        return this.f7035c.m23086f(null, null, this);
    }
}
