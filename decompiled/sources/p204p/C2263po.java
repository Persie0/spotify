package p204p;

import android.content.Context;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p.po */
/* JADX INFO: loaded from: classes7.dex */
public final class C2263po implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179549a;

    /* JADX INFO: renamed from: b */
    public final Object f179550b;

    /* JADX INFO: renamed from: c */
    public final Object f179551c;

    public /* synthetic */ C2263po(int i, Object obj, Object obj2) {
        this.f179549a = i;
        this.f179550b = obj;
        this.f179551c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        switch (this.f179549a) {
            case 0:
                return observable.switchMap(new etq(3, (e470) this.f179550b, (Context) this.f179551c));
            case 1:
                return observable.flatMap(new yic1(this, 7));
            case 2:
                return observable.publish(new qgj0(this, 9));
            case 3:
                return observable.concatMap(new wk9((Observable) this.f179550b)).concatMap(new xk9((vsk) this.f179551c, 0)).map(t0o0.f215932Y).onErrorReturnItem(new gmr0("", "", null, "", lau.f131415a, null, 0, false, false, false, false, false, false, false)).map(u0o0.f225555Z);
            case 4:
                return observable.switchMap(new m47(20, (dwj0) this.f179550b, (Scheduler) this.f179551c));
            case 5:
                return observable.switchMap(new np7(18, (hol0) this.f179550b, (Scheduler) this.f179551c));
            case 6:
                return observable.switchMap(new fs9(this, 12));
            case 7:
                return observable.switchMap(new kca(this, 9));
            case 8:
                return observable.flatMap(new z4n(17, (pto) this.f179550b, (InterfaceC1862fj) this.f179551c));
            case 9:
                return observable.flatMap(new k1n(this, 12)).cast(t8z.class);
            case 10:
                return observable.flatMapSingle(new j3p(this, 13));
            case 11:
                return observable.flatMap(new bco(this, 21));
            case 12:
                return observable.debounce(100L, TimeUnit.MILLISECONDS).flatMapCompletable(new qn6((Scheduler) this.f179550b, (Consumer) this.f179551c)).m23307y();
            case 13:
                return observable.switchMap(new g2q(16, (oge0) this.f179550b, (nfp) this.f179551c));
            case 14:
                return observable.flatMap(new po10(4, (khy0) this.f179550b, (p0i0) this.f179551c));
            case 15:
                return observable.switchMap(new i5z(12, (Flowable) this.f179550b, (vsk) this.f179551c));
            case 16:
                return observable.observeOn((Scheduler) this.f179550b).map(new i2v((fk60) this.f179551c, 23));
            case 17:
                qlv0 qlv0Var = new qlv0();
                xre xreVar = (xre) this.f179550b;
                return observable.distinctUntilChanged((BiPredicate) new tey(xreVar, qlv0Var, (a8x) this.f179551c)).doOnNext(new tjp(21, qlv0Var, xreVar));
            case 18:
                return observable.concatMap(new m600(14, (FlowableElementAtSingle) this.f179550b, (j331) this.f179551c));
            case 19:
                return observable.switchMap(new cdv(this, 19));
            case 20:
                return observable.switchMap(new h7u(this, 25));
            case 21:
                return observable.switchMap(new a470(18, (ujb0) this.f179550b, (Scheduler) this.f179551c));
            case 22:
                return observable.switchMap(new a470(25, (zby) this.f179550b, (ch9) this.f179551c));
            case 23:
                return observable.switchMapCompletable(new phn0(this, 3)).m23307y();
            case 24:
                return observable.switchMap(new l3d0(this, 24));
            case 25:
                return observable.flatMapSingle(new w8q0(1, (vxx) this.f179550b, (d2j0) this.f179551c));
            case 26:
                return observable.flatMapSingle(new drq0(this));
            case 27:
                return observable.observeOn((Scheduler) this.f179550b).switchMapSingle(new pqk0((zmn0) this.f179551c, 22));
            case 28:
                return observable.switchMap(new tfm0(20, (hua1) this.f179550b, (Scheduler) this.f179551c));
            default:
                return observable.switchMap(new w8q0(6, (qwx0) this.f179550b, (Scheduler) this.f179551c));
        }
    }

    public C2263po(uqw uqwVar, hrw hrwVar, u9n u9nVar, String str) {
        this.f179549a = 23;
        this.f179550b = str;
        this.f179551c = u9nVar.m82651a(hrwVar, uqwVar, "comment-sheet-timestamp", k0e1.f118059u);
    }
}
