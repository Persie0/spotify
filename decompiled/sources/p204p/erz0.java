package p204p;

import android.content.Context;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes5.dex */
public final class erz0 implements dut {

    /* JADX INFO: renamed from: a */
    public final mmh0 f62225a;

    /* JADX INFO: renamed from: b */
    public final i5x f62226b;

    /* JADX INFO: renamed from: c */
    public final cph f62227c;

    public erz0(q831 q831Var, Context context, pq4 pq4Var, luk lukVar, sad sadVar, gh00 gh00Var) {
        brz0 brz0Var = new brz0(null, "", "", 0, false, arz0.f19261g, false);
        mfr0 mfr0Var = mfr0.f143158q;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        lqz0 lqz0Var = new lqz0(pq4Var, context, gh00Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qqz0.class), c1033x3ae6ae8e.m15631a(lqz0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rqz0.class), new C1033x3ae6ae8e().m15631a(new mqz0(context, q831Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(pqz0.class), new C1033x3ae6ae8e().m15631a(new oqz0(sadVar)));
        this.f62225a = alf1.m26339v(brz0Var, mfr0Var, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), gpz0.f83282S0, tmz0.f221830g);
        this.f62226b = mhf1.m61771p(this).m94133b(b8z0.f24719c1, drz0.f52439b);
        fyf fyfVar = f7h.f66682b;
        wpi0 wpi0Var = xwt.f266743a;
        this.f62227c = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f62226b;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f62227c;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f62225a;
    }
}
