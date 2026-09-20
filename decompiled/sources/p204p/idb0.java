package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes10.dex */
public final class idb0 implements dut {

    /* JADX INFO: renamed from: a */
    public final luk f101049a;

    /* JADX INFO: renamed from: b */
    public final s9v f101050b;

    /* JADX INFO: renamed from: c */
    public final q2c f101051c;

    /* JADX INFO: renamed from: d */
    public final mmh0 f101052d;

    /* JADX INFO: renamed from: e */
    public final cph f101053e;

    /* JADX INFO: renamed from: f */
    public final j2a1 f101054f;

    public idb0(luk lukVar, luk lukVar2, m95 m95Var, s9v s9vVar, q2c q2cVar) {
        this.f101049a = lukVar2;
        this.f101050b = s9vVar;
        this.f101051c = q2cVar;
        gpa0 gpa0Var = gpa0.f83137a1;
        jza0 jza0Var = jza0.f117647e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        gdb0 gdb0Var = new gdb0(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(xcb0.class), c1037x558fa59a.m15633a(gdb0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wcb0.class), new C1037x558fa59a().m15633a(new hdb0(this)));
        int i = 4;
        this.f101052d = alf1.m26338u(gpa0Var, jza0Var, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), hza0.f96878t, new b6b0(lukVar, i));
        fyf fyfVar = new fyf(new eoa0(this, i), true, 127341721);
        wpi0 wpi0Var = xwt.f266743a;
        this.f101053e = new cph(fyfVar, 3);
        this.f101054f = new j2a1();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f101054f;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f101053e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f101052d;
    }
}
