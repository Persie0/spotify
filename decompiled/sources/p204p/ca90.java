package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class ca90 implements dut {

    /* JADX INFO: renamed from: a */
    public final da90 f35780a;

    /* JADX INFO: renamed from: b */
    public final luk f35781b;

    /* JADX INFO: renamed from: c */
    public final luk f35782c;

    /* JADX INFO: renamed from: d */
    public final String f35783d;

    /* JADX INFO: renamed from: e */
    public final mmh0 f35784e;

    /* JADX INFO: renamed from: f */
    public final cph f35785f;

    /* JADX INFO: renamed from: g */
    public final i5x f35786g;

    public ca90(npt nptVar, da90 da90Var, luk lukVar, luk lukVar2, String str) {
        this.f35780a = da90Var;
        this.f35781b = lukVar;
        this.f35782c = lukVar2;
        this.f35783d = str;
        nau nauVar = nau.f152117a;
        y990 y990Var = new y990(nauVar, nauVar, j990.f110129a);
        lpc lpcVar = new lpc(this, 12);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        mnt mntVar = new mnt(nptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yft.class), c1033x3ae6ae8e.m15631a(mntVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bit.class), new C1037x558fa59a().m15633a(new jnt(nptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(sht.class), new C1037x558fa59a().m15633a(new knt(nptVar)));
        this.f35784e = alf1.m26339v(y990Var, lpcVar, new C1044a(nptVar.f157068c, coroutinesSubtypeEffectHandlerBuilderM42464h), new aa90(this, 0), new t690(this, 6));
        fyf fyfVar = dpg.f51327a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f35785f = new cph(fyfVar, 3);
        this.f35786g = mhf1.m61771p(this).m94133b(new az60(this, 14), z970.f280695c1);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f35786g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f35785f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f35784e;
    }
}
