package com.spotify.widgets.npvwidget;

import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.i */
/* JADX INFO: loaded from: classes11.dex */
public final class C1369i extends ibk {

    /* JADX INFO: renamed from: a */
    public String f7029a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f7030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371k f7031c;

    /* JADX INFO: renamed from: d */
    public int f7032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369i(C1371k c1371k, ibk ibkVar) {
        super(ibkVar);
        this.f7031c = c1371k;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7030b = obj;
        this.f7032d |= Integer.MIN_VALUE;
        return this.f7031c.m23085e(null, null, this);
    }
}
