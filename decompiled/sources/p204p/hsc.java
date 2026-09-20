package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes10.dex */
public final class hsc implements dut {

    /* JADX INFO: renamed from: a */
    public final trc f94661a;

    /* JADX INFO: renamed from: b */
    public final yrc f94662b;

    /* JADX INFO: renamed from: c */
    public final leh0 f94663c;

    /* JADX INFO: renamed from: d */
    public final q2c f94664d;

    /* JADX INFO: renamed from: e */
    public final mmh0 f94665e;

    /* JADX INFO: renamed from: f */
    public final cph f94666f;

    /* JADX INFO: renamed from: g */
    public final i5x f94667g;

    public hsc(trc trcVar, yrc yrcVar, luk lukVar, leh0 leh0Var, q2c q2cVar) {
        this.f94661a = trcVar;
        this.f94662b = yrcVar;
        this.f94663c = leh0Var;
        this.f94664d = q2cVar;
        frc frcVar = frc.f72419R0;
        C2362s4 c2362s4 = C2362s4.f205392r;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        fsc fscVar = new fsc(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(asc.class), c1037x558fa59a.m15633a(fscVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bsc.class), new C1037x558fa59a().m15633a(new gsc(this)));
        this.f94665e = alf1.m26340w(frcVar, c2362s4, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), f4c.f65724L0, new rqc(this, 2));
        fyf fyfVar = q5g.f185526a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f94666f = new cph(fyfVar, 3);
        this.f94667g = mhf1.m61771p(this).m94133b(new ik9(this, 23), nlc.f155069g);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f94667g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f94666f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f94665e;
    }
}
