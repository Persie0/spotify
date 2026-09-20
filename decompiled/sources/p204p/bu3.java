package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public final class bu3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ du3 f31007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu3(du3 du3Var, int i) {
        super(0);
        this.f31006a = i;
        this.f31007b = du3Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f31006a) {
            case 0:
                du3 du3Var = this.f31007b;
                bji bjiVar = du3Var.f52956c;
                if (bjiVar != null) {
                    return (du3) bjiVar.mo29483e(new au3(du3Var, 0));
                }
                return null;
            default:
                du3 du3Var2 = this.f31007b;
                fnk0 fnk0Var = du3Var2.f52955b;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new fj1(du3Var2, 12))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
