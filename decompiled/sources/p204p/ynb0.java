package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes8.dex */
public final class ynb0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274428a;

    /* JADX INFO: renamed from: b */
    public final Object f274429b;

    public /* synthetic */ ynb0(Object obj, int i) {
        this.f274428a = i;
        this.f274429b = obj;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        Observable observableStartWithItem;
        switch (this.f274428a) {
            case 0:
                return observable.switchMap(new w090((ObservableFromPublisher) this.f274429b, 9));
            case 1:
                return observable.switchMap(new zb70((wmb0) this.f274429b, 12));
            case 2:
                return observable.switchMap(new zb70((n2d0) this.f274429b, 18));
            case 3:
                return observable.switchMap(new mj70((ooe0) this.f274429b, 20)).take(1L).map(lby.f131750N0);
            case 4:
                return observable.flatMap(new jwj0((kwj0) this.f274429b, 0));
            case 5:
                return observable.flatMap(new k4k0((nij0) this.f274429b, 0));
            case 6:
                return observable.switchMap(new s780((flw0) this.f274429b, 29));
            case 7:
                return observable.switchMap(new pqk0(this, 3));
            case 8:
                eyl0 eyl0Var = ((hyl0) this.f274429b).f96612t;
                return (eyl0Var == null || (observableStartWithItem = observable.startWithItem(eyl0Var)) == null) ? observable : observableStartWithItem;
            case 9:
                return observable.map(new fbk0((y9n0) this.f274429b, 10));
            case 10:
                return observable.flatMapSingle(new ben0((den0) this.f274429b));
            case 11:
                fen0 fen0Var = (fen0) this.f274429b;
                return Observable.wrap(observable.flatMapSingle(new ezk0(fen0Var.f68809a, 7))).map(new xuk0(fen0Var, 8));
            case 12:
                return observable.flatMap(new xuk0(this, 9));
            case 13:
                return observable.flatMap(new k0a0(this, 27));
            case 14:
                return observable.switchMapSingle(new jwj0((sbo0) this.f274429b, 14));
            case 15:
                return observable.flatMap(new ezk0((sef0) this.f274429b, 11));
            case 16:
                Observable map = observable.distinctUntilChanged().map(m1y.f139150Z0);
                gbu gbuVar = gbu.f78413a;
                return map.scan(new pqm0(gbuVar, gbuVar), y4y.f269263Z0).flatMapCompletable(new l3d0((d2j0) this.f274429b, 27)).m23307y();
            case 17:
                return ((c07) this.f274429b).m31111a(true).map(u6j0.f227375h);
            case 18:
                return observable.switchMap(new m8p0((g5q0) this.f274429b, 1));
            case 19:
                Completable completableSwitchMapCompletable = observable.switchMapCompletable(new xuk0(this, 18));
                completableSwitchMapCompletable.getClass();
                return completableSwitchMapCompletable.m23299p(Functions.f7232h).m23293d(Observable.empty());
            case 20:
                return observable.flatMapSingle(new phn0((yjq0) this.f274429b, 13));
            case 21:
                return observable.map(vnq0.f243215b).compose((j3k0) this.f274429b).map(wnq0.f253254b).onErrorComplete();
            case 22:
                return observable.switchMap(new C2193nx((Observable) this.f274429b, 2));
            case 23:
                return observable.switchMap(new pqk0((x4s0) this.f274429b, 25));
            case 24:
                return observable.flatMap(new fus0((n4u0) this.f274429b, 4));
            case 25:
                return observable.switchMap(new rwt0((gem0) this.f274429b, 3));
            case 26:
                hyo0 hyo0Var = ((g8v0) this.f274429b).f77602c;
                return observable.switchMap(new fbk0(hyo0Var, 15)).flatMap(new wel0(hyo0Var, 8));
            case 27:
                return observable.flatMapMaybe(new b9v0((x1p0) this.f274429b, 1));
            case 28:
                return observable.switchMap(new p0p0(this, 21));
            default:
                return observable.flatMapSingle(new gjs0(this, 12));
        }
    }

    public ynb0(xrv0 xrv0Var, w1k0 w1k0Var) {
        this.f274428a = 29;
        this.f274429b = xrv0Var;
    }
}
