package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes4.dex */
public final class o941 implements w7k0 {

    /* JADX INFO: renamed from: a */
    public final r741 f162939a;

    /* JADX INFO: renamed from: b */
    public final ObservableFromPublisher f162940b;

    /* JADX INFO: renamed from: c */
    public final cw0 f162941c;

    /* JADX INFO: renamed from: d */
    public final Observable f162942d;

    /* JADX INFO: renamed from: e */
    public final wg61 f162943e;

    /* JADX INFO: renamed from: f */
    public final nnc f162944f;

    public o941(r741 r741Var, ObservableFromPublisher observableFromPublisher, cw0 cw0Var, Observable observable, m500 m500Var, mxn mxnVar, Flowable flowable) {
        this.f162939a = r741Var;
        this.f162940b = observableFromPublisher;
        this.f162941c = cw0Var;
        this.f162942d = observable;
        this.f162943e = new wg61(new i941(mxnVar, 1));
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f162944f = xtm0.m92074U(mvl0.m62955r(new onc(flowable), k941.f120517h, mvl0.f147608b), new g1i((fbk) null, this, m500Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r0.m34078e(r1) == r4) goto L24;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m66445a(o941 o941Var, String str, ibk ibkVar) {
        n941 n941Var;
        cw0 cw0Var = o941Var.f162941c;
        if (ibkVar instanceof n941) {
            n941Var = (n941) ibkVar;
            int i = n941Var.f151706c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n941Var.f151706c = i - Integer.MIN_VALUE;
            } else {
                n941Var = new n941(o941Var, ibkVar);
            }
        } else {
            n941Var = new n941(o941Var, ibkVar);
        }
        Object obj = n941Var.f151704a;
        int i2 = n941Var.f151706c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                uu61 uu61Var = new uu61(new pqm0(new tu61(), str));
                n941Var.f151706c = 1;
                if (cw0.m34074b(cw0Var, uu61Var, n941Var) == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
            n941Var.f151706c = 2;
        } catch (Exception unused) {
        }
    }

    @Override // p204p.w7k0
    /* JADX INFO: renamed from: c */
    public final fiz mo38074c() {
        return this.f162944f;
    }
}
