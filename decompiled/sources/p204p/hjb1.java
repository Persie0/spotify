package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hjb1 implements cut {

    /* JADX INFO: renamed from: L0 */
    public final mmh0 f92013L0;

    /* JADX INFO: renamed from: M0 */
    public final i5x f92014M0;

    /* JADX INFO: renamed from: N0 */
    public final twt f92015N0;

    /* JADX INFO: renamed from: X */
    public final d6u f92016X;

    /* JADX INFO: renamed from: Y */
    public final oge0 f92017Y;

    /* JADX INFO: renamed from: Z */
    public final ao0 f92018Z;

    /* JADX INFO: renamed from: a */
    public final luk f92019a;

    /* JADX INFO: renamed from: b */
    public final lx0 f92020b;

    /* JADX INFO: renamed from: c */
    public final d2j0 f92021c;

    /* JADX INFO: renamed from: d */
    public final x1p0 f92022d;

    /* JADX INFO: renamed from: e */
    public final hc80 f92023e;

    /* JADX INFO: renamed from: f */
    public final w0e1 f92024f;

    /* JADX INFO: renamed from: g */
    public final rmx f92025g;

    /* JADX INFO: renamed from: h */
    public final k9b f92026h;

    /* JADX INFO: renamed from: i */
    public final mhb1 f92027i;

    /* JADX INFO: renamed from: t */
    public final fz3 f92028t;

    public hjb1(luk lukVar, lx0 lx0Var, d2j0 d2j0Var, x1p0 x1p0Var, hc80 hc80Var, w0e1 w0e1Var, rmx rmxVar, k9b k9bVar, mhb1 mhb1Var, fz3 fz3Var, d6u d6uVar, oge0 oge0Var, ao0 ao0Var) {
        this.f92019a = lukVar;
        this.f92020b = lx0Var;
        this.f92021c = d2j0Var;
        this.f92022d = x1p0Var;
        this.f92023e = hc80Var;
        this.f92024f = w0e1Var;
        this.f92025g = rmxVar;
        this.f92026h = k9bVar;
        this.f92027i = mhb1Var;
        this.f92028t = fz3Var;
        this.f92016X = d6uVar;
        this.f92017Y = oge0Var;
        this.f92018Z = ao0Var;
        HashMap map = d6uVar.f45883a;
        Object obj = map.get("muted");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Object obj2 = map.get("position");
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        oib1 oib1Var = new oib1(zBooleanValue, null, null, null, l != null ? l.longValue() : 0L, 126);
        ata0 ata0Var = new ata0(this);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        sib1 sib1Var = new sib1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(shb1.class), c1037x558fa59a.m15633a(sib1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(nhb1.class), new C1037x558fa59a().m15633a(new tib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(phb1.class), new C1037x558fa59a().m15633a(new uib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ohb1.class), new C1037x558fa59a().m15633a(new vib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(whb1.class), new C1037x558fa59a().m15633a(new wib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(thb1.class), new C1037x558fa59a().m15633a(new xib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qhb1.class), new C1037x558fa59a().m15633a(new yib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(uhb1.class), new C1037x558fa59a().m15633a(new zib1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rhb1.class), new C1037x558fa59a().m15633a(new ajb1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vhb1.class), new C1033x3ae6ae8e().m15631a(new cjb1(this)));
        this.f92013L0 = elf1.m39382u(oib1Var, ata0Var, new C1044a(dau.f47107a, coroutinesSubtypeEffectHandlerBuilderM42464h), new yfb1(this, 1), new rib1(this));
        this.f92014M0 = mhf1.m61771p(this).m94133b(obs0.f163704Z, new qxa1(this, 6));
        this.f92015N0 = q0f1.m71838m(new pu8(this, 8));
    }

    /* JADX INFO: renamed from: e */
    public static final void m47679e(hjb1 hjb1Var, gh00 gh00Var) {
        x0h1.m89578u(n5h1.m63737m(hjb1Var.f92023e), hjb1Var.f92019a, 0, new as8(gh00Var, null, 6), 2);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m47680f(hjb1 hjb1Var, ijb1 ijb1Var) {
        w0e1 w0e1Var = hjb1Var.f92024f;
        w0e1Var.m86949y(r230.f195043d, ijb1Var.m50787a());
        boolean zIsEmpty = ijb1Var.m50787a().f69513g.m28373c().isEmpty();
        if (zIsEmpty) {
            w0e1Var.m86949y(new v230(new Exception("Ad invalid"), "invalid_config"), ijb1Var.m50787a());
        }
        return zIsEmpty;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f92014M0;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f92015N0;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f92013L0;
    }
}
