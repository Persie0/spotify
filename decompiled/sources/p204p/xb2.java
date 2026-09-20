package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes8.dex */
public final class xb2 implements dut {

    /* JADX INFO: renamed from: a */
    public final vh00 f259816a;

    /* JADX INFO: renamed from: b */
    public final eh00 f259817b;

    /* JADX INFO: renamed from: c */
    public final eh00 f259818c;

    /* JADX INFO: renamed from: d */
    public final xjr0 f259819d;

    /* JADX INFO: renamed from: e */
    public final ubq0 f259820e;

    /* JADX INFO: renamed from: f */
    public final b7a1 f259821f;

    /* JADX INFO: renamed from: g */
    public final mmh0 f259822g;

    /* JADX INFO: renamed from: h */
    public final j2a1 f259823h;

    /* JADX INFO: renamed from: i */
    public final cph f259824i;

    public xb2(vh00 vh00Var, eh00 eh00Var, eh00 eh00Var2, xjr0 xjr0Var, ubq0 ubq0Var, b7a1 b7a1Var, EventSource eventSource) {
        this.f259816a = vh00Var;
        this.f259817b = eh00Var;
        this.f259818c = eh00Var2;
        this.f259819d = xjr0Var;
        this.f259820e = ubq0Var;
        this.f259821f = b7a1Var;
        pb2 pb2Var = new pb2();
        v961 v961Var = new v961(21);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        int i = 3;
        subtypeEffectHandlerBuilderM15658c.m15665g(sb2.class, new bi1(this, i));
        subtypeEffectHandlerBuilderM15658c.m15661c(rb2.class, new vb2(this, 0));
        subtypeEffectHandlerBuilderM15658c.m15661c(qb2.class, new vb2(this, 1));
        this.f259822g = alf1.m26337t(pb2Var, v961Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()), ec1.f58175Q0, new ub2(eventSource, this));
        this.f259823h = new j2a1();
        fyf fyfVar = new fyf(new C2479v1(this, 27), true, -1822233938);
        wpi0 wpi0Var = xwt.f266743a;
        this.f259824i = new cph(fyfVar, i);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f259823h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f259824i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f259822g;
    }
}
