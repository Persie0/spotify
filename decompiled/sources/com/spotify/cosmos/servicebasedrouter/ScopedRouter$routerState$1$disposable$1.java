package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.Metadata;
import p204p.gh00;
import p204p.qe70;
import p204p.w2a1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m24212d2 = {"Lcom/spotify/cosmos/rxrouter/RxRouter;", "router", "Lp/w2a1;", "invoke", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class ScopedRouter$routerState$1$disposable$1 extends qe70 implements gh00 {
    final /* synthetic */ ObservableEmitter<ScopedRouter.RouterState> $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedRouter$routerState$1$disposable$1(ObservableEmitter<ScopedRouter.RouterState> observableEmitter) {
        super(1);
        this.$emitter = observableEmitter;
    }

    @Override // p204p.gh00
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RxRouter) obj);
        return w2a1.f247311a;
    }

    public final void invoke(RxRouter rxRouter) {
        this.$emitter.onNext(new ScopedRouter.RouterState.Available(rxRouter));
    }
}
