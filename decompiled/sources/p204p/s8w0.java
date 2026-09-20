package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class s8w0 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206799a;

    /* JADX INFO: renamed from: b */
    public final Object f206800b;

    public /* synthetic */ s8w0(Object obj, int i) {
        this.f206799a = i;
        this.f206800b = obj;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f206799a) {
            case 0:
                return observable.switchMap(new x7q0(this, 21));
            case 1:
                return observable.flatMap(new vnt0((cpw0) this.f206800b, 12));
            case 2:
                return observable.switchMap(new frv0(this, 3));
            case 3:
                return observable.switchMap(new qst0(this, 13)).onErrorResumeNext(loq0.f135531h);
            case 4:
                return observable.switchMap(new rxw0((sxw0) this.f206800b));
            case 5:
                return observable.flatMapSingle(new prv0((rwt0) this.f206800b, 4));
            case 6:
                return observable.flatMapSingle(new vnt0((prv0) this.f206800b, 14));
            case 7:
                return observable.switchMap(new vnt0(this, 19));
            case 8:
                return ((csr0) this.f206800b).apply(observable);
            case 9:
                return observable.switchMap(new iry0(this, 0));
            case 10:
                return observable.switchMap(new iry0((slz0) this.f206800b, 4));
            case 11:
                return observable.flatMap(new onz0((pnz0) this.f206800b, 0));
            case 12:
                return ((bx7) this.f206800b).apply(observable);
            case 13:
                return observable.switchMap(new djs0((jx21) this.f206800b, 28));
            case 14:
                return ((s8w0) this.f206800b).apply(observable);
            case 15:
                return observable.switchMap(new qst0((i431) this.f206800b, 24));
            case 16:
                return ((s8w0) this.f206800b).apply(observable);
            case 17:
                return observable.switchMap(new iry0((jhz0) this.f206800b, 7));
            case 18:
                return ((s8w0) this.f206800b).apply(observable);
            case 19:
                return observable.switchMapSingle(new gjv0((xb01) this.f206800b, 17));
            case 20:
                bwt0 bwt0Var = (bwt0) this.f206800b;
                return observable.observeOn((Scheduler) bwt0Var.f31732e).flatMap(new d501(bwt0Var, 3));
            case 21:
                return observable.flatMap(new frv0(this, 20));
            case 22:
                return ((qal) this.f206800b).apply(observable);
            case 23:
                return observable.switchMap(new onz0((s2o) this.f206800b, 6));
            case 24:
                return ((s8w0) this.f206800b).apply(observable);
            case 25:
                return observable.switchMap(new onz0((q831) this.f206800b, 7));
            case 26:
                return ((s8w0) this.f206800b).apply(observable);
            case 27:
                return observable.switchMap(new prv0((uj81) this.f206800b, 18));
            case 28:
                return ((s8w0) this.f206800b).apply(observable);
            default:
                return observable.switchMap(new wiy0((cy11) this.f206800b, 11));
        }
    }

    public s8w0(jx21 jx21Var) {
        this.f206799a = 14;
        this.f206800b = new s8w0(jx21Var, 13);
    }

    public s8w0(i431 i431Var) {
        this.f206799a = 16;
        this.f206800b = new s8w0(i431Var, 15);
    }

    public s8w0(uj81 uj81Var) {
        this.f206799a = 28;
        this.f206800b = new s8w0(uj81Var, 27);
    }

    public s8w0(Scheduler scheduler) {
        this.f206799a = 12;
        this.f206800b = new bx7(scheduler, 9);
    }

    public s8w0(s2o s2oVar) {
        this.f206799a = 24;
        this.f206800b = new s8w0(s2oVar, 23);
    }

    public s8w0(xre xreVar, Scheduler scheduler) {
        this.f206799a = 8;
        this.f206800b = new csr0(scheduler, xreVar, 5);
    }

    public s8w0(jhz0 jhz0Var) {
        this.f206799a = 18;
        this.f206800b = new s8w0(jhz0Var, 17);
    }

    public s8w0(q831 q831Var) {
        this.f206799a = 26;
        this.f206800b = new s8w0(q831Var, 25);
    }

    public s8w0(ay21 ay21Var, b5y0 b5y0Var, q431 q431Var, Scheduler scheduler) {
        this.f206799a = 22;
        this.f206800b = new qal(b5y0Var, scheduler, ay21Var, q431Var, 5);
    }
}
