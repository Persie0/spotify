package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pmg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f179068a;

    /* JADX INFO: renamed from: b */
    public static sd40 f179069b;

    /* JADX INFO: renamed from: a */
    public static final void m70342a(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-1269108004);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            qiu.m72876b(15, rkk.m75772x(1933305361, new C1818el(eh00Var, str), xq00Var), xq00Var, 54);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, eh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70343b(di60 di60Var, xq00 xq00Var, int i) {
        int i2;
        String strM54978M;
        xq00Var.m91775k0(1647878659);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(di60Var) : xq00Var.m91770i(di60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = di60Var.f49268f;
            String str = di60Var.f49264b;
            if (z) {
                xq00Var.m91771i0(477027883);
                if (di60Var.f49267e) {
                    xq00Var.m91771i0(477065114);
                    strM54978M = k0e1.m54978M(R.string.join_jam_sheet_device_text_ask_to_join, new Object[]{str}, xq00Var);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(477170886);
                    strM54978M = k0e1.m54978M(R.string.join_jam_sheet_device_text, new Object[]{str}, xq00Var);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(477271512);
                strM54978M = k0e1.m54978M(R.string.join_jam_nearby_session_device_fallback, new Object[]{di60Var.f49263a}, xq00Var);
                xq00Var.m91788r(false);
            }
            kmg1.m56908f(di60Var.f49265c, strM54978M, null, xq00Var, 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qy40(di60Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m70344c(int i, int i2, int i3, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-2075665721);
        int i4 = i3 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91762e(i2) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            String strM54978M = k0e1.m54978M(R.string.kid_account_creation_page_indicator, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            long j = ((hiu) iiu.f102631a.f258040e).f91882m;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(strM54978M, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, f, 0.0f, 11), if71Var, j, new h171(6), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s7c(i, i2, i3, 9, fxh0Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m70345d(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1186268037);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new vh60(1, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(hdi.m47247x(fxh0VarM61822f, false, null, null, null, (eh00) objM91750T, 15), 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                m70360s();
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
            ahf1.m25932d(k0e1.m54977L(R.string.join_jam_learn_more_about_invite, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            y85.m93057b(pou.f179785c, qgj.f188480a, null, leu.m58815a(xq00Var).f112824b.f138758b, 0L, false, xq00Var, pou.f179786d | 48, 52);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(i, false, eh00Var, 18);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m70346e(float f, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1963773666);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                m70360s();
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
            dha.m36004a(nec.m64246i(mi21.m61824h(1, ms2.m62688m(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, cxh0Var, 1.0f)), leu.m58815a(xq00Var).f112826d.f50025b, kxf1.f127485a), xq00Var, 0);
            m70345d(eh00Var, xq00Var, (i2 >> 3) & 14);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hkx(f, i, eh00Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m70347f(b4c0 b4c0Var, gh00 gh00Var, f4m0 f4m0Var, ha80 ha80Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1542477363);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(b4c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(f4m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(ha80Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1155) != 1154)) {
            xq00Var2 = xq00Var;
            mif1.m61869b((gzl) ha80Var.f89153b, new co3(b4c0Var.f23301a, b4c0Var.f23302b), zsf1.m96832C(zsf1.m96864x(cxh0.f43038a, f4m0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 0.0f, 13), null, xq00Var2, 0, 8);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60((Object) b4c0Var, gh00Var, (Object) f4m0Var, (Object) ha80Var, i, 27);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m70348g(eju ejuVar, k79 k79Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1104159737);
        int i2 = i | (xq00Var.m91770i(ejuVar) ? 4 : 2) | (xq00Var.m91770i(k79Var) ? 32 : 16) | (xq00Var.m91770i(fxh0Var) ? 256 : 128) | (xq00Var.m91770i(gh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM91770i = xq00Var.m91770i(ejuVar) | ((i2 & 7168) == 2048);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new xqm0(ejuVar, gh00Var, 1);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(k79Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new yqm0(k79Var, 1);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0Var, (gh00) objM91750T2, xq00Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zqm0(ejuVar, k79Var, fxh0Var, gh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m70349h(nlt0 nlt0Var, boolean z, eh00 eh00Var, xq00 xq00Var, int i) {
        String description;
        peu peuVar;
        xq00Var.m91775k0(986780730);
        int i2 = i | (xq00Var.m91766g(nlt0Var) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.questionnaire_choice_limit_reached, xq00Var);
            if (nlt0Var instanceof mlt0) {
                description = AbstractC0000a.m12k(xq00Var, -1866171175, R.string.questionnaire_user_added_answer_subtitle, xq00Var, false);
            } else {
                xq00Var.m91771i0(-1866088312);
                xq00Var.m91788r(false);
                description = nlt0Var.getDescription();
            }
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            boolean z2 = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new qc7(nlt0Var, z, 11);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61822f, true, (gh00) objM91750T);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var).f117230b.f224762e;
            kyu kyuVar = new kyu(0, null, 3, new j4m0(f, f2, f, f2), null, new jyu(leu.m58816b(xq00Var).f117230b.f224758a, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d), null, 0, null, 467);
            udu qduVar = z ? sdu.f208086a : new qdu(strM54977L);
            fyf fyfVarM75772x = null;
            if (z) {
                String text = nlt0Var.getText();
                if (wl51.m88460J0(text)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                peuVar = new peu(new t40(text), eh00Var);
            } else {
                peuVar = null;
            }
            if (description == null) {
                xq00Var.m91771i0(-1864817840);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1864817839);
                fyfVarM75772x = rkk.m75772x(1486862950, new ylm0(description, 12), xq00Var);
                xq00Var.m91788r(false);
            }
            p711.m69222a(fxh0VarM96644b, kyuVar, qduVar, false, null, null, peuVar, null, null, null, null, fyfVarM75772x, rkk.m75772x(917740257, new klt0(nlt0Var, 0), xq00Var), null, null, rkk.m75772x(-909317762, new klt0(nlt0Var, 1), xq00Var), xq00Var, 64, 196992, 26552);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wo0(nlt0Var, z, eh00Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m70350i(List list, rc01 rc01Var, gh00 gh00Var, fxh0 fxh0Var, boolean z, boolean z2, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(273509872);
        int i2 = i | (xq00Var.m91766g(list) ? 4 : 2) | (xq00Var.m91762e(rc01Var.ordinal()) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | 3072 | (xq00Var.m91768h(z) ? 16384 : 8192) | (xq00Var.m91768h(z2) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            int iIndexOf = list.indexOf(rc01Var);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zM91762e = xq00Var.m91762e(iIndexOf) | xq00Var.m91770i(yw70VarM30763a);
            Object objM91750T = xq00Var.m91750T();
            if (zM91762e || objM91750T == obj) {
                objM91750T = new l92(iIndexOf, (fbk) null, yw70VarM30763a);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49237i(numValueOf, (th00) objM91750T, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 5);
            j4m0 j4m0VarM96848h = zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29371h = bj5.m29371h(leu.m58816b(xq00Var).f117230b.f224762e, d7f0.f46145P0);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((458752 & i2) == 131072) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == obj) {
                objM91750T2 = new zzu(5, list, rc01Var, gh00Var, z2, z);
                xq00Var.m91793t0(objM91750T2);
            }
            fyg1.m43086j(fxh0VarM96832C, yw70VarM30763a, j4m0VarM96848h, xi5VarM29371h, null, null, false, null, (gh00) objM91750T2, xq00Var, 0, 488);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lwc(list, rc01Var, gh00Var, fxh0Var2, z, z2, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m70351j(ol61 ol61Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1736636824);
        int i2 = i | (xq00Var.m91766g(ol61Var) ? 4 : 2) | (xq00Var.m91766g(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            c8y0 c8y0VarM59893o = ltf1.m59893o(xq00Var);
            Object value = ol61Var.f166768c.getValue();
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new gh41(ol61Var, 2);
                xq00Var.m91793t0(objM91750T);
            }
            bx4.m30752a(value, fxh0Var, (gh00) objM91750T, null, "TabNode", null, rkk.m75772x(866341353, new jbs0(1, c8y0VarM59893o, fyfVar), xq00Var), xq00Var, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 1597440, 40);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vk5(ol61Var, fxh0Var, fyfVar, i, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public static final void m70352k(di60 di60Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var4;
        eh00 eh00Var5;
        eh00 eh00Var6 = eh00Var3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-446887701);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var2.m91766g(di60Var) : xq00Var2.m91770i(di60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var6) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var2.m91770i(cxh0Var) ? 16384 : 8192;
        }
        int i4 = i2;
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 9363) != 9362)) {
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(mi21.m61822f(1.0f, cxh0Var), oyf1.m68467i0(0, 0, 1, xq00Var2), false, 14);
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM19r = AbstractC0000a.m19r(bxd1.m30815d(xq00Var2).f42991g, 32, fxh0VarM68493v0);
            ub9 ub9Var = d7f0.f46145P0;
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM19r);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                m70360s();
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
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var2).f117230b.f224758a, 0.0f, 2);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            kmg1.m56914l(opo.m67574x(di60Var.f49269g), null, false, null, xq00Var2, 8, 14);
            xq00Var2 = xq00Var;
            kmg1.m56910h(opo.m67574x(di60Var.f49266d), di60Var.f49263a, di60Var.f49267e, null, xq00Var2, 8);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224763f, cxh0Var));
            m70343b(di60Var, xq00Var2, (i4 & 14) | 8);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224765h, cxh0Var));
            eh00Var5 = eh00Var;
            eh00Var4 = eh00Var2;
            kmg1.m56911i(di60Var.f49267e, eh00Var5, eh00Var4, xq00Var2, i4 & 1008);
            xq00Var2.m91788r(true);
            eh00Var6 = eh00Var3;
            m70346e(leu.m58816b(xq00Var2).f117230b.f224763f, eh00Var6, xq00Var2, (i4 >> 6) & ContentType.LONG_FORM_ON_DEMAND);
            AbstractC0000a.m22u(cxh0Var, AbstractC0000a.m17p(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224766i, xq00Var2, xq00Var2).f117230b.f224764g, xq00Var2, true);
        } else {
            eh00Var4 = eh00Var2;
            eh00Var5 = eh00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(di60Var, eh00Var5, eh00Var4, eh00Var6, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m70353l(fpi0 fpi0Var, Map map) {
        if (fpi0Var != null && fpi0Var.f71881e == map.size()) {
            Object[] objArr = fpi0Var.f71878b;
            int[] iArr = fpi0Var.f71879c;
            long[] jArr = fpi0Var.f71877a;
            int length = jArr.length - 2;
            if (length < 0) {
                return true;
            }
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            Integer num = (Integer) map.get((pb3) obj);
                            if (num == null || num.intValue() != i5) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i == length) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final exh0 m70354m(jlq jlqVar, int i) {
        exh0 exh0Var = ((exh0) jlqVar).f63770a.f63775f;
        if (exh0Var == null || (exh0Var.f63773d & i) == 0) {
            return null;
        }
        while (exh0Var != null) {
            int i2 = exh0Var.f63772c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return exh0Var;
            }
            exh0Var = exh0Var.f63775f;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final zzo m70355n(Context context, Long l) {
        Context applicationContext = context.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        if (l != null) {
            for (Integer num : map.keySet()) {
                num.getClass();
                map.put(num, l);
            }
        }
        return new zzo(applicationContext, map);
    }

    /* JADX INFO: renamed from: o */
    public static final int m70356o(xq00 xq00Var) {
        return Long.hashCode(xq00Var.f264809T);
    }

    /* JADX INFO: renamed from: p */
    public static final long m70357p(xq00 xq00Var) {
        return xq00Var.f264809T;
    }

    /* JADX INFO: renamed from: q */
    public static final pgv0 m70358q(xq00 xq00Var) {
        pgv0 pgv0VarM91734D = xq00Var.m91734D();
        if (pgv0VarM91734D == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        pgv0VarM91734D.m69930g();
        return pgv0VarM91734D;
    }

    /* JADX INFO: renamed from: r */
    public static final qge m70359r(oqo oqoVar) {
        oqo oqoVarMo27379o = oqoVar.mo27379o();
        if (oqoVarMo27379o == null || (oqoVar instanceof m3m0)) {
            return null;
        }
        if (!(oqoVarMo27379o.mo27379o() instanceof m3m0)) {
            return m70359r(oqoVarMo27379o);
        }
        if (oqoVarMo27379o instanceof qge) {
            return (qge) oqoVarMo27379o;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final void m70360s() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: t */
    public static final vq00 m70361t(xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91763e0(206, vph.f243695e);
        if (xq00Var.f264808S) {
            wu21.m88962z(xq00Var.f264798I);
        }
        Object objM91742L = xq00Var.m91742L();
        f9w0 edx0Var = objM91742L instanceof f9w0 ? (f9w0) objM91742L : null;
        if (edx0Var == null) {
            xq00Var2 = xq00Var;
            edx0Var = new edx0(new uq00(new vq00(xq00Var2, xq00Var.f264809T, xq00Var.f264827q, xq00Var.f264792C, xq00Var.f264818h.f146784R0)), -1);
            xq00Var2.m91795u0(edx0Var);
        } else {
            xq00Var2 = xq00Var;
        }
        vq00 vq00Var = ((uq00) edx0Var.mo30283a()).f232880a;
        vq00Var.f243826g.setValue(xq00Var2.m91778m());
        xq00Var2.m91788r(false);
        return vq00Var;
    }

    /* JADX INFO: renamed from: u */
    public static final nfe m70362u(mxh0 mxh0Var, y400 y400Var) {
        bfe0 bfe0VarMo30957T;
        z400 z400Var = y400Var.f269048a;
        if (!z400Var.m95303c()) {
            tx70 tx70Var = ((ex70) mxh0Var.mo53208I(y400Var.m92786b())).f63695h;
            qti0 qti0VarM95306g = z400Var.m95306g();
            pkj0 pkj0Var = pkj0.f178474a;
            qge qgeVarMo27571g = tx70Var.mo27571g(qti0VarM95306g, pkj0Var);
            nfe nfeVar = qgeVarMo27571g instanceof nfe ? (nfe) qgeVarMo27571g : null;
            if (nfeVar != null) {
                return nfeVar;
            }
            nfe nfeVarM70362u = m70362u(mxh0Var, y400Var.m92786b());
            qge qgeVarMo27571g2 = (nfeVarM70362u == null || (bfe0VarMo30957T = nfeVarM70362u.mo30957T()) == null) ? null : bfe0VarMo30957T.mo27571g(z400Var.m95306g(), pkj0Var);
            if (qgeVarMo27571g2 instanceof nfe) {
                return (nfe) qgeVarMo27571g2;
            }
        }
        return null;
    }
}
