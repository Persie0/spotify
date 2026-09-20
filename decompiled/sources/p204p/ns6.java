package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class ns6 implements dfo {

    /* JADX INFO: renamed from: a */
    public final luk f157692a;

    /* JADX INFO: renamed from: b */
    public final luk f157693b;

    /* JADX INFO: renamed from: c */
    public final mmh0 f157694c;

    /* JADX INFO: renamed from: d */
    public final cph f157695d;

    /* JADX INFO: renamed from: e */
    public final i5x f157696e;

    public ns6(mpt mptVar, luk lukVar, luk lukVar2) {
        this.f157692a = lukVar;
        this.f157693b = lukVar2;
        ks6 ks6Var = new ks6(1, "", null, null, true, false);
        C2362s4 c2362s4 = C2362s4.f205383i;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        bpt bptVar = new bpt(mptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fjt.class), c1033x3ae6ae8e.m15631a(bptVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(jgt.class), new C1033x3ae6ae8e().m15631a(new rot(mptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rjt.class), new C1037x558fa59a().m15633a(new snt(mptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(oht.class), new C1037x558fa59a().m15633a(new xnt(mptVar)));
        this.f157694c = alf1.m26339v(ks6Var, c2362s4, new C1044a(mptVar.f146091e, coroutinesSubtypeEffectHandlerBuilderM42464h), gh6.f79837f, new ms6(this));
        fyf fyfVar = x2g.f257463a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f157695d = new cph(fyfVar, 3);
        this.f157696e = mhf1.m61771p(this).m94133b(f36.f65371T0, f36.f65372U0);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f157696e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f157695d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f157694c;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return ns5.f157665c;
    }
}
