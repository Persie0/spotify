package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes9.dex */
public final class h091 implements cut {

    /* JADX INFO: renamed from: a */
    public final mmh0 f86185a;

    /* JADX INFO: renamed from: b */
    public final j2a1 f86186b;

    /* JADX INFO: renamed from: c */
    public final twt f86187c;

    public h091(fz81 fz81Var) {
        a091 a091Var = new a091(false, -1L, -1L, false, false, new i291(0, (vr11) null, 7), rz81.f204093a, yz81.f277730a, false, false, null);
        v961 v961Var = v961.f238864f;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        dz81 dz81Var = new dz81();
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(iz81.class), c1037x558fa59a.m15633a(dz81Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(hz81.class), new C1033x3ae6ae8e().m15631a(new bz81(fz81Var)));
        this.f86185a = alf1.m26337t(a091Var, v961Var, new tfv0(new C1044a(xsr.f265651a, coroutinesSubtypeEffectHandlerBuilderM42464h), 10), f091.f64576h, g091.f75318a);
        this.f86186b = new j2a1();
        this.f86187c = q0f1.m71838m(pp81.f179974i);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f86186b;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f86187c;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f86185a;
    }
}
