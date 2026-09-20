package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;

/* JADX INFO: loaded from: classes10.dex */
public final class bi1 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27308a;

    /* JADX INFO: renamed from: b */
    public final Object f27309b;

    public /* synthetic */ bi1(Object obj, int i) {
        this.f27308a = i;
        this.f27309b = obj;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f27308a) {
            case 0:
                return observable.flatMap(new dg10(this, 7));
            case 1:
                return observable.flatMapCompletable(new vbu0(this, 9)).m23307y();
            case 2:
                return observable.switchMap(new az1((ron0) this.f27309b, 10));
            case 3:
                return observable.map(new vbu0((xb2) this.f27309b, 11));
            case 4:
                return observable.flatMap(new egb1((vk9) this.f27309b, 29)).map(s0o0.f204454Z);
            case 5:
                return observable.concatMap(new gd8((bl9) this.f27309b, 5)).map(lew0.f132747Z);
            case 6:
                return k0e1.m54988g(((d97) this.f27309b).m35319o(), dau.f47107a).map(t6x0.f217645h);
            case 7:
                return observable.map(new kca(this, 8));
            case 8:
                return observable.flatMap(new fs9((snj) this.f27309b, 20));
            case 9:
                return observable.switchMap(new id8(this, 27));
            case 10:
                pto ptoVar = (pto) this.f27309b;
                return observable.subscribeOn(ptoVar.f181212e).map(new c9a(ptoVar, 24));
            case 11:
                return observable.flatMapCompletable(new bco((wsp) this.f27309b, 13)).m23307y();
            case 12:
                return observable.switchMap(new f0m((u7s0) this.f27309b, 16));
            case 13:
                return observable.flatMapSingle(new bzo(this, 23));
            case 14:
                kb5 kb5Var = (kb5) this.f27309b;
                int i = 24;
                return observable.filter(new m3n(kb5Var, i)).switchMapSingle(new xvo(kb5Var, i));
            case 15:
                return observable.flatMap(new nfp((kps) this.f27309b, 16));
            case 16:
                return observable.flatMapSingle(new drw(this, 2));
            case 17:
                return observable.switchMap(new h7u((j7y) this.f27309b, 9));
            case 18:
                return observable.flatMapSingle(new vux((xeu) this.f27309b, 3));
            case 19:
                return observable.map(lby.f131773f).distinctUntilChanged().switchMap(new z4y((mx20) this.f27309b, 11)).distinctUntilChanged().map(qby.f187207f);
            case 20:
                return r830.m74971b(observable.map(jsy.f115625f), (lkp) this.f27309b);
            case 21:
                return ((ol1) this.f27309b).apply(observable);
            case 22:
                return ((C2263po) this.f27309b).apply(observable);
            case 23:
                return observable.map(wyx.f256397t).distinctUntilChanged().switchMap(new drw((n380) this.f27309b, 25)).distinctUntilChanged().map(yyx.f277625i);
            case 24:
                return observable.switchMap(new uho0((eio0) this.f27309b));
            case 25:
                return observable.switchMap(new dz31((u4l0) this.f27309b, 3));
            case 26:
                da80 da80Var = (da80) this.f27309b;
                return observable.filter(new t36(da80Var, 15)).filter(new w090(da80Var, 3)).map(iaz.f100384X).map(jaz.f110599t);
            case 27:
                return observable.switchMapSingle(new mj70((li80) this.f27309b, 9));
            case 28:
                return observable.switchMapSingle(new csy(this, 24));
            default:
                return observable.switchMap(new t180((b6b0) this.f27309b, 12));
        }
    }

    public bi1(int i, FlowableElementAtSingle flowableElementAtSingle, j331 j331Var) {
        this.f27308a = i;
        switch (i) {
            case 22:
                this.f27309b = new C2263po(18, flowableElementAtSingle, j331Var);
                break;
            default:
                this.f27309b = new ol1(2, flowableElementAtSingle, j331Var);
                break;
        }
    }
}
