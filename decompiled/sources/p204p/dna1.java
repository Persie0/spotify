package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class dna1 implements dfo {

    /* JADX INFO: renamed from: a */
    public final zf90 f50718a;

    /* JADX INFO: renamed from: b */
    public final y3m f50719b;

    /* JADX INFO: renamed from: c */
    public final luk f50720c;

    /* JADX INFO: renamed from: d */
    public final luk f50721d;

    /* JADX INFO: renamed from: e */
    public final mko f50722e;

    /* JADX INFO: renamed from: f */
    public final mmh0 f50723f;

    /* JADX INFO: renamed from: g */
    public final cph f50724g;

    /* JADX INFO: renamed from: h */
    public final i5x f50725h;

    public dna1(tpt tptVar, zf90 zf90Var, y3m y3mVar, luk lukVar, luk lukVar2) {
        this.f50718a = zf90Var;
        this.f50719b = y3mVar;
        this.f50720c = lukVar;
        this.f50721d = lukVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oko(bna1.f28766b, q6f0.f185769a));
        int i = 0;
        arrayList.add(new oko(new cna1(this, 0), szj.f215602a));
        arrayList.add(new oko(new cna1(this, 1), ez80.f64302a));
        this.f50722e = arrayList.isEmpty() ? ns5.f157671i : arrayList.size() == 1 ? (mko) g6f.m43741q0(arrayList) : new bbf(arrayList);
        wma1 wma1Var = new wma1(0L, "", mma1.f145094a, false);
        v961 v961Var = v961.f238867i;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        rnt rntVar = new rnt(tptVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(iet.class), c1037x558fa59a.m15633a(rntVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(lit.class), new C1037x558fa59a().m15633a(new ept(tptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(nit.class), new C1037x558fa59a().m15633a(new wnt(tptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ggt.class), new C1033x3ae6ae8e().m15631a(new qot(tptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zft.class), new C1033x3ae6ae8e().m15631a(new wot(tptVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(njt.class), new C1037x558fa59a().m15633a(new ynt(tptVar)));
        this.f50723f = alf1.m26339v(wma1Var, v961Var, new C1044a(tptVar.f222599g, coroutinesSubtypeEffectHandlerBuilderM42464h), new yma1(this, i), new ana1(this));
        fyf fyfVar = new fyf(new t581(this, 25), true, -1197458556);
        wpi0 wpi0Var = xwt.f266743a;
        this.f50724g = new cph(fyfVar, 3);
        this.f50725h = mhf1.m61771p(this).m94133b(s6a1.f206039N0, s6a1.f206040O0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m36460f(dna1 dna1Var, String str, gh00 gh00Var, xq00 xq00Var, int i) {
        String str2;
        int i2;
        xq00Var.m91775k0(763875523);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (xq00Var.m91766g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(dna1Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2;
            y3m y3mVar = dna1Var.f50719b;
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ifa1(6, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            mif1.m61869b(y3mVar, new v3m(str2, (String) null, (u3m) null, (p3m) null, (String) null, (eh00) objM91750T, 62), null, null, xq00Var, 8, 12);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(dna1Var, str, gh00Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m36461g(dna1 dna1Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1896783052);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(dna1Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            long j = ((n6f) xq00Var.m91774k(fgj.f69332a)).f150873a;
            if (((s9f) xq00Var.m91774k(t9f.f218282a)).m77576d()) {
                rfg1.m75426A(j);
            } else {
                rfg1.m75426A(j);
            }
            fxh0 fxh0VarM97185e = zxc.m97185e(0.38f, cxh0.f43038a);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = c781.f34798R0;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM97185e, false, null, null, null, (eh00) objM91750T, 14);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47247x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            xq00Var2 = xq00Var;
            mif1.m61869b(dna1Var.f50719b, new v3m(str, (String) null, (u3m) null, (p3m) null, (String) null, (eh00) null, 126), null, null, xq00Var2, 8, 12);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(dna1Var, str, i, 22);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m36462h(dna1 dna1Var, tma1 tma1Var) {
        sma1 sma1Var = tma1Var.f221641b;
        rma1 rma1Var = sma1Var instanceof rma1 ? (rma1) sma1Var : null;
        if (rma1Var != null) {
            return rma1Var.f200487a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX INFO: renamed from: i */
    public static final xma1 m36463i(dna1 dna1Var, xma1 xma1Var, tma1 tma1Var) {
        nma1 nma1Var;
        oma1 jma1Var;
        oma1 oma1VarMo83428a = xma1Var.mo83428a();
        sma1 sma1Var = tma1Var.f221641b;
        if (sma1Var instanceof qma1) {
            jma1Var = mma1.f145094a;
        } else if (sma1Var instanceof pma1) {
            jma1Var = kma1.f124096a;
        } else {
            if (!(sma1Var instanceof rma1)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((rma1) sma1Var).f200487a;
            if (oma1VarMo83428a instanceof nma1) {
                nma1Var = (nma1) oma1VarMo83428a;
                if (!wj50.m88271j(nma1Var.getUri(), str)) {
                    jma1Var = nma1Var;
                    jma1Var = new jma1(str);
                }
            } else {
                jma1Var = nma1Var;
                jma1Var = new jma1(str);
            }
        }
        jma1Var = nma1Var;
        oma1 oma1Var = jma1Var;
        if (xma1Var instanceof wma1) {
            return new wma1(tma1Var.f221642c, tma1Var.f221640a, oma1Var, tma1Var.f221643d);
        }
        if (xma1Var instanceof vma1) {
            return vma1.m85989b((vma1) xma1Var, tma1Var.f221642c, tma1Var.f221640a, oma1Var, tma1Var.f221643d, null, null, null, null, 240);
        }
        if (!(xma1Var instanceof uma1)) {
            throw new NoWhenBranchMatchedException();
        }
        return new uma1(tma1Var.f221642c, tma1Var.f221640a, oma1Var, tma1Var.f221643d);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f50725h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f50724g;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f50723f;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f50722e;
    }
}
