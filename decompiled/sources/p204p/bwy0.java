package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bwy0 {

    /* JADX INFO: renamed from: a */
    public static final long f31743a = epv0.m39702v(22);

    /* JADX INFO: renamed from: b */
    public static final float f31744b = 5;

    /* JADX INFO: renamed from: c */
    public static final oz60 f31745c = new oz60(0, null, 0, 3, 119);

    /* JADX INFO: renamed from: a */
    public static final void m30726a(l971 l971Var, boolean z, int i, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(1107459858);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91770i(l971Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            fxh0 fxh0VarM64246i = nec.m64246i(fxh0Var, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, kxf1.f127485a);
            int i4 = (i3 & 14) | 384 | (i3 & ContentType.LONG_FORM_ON_DEMAND);
            int i5 = i3 << 3;
            m30729d(l971Var, z, null, i, fxh0VarM64246i, gh00Var, xq00Var, i4 | (i5 & 7168) | (i5 & 458752));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new awy0(l971Var, z, i, fxh0Var, gh00Var, i2, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m30727b(l971 l971Var, boolean z, fxh0 fxh0Var, boolean z2, int i, gh00 gh00Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        int i3;
        int i4;
        fxh0 fxh0Var3;
        int i5;
        xq00Var.m91775k0(-1612387491);
        int i6 = i2 | (xq00Var.m91770i(l971Var) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | 384 | (xq00Var.m91768h(z2) ? 2048 : 1024) | 8192;
        if (xq00Var.m91752Y(i6 & 1, (74899 & i6) != 74898)) {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                i4 = i6 & (-57345);
                fxh0Var3 = cxh0.f43038a;
                i5 = R.string.search_header_field_hint;
            } else {
                xq00Var.m91757b0();
                i4 = i6 & (-57345);
                fxh0Var3 = fxh0Var;
                i5 = i;
            }
            xq00Var.m91790s();
            if (z2) {
                xq00Var.m91771i0(278761677);
                m30730e(l971Var, z, i5, fxh0Var3, gh00Var, xq00Var, (i4 & 126) | 27648);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(278950126);
                m30726a(l971Var, z, i5, fxh0Var3, gh00Var, xq00Var, (i4 & 126) | 27648);
                xq00Var.m91788r(false);
            }
            i3 = i5;
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            i3 = i;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1794dy(l971Var, z, fxh0Var2, z2, i3, gh00Var, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m30728c(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1430637632);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2;
            jnu jnuVar = jnu.f114200c;
            long j = leu.m58815a(xq00Var).f112824b.f138757a;
            rgj rgjVar = new rgj(k0e1.m54977L(R.string.search_query_cancel_button_accessibility, xq00Var));
            fxh0 fxh0VarM39673I = epv0.m39673I("search_field_back_button", mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0.f43038a));
            boolean z = (i3 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new dgx0(13, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            y85.m93057b(jnuVar, rgjVar, hdi.m47247x(fxh0VarM39673I, false, null, null, null, (eh00) objM91750T, 15), j, 0L, false, xq00Var, jnu.f114201d, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z3d0(gh00Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m30729d(l971 l971Var, boolean z, dea1 dea1Var, int i, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i2) {
        int i3;
        gh00 gh00Var2;
        if71 if71VarM50418a;
        boolean z2;
        Object gny0Var;
        Object obj;
        Object obj2;
        kqi0 kqi0Var;
        boolean z3;
        fxh0 fxh0VarM61824h;
        kqi0 kqi0Var2;
        Object obj3;
        voi0 voi0Var;
        l971 l971Var2;
        gh00 gh00Var3;
        b671 dy0Var;
        th00 th00Var;
        boolean z4;
        xq00Var.m91775k0(-967731000);
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91770i(l971Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91770i(dea1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91762e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 131072 : 65536;
        }
        int i4 = i3;
        if (xq00Var.m91752Y(i4 & 1, (74899 & i4) != 74898)) {
            boolean z5 = dea1Var != null;
            Object objM91750T = xq00Var.m91750T();
            Object obj4 = t6x0.f217647t;
            if (objM91750T == obj4) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            voi0 voi0Var2 = (voi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj4) {
                objM91750T2 = ydj.m93452k(xq00Var);
            }
            Object obj5 = (aqz) objM91750T2;
            Object obj6 = (ppz) xq00Var.m91774k(wsh.f254618i);
            Object obj7 = (mk31) xq00Var.m91774k(wsh.f254626q);
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj4) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T3;
            if (z5) {
                xq00Var.m91771i0(-1853122398);
                if71VarM50418a = if71.m50418a(leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 0, f31743a, null, null, null, 0, 16646142);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1852967832);
                if71VarM50418a = if71.m50418a(leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777214);
                xq00Var.m91788r(false);
            }
            if71 if71Var = if71VarM50418a;
            int i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            boolean zM91768h = (i5 == 32) | xq00Var.m91768h(z5);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91768h || objM91750T4 == obj4) {
                z2 = false;
                objM91750T4 = new p771(0, (z || z5) ? 3 : 1, 1);
                xq00Var.m91793t0(objM91750T4);
            } else {
                z2 = false;
            }
            p771 p771Var = (p771) objM91750T4;
            int i6 = i4 & 458752;
            boolean zM91770i = xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(obj5) | (i6 == 131072 ? true : z2) | xq00Var.m91770i(l971Var);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i || objM91750T5 == obj4) {
                obj = obj5;
                obj2 = obj4;
                kqi0Var = kqi0Var3;
                z3 = true;
                gny0Var = new gny0(obj, gh00Var, l971Var, kqi0Var, 1);
                xq00Var.m91793t0(gny0Var);
            } else {
                obj = obj5;
                gny0Var = objM91750T5;
                kqi0Var = kqi0Var3;
                z3 = true;
                obj2 = obj4;
            }
            eh00 eh00Var = (eh00) gny0Var;
            if (dea1Var == null || (fxh0VarM61824h = mi21.m61824h(dea1Var.f48044b, fxh0Var)) == null) {
                fxh0VarM61824h = fxh0Var;
            }
            if (dea1Var != null) {
                xq00Var.m91771i0(-1852334750);
                kqi0Var2 = kqi0Var;
                obj3 = dea1Var;
                l971Var2 = l971Var;
                gh00Var3 = gh00Var;
                dy0Var = new dy0(l971Var2, obj3, voi0Var2, eh00Var, i, if71Var);
                voi0Var = voi0Var2;
                xq00Var.m91788r(z2);
            } else {
                kqi0Var2 = kqi0Var;
                obj3 = dea1Var;
                voi0Var = voi0Var2;
                l971Var2 = l971Var;
                gh00Var3 = gh00Var;
                xq00Var.m91771i0(-1852051627);
                mqi0 mqi0Var = new mqi0();
                mqi0Var.f146298c = l971Var2;
                mqi0Var.f146297b = z;
                mqi0Var.f146299d = voi0Var;
                mqi0Var.f146296a = i;
                mqi0Var.f146300e = gh00Var3;
                mqi0Var.f146301f = eh00Var;
                xq00Var.m91788r(z2);
                dy0Var = mqi0Var;
            }
            boolean zM91770i2 = xq00Var.m91770i(l971Var2) | (i6 == 131072 ? z3 : z2);
            Object objM91750T6 = xq00Var.m91750T();
            fbk fbkVar = null;
            if (zM91770i2 || objM91750T6 == obj2) {
                objM91750T6 = new nf5(l971Var2, gh00Var3, fbkVar, 10);
                xq00Var.m91793t0(objM91750T6);
            }
            w2a1 w2a1Var = w2a1.f247311a;
            hz40.m49237i(w2a1Var, (th00) objM91750T6, xq00Var);
            fxh0 fxh0VarM69835p = pft0.m69835p(k3u0.m55315s(epv0.m39673I("search_field_input", mi21.m61822f(1.0f, fxh0VarM61824h)), z, voi0Var), obj);
            boolean zM91770i3 = (i6 == 131072 ? z3 : z2) | xq00Var.m91770i(l971Var2);
            Object objM91750T7 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T7 == obj2) {
                objM91750T7 = new sgy0(5, gh00Var3, l971Var2);
                xq00Var.m91793t0(objM91750T7);
            }
            fxh0 fxh0VarM43463v = g391.m43463v(fxh0VarM69835p, (gh00) objM91750T7);
            boolean z6 = i6 == 131072 ? z3 : z2;
            Object objM91750T8 = xq00Var.m91750T();
            if (z6 || objM91750T8 == obj2) {
                objM91750T8 = new dgx0(14, gh00Var3);
                xq00Var.m91793t0(objM91750T8);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM43463v, false, null, null, null, (eh00) objM91750T8, 15);
            Object obj8 = obj;
            pk31 pk31Var = new pk31(leu.m58815a(xq00Var).f112824b.f138759c);
            boolean zM91770i4 = (i6 == 131072 ? z3 : false) | xq00Var.m91770i(l971Var2);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T9 == obj2) {
                objM91750T9 = new kwc(gh00Var3, l971Var2);
                xq00Var.m91793t0(objM91750T9);
            }
            cz60 cz60Var = (cz60) objM91750T9;
            if (obj3 == null) {
                xq00Var.m91771i0(-1850523421);
                z4 = false;
                xq00Var.m91788r(false);
                th00Var = null;
            } else {
                xq00Var.m91771i0(-1850523420);
                boolean zM91770i5 = xq00Var.m91770i(obj3);
                Object objM91750T10 = xq00Var.m91750T();
                if (zM91770i5 || objM91750T10 == obj2) {
                    objM91750T10 = new iox0(obj3, 8);
                    xq00Var.m91793t0(objM91750T10);
                }
                th00Var = (th00) objM91750T10;
                z4 = false;
                xq00Var.m91788r(false);
            }
            th00 th00Var2 = th00Var;
            voi0 voi0Var3 = voi0Var;
            Object obj9 = obj2;
            boolean z7 = z3;
            d39.m34809c(l971Var, fxh0VarM47247x, false, false, null, if71Var, f31745c, cz60Var, p771Var, th00Var2, voi0Var3, pk31Var, null, dy0Var, null, xq00Var, i4 & 14, 0, 20508);
            kqi0 kqi0VarM72396s = q9g1.m72396s(voi0Var3, xq00Var, 0);
            kqi0 kqi0Var4 = kqi0Var2;
            boolean zM91770i6 = xq00Var.m91770i(kqi0VarM72396s) | (i6 == 131072 ? z7 : false) | xq00Var.m91770i(kqi0Var4);
            Object objM91750T11 = xq00Var.m91750T();
            if (zM91770i6 || objM91750T11 == obj9) {
                gh00Var2 = gh00Var;
                objM91750T11 = new ilw0(kqi0VarM72396s, gh00Var2, kqi0Var4, (fbk) null);
                xq00Var.m91793t0(objM91750T11);
            } else {
                gh00Var2 = gh00Var;
            }
            hz40.m49237i(w2a1Var, (th00) objM91750T11, xq00Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91770i7 = xq00Var.m91770i(kqi0VarM72396s) | (i5 == 32 ? z7 : false) | xq00Var.m91770i(kqi0Var4) | xq00Var.m91770i(obj8) | xq00Var.m91770i(l971Var) | xq00Var.m91770i(obj6) | xq00Var.m91770i(obj7);
            Object objM91750T12 = xq00Var.m91750T();
            if (zM91770i7 || objM91750T12 == obj9) {
                Object xapVar = new xap(z, obj8, l971Var, obj6, obj7, kqi0VarM72396s, kqi0Var4, null, 3);
                xq00Var.m91793t0(xapVar);
                objM91750T12 = xapVar;
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T12, xq00Var);
        } else {
            gh00Var2 = gh00Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j69(l971Var, z, dea1Var, i, fxh0Var, gh00Var2, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m30730e(l971 l971Var, boolean z, int i, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i2) {
        int i3;
        boolean z2;
        xq00Var.m91775k0(-1477109764);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i2 & 6) == 0) {
            i3 = (xq00Var.m91770i(l971Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= xq00Var.m91768h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object obj = t6x0.f217647t;
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            float fMo26962D = yqqVar.mo26962D(f31743a);
            ybs ybsVar = new ybs(leu.m58816b(xq00Var).f117232d.f137886b);
            float f = 2;
            float f2 = f31744b * f;
            float f3 = ((ybs) jlg1.m53714x(ybsVar, new ybs(f2 + fMo26962D))).f271238a;
            boolean zM91760d = xq00Var.m91760d(fMo26962D);
            Object objM91750T = xq00Var.m91750T();
            if (zM91760d || objM91750T == obj) {
                objM91750T = sam.m77645B(new zb71(fMo26962D / f, 1));
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            float f4 = fMo26962D * ((zb71) kqi0Var.getValue()).f281275b;
            float f5 = ((ybs) jlg1.m53714x(new ybs(f3), new ybs(f2 + f4))).f271238a;
            int iMo35990l0 = yqqVar.mo35990l0(f5) - yqqVar.mo35990l0(f4);
            if (iMo35990l0 < 0) {
                iMo35990l0 = 0;
            }
            int i4 = iMo35990l0 / 2;
            j4m0 j4m0Var = new j4m0(13, yqqVar.mo35987O0(i4), 9, yqqVar.mo35987O0(iMo35990l0 - i4));
            boolean zM91770i = xq00Var.m91770i(yqqVar) | xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new qlj(yqqVar, kqi0Var, 2);
                xq00Var.m91793t0(objM91750T2);
            }
            dea1 dea1Var = new dea1(f3, f5, ((zb71) kqi0Var.getValue()).f281274a, j4m0Var, (gh00) objM91750T2);
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, fxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d, 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            int i5 = i3;
            fxh0 fxh0VarM61824h = mi21.m61824h(f3, mi21.m61838v(leu.m58816b(xq00Var).f117232d.f137887c, cxh0.f43038a));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61824h);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            m30728c(gh00Var, xq00Var, (i5 >> 12) & 14);
            xq00Var.m91788r(true);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            int i6 = i5 << 3;
            m30729d(l971Var, z2, dea1Var, i, nec.m64246i(new cr70(1.0f, true), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(f3 / f)), gh00Var, xq00Var, (i5 & 126) | (i6 & 7168) | (i6 & 458752));
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new awy0(l971Var, z, i, fxh0Var, gh00Var, i2, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m30731f(int i, eh00 eh00Var, xq00 xq00Var, boolean z) {
        int i2;
        long j;
        xq00Var.m91775k0(-1065023239);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            wwu wwuVar = z ? vwu.f245554c : uwu.f234734c;
            rgj rgjVar = new rgj(k0e1.m54977L(R.string.search_clear_query_accessibility, xq00Var));
            if (z) {
                xq00Var.m91771i0(-1285105504);
                j = leu.m58815a(xq00Var).f112824b.f138758b;
            } else {
                xq00Var.m91771i0(-1285104419);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
            }
            xq00Var.m91788r(false);
            y85.m93057b(wwuVar, rgjVar, hdi.m47247x(epv0.m39673I("search_field_clear_button", mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0.f43038a)), false, null, null, null, eh00Var, 15), j, 0L, true, xq00Var, 196616, 16);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new u3v(i, z, eh00Var, 6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final v571 m30732g(xq00 xq00Var) {
        p671 p671Var = p671.f174307a;
        long j = n6f.f150870j;
        return p671.m69185c(j, j, 0L, j, j, j, xq00Var, 2147469263);
    }
}
