package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
public final class gp4 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hp4 f83070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp4(hp4 hp4Var, int i) {
        super(0);
        this.f83069a = i;
        this.f83070b = hp4Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f83069a) {
            case 0:
                hp4 hp4Var = this.f83070b;
                bji bjiVar = hp4Var.f93695c;
                if (bjiVar != null) {
                    return (hp4) bjiVar.mo29483e(new bo4(hp4Var, 10));
                }
                return null;
            default:
                hp4 hp4Var2 = this.f83070b;
                fnk0 fnk0Var = hp4Var2.f93694b;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new hd41(hp4Var2, 16))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
