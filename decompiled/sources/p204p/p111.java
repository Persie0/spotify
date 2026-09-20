package p204p;

import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class p111 implements dut {

    /* JADX INFO: renamed from: L0 */
    public final wxh0 f172911L0;

    /* JADX INFO: renamed from: M0 */
    public final i5x f172912M0 = mhf1.m61771p(this).m94133b(new m111(this, 0), new m111(this, 1));

    /* JADX INFO: renamed from: N0 */
    public final cph f172913N0;

    /* JADX INFO: renamed from: X */
    public final k5m0 f172914X;

    /* JADX INFO: renamed from: Y */
    public final luk f172915Y;

    /* JADX INFO: renamed from: Z */
    public final b411 f172916Z;

    /* JADX INFO: renamed from: a */
    public final xuk0 f172917a;

    /* JADX INFO: renamed from: b */
    public final ft01 f172918b;

    /* JADX INFO: renamed from: c */
    public final vch0 f172919c;

    /* JADX INFO: renamed from: d */
    public final kv91 f172920d;

    /* JADX INFO: renamed from: e */
    public final ynb f172921e;

    /* JADX INFO: renamed from: f */
    public final jjb f172922f;

    /* JADX INFO: renamed from: g */
    public final er70 f172923g;

    /* JADX INFO: renamed from: h */
    public final y0i0 f172924h;

    /* JADX INFO: renamed from: i */
    public final m011 f172925i;

    /* JADX INFO: renamed from: t */
    public final z9j0 f172926t;

    public p111(xuk0 xuk0Var, ft01 ft01Var, vch0 vch0Var, kv91 kv91Var, ynb ynbVar, jjb jjbVar, er70 er70Var, y0i0 y0i0Var, m011 m011Var, z9j0 z9j0Var, k5m0 k5m0Var, luk lukVar, b411 b411Var) {
        this.f172917a = xuk0Var;
        this.f172918b = ft01Var;
        this.f172919c = vch0Var;
        this.f172920d = kv91Var;
        this.f172921e = ynbVar;
        this.f172922f = jjbVar;
        this.f172923g = er70Var;
        this.f172924h = y0i0Var;
        this.f172925i = m011Var;
        this.f172926t = z9j0Var;
        this.f172914X = k5m0Var;
        this.f172915Y = lukVar;
        this.f172916Z = b411Var;
        int i = 3;
        this.f172911L0 = uuf1.m83999s(y011.f267864f, null, y011.f267866h, new fyf(new z701(this, i), true, -467590138), 2);
        fyf fyfVar = new fyf(new puz0(this, 15), true, -227222931);
        wpi0 wpi0Var = xwt.f266743a;
        this.f172913N0 = new cph(fyfVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX INFO: renamed from: h */
    public static final void m68759h(p111 p111Var, l111 l111Var, gh00 gh00Var, xq00 xq00Var, int i) throws Throwable {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(2017407938);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(l111Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(p111Var) ? 256 : 128;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91757b0();
        } else if (l111Var instanceof j111) {
            xq00Var.m91771i0(1122636558);
            j111 j111Var = (j111) l111Var;
            i111 i111Var = j111Var.f107594g;
            if (i111Var == i111.f97354d || i111Var == i111.f97352b) {
                xq00Var.m91771i0(1122773609);
                xq00Var.m91788r(false);
            } else if (i111Var == i111.f97353c) {
                l44 l44Var = p111Var.f172921e.f274426a;
                if (l44Var.m58075h() && l44Var.m58061a()) {
                    xq00Var.m91771i0(1122984037);
                    p111Var.m68762e(j111Var, xq00Var, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 14));
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1123062684);
                    p111Var.m68764g(j111Var, xq00Var, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 14));
                    xq00Var.m91788r(false);
                }
            } else {
                xq00Var.m91771i0(1123062684);
                p111Var.m68764g(j111Var, xq00Var, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 14));
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(false);
        } else {
            boolean z = l111Var instanceof k111;
            cxh0 cxh0Var = cxh0.f43038a;
            fbk fbkVar = null;
            if (z) {
                xq00Var.m91771i0(1123177787);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, mi21.m61842z(cxh0Var, null, 3));
                aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                ufc1.m82964b(null, xq00Var, 0);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            } else {
                if (!(l111Var instanceof h111)) {
                    throw lq51.m59703i(1698781225, xq00Var, false);
                }
                xq00Var.m91771i0(1123337716);
                int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
                boolean z2 = i3 == 32;
                Object objM91750T = xq00Var.m91750T();
                if (z2 || objM91750T == ia7Var) {
                    objM91750T = new ri0(gh00Var, fbkVar, 15);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(w2a1.f247311a, (th00) objM91750T, xq00Var);
                fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
                boolean z3 = i3 == 32;
                Object objM91750T2 = xq00Var.m91750T();
                if (z3 || objM91750T2 == ia7Var) {
                    objM91750T2 = new os01(8, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                ppg1.m70559c(6, (eh00) objM91750T2, xq00Var, fxh0VarM61822f2);
                xq00Var.m91788r(false);
            }
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ylw0(p111Var, l111Var, gh00Var, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (p204p.x0h1.m89557A(r0, r8, r1) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (p204p.x0h1.m89557A(r0, r8, r1) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m68760i(p111 p111Var, ccl0 ccl0Var, fq01 fq01Var, fbk fbkVar) {
        n111 n111Var;
        luk lukVar = p111Var.f172915Y;
        if (fbkVar instanceof n111) {
            n111Var = (n111) fbkVar;
            int i = n111Var.f149266c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n111Var.f149266c = i - Integer.MIN_VALUE;
            } else {
                n111Var = new n111(p111Var, fbkVar);
            }
        } else {
            n111Var = new n111(p111Var, fbkVar);
        }
        Object obj = n111Var.f149264a;
        int i2 = n111Var.f149266c;
        if (i2 == 0) {
            bga.m29073P(obj);
            rp01 rp01Var = rp01.f201396d;
            fbk fbkVar2 = null;
            yuk yukVar = yuk.f276404a;
            if (fq01Var == rp01Var || fq01Var == fp01.f71659d) {
                o111 o111Var = new o111(p111Var, ccl0Var, fbkVar2, 0);
                n111Var.f149266c = 1;
            } else {
                o111 o111Var2 = new o111(p111Var, ccl0Var, fbkVar2, 1);
                n111Var.f149266c = 2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: j */
    public static final i111 m68761j(p111 p111Var, ijb ijbVar) {
        int iOrdinal = ijbVar.ordinal();
        if (iOrdinal == 0) {
            return i111.f97353c;
        }
        if (iOrdinal == 1) {
            return i111.f97352b;
        }
        if (iOrdinal == 2) {
            return i111.f97351a;
        }
        if (iOrdinal == 3) {
            return i111.f97354d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f172912M0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f172913N0;
    }

    /* JADX INFO: renamed from: e */
    public final void m68762e(j111 j111Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(2127574784);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(j111Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("share.sheet.share.onplatform.age.assurance.banner", mi21.m61822f(1.0f, mi21.m61842z(cxh0.f43038a, null, 3)));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            m68763f(j111Var, xq00Var, i2 & 126);
            xq00Var2 = xq00Var;
            mif1.m61869b((ry8) this.f172923g.get(), new by01(j111Var.f107590c, j111Var.f107591d, j111Var.f107592e, j111Var.f107595h, j111Var.f107589b), null, null, xq00Var2, 0, 12);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c111(this, j111Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m68763f(j111 j111Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(811048239);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(j111Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            xq00Var.m91757b0();
        } else if (j111Var.f107593f) {
            xq00Var.m91771i0(-1547816542);
            fxh0 fxh0VarM39673I = epv0.m39673I("share.sheet.share.onplatform.onboarding.label.loaded", mi21.m61822f(1.0f, cxh0.f43038a));
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = y011.f267863e;
                xq00Var.m91793t0(objM91750T);
            }
            g0g1.m43297b(1, 6, xq00Var, zoz0.m96644b(fxh0VarM39673I, true, (gh00) objM91750T));
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1547486733);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c111(this, j111Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m68764g(j111 j111Var, xq00 xq00Var, int i) throws Throwable {
        xq00Var.m91775k0(959848003);
        int i2 = (i & 6) == 0 ? (xq00Var.m91766g(j111Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            Throwable th = null;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, mi21.m61842z(cxh0Var, null, 3));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            m68763f(j111Var, xq00Var, i2 & 126);
            xq00Var.m91771i0(-2059463434);
            List list = j111Var.f107588a;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    h6f.m46722S();
                    throw th2;
                }
                nbl0 nbl0Var = (nbl0) obj;
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = (dut) new vvk0(this.f172917a, 10).invoke();
                    xq00Var.m91793t0(objM91750T);
                }
                arrayList.add(new s630(new b111(j111Var.f107589b.m82262g(), nbl0Var, i3, j111Var.f107590c, j111Var.f107591d, j111Var.f107592e, j111Var.f107595h), (dut) objM91750T));
                i3 = i4;
                th = th;
            }
            xq00Var.m91788r(false);
            hra.m48356b(opo.m67546C(arrayList), mi21.m61822f(1.0f, cxh0Var), null, xq00Var, 48, 4);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c111(this, j111Var, i, 2);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f172911L0;
    }
}
