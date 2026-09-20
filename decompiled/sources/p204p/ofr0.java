package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes10.dex */
public final class ofr0 implements dut {

    /* JADX INFO: renamed from: a */
    public final sfr0 f164895a;

    /* JADX INFO: renamed from: b */
    public final luk f164896b;

    /* JADX INFO: renamed from: c */
    public final luk f164897c;

    /* JADX INFO: renamed from: d */
    public final mmh0 f164898d;

    /* JADX INFO: renamed from: e */
    public final i5x f164899e;

    /* JADX INFO: renamed from: f */
    public final cph f164900f;

    public ofr0(yer0 yer0Var, sfr0 sfr0Var, luk lukVar, luk lukVar2) {
        this.f164895a = sfr0Var;
        this.f164896b = lukVar;
        this.f164897c = lukVar2;
        etq0 etq0Var = etq0.f62771X0;
        mfr0 mfr0Var = mfr0.f143143b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        ter0 ter0Var = new ter0(yer0Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zer0.class), c1037x558fa59a.m15633a(ter0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(afr0.class), new C1037x558fa59a().m15633a(new uer0(yer0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bfr0.class), new C1037x558fa59a().m15633a(new ver0(yer0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cfr0.class), new C1037x558fa59a().m15633a(new xer0(yer0Var)));
        this.f164898d = alf1.m26338u(etq0Var, mfr0Var, new C1044a(yer0Var.f272041e, coroutinesSubtypeEffectHandlerBuilderM42464h), b5r0.f23677e, new p0r0(this, 7));
        this.f164899e = mhf1.m61771p(this).m94133b(kwp0.f127158a1, kwp0.f127160b1);
        fyf fyfVar = s1h.f204715a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f164900f = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f164899e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f164900f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f164898d;
    }
}
