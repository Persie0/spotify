package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class bb90 implements dut {

    /* JADX INFO: renamed from: a */
    public final zk1 f25480a;

    /* JADX INFO: renamed from: b */
    public final qa1 f25481b;

    /* JADX INFO: renamed from: c */
    public final shy f25482c;

    /* JADX INFO: renamed from: d */
    public final shy f25483d;

    /* JADX INFO: renamed from: e */
    public final shy f25484e;

    /* JADX INFO: renamed from: f */
    public final luk f25485f;

    /* JADX INFO: renamed from: g */
    public final luk f25486g;

    /* JADX INFO: renamed from: h */
    public final mmh0 f25487h;

    /* JADX INFO: renamed from: i */
    public final cph f25488i;

    /* JADX INFO: renamed from: t */
    public final i5x f25489t;

    public bb90(opt optVar, zk1 zk1Var, qa1 qa1Var, shy shyVar, shy shyVar2, shy shyVar3, luk lukVar, luk lukVar2) {
        this.f25480a = zk1Var;
        this.f25481b = qa1Var;
        this.f25482c = shyVar;
        this.f25483d = shyVar2;
        this.f25484e = shyVar3;
        this.f25485f = lukVar;
        this.f25486g = lukVar2;
        xa90 xa90Var = new xa90(lau.f131415a, ta90.f218523a, 0L, true, g6f.m43736n1(oa90.f163272c));
        brp brpVar = brp.f30154z;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(qpv0.f191387a.mo54112b(wft.class), new C1033x3ae6ae8e().m15631a(new lot(optVar)));
        this.f25487h = alf1.m26339v(xa90Var, brpVar, new C1044a(optVar.f168019b, coroutinesSubtypeEffectHandlerBuilderM42464h), ip80.f104404O0, new za90(this));
        fyf fyfVar = new fyf(new aa70(this, 21), true, 1120488658);
        wpi0 wpi0Var = xwt.f266743a;
        this.f25488i = new cph(fyfVar, 3);
        this.f25489t = mhf1.m61771p(this).m94133b(ab90.f14064b, ab90.f14066c);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f25489t;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f25488i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f25487h;
    }
}
