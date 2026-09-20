package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class o5l implements dut {

    /* JADX INFO: renamed from: X */
    public final i5x f162024X;

    /* JADX INFO: renamed from: a */
    public final qqa1 f162025a;

    /* JADX INFO: renamed from: b */
    public final lwd0 f162026b;

    /* JADX INFO: renamed from: c */
    public final bie1 f162027c;

    /* JADX INFO: renamed from: d */
    public final n93 f162028d;

    /* JADX INFO: renamed from: e */
    public final hv31 f162029e;

    /* JADX INFO: renamed from: f */
    public final oge0 f162030f;

    /* JADX INFO: renamed from: g */
    public final String f162031g;

    /* JADX INFO: renamed from: h */
    public final h90 f162032h;

    /* JADX INFO: renamed from: i */
    public final wxh0 f162033i;

    /* JADX INFO: renamed from: t */
    public final cph f162034t;

    public o5l(qqa1 qqa1Var, lwd0 lwd0Var, bie1 bie1Var, n93 n93Var, hv31 hv31Var, oge0 oge0Var, String str, h90 h90Var) {
        this.f162025a = qqa1Var;
        this.f162026b = lwd0Var;
        this.f162027c = bie1Var;
        this.f162028d = n93Var;
        this.f162029e = hv31Var;
        this.f162030f = oge0Var;
        this.f162031g = str;
        this.f162032h = h90Var;
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        adk adkVar = new adk(this, 9);
        fyf fyfVar = new fyf(new iy6(this, 4), true, 1111501336);
        jtp jtpVar = new jtp();
        jtpVar.m54301a(cmk.f39700Q0, sik.f209543e);
        this.f162033i = new wxh0(jtpVar, adkVar, rb20Var, fyfVar);
        fyf fyfVar2 = new fyf(new r4i(this, 24), true, -109816577);
        wpi0 wpi0Var = xwt.f266743a;
        this.f162034t = new cph(fyfVar2, 3);
        this.f162024X = mhf1.m61771p(this).m94133b(fpk.f71915e, fpk.f71916f);
    }

    /* JADX INFO: renamed from: i */
    public static final void m66287i(o5l o5lVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        boolean z7;
        boolean z8;
        int i3;
        xq00 xq00Var3 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var3.m91775k0(-546492334);
        ug5 ug5Var = xq00Var3.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var3.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var3.m91768h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var3.m91768h(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var3.m91768h(z4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var3.m91768h(z5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var3.m91768h(z6) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var3.m91770i(gh00Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var3.m91770i(o5lVar) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (xq00Var3.m91752Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            if (z) {
                xq00Var3.m91771i0(1668139922);
                o5lVar.m66289e((i4 >> 21) & 14, xq00Var3);
                xq00Var3.m91788r(false);
            } else {
                xq00Var3.m91771i0(1668168752);
                xq00Var3.m91788r(false);
            }
            if (z2) {
                xq00Var3.m91771i0(1668195629);
                bie1 bie1Var = o5lVar.f162027c;
                int i5 = i4 & 3670016;
                boolean z9 = i5 == 1048576;
                Object objM91750T = xq00Var3.m91750T();
                if (z9 || objM91750T == ia7Var) {
                    objM91750T = new awj(12, gh00Var);
                    xq00Var3.m91793t0(objM91750T);
                }
                eh00 eh00Var = (eh00) objM91750T;
                boolean z10 = i5 == 1048576;
                Object objM91750T2 = xq00Var3.m91750T();
                if (z10 || objM91750T2 == ia7Var) {
                    objM91750T2 = new awj(13, gh00Var);
                    xq00Var3.m91793t0(objM91750T2);
                }
                mif1.m61869b(bie1Var, new qew(eh00Var, (eh00) objM91750T2), null, null, xq00Var3, 8, 12);
                xq00Var2 = xq00Var3;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2 = xq00Var3;
                xq00Var2.m91771i0(1668444528);
                xq00Var2.m91788r(false);
            }
            ub9 ub9Var = d7f0.f46145P0;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var2).f117230b.f224761d, ub9Var), d7f0.f46141L0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            if (z5) {
                xq00Var2.m91771i0(-818343009);
                i3 = 1048576;
                boolean z11 = (i4 & 3670016) == 1048576;
                Object objM91750T3 = xq00Var2.m91750T();
                if (z11 || objM91750T3 == ia7Var) {
                    objM91750T3 = new awj(14, gh00Var);
                    xq00Var2.m91793t0(objM91750T3);
                }
                xq00Var3 = xq00Var2;
                z7 = true;
                z8 = false;
                o5lVar.m66290f(((i4 >> 15) & 14) | ((i4 >> 12) & 7168), (eh00) objM91750T3, xq00Var3, null, z6);
                xq00Var3.m91788r(false);
            } else {
                xq00Var3 = xq00Var2;
                z7 = true;
                z8 = false;
                i3 = 1048576;
                xq00Var3.m91771i0(-818240182);
                xq00Var3.m91788r(false);
            }
            int i6 = i4 & 3670016;
            boolean z12 = i6 == i3 ? z7 : z8;
            Object objM91750T4 = xq00Var3.m91750T();
            if (z12 || objM91750T4 == ia7Var) {
                objM91750T4 = new awj(15, gh00Var);
                xq00Var3.m91793t0(objM91750T4);
            }
            o5lVar.m66291g(((i4 >> 12) & 7168) | ((i4 >> 6) & 14), (eh00) objM91750T4, xq00Var3, null, z3);
            xq00Var3.m91788r(z7);
            if (z3) {
                xq00Var3.m91771i0(-1871006003);
                boolean z13 = i6 == i3 ? z7 : z8;
                Object objM91750T5 = xq00Var3.m91750T();
                if (z13 || objM91750T5 == ia7Var) {
                    objM91750T5 = new awj(16, gh00Var);
                    xq00Var3.m91793t0(objM91750T5);
                }
                o5lVar.m66292h(((i4 >> 9) & 14) | ((i4 >> 15) & 896), (eh00) objM91750T5, xq00Var3, z4);
                xq00Var3.m91788r(z8);
            } else {
                xq00Var3.m91771i0(-1870858970);
                xq00Var3.m91788r(z8);
            }
            xq00Var3.m91788r(z7);
        } else {
            xq00Var3.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var3.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c5l(o5lVar, z, z2, z3, z4, z5, z6, gh00Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: j */
    public static final Object m66288j(o5l o5lVar, String str, k5l k5lVar, boolean z, ibk ibkVar) {
        n5l n5lVar;
        boolean z2;
        Object objM73513a;
        String str2;
        yvd0 yvd0Var;
        yvd0 yvd0Var2;
        Object c6x0Var;
        boolean z3;
        k5l k5lVar2 = k5lVar;
        String str3 = o5lVar.f162031g;
        lwd0 lwd0Var = o5lVar.f162026b;
        if (ibkVar instanceof n5l) {
            n5lVar = (n5l) ibkVar;
            int i = n5lVar.f150580g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n5lVar.f150580g = i - Integer.MIN_VALUE;
            } else {
                n5lVar = new n5l(o5lVar, ibkVar);
            }
        } else {
            n5lVar = new n5l(o5lVar, ibkVar);
        }
        Object objM96567o = n5lVar.f150578e;
        int i2 = n5lVar.f150580g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            t2b0 t2b0Var = k5lVar2.f119538a;
            wcl wclVar = new wcl(t2b0Var.f195112a, str, t2b0Var.f195113b);
            qqa1 qqa1Var = o5lVar.f162025a;
            n5lVar.f150574a = str;
            n5lVar.f150575b = k5lVar2;
            z2 = z;
            n5lVar.f150577d = z2;
            n5lVar.f150580g = 1;
            objM73513a = qqa1Var.m73513a(wclVar, n5lVar);
            if (objM73513a != yukVar) {
                str2 = str;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yvd0Var = n5lVar.f150576c;
            try {
                bga.m29073P(objM96567o);
                c6x0Var = (m93) objM96567o;
            } catch (Throwable th) {
                th = th;
                c6x0Var = new c6x0(th);
            }
            yvd0Var2 = yvd0Var;
            if (c6x0Var instanceof c6x0) {
                na6.m63971s("Failed to curate clip");
                z3 = false;
            } else {
                o5lVar.f162030f.m66891n(new n6x0(yvd0Var2));
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
        boolean z4 = n5lVar.f150577d;
        k5l k5lVar3 = n5lVar.f150575b;
        String str4 = n5lVar.f150574a;
        bga.m29073P(objM96567o);
        objM73513a = ((s6x0) objM96567o).f206218a;
        z2 = z4;
        k5lVar2 = k5lVar3;
        str2 = str4;
        Throwable thM77348a = s6x0.m77348a(objM73513a);
        if (thM77348a != null) {
            na6.m63972t("Unexpected error creating highlight", thM77348a);
            return Boolean.FALSE;
        }
        xcl xclVar = (xcl) objM73513a;
        String str5 = xclVar.f260252a;
        t2b0 t2b0Var2 = k5lVar2.f119538a;
        yvd0 yvd0Var3 = new yvd0(str5, str2, t2b0Var2);
        String str6 = str2;
        ((omc) lwd0Var.f137542b.computeIfAbsent(str3, rer.f198419e)).mo30231j(new jwd0(str5, t2b0Var2.f195112a, t2b0Var2.f195113b, str6));
        ((omc) lwd0Var.f137543c.computeIfAbsent(str3, rer.f198420f)).mo30231j(yvd0Var3);
        if (z2) {
            try {
                Single singleM63880c = o5lVar.f162028d.m63880c(Collections.singletonList(xclVar.f260252a), xoc1.f263977R2.f243453a, str6, false, new f93(29, null));
                n5lVar.f150574a = null;
                n5lVar.f150575b = null;
                n5lVar.f150576c = yvd0Var3;
                n5lVar.f150577d = z2;
                n5lVar.f150580g = 2;
                objM96567o = zn91.m96567o(singleM63880c, n5lVar);
                if (objM96567o != yukVar) {
                    yvd0Var = yvd0Var3;
                    c6x0Var = (m93) objM96567o;
                    yvd0Var2 = yvd0Var;
                    if (c6x0Var instanceof c6x0) {
                        na6.m63971s("Failed to curate clip");
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
                return yukVar;
            } catch (Throwable th2) {
                th = th2;
                yvd0Var = yvd0Var3;
                c6x0Var = new c6x0(th);
            }
        } else {
            yvd0Var2 = yvd0Var3;
        }
        o5lVar.f162030f.m66891n(new n6x0(yvd0Var2));
        z3 = true;
        return Boolean.valueOf(z3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f162024X;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f162034t;
    }

    /* JADX INFO: renamed from: e */
    public final void m66289e(int i, xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-1017434445);
        int i2 = i & 1;
        if (xq00Var.m91752Y(i2, i2 != 0)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = bpj.f29488P0;
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            epv0.m39681a((eh00) objM91750T, new lhr(3, false, false, false), qag.f186873d, xq00Var2, 390, 0);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zuh(this, i, 8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m66290f(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1885938104);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91768h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            peu peuVar = new peu(u40.f226523c, eh00Var);
            ugu uguVar = ugu.f230259c;
            rgu rguVarM86516q = vvx.m86516q(xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            dyu.m37371c(peuVar, uguVar, epv0.m39673I("preview_button", cxh0Var), null, rguVarM86516q, null, null, null, rkk.m75772x(-267230904, new op0(z, 13), xq00Var), null, qag.f186872c, xq00Var, 805306368, 48, 1496);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i5l(this, z, eh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m66291g(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1976613763);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91768h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("create_clip_controls_element", cxh0Var);
            rgu rguVarM86516q = vvx.m86516q(xq00Var);
            String strM54977L = k0e1.m54977L(z ? R.string.continue_clip_button_action_label : R.string.save_button_action_label, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), new tgu(4), fxh0VarM39673I, null, rguVarM86516q, null, null, null, z ? null : qag.f186870a, null, rkk.m75772x(735230908, new op0(z, 14), xq00Var), xq00Var, 0, 48, 1496);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i5l(this, z, eh00Var, fxh0Var2, i, 1);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f162033i;
    }

    /* JADX INFO: renamed from: h */
    public final void m66292h(int i, eh00 eh00Var, xq00 xq00Var, boolean z) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(2073829962);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91768h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            tix0 tix0Var = new tix0(1);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new ke0(22, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(epv0.m39673I("save_to_clips_toggle", edg1.m38595p(cxh0Var, z, false, tix0Var, (gh00) objM91750T, 10)), 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 13);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            y85.m93057b(z ? kou.f124911c : auu.f20028c, qgj.f188480a, null, 0L, 0L, false, xq00Var2, 56, 60);
            ahf1.m25932d(k0e1.m54977L(R.string.save_to_your_clips_label, xq00Var2), zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224762e, 0.0f, 0.0f, 0.0f, 14), leu.m58818d(xq00Var2).f64972h, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2507vs(this, z, eh00Var, i, 6);
        }
    }
}
