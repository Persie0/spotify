package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public final class xx3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yx3 f266849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx3(yx3 yx3Var, int i) {
        super(0);
        this.f266848a = i;
        this.f266849b = yx3Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f266848a) {
            case 0:
                yx3 yx3Var = this.f266849b;
                bji bjiVar = yx3Var.f277122d;
                if (bjiVar != null) {
                    return (yx3) bjiVar.mo29483e(new jv3(yx3Var, 10));
                }
                return null;
            default:
                yx3 yx3Var2 = this.f266849b;
                fnk0 fnk0Var = yx3Var2.f277121c;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new egb1(yx3Var2, 12))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
