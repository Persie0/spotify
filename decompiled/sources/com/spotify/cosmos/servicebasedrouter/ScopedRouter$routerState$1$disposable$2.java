package com.spotify.cosmos.servicebasedrouter;

import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.Metadata;
import p204p.eh00;
import p204p.qe70;
import p204p.w2a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m24212d2 = {"Lp/w2a1;", "invoke", "()V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class ScopedRouter$routerState$1$disposable$2 extends qe70 implements eh00 {
    final /* synthetic */ ObservableEmitter<ScopedRouter.RouterState> $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedRouter$routerState$1$disposable$2(ObservableEmitter<ScopedRouter.RouterState> observableEmitter) {
        super(0);
        this.$emitter = observableEmitter;
    }

    @Override // p204p.eh00
    public /* bridge */ /* synthetic */ Object invoke() {
        m98334invoke();
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m98334invoke() {
        this.$emitter.onNext(ScopedRouter.RouterState.NotAvailable.INSTANCE);
    }
}
