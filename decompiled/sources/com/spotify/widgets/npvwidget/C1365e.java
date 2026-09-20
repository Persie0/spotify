package com.spotify.widgets.npvwidget;

import p204p.byz0;
import p204p.d850;
import p204p.gh00;
import p204p.qe70;
import p204p.qtd1;
import p204p.w2a1;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.e */
/* JADX INFO: loaded from: classes11.dex */
public final class C1365e extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d850 f7010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WidgetInteraction.ItemClick f7011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f7012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365e(d850 d850Var, WidgetInteraction.ItemClick itemClick, String str) {
        super(1);
        this.f7010a = d850Var;
        this.f7011b = itemClick;
        this.f7012c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((byz0) obj).mo30912E().m30510b(new qtd1(this.f7010a.f46380a.f279709a, this.f7011b.getUri().toString(), this.f7012c));
        return w2a1.f247311a;
    }
}
