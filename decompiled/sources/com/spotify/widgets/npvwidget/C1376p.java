package com.spotify.widgets.npvwidget;

import p204p.d850;
import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.p */
/* JADX INFO: loaded from: classes11.dex */
public final class C1376p extends ibk {

    /* JADX INFO: renamed from: a */
    public WidgetInteraction.NpvMetadata f7062a;

    /* JADX INFO: renamed from: b */
    public String f7063b;

    /* JADX INFO: renamed from: c */
    public d850 f7064c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f7065d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1378r f7066e;

    /* JADX INFO: renamed from: f */
    public int f7067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1376p(C1378r c1378r, ibk ibkVar) {
        super(ibkVar);
        this.f7066e = c1378r;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7065d = obj;
        this.f7067f |= Integer.MIN_VALUE;
        return this.f7066e.m23094e(null, null, null, this);
    }
}
