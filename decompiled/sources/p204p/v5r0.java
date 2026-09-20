package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.MobiusLoop;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class v5r0 implements m5r0 {

    /* JADX INFO: renamed from: A */
    public final AtomicReference f237576A;

    /* JADX INFO: renamed from: B */
    public boolean f237577B;

    /* JADX INFO: renamed from: C */
    public boolean f237578C;

    /* JADX INFO: renamed from: D */
    public boolean f237579D;

    /* JADX INFO: renamed from: E */
    public boolean f237580E;

    /* JADX INFO: renamed from: F */
    public WeakReference f237581F;

    /* JADX INFO: renamed from: G */
    public final yho f237582G;

    /* JADX INFO: renamed from: H */
    public final zux f237583H;

    /* JADX INFO: renamed from: I */
    public int f237584I;

    /* JADX INFO: renamed from: b */
    public final t9p0 f237585b;

    /* JADX INFO: renamed from: c */
    public final cq6 f237586c;

    /* JADX INFO: renamed from: d */
    public final xfx f237587d;

    /* JADX INFO: renamed from: e */
    public final luk f237588e;

    /* JADX INFO: renamed from: f */
    public final luk f237589f;

    /* JADX INFO: renamed from: g */
    public final xre f237590g;

    /* JADX INFO: renamed from: h */
    public final isi0 f237591h;

    /* JADX INFO: renamed from: i */
    public final fcr f237592i;

    /* JADX INFO: renamed from: j */
    public final e5j f237593j;

    /* JADX INFO: renamed from: k */
    public final bcm0 f237594k;

    /* JADX INFO: renamed from: l */
    public final azp0 f237595l;

    /* JADX INFO: renamed from: m */
    public final p8p0 f237596m;

    /* JADX INFO: renamed from: n */
    public final cxq0 f237597n;

    /* JADX INFO: renamed from: o */
    public final zv41 f237598o;

    /* JADX INFO: renamed from: p */
    public final zv41 f237599p;

    /* JADX INFO: renamed from: q */
    public final zv41 f237600q;

    /* JADX INFO: renamed from: r */
    public s9p0 f237601r;

    /* JADX INFO: renamed from: s */
    public WeakReference f237602s;

    /* JADX INFO: renamed from: t */
    public final zv41 f237603t;

    /* JADX INFO: renamed from: u */
    public k5r0 f237604u;

    /* JADX INFO: renamed from: v */
    public di41 f237605v;

    /* JADX INFO: renamed from: w */
    public di41 f237606w;

    /* JADX INFO: renamed from: x */
    public di41 f237607x;

    /* JADX INFO: renamed from: y */
    public zbr f237608y;

    /* JADX INFO: renamed from: z */
    public final zv41 f237609z;

    public v5r0(t9p0 t9p0Var, cq6 cq6Var, xfx xfxVar, luk lukVar, luk lukVar2, xre xreVar, isi0 isi0Var, fcr fcrVar, e5j e5jVar, bcm0 bcm0Var, yhm yhmVar, azp0 azp0Var, p8p0 p8p0Var, cxq0 cxq0Var) {
        yho yhoVar;
        this.f237585b = t9p0Var;
        this.f237586c = cq6Var;
        this.f237587d = xfxVar;
        this.f237588e = lukVar;
        this.f237589f = lukVar2;
        this.f237590g = xreVar;
        this.f237591h = isi0Var;
        this.f237592i = fcrVar;
        this.f237593j = e5jVar;
        this.f237594k = bcm0Var;
        this.f237595l = azp0Var;
        this.f237596m = p8p0Var;
        this.f237597n = cxq0Var;
        Boolean bool = Boolean.FALSE;
        this.f237598o = jag1.m52819d(bool);
        this.f237599p = jag1.m52819d(bool);
        fbk fbkVar = null;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f237600q = zv41VarM52819d;
        this.f237603t = jag1.m52819d(null);
        this.f237609z = jag1.m52819d(null);
        this.f237576A = new AtomicReference(null);
        this.f237584I = 1;
        switch (yhmVar.f272921a) {
            case 0:
                aim aimVar = (aim) ((igm) yhmVar.f272922b).f102010c;
                yhoVar = new yho((nea0) ((h4t0) aimVar.f16022b).get(), xfxVar, (xre) ((d23) aimVar.f16029i).f44441a);
                break;
            case 1:
                jnm jnmVar = (jnm) ((slm) yhmVar.f272922b).f210441c;
                nea0 nea0Var = (nea0) jnmVar.f114138P0.get();
                xre xreVarM64810c = ((nma) jnmVar.f114147X0).m64810c();
                jg31.m53271i(xreVarM64810c);
                yhoVar = new yho(nea0Var, xfxVar, xreVarM64810c);
                break;
            case 2:
                rkm rkmVar = (rkm) ((slm) yhmVar.f272922b).f210441c;
                nea0 nea0Var2 = (nea0) ((h4t0) rkmVar.f200108k).get();
                xre xreVarM75992c = ((rna) rkmVar.f200118u).m75992c();
                jg31.m53271i(xreVarM75992c);
                yhoVar = new yho(nea0Var2, xfxVar, xreVarM75992c);
                break;
            case 3:
                dlm dlmVar = (dlm) ((opm) yhmVar.f272922b).f167970c;
                nea0 nea0Var3 = (nea0) dlmVar.f50250e.get();
                xre xreVarM80221a = ((t7i) dlmVar.f50227L0).m80221a();
                jg31.m53271i(xreVarM80221a);
                yhoVar = new yho(nea0Var3, xfxVar, xreVarM80221a);
                break;
            case 4:
                aim aimVar2 = (aim) ((xrm) yhmVar.f272922b).f265375c;
                yhoVar = new yho((nea0) ((h4t0) aimVar2.f16022b).get(), xfxVar, (xre) ((nml) aimVar2.f16029i).f155472b);
                break;
            case 5:
                vym vymVar = (vym) ((yum) yhmVar.f272922b).f276419c;
                nea0 nea0Var4 = (nea0) vymVar.f246214P.get();
                xre xreVarM47376b = vymVar.f246236a.m47376b();
                jg31.m53271i(xreVarM47376b);
                yhoVar = new yho(nea0Var4, xfxVar, xreVarM47376b);
                break;
            case 6:
                mmb mmbVar = (mmb) ((zbn) yhmVar.f272922b).f281351c;
                nea0 nea0Var5 = (nea0) ((h4t0) mmbVar.f145099X).get();
                xre xreVar2 = (xre) ((nml) mmbVar.f145103b).f155472b;
                jg31.m53271i(xreVar2);
                yhoVar = new yho(nea0Var5, xfxVar, xreVar2);
                break;
            default:
                d6o d6oVar = (d6o) ((d3o) yhmVar.f272922b).f44953c;
                nea0 nea0Var6 = (nea0) d6oVar.f45815k0.get();
                xre xreVarM33651d = d6oVar.f45784a.m33651d();
                jg31.m53271i(xreVarM33651d);
                yhoVar = new yho(nea0Var6, xfxVar, xreVarM33651d);
                break;
        }
        this.f237582G = yhoVar;
        this.f237583H = new zux(new kmx(zv41VarM52819d, 8), new b7g0(isi0Var.f105260a, 8), new nri0(3, 1, fbkVar), 1);
    }

    /* JADX INFO: renamed from: b */
    public static String m84744b(k5r0 k5r0Var) {
        String str = k5r0Var.f119567d.f120136b.f109607e;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public final void m84745a(qwt qwtVar, k5r0 k5r0Var, xq00 xq00Var, int i) {
        int i2;
        Object yskVar;
        int i3;
        Object obj;
        Object obj2;
        fbk fbkVar;
        Object iso0Var;
        int i4;
        int i5;
        Object obj3;
        Object obj4;
        h6p0 h6p0Var;
        v5r0 v5r0Var = this;
        Object obj5 = t6x0.f217647t;
        xq00Var.m91775k0(1072729880);
        int i6 = 2;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(k5r0Var) : xq00Var.m91770i(k5r0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(v5r0Var) ? 256 : 128;
        }
        int i7 = i2;
        int i8 = 1;
        if (xq00Var.m91752Y(i7 & 1, (i7 & 147) != 146)) {
            String str = k5r0Var.f119565b;
            boolean zM91766g = xq00Var.m91766g(str);
            Object objM91750T = xq00Var.m91750T();
            fbk fbkVar2 = null;
            if (zM91766g || objM91750T == obj5) {
                v5r0Var.f237578C = false;
                v5r0Var.f237579D = false;
                v5r0Var.f237584I = 1;
                t9p0 t9p0Var = v5r0Var.f237585b;
                objM91750T = t9p0Var != null ? t9p0Var.mo32675e(str, false) : null;
                xq00Var.m91793t0(objM91750T);
            }
            v5r0Var.f237601r = (s9p0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(v5r0Var);
            Object objM91750T2 = xq00Var.m91750T();
            Object obj6 = objM91750T2;
            if (zM91770i || objM91750T2 == obj5) {
                Object a1e0Var = new a1e0(v5r0Var, i8);
                xq00Var.m91793t0(a1e0Var);
                obj6 = a1e0Var;
            }
            eh00 eh00Var = (eh00) obj6;
            boolean zM91770i2 = xq00Var.m91770i(v5r0Var);
            Object objM91750T3 = xq00Var.m91750T();
            Object obj7 = objM91750T3;
            if (zM91770i2 || objM91750T3 == obj5) {
                Object a1e0Var2 = new a1e0(v5r0Var, i6);
                xq00Var.m91793t0(a1e0Var2);
                obj7 = a1e0Var2;
            }
            p2h1.m68938d(qwtVar, v5r0Var.f237586c, str, eh00Var, (eh00) obj7, xq00Var, i7 & 14, 0);
            hc80 hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            kqi0 kqi0VarM69675a = pda0.m69675a(xq00Var);
            b250 b250Var = (b250) kqi0VarM69675a.getValue();
            u6j0 u6j0Var = u6j0.f227373f;
            mnm0 mnm0Var = (mnm0) b250Var.mo27941a(u6j0Var);
            kiz kizVar = mnm0Var != null ? mnm0Var.f145446b : null;
            if (kizVar != null) {
                d0k[] d0kVarArr = bmu0.f28619a;
                yskVar = new onc(kizVar);
            } else {
                i7t0 i7t0VarM69891n = pgg1.m69891n((b250) kqi0VarM69675a.getValue());
                if (i7t0VarM69891n != null) {
                    d0k[] d0kVarArr2 = bmu0.f28619a;
                    yskVar = new uxc0(new onc(i7t0VarM69891n), 14);
                } else {
                    yskVar = new ysk(hnm0.f93363a, 27);
                }
            }
            mnm0 mnm0Var2 = (mnm0) ((b250) kqi0VarM69675a.getValue()).mo27941a(u6j0Var);
            h6p0 h6p0Var2 = mnm0Var2 != null ? mnm0Var2.f145447c : null;
            if (h6p0Var2 == null) {
                h6p0Var2 = h6p0.f88213a;
            }
            Object rxp0Var = new rxp0(hc80Var.getLifecycle().mo44208c(), i6);
            v5r0Var.f237597n.f43081c = (b250) kqi0VarM69675a.getValue();
            String strM84744b = m84744b(k5r0Var);
            boolean zM91770i3 = xq00Var.m91770i(v5r0Var);
            int i9 = i7 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z = zM91770i3 | (i9 == 32 || ((i7 & 64) != 0 && xq00Var.m91770i(k5r0Var)));
            Object objM91750T4 = xq00Var.m91750T();
            if (z || objM91750T4 == obj5) {
                i3 = 0;
                Object q5r0Var = new q5r0(v5r0Var, k5r0Var, fbkVar2, i3);
                xq00Var.m91793t0(q5r0Var);
                obj = q5r0Var;
            } else {
                i3 = 0;
                obj = objM91750T4;
            }
            hz40.m49236h(str, strM84744b, (th00) obj, xq00Var);
            int i10 = (xq00Var.m91770i(v5r0Var) ? 1 : 0) | (xq00Var.m91770i(hc80Var) ? 1 : 0) | ((i9 == 32 || ((i7 & 64) != 0 && xq00Var.m91770i(k5r0Var))) ? 1 : i3);
            Object objM91750T5 = xq00Var.m91750T();
            if (i10 != 0 || objM91750T5 == obj5) {
                obj2 = hc80Var;
                fbkVar = null;
                i4 = i3;
                iso0Var = new iso0(v5r0Var, obj2, k5r0Var, fbkVar, 14);
                xq00Var.m91793t0(iso0Var);
            } else {
                obj2 = hc80Var;
                fbkVar = null;
                iso0Var = objM91750T5;
                i4 = i3;
            }
            hz40.m49237i(str, (th00) iso0Var, xq00Var);
            boolean zM91770i4 = xq00Var.m91770i(v5r0Var) | xq00Var.m91770i(obj2);
            Object objM91750T6 = xq00Var.m91750T();
            Object obj8 = objM91750T6;
            if (zM91770i4 || objM91750T6 == obj5) {
                Object mep0Var = new mep0(v5r0Var, obj2, fbkVar, 11);
                xq00Var.m91793t0(mep0Var);
                obj8 = mep0Var;
            }
            hz40.m49237i(str, (th00) obj8, xq00Var);
            boolean zM91770i5 = xq00Var.m91770i(v5r0Var);
            Object objM91750T7 = xq00Var.m91750T();
            Object obj9 = objM91750T7;
            if (zM91770i5 || objM91750T7 == obj5) {
                Object s5r0Var = new s5r0(v5r0Var, fbkVar, i4);
                xq00Var.m91793t0(s5r0Var);
                obj9 = s5r0Var;
            }
            hz40.m49237i(str, (th00) obj9, xq00Var);
            int i11 = (xq00Var.m91770i(v5r0Var) ? 1 : 0) | ((i9 == 32 || ((i7 & 64) != 0 && xq00Var.m91770i(k5r0Var))) ? 1 : i4);
            Object objM91750T8 = xq00Var.m91750T();
            if (i11 != 0 || objM91750T8 == obj5) {
                i5 = 1;
                Object q5r0Var2 = new q5r0(v5r0Var, k5r0Var, fbkVar, i5);
                xq00Var.m91793t0(q5r0Var2);
                obj3 = q5r0Var2;
            } else {
                i5 = 1;
                obj3 = objM91750T8;
            }
            hz40.m49237i(str, (th00) obj3, xq00Var);
            int i12 = (xq00Var.m91770i(v5r0Var) ? 1 : 0) | (xq00Var.m91770i(yskVar) ? 1 : 0) | (xq00Var.m91770i(rxp0Var) ? 1 : 0) | (xq00Var.m91762e(h6p0Var2.ordinal()) ? 1 : 0);
            if (i9 == 32 || ((i7 & 64) != 0 && xq00Var.m91770i(k5r0Var))) {
                i4 = i5;
            }
            int i13 = i12 | i4;
            Object objM91750T9 = xq00Var.m91750T();
            if (i13 != 0 || objM91750T9 == obj5) {
                obj4 = yskVar;
                h6p0Var = h6p0Var2;
                Object uyf0Var = new uyf0(14, this, obj4, rxp0Var, h6p0Var, k5r0Var, (fbk) null);
                v5r0Var = this;
                xq00Var.m91793t0(uyf0Var);
                objM91750T9 = uyf0Var;
            } else {
                obj4 = yskVar;
                h6p0Var = h6p0Var2;
            }
            hz40.m49235g(str, obj4, h6p0Var, (th00) objM91750T9, xq00Var);
            boolean zM91770i6 = xq00Var.m91770i(v5r0Var);
            Object objM91750T10 = xq00Var.m91750T();
            Object obj10 = objM91750T10;
            if (zM91770i6 || objM91750T10 == obj5) {
                Object p0r0Var = new p0r0(v5r0Var, 5);
                xq00Var.m91793t0(p0r0Var);
                obj10 = p0r0Var;
            }
            hz40.m49233e(w2a1.f247311a, (gh00) obj10, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dzm0(v5r0Var, qwtVar, k5r0Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: c */
    public final k7i0 m84746c(k5r0 k5r0Var) {
        Long lValueOf;
        boolean z = k5r0Var.f119569f;
        k7i0 k7i0Var = k5r0Var.f119567d;
        if (z) {
            String strM84744b = m84744b(k5r0Var);
            yho yhoVar = this.f237582G;
            xfx xfxVar = (xfx) yhoVar.f272928c;
            if (xfxVar != null) {
                MobiusLoop mobiusLoop = xfxVar.f261112a.f272367d;
                if (mobiusLoop == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                lValueOf = Long.valueOf(((Number) ((q9x0) bnf1.m29974j(mobiusLoop).getValue()).f186684a.getOrDefault(strM84744b, 0L)).longValue() * 1000);
            } else {
                lValueOf = null;
            }
            if (lValueOf == null || lValueOf.longValue() <= 0) {
                long j = ((dc11) ((Map) ((hc11) ((nea0) yhoVar.f272927b)).f89664c.getValue()).getOrDefault(strM84744b, new dc11(0L, 0L))).f47401a;
                lValueOf = j > 0 ? Long.valueOf(j) : null;
            }
            if (lValueOf != null) {
                return new k7i0(k7i0Var.f120135a, k7i0Var.f120136b, k7i0Var.f120137c, k7i0Var.f120138d, k7i0Var.f120139e != null ? new i7i0(Long.valueOf(lValueOf.longValue()), null) : null, k7i0Var.f120140f, k7i0Var.f120141g, k7i0Var.f120142h, k7i0Var.f120143i, k7i0Var.f120144j);
            }
        }
        return k7i0Var;
    }

    /* JADX INFO: renamed from: d */
    public final zux m84747d() {
        return this.f237583H;
    }

    /* JADX INFO: renamed from: e */
    public final void m84748e(k5r0 k5r0Var) {
        s9p0 s9p0Var;
        t9p0 t9p0Var;
        if (!k5r0Var.f119571h || this.f237584I != 1 || (s9p0Var = this.f237601r) == null || (t9p0Var = this.f237585b) == null) {
            return;
        }
        t9p0Var.mo32673a(s9p0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m84749f(k5r0 k5r0Var) {
        if (k5r0Var.f119569f) {
            yho yhoVar = this.f237582G;
            di41 di41Var = (di41) yhoVar.f272932g;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            di41 di41Var2 = (di41) yhoVar.f272931f;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            yhoVar.f272932g = null;
            yhoVar.f272931f = null;
            xre xreVar = (xre) yhoVar.f272929d;
            jf00 jf00Var = (jf00) yhoVar.f272930e;
            if (jf00Var instanceof if00) {
                if00 if00Var = (if00) jf00Var;
                if (!yhoVar.m93682v(if00Var.f101601a)) {
                    ((wy3) xreVar).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - if00Var.f101603c;
                    if (j < 0) {
                        j = 0;
                    }
                    yho.m93662B((nea0) yhoVar.f272927b, if00Var.f101601a, if00Var.f101602b + j, jCurrentTimeMillis);
                }
            } else if (jf00Var instanceof hf00) {
                hf00 hf00Var = (hf00) jf00Var;
                if (!yhoVar.m93682v(hf00Var.f90574a)) {
                    nea0 nea0Var = (nea0) yhoVar.f272927b;
                    String str = hf00Var.f90574a;
                    long j2 = hf00Var.f90575b;
                    ((wy3) xreVar).getClass();
                    yho.m93662B(nea0Var, str, j2, System.currentTimeMillis());
                }
            } else if (jf00Var instanceof gf00) {
                nea0 nea0Var2 = (nea0) yhoVar.f272927b;
                String str2 = ((gf00) jf00Var).f79244a;
                hc11 hc11Var = (hc11) nea0Var2;
                zv41 zv41Var = hc11Var.f89664c;
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) zv41Var.getValue());
                linkedHashMap.remove(str2);
                zv41Var.m97091m(null, linkedHashMap);
                hc11Var.m47090a();
            }
            xfx xfxVar = this.f237587d;
            if (xfxVar != null) {
                String strM84744b = m84744b(k5r0Var);
                yfx yfxVar = xfxVar.f261112a;
                MobiusLoop mobiusLoop = yfxVar.f272367d;
                if (mobiusLoop == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                yfxVar.m93569a(mobiusLoop, new n9x0(strM84744b));
            }
            this.f237576A.set(null);
        }
        zbr zbrVar = this.f237608y;
        if (zbrVar != null && !fem.m41461i(zbrVar)) {
            isi0 isi0Var = this.f237591h;
            if (!isi0Var.m51543a()) {
                zv41 zv41Var2 = isi0Var.f105260a;
                gsi0 gsi0Var = new gsi0();
                zv41Var2.getClass();
                zv41Var2.m97091m(null, gsi0Var);
            }
        }
        m84755l();
    }

    /* JADX INFO: renamed from: g */
    public final void m84750g(k5r0 k5r0Var, xuk xukVar, d850 d850Var, boolean z) {
        if (this.f237584I != 1) {
            return;
        }
        this.f237604u = k5r0Var;
        this.f237577B = false;
        this.f237581F = null;
        di41 di41Var = this.f237607x;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f237606w = x0h1.m89578u(xukVar, this.f237589f, 0, new u5r0(this, k5r0Var, d850Var, z, xukVar, null), 2);
    }

    /* JADX INFO: renamed from: h */
    public final zv41 m84751h() {
        return this.f237598o;
    }

    /* JADX INFO: renamed from: i */
    public final zv41 m84752i() {
        return this.f237599p;
    }

    /* JADX INFO: renamed from: j */
    public final void m84753j() {
        k5r0 k5r0Var;
        t9p0 t9p0Var;
        isi0 isi0Var = this.f237591h;
        boolean zM51543a = isi0Var.m51543a();
        zv41 zv41Var = isi0Var.f105260a;
        gsi0 gsi0Var = new gsi0();
        zv41Var.getClass();
        zv41Var.m97091m(null, gsi0Var);
        if (zM51543a || (k5r0Var = this.f237604u) == null || !k5r0Var.f119570g) {
            return;
        }
        this.f237577B = false;
        this.f237581F = null;
        Boolean bool = Boolean.FALSE;
        zv41 zv41Var2 = this.f237599p;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, bool);
        di41 di41Var = this.f237606w;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        di41 di41Var2 = this.f237607x;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        di41 di41Var3 = this.f237605v;
        if (di41Var3 != null) {
            di41Var3.mo26601e(null);
        }
        bcm0 bcm0Var = this.f237594k;
        lg21 lg21Var = (lg21) bcm0Var.f25916b;
        if (lg21Var != null) {
            lg21Var.m58929h();
        }
        bcm0Var.f25916b = null;
        s9p0 s9p0Var = this.f237601r;
        if (s9p0Var != null && (t9p0Var = this.f237585b) != null) {
            t9p0Var.mo32674b(s9p0Var);
        }
        k5r0 k5r0Var2 = this.f237604u;
        if (k5r0Var2 != null) {
            m84748e(k5r0Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m84754k(d850 d850Var) {
        k5r0 k5r0Var;
        lg21 lg21Var = (lg21) this.f237594k.f25916b;
        if (lg21Var == null || !(((cg21) lg21Var.f133060f.getValue()).f37544h instanceof eg21) || (k5r0Var = this.f237604u) == null) {
            return;
        }
        lg21Var.m58924b(m84746c(k5r0Var));
        lg21.m58922g(lg21Var, d850Var, dq60.m36607g((wy3) this.f237590g), null, u3t0.f226447a, 4);
    }

    /* JADX INFO: renamed from: l */
    public final void m84755l() {
        t9p0 t9p0Var;
        this.f237602s = null;
        this.f237581F = null;
        this.f237577B = false;
        this.f237603t.m97090l(null);
        Boolean bool = Boolean.FALSE;
        zv41 zv41Var = this.f237598o;
        zv41Var.getClass();
        zv41Var.m97091m(null, bool);
        zv41 zv41Var2 = this.f237599p;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, bool);
        this.f237604u = null;
        di41 di41Var = this.f237606w;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f237606w = null;
        di41 di41Var2 = this.f237607x;
        if (di41Var2 != null) {
            di41Var2.mo26601e(null);
        }
        this.f237607x = null;
        di41 di41Var3 = this.f237605v;
        if (di41Var3 != null) {
            di41Var3.mo26601e(null);
        }
        this.f237605v = null;
        this.f237580E = false;
        bcm0 bcm0Var = this.f237594k;
        lg21 lg21Var = (lg21) bcm0Var.f25916b;
        if (lg21Var != null) {
            lg21Var.m58932k();
        }
        lg21 lg21Var2 = (lg21) bcm0Var.f25916b;
        if (lg21Var2 != null) {
            lg21Var2.m58929h();
        }
        bcm0Var.f25916b = null;
        cg21 cg21Var = new cg21();
        zv41 zv41Var3 = this.f237600q;
        zv41Var3.getClass();
        zv41Var3.m97091m(null, cg21Var);
        s9p0 s9p0Var = this.f237601r;
        if (s9p0Var == null || (t9p0Var = this.f237585b) == null) {
            return;
        }
        t9p0Var.mo32674b(s9p0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m84756m(d850 d850Var) {
        if (this.f237584I != 1) {
            return;
        }
        this.f237580E = true;
        zv41 zv41Var = this.f237591h.f105260a;
        gsi0 gsi0Var = new gsi0(d850Var, false);
        zv41Var.getClass();
        zv41Var.m97091m(null, gsi0Var);
    }
}
