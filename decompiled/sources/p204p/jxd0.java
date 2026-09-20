package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes10.dex */
public final class jxd0 implements dut {

    /* JADX INFO: renamed from: a */
    public final wvd0 f117099a;

    /* JADX INFO: renamed from: b */
    public final lwd0 f117100b;

    /* JADX INFO: renamed from: c */
    public final luk f117101c;

    /* JADX INFO: renamed from: d */
    public final leh0 f117102d;

    /* JADX INFO: renamed from: e */
    public final q2c f117103e;

    /* JADX INFO: renamed from: f */
    public final mmh0 f117104f;

    /* JADX INFO: renamed from: g */
    public final cph f117105g;

    /* JADX INFO: renamed from: h */
    public final i5x f117106h;

    public jxd0(wvd0 wvd0Var, lwd0 lwd0Var, luk lukVar, leh0 leh0Var, q2c q2cVar) {
        this.f117099a = wvd0Var;
        this.f117100b = lwd0Var;
        this.f117101c = lukVar;
        this.f117102d = leh0Var;
        this.f117103e = q2cVar;
        pvd0 pvd0Var = pvd0.f181708Y;
        jza0 jza0Var = jza0.f117657o;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        hxd0 hxd0Var = new hxd0(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ywd0.class), c1037x558fa59a.m15633a(hxd0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zwd0.class), new C1037x558fa59a().m15633a(new ixd0(this)));
        this.f117104f = alf1.m26340w(pvd0Var, jza0Var, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), fjd0.f70197f, new gxd0(this, 1));
        fyf fyfVar = zsg.f285940a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f117105g = new cph(fyfVar, 3);
        this.f117106h = mhf1.m61771p(this).m94133b(new yhb0(this, 16), cvd0.f42379c);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f117106h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f117105g;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f117104f;
    }
}
