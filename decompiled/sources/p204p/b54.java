package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;

/* JADX INFO: loaded from: classes7.dex */
public final class b54 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c54 f23507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b54(c54 c54Var, int i) {
        super(0);
        this.f23506a = i;
        this.f23507b = c54Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f23506a) {
            case 0:
                c54 c54Var = this.f23507b;
                bji bjiVar = c54Var.f34075d;
                if (bjiVar != null) {
                    return (c54) bjiVar.mo29483e(new v44(c54Var, 4));
                }
                return null;
            default:
                c54 c54Var2 = this.f23507b;
                fnk0 fnk0Var = c54Var2.f34074c;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new ihj0(c54Var2, 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
        }
    }
}
