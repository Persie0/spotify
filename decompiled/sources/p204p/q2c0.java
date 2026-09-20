package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1035xafc7dc52;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class q2c0 {

    /* JADX INFO: renamed from: a */
    public final a2c0 f184586a;

    public q2c0(a2c0 a2c0Var) {
        this.f184586a = a2c0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Factory m71997a() {
        p2c0 p2c0Var = new p2c0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1035xafc7dc52 c1035xafc7dc52 = new C1035xafc7dc52();
        a2c0 a2c0Var = this.f184586a;
        r1c0 r1c0Var = new r1c0(a2c0Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(h1c0.class), c1035xafc7dc52.m15632a(r1c0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(b1c0.class), new C1035xafc7dc52().m15632a(new t1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(c1c0.class), new C1035xafc7dc52().m15632a(new z1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(g1c0.class), new C1033x3ae6ae8e().m15631a(new v1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(f1c0.class), new C1037x558fa59a().m15633a(new n1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(e1c0.class), new C1033x3ae6ae8e().m15631a(new x1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(d1c0.class), new C1037x558fa59a().m15633a(new o1c0(a2c0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(a1c0.class), new C1037x558fa59a().m15633a(new p1c0(a2c0Var)));
        return Mobius.m15582d(p2c0Var, new C1044a(a2c0Var.f11624b, coroutinesSubtypeEffectHandlerBuilderM42464h));
    }
}
