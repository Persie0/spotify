package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public final class nl4 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f155003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ol4 f155004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl4(ol4 ol4Var, int i) {
        super(0);
        this.f155003a = i;
        this.f155004b = ol4Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f155003a) {
            case 0:
                ol4 ol4Var = this.f155004b;
                bji bjiVar = ol4Var.f166751c;
                if (bjiVar != null) {
                    return (ol4) bjiVar.mo29483e(new nj4(ol4Var, 19));
                }
                return null;
            default:
                ol4 ol4Var2 = this.f155004b;
                fnk0 fnk0Var = ol4Var2.f166750b;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new ihj0(ol4Var2, 18))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
