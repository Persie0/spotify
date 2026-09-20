package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public final class uc01 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vc01 f228917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc01(vc01 vc01Var, int i) {
        super(0);
        this.f228916a = i;
        this.f228917b = vc01Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f228916a) {
            case 0:
                vc01 vc01Var = this.f228917b;
                bji bjiVar = vc01Var.f239634d;
                if (bjiVar != null) {
                    return (vc01) bjiVar.mo29483e(new jzn0(vc01Var, 10));
                }
                return null;
            default:
                vc01 vc01Var2 = this.f228917b;
                fnk0 fnk0Var = vc01Var2.f239633c;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new wiy0(vc01Var2, 8))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
