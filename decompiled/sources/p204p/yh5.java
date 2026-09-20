package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public final class yh5 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zh5 f272732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh5(zh5 zh5Var, int i) {
        super(0);
        this.f272731a = i;
        this.f272732b = zh5Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f272731a) {
            case 0:
                zh5 zh5Var = this.f272732b;
                bji bjiVar = zh5Var.f282807e;
                if (bjiVar != null) {
                    return (zh5) bjiVar.mo29483e(new pt4(zh5Var, 24));
                }
                return null;
            default:
                zh5 zh5Var2 = this.f272732b;
                fnk0 fnk0Var = zh5Var2.f282806d;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new hd41(zh5Var2, 18))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
