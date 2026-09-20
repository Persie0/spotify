package p204p;

import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes7.dex */
public final class b670 implements dut {

    /* JADX INFO: renamed from: d */
    public static final int f23861d;

    /* JADX INFO: renamed from: e */
    public static final int f23862e;

    /* JADX INFO: renamed from: a */
    public final xiz f23863a;

    /* JADX INFO: renamed from: b */
    public final j2a1 f23864b = new j2a1();

    /* JADX INFO: renamed from: c */
    public final cph f23865c;

    static {
        gfp gfpVar = leu.f132721a;
        int iM75429D = rfg1.m75429D(((giu) iiu.f102631a.f258039d).f80259c);
        f23861d = iM75429D;
        f23862e = ttg1.m81513h(0.3f, ttg1.m81513h(0.5f, iM75429D));
    }

    public b670(ObservableFromPublisher observableFromPublisher, so3 so3Var) {
        this.f23863a = axf1.m27397l(mvl0.m62953p(new gzr(k0e1.m54985d(observableFromPublisher), 26)), p470.f173854c, zo50.f284672R0, null, new jf50(this, 28), 8);
        fyf fyfVar = cog.f40254c;
        wpi0 wpi0Var = xwt.f266743a;
        this.f23865c = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f23864b;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f23865c;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f23863a;
    }
}
