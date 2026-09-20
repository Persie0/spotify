package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes10.dex */
public final class csr0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41684a;

    /* JADX INFO: renamed from: b */
    public final Object f41685b;

    /* JADX INFO: renamed from: c */
    public final Object f41686c;

    public /* synthetic */ csr0(int i, Object obj, Object obj2) {
        this.f41684a = i;
        this.f41686c = obj;
        this.f41685b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [p.ri00, p.th00] */
    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f41684a) {
            case 0:
                return observable.switchMapSingle(new aaq0(6, (jyx0) this.f41686c, (Scheduler) this.f41685b));
            case 1:
                return observable.observeOn((Scheduler) this.f41685b).flatMap(new pqk0((jrr0) this.f41686c, 23));
            case 2:
                return observable.flatMap(new zrr0(1, (jtr0) this.f41686c, (x4b) this.f41685b));
            case 3:
                return observable.withLatestFrom(k0e1.m54988g(((gcu0) this.f41686c).m44321c(), dau.f47107a), vnq0.f243223i).filter(wnq0.f253262i).switchMap(new m8p0(this, 21)).map(koq0.f124898i);
            case 4:
                return observable.switchMap(new xvx0(2, (yvy) this.f41686c, (ld40) this.f41685b));
            case 5:
                return observable.switchMap(new zrr0(28, (Scheduler) this.f41685b, (xre) this.f41686c));
            case 6:
                return observable.flatMapMaybe(new b5y0(8, (ot7) this.f41686c, (xb01) this.f41685b));
            case 7:
                return observable.switchMapSingle(new xvx0(27, (Scheduler) this.f41685b, (ib60) this.f41686c));
            case 8:
                return observable.doOnSubscribe(new dh51(this, 0)).flatMap(new w221(this, 10)).doOnDispose(new y1s0(this, 20)).doOnError(new dh51(this, 1));
            case 9:
                return observable.debounce(new b741(this, 16)).switchMap(new dz31(this, 18));
            case 10:
                return observable.switchMap(new r9a1(this));
            case 11:
                return observable.map(new py51((z5p) this.f41686c, 15)).observeOn((Scheduler) this.f41685b).map(snq0.f211001X0);
            case 12:
                return observable.flatMap(new g2a1(8, (e5d1) this.f41686c, (Scheduler) this.f41685b));
            case 13:
                return observable.flatMap(new bka1((e5d1) this.f41686c, (th00) this.f41685b));
            default:
                return observable.flatMapCompletable(new rg41(this, 25)).m23307y();
        }
    }

    public /* synthetic */ csr0(Scheduler scheduler, Object obj, int i) {
        this.f41684a = i;
        this.f41685b = scheduler;
        this.f41686c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public csr0(e5d1 e5d1Var, th00 th00Var) {
        this.f41684a = 13;
        this.f41686c = e5d1Var;
        this.f41685b = (ri00) th00Var;
    }
}
