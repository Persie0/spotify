package com.spotify.widgets.npvwidget;

import p204p.byz0;
import p204p.d850;
import p204p.gh00;
import p204p.qe70;
import p204p.qtd1;
import p204p.w2a1;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.c */
/* JADX INFO: loaded from: classes11.dex */
public final class C1363c extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d850 f7001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WidgetInteraction.PlayCommand f7002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f7003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363c(d850 d850Var, WidgetInteraction.PlayCommand playCommand, String str) {
        super(1);
        this.f7001a = d850Var;
        this.f7002b = playCommand;
        this.f7003c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((byz0) obj).mo30912E().m30510b(new qtd1(this.f7001a.f46380a.f279709a, this.f7002b.getContextUri(), this.f7003c));
        return w2a1.f247311a;
    }
}
