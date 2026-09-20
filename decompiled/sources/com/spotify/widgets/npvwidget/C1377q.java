package com.spotify.widgets.npvwidget;

import p204p.d850;
import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.q */
/* JADX INFO: loaded from: classes11.dex */
public final class C1377q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f7068a;

    /* JADX INFO: renamed from: b */
    public d850 f7069b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f7070c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1378r f7071d;

    /* JADX INFO: renamed from: e */
    public int f7072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377q(C1378r c1378r, ibk ibkVar) {
        super(ibkVar);
        this.f7071d = c1378r;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7070c = obj;
        this.f7072e |= Integer.MIN_VALUE;
        return this.f7071d.m23095f(null, null, null, this);
    }
}
