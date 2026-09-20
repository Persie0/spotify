package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes7.dex */
public final class hq0 implements w7k0 {

    /* JADX INFO: renamed from: a */
    public final qzn f93972a;

    /* JADX INFO: renamed from: b */
    public final wg61 f93973b;

    /* JADX INFO: renamed from: c */
    public final fiz f93974c;

    public hq0(qzn qznVar, m500 m500Var, pwn pwnVar, ObservableFromPublisher observableFromPublisher, cp0 cp0Var) {
        this.f93972a = qznVar;
        this.f93973b = new wg61(new cq0(m500Var, 0));
        fbk fbkVar = null;
        this.f93974c = mvl0.m62953p(new vjz(xtm0.m92074U(mvl0.m62953p(new zux(cp0Var.f40382d, k0e1.m54985d(observableFromPublisher), new zp0(this, fbkVar, 0), 1)), new eq0(null, this, m500Var, pwnVar)), new gc0(2, 1, fbkVar)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m48190a(hq0 hq0Var, String str, ibk ibkVar) {
        dq0 dq0Var;
        if (ibkVar instanceof dq0) {
            dq0Var = (dq0) ibkVar;
            int i = dq0Var.f51779c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq0Var.f51779c = i - Integer.MIN_VALUE;
            } else {
                dq0Var = new dq0(hq0Var, ibkVar);
            }
        } else {
            dq0Var = new dq0(hq0Var, ibkVar);
        }
        Object obj = dq0Var.f51777a;
        int i2 = dq0Var.f51779c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        if (str == null) {
            str = "";
        }
        qzn qznVar = hq0Var.f93972a;
        int iIntValue = ((Number) hq0Var.f93973b.getValue()).intValue();
        Single singleOnErrorReturn = Single.create(new ybn(14, qznVar, str)).subscribeOn((Scheduler) qznVar.f194231d).map(new cl8(qznVar, iIntValue, 4)).map(t0b1.f215816S0).onErrorReturn(new zz11(iIntValue, 9));
        dq0Var.f51779c = 1;
        Object objM96567o = zn91.m96567o(singleOnErrorReturn, dq0Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.w7k0
    /* JADX INFO: renamed from: c */
    public final fiz mo38074c() {
        return this.f93974c;
    }
}
