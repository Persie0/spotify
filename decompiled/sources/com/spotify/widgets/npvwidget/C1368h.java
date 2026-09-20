package com.spotify.widgets.npvwidget;

import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.h */
/* JADX INFO: loaded from: classes11.dex */
public final class C1368h extends ibk {

    /* JADX INFO: renamed from: a */
    public String f7025a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371k f7027c;

    /* JADX INFO: renamed from: d */
    public int f7028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368h(C1371k c1371k, ibk ibkVar) {
        super(ibkVar);
        this.f7027c = c1371k;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7026b = obj;
        this.f7028d |= Integer.MIN_VALUE;
        return this.f7027c.m23084d(null, null, this);
    }
}
