package com.spotify.cosmos.servicebasedrouter;

import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.sir0;
import p204p.w2a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m24212d2 = {"Lp/w2a1;", "invoke", "()V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class ScopedCallbackRouter$routerState$1$scopeDisposable$2 extends qe70 implements eh00 {
    final /* synthetic */ sir0 $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedCallbackRouter$routerState$1$scopeDisposable$2(sir0 sir0Var) {
        super(0);
        this.$$this$callbackFlow = sir0Var;
    }

    @Override // p204p.eh00
    public /* bridge */ /* synthetic */ Object invoke() {
        m98333invoke();
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m98333invoke() {
        this.$$this$callbackFlow.mo30231j(ScopedCallbackRouter.RouterState.NotAvailable.INSTANCE);
    }
}
