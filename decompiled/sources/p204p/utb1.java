package p204p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes8.dex */
public final class utb1 implements dut {

    /* JADX INFO: renamed from: a */
    public final iac1 f233878a;

    /* JADX INFO: renamed from: b */
    public final int f233879b;

    /* JADX INFO: renamed from: c */
    public final int f233880c;

    /* JADX INFO: renamed from: d */
    public final boolean f233881d;

    /* JADX INFO: renamed from: e */
    public final hgc f233882e;

    /* JADX INFO: renamed from: f */
    public final m7t0 f233883f;

    /* JADX INFO: renamed from: g */
    public final cph f233884g;

    /* JADX INFO: renamed from: h */
    public final j2a1 f233885h;

    public utb1(iac1 iac1Var, int i, int i2, boolean z, itb1 itb1Var, ulp ulpVar, hgc hgcVar, FlowableMap flowableMap, aj4 aj4Var) {
        this.f233878a = iac1Var;
        this.f233879b = i;
        this.f233880c = i2;
        this.f233881d = z;
        this.f233882e = hgcVar;
        BehaviorSubject behaviorSubject = ulpVar.f231606e;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.f7190d;
        this.f233883f = qjg1.m72915g(Flowable.m23321g(behaviorSubject.toFlowable(backpressureStrategy), itb1Var.m51626a().toFlowable(backpressureStrategy), flowableMap, new utu0(aj4Var)), gqb1.f83416Z, koa1.f124737c1, null, 24);
        fyf fyfVar = new fyf(new qcb1(this, 7), true, 936949849);
        wpi0 wpi0Var = xwt.f266743a;
        this.f233884g = new cph(fyfVar, 3);
        this.f233885h = new j2a1();
    }

    /* JADX INFO: renamed from: e */
    public static final void m83928e(utb1 utb1Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1277189707);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(utb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zM91770i = xq00Var.m91770i(utb1Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new yaa1(utb1Var, 26);
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            g0b1.m43261b((gh00) objM91750T, mi21.m61820d(1.0f, cxh0.f43038a), null, xq00Var2, 0, 4);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ttb1(utb1Var, i, 0);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f233885h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f233884g;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f233883f;
    }
}
