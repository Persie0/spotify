package com.spotify.widgets.npvwidget;

import p204p.d850;
import p204p.ibk;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.o */
/* JADX INFO: loaded from: classes11.dex */
public final class C1375o extends ibk {

    /* JADX INFO: renamed from: a */
    public WidgetInteraction.ItemClick f7056a;

    /* JADX INFO: renamed from: b */
    public String f7057b;

    /* JADX INFO: renamed from: c */
    public d850 f7058c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f7059d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1378r f7060e;

    /* JADX INFO: renamed from: f */
    public int f7061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375o(C1378r c1378r, ibk ibkVar) {
        super(ibkVar);
        this.f7060e = c1378r;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f7059d = obj;
        this.f7061f |= Integer.MIN_VALUE;
        return this.f7060e.m23093d(null, null, null, this);
    }
}
