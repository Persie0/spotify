package com.spotify.widgets.npvwidget;

import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.a */
/* JADX INFO: loaded from: classes11.dex */
public final class C1361a extends ibk {

    /* JADX INFO: renamed from: a */
    public String f6993a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371k f6995c;

    /* JADX INFO: renamed from: d */
    public int f6996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361a(C1371k c1371k, ibk ibkVar) {
        super(ibkVar);
        this.f6995c = c1371k;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f6994b = obj;
        this.f6996d |= Integer.MIN_VALUE;
        return this.f6995c.m23082b(null, null, this);
    }
}
