package com.spotify.widgets.npvwidget;

import p204p.d850;
import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.n */
/* JADX INFO: loaded from: classes11.dex */
public final class C1374n extends ibk {

    /* JADX INFO: renamed from: a */
    public WidgetInteraction.Background f7050a;

    /* JADX INFO: renamed from: b */
    public String f7051b;

    /* JADX INFO: renamed from: c */
    public d850 f7052c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f7053d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1378r f7054e;

    /* JADX INFO: renamed from: f */
    public int f7055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374n(C1378r c1378r, ibk ibkVar) {
        super(ibkVar);
        this.f7054e = c1378r;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7053d = obj;
        this.f7055f |= Integer.MIN_VALUE;
        return this.f7054e.m23091b(null, null, null, this);
    }
}
