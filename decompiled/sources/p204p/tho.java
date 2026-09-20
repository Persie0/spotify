package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes6.dex */
public final class tho extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f220465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tho(ObservableEmitter observableEmitter, int i) {
        super(0);
        this.f220464a = i;
        this.f220465b = observableEmitter;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f220464a) {
            case 0:
                ObservableEmitter observableEmitter = this.f220465b;
                w2a1 w2a1Var = w2a1.f247311a;
                observableEmitter.onNext(w2a1Var);
                return w2a1Var;
            case 1:
                ObservableEmitter observableEmitter2 = this.f220465b;
                if (!observableEmitter2.isDisposed()) {
                    observableEmitter2.onNext(fvr0.f73847a);
                    observableEmitter2.onComplete();
                }
                return w2a1.f247311a;
            case 2:
                ObservableEmitter observableEmitter3 = this.f220465b;
                if (!observableEmitter3.isDisposed()) {
                    observableEmitter3.onComplete();
                }
                return w2a1.f247311a;
            case 3:
                ObservableEmitter observableEmitter4 = this.f220465b;
                if (!observableEmitter4.isDisposed()) {
                    observableEmitter4.onNext(svr0.f214503a);
                    observableEmitter4.onComplete();
                }
                return w2a1.f247311a;
            case 4:
                ObservableEmitter observableEmitter5 = this.f220465b;
                if (!observableEmitter5.isDisposed()) {
                    observableEmitter5.onComplete();
                }
                return w2a1.f247311a;
            case 5:
                ObservableEmitter observableEmitter6 = this.f220465b;
                if (!observableEmitter6.isDisposed()) {
                    observableEmitter6.onComplete();
                }
                return w2a1.f247311a;
            case 6:
                this.f220465b.onNext(vua1.f244903a);
                return w2a1.f247311a;
            case 7:
                this.f220465b.onNext(fva1.f73747a);
                return w2a1.f247311a;
            case 8:
                this.f220465b.onNext(yua1.f276293a);
                return w2a1.f247311a;
            default:
                this.f220465b.onNext(bva1.f31318a);
                return w2a1.f247311a;
        }
    }
}
