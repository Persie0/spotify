package p204p;

import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: classes5.dex */
public final class poc1 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BehaviorProcessor f179673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fpc1 f179674b;

    public poc1(BehaviorProcessor behaviorProcessor, fpc1 fpc1Var) {
        this.f179673a = behaviorProcessor;
        this.f179674b = fpc1Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f179674b.m42326b();
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f179673a.onNext(Boolean.TRUE);
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f179673a.onNext(Boolean.FALSE);
    }
}
