package com.spotify.widgets.npvwidget;

import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C1362b extends ibk {

    /* JADX INFO: renamed from: a */
    public String f6997a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1371k f6999c;

    /* JADX INFO: renamed from: d */
    public int f7000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362b(C1371k c1371k, ibk ibkVar) {
        super(ibkVar);
        this.f6999c = c1371k;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f6998b = obj;
        this.f7000d |= Integer.MIN_VALUE;
        return this.f6999c.m23083c(null, null, this);
    }
}
