package p204p;

import android.net.Uri;
import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iig1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f102559a;

    /* JADX INFO: renamed from: b */
    public static sd40 f102560b;

    /* JADX INFO: renamed from: a */
    public static final void m50714a(String str, String str2, String str3, Integer num, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        eh00 eh00Var2 = eh00Var;
        xq00Var.m91775k0(1714661227);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(str3) ? 256 : 128) | (xq00Var.m91766g(num) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var2) ? 16384 : 8192);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117233e.f137888d, 0.0f, 0.0f, 13);
            ub9 ub9Var = d7f0.f46145P0;
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            int i3 = i2 << 9;
            kgg1.m56339b(Uri.parse(str3 == null ? "" : str3), mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159609g, cxh0Var), tfu.f220052e, str, str2, num != null ? n6f.m63765b(rfg1.m75432b(num.intValue()), 1.0f, 0.0f, 0.0f, 0.0f, 14) : n6f.f150871k, 0L, false, xq00Var, (i3 & 7168) | 384 | (i3 & 57344), 192);
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, mi21.m61822f(1.0f, cxh0Var));
            aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d), ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96865y);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ahf1.m25932d(k0e1.m54978M(R.string.profile_friend_request_sheet_title, new Object[]{str2}, xq00Var), null, leu.m58818d(xq00Var).f64969e, 0L, new h171(3), null, 0, false, new ol80(3), 0, null, xq00Var, 0, 0, 1770);
            ahf1.m25932d(k0e1.m54977L(R.string.profile_friend_request_sheet_body, xq00Var), null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, new ol80(Alert.DURATION_SHOW_INDEFINITELY), 0, null, xq00Var, 0, 0, 1762);
            xq00Var.m91788r(true);
            fxh0 fxh0VarM96832C2 = zsf1.m96832C(zfg1.m96028q(cxh0Var, zfg1.f282319g), 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5);
            aaf aafVarM87496a3 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM96832C2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a3, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            eh00Var2 = eh00Var;
            dyu.m37371c(new peu(u40.f226523c, eh00Var2), new tgu(4), null, null, vvx.m86516q(xq00Var), null, null, null, null, null, bjg.f27695a, xq00Var, 0, 48, 2012);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new w5k(str, str2, str3, num, eh00Var2, i, 18);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m50715b(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(332358895);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.queue_jam_capped_premium_banner_message, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.queue_jam_capped_premium_banner_click_label, xq00Var);
            zhi0 zhi0Var = bj5.f27612c;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
            soh.f211194A.getClass();
            eh00 eh00Var2 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, hdi.m47247x(nec.m64246i(zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58815a(xq00Var).f112823a.f229874a.f123094b, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148189e)), false, strM54977L2, null, null, eh00Var, 13));
            boolean zM91766g = xq00Var.m91766g(strM54977L);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new ej10(strM54977L, 23);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96643a = zoz0.m96643a(fxh0VarM96865y, (gh00) objM91750T);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96643a);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, cr70Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            phf1.m69984c(0, 1, xq00Var, null);
            ahf1.m25932d(strM54977L, null, fr0.m42477u(cxh0Var, leu.m58816b(xq00Var).f117230b.f224759b, xq00Var, xq00Var).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var.m91788r(true);
            cxh0 cxh0Var2 = cxh0Var;
            riw0.m75615i(xq00Var, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var2));
            y85.m93057b(pou.f179785c, qgj.f188480a, null, leu.m58815a(xq00Var).f112824b.f138757a, 0L, false, xq00Var, pou.f179786d | 48, 52);
            xq00Var.m91788r(true);
            AbstractC0000a.m22u(cxh0Var2, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, true);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(eh00Var, fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m50716c(w711 w711Var, e940 e940Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        e940 e940Var2;
        fxh0 fxh0Var2;
        String strM12k;
        eh00 eh00Var;
        ia7 ia7Var = t6x0.f217647t;
        boolean z = w711Var.f248514c;
        xq00Var.m91775k0(199930150);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(w711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            e940Var2 = e940Var;
            i2 |= xq00Var.m91770i(e940Var2) ? 32 : 16;
        } else {
            e940Var2 = e940Var;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fxh0Var2 = fxh0Var;
            i2 |= xq00Var.m91766g(fxh0Var2) ? 2048 : 1024;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            List list = w711Var.f248513b;
            String strM75071s = r9g1.m75071s(list);
            if (z) {
                xq00Var.m91771i0(-1000166947);
                Integer numM65708t = nug1.m65708t(w711Var.f248515d);
                if (numM65708t == null) {
                    xq00Var.m91771i0(-1000166948);
                    xq00Var.m91788r(false);
                    strM12k = null;
                } else {
                    strM12k = AbstractC0000a.m13l(xq00Var, -1000166947, numM65708t, xq00Var, false);
                }
                xq00Var.m91788r(false);
            } else {
                strM12k = AbstractC0000a.m12k(xq00Var, -1000116634, R.string.share_with_row_reason_disabled, xq00Var, false);
            }
            bsu bsuVar = bsu.f30386c;
            String strM54977L = k0e1.m54977L(R.string.share_with_row_more_content_description, xq00Var);
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new w831(21, gh00Var, w711Var);
                xq00Var.m91793t0(objM91750T);
            }
            vva1 vva1Var = new vva1(list, strM75071s, strM12k, new qva1(new tva1(strM54977L, bsuVar, (eh00) objM91750T)));
            if (z) {
                xq00Var.m91771i0(-999550016);
                boolean z3 = i3 == 256;
                Object objM91750T2 = xq00Var.m91750T();
                if (z3 || objM91750T2 == ia7Var) {
                    objM91750T2 = new ko41(13, gh00Var);
                    xq00Var.m91793t0(objM91750T2);
                }
                eh00Var = (eh00) objM91750T2;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-999485722);
                xq00Var.m91788r(false);
                eh00Var = null;
            }
            q9g1.m72384g(vva1Var, eh00Var, e940Var2, fxh0Var2, xq00Var, ((i2 << 3) & 896) | (i2 & 7168), 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ho41(w711Var, e940Var, gh00Var, fxh0Var, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m50717d(String str, pqm0 pqm0Var, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        String str2;
        int i3;
        fxh0 fxh0Var2;
        boolean z;
        fxh0 fxh0Var3;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var4;
        Object objM91750T;
        Object obj;
        kqi0 kqi0Var;
        boolean zM91770i;
        Object objM91750T2;
        xq00Var.m91775k0(425373743);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (xq00Var.m91766g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(pqm0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91770i(fxh0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i4 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                objM91750T = xq00Var.m91750T();
                obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = sam.m77645B(pqm0Var);
                    xq00Var.m91793t0(objM91750T);
                }
                kqi0Var = (kqi0) objM91750T;
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var4);
                int i5 = i3;
                Uri uri = Uri.parse(str2);
                zM91770i = xq00Var.m91770i(kqi0Var) | ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                objM91750T2 = xq00Var.m91750T();
                if (zM91770i || objM91750T2 == obj) {
                    objM91750T2 = new twm0(kqi0Var, pqm0Var, 2);
                    xq00Var.m91793t0(objM91750T2);
                }
                l0y0.m57824f(vm6.m85986a(uri, null, null, null, null, null, false, false, (gh00) objM91750T2, null, null, 0L, xq00Var, 0, 0, 126974), qgj.f188480a, fxh0VarM61822f, null, null, new ofu(((Number) ((pqm0) kqi0Var.getValue()).f180350a).floatValue(), ((Number) ((pqm0) kqi0Var.getValue()).f180351b).floatValue()), r101.f194647O0, null, null, xq00Var, 3120, 400);
                fxh0Var3 = fxh0Var4;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new a4j0(str2, pqm0Var, fxh0Var3, i, i2, 18);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            if (i4 != 0) {
                fxh0Var4 = cxh0.f43038a;
            } else {
                fxh0Var4 = fxh0Var2;
            }
            objM91750T = xq00Var.m91750T();
            obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(pqm0Var);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0Var = (kqi0) objM91750T;
            fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, fxh0Var4);
            int i6 = i3;
            Uri uri2 = Uri.parse(str2);
            zM91770i = xq00Var.m91770i(kqi0Var) | ((i6 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            objM91750T2 = xq00Var.m91750T();
            if (zM91770i) {
                objM91750T2 = new twm0(kqi0Var, pqm0Var, 2);
                xq00Var.m91793t0(objM91750T2);
            } else {
                objM91750T2 = new twm0(kqi0Var, pqm0Var, 2);
                xq00Var.m91793t0(objM91750T2);
            }
            l0y0.m57824f(vm6.m85986a(uri2, null, null, null, null, null, false, false, (gh00) objM91750T2, null, null, 0L, xq00Var, 0, 0, 126974), qgj.f188480a, fxh0VarM61822f2, null, null, new ofu(((Number) ((pqm0) kqi0Var.getValue()).f180350a).floatValue(), ((Number) ((pqm0) kqi0Var.getValue()).f180351b).floatValue()), r101.f194647O0, null, null, xq00Var, 3120, 400);
            fxh0Var3 = fxh0Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(str2, pqm0Var, fxh0Var3, i, i2, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m50718e(qf40 qf40Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        pgv0 pgv0VarM91796v;
        wr8 wr8Var;
        xq00Var.m91775k0(1649314491);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            if (((AbstractC2282q6) qf40Var).isEmpty()) {
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v == null) {
                    return;
                } else {
                    wr8Var = new wr8(qf40Var, i, 1);
                }
            } else {
                xq00Var2 = xq00Var;
                iyg1.m51914a(mi21.m61820d(1.0f, cxh0.f43038a), d7f0.f46174i, rkk.m75772x(1614507537, new p220((yqq) xq00Var.m91774k(wsh.f254617h), qf40Var, (e940) xq00Var.m91774k(vm6.f242710a), 15), xq00Var), xq00Var2, 3126, 4);
            }
            pgv0VarM91796v.f177419d = wr8Var;
        }
        xq00Var2 = xq00Var;
        xq00Var2.m91757b0();
        pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            wr8Var = new wr8(qf40Var, i, 2);
            pgv0VarM91796v.f177419d = wr8Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final fiz m50719f(jfm0 jfm0Var) {
        return cyf1.m34368d(nxf1.m65827f(new yyj0(jfm0Var, null, 5)), -1, 1);
    }

    /* JADX INFO: renamed from: g */
    public static final fxh0 m50720g(fxh0 fxh0Var, long j, long j2) {
        long jM63765b = n6f.m63765b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14);
        long jM63765b2 = n6f.m63765b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14);
        long jM63765b3 = n6f.m63765b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14);
        long jM75452v = rfg1.m75452v(jM63765b, j2);
        long jM75452v2 = rfg1.m75452v(jM63765b2, j2);
        long jM75452v3 = rfg1.m75452v(jM63765b3, j2);
        return nec.m64245h(fxh0Var, tm4.m81084A(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(jM75452v)), new pqm0(Float.valueOf(0.5f), new n6f(jM75452v2)), new pqm0(Float.valueOf(1.0f), new n6f(jM75452v3))}, 0L, 0.0f, 14), hmx0.f93097a, 0.0f, 4);
    }

    /* JADX INFO: renamed from: h */
    public static final tiv0 m50721h(jo70 jo70Var) {
        return pwg1.m71280o(jo70Var).mo30001I(jo70Var, false);
    }

    /* JADX INFO: renamed from: i */
    public static final sjo m50722i(bmr0 bmr0Var, String str, p5u0 p5u0Var, long j, boolean z, boolean z2) {
        pqm0 pqm0Var;
        Uri uriM73999D = qvf1.m73999D(str, p5u0Var.f174234b);
        if (z) {
            List list = bmr0Var.f28603c;
            wj50.m88279p(uriM73999D);
            pqm0Var = new pqm0(list, m50725l(uriM73999D, str, z2));
        } else {
            List list2 = (List) bmr0Var.f28610j.getValue();
            wj50.m88279p(uriM73999D);
            pqm0Var = new pqm0(list2, m50726m(uriM73999D, z2));
        }
        List list3 = (List) pqm0Var.f180350a;
        String str2 = (String) pqm0Var.f180351b;
        Map map = Collections.EMPTY_MAP;
        long j2 = p5u0Var.f174233a;
        lfz0 lfz0Var = new lfz0(j, str2, list3);
        c95.m31848n(uriM73999D, "The uri must be set.");
        return new sjo(uriM73999D, 0L, 1, null, map, 0L, j2, null, 0, lfz0Var);
    }

    /* JADX INFO: renamed from: j */
    public static final uxq m50723j(x1t0 x1t0Var) {
        switch (x1t0Var == null ? -1 : j2t0.f108145b[x1t0Var.ordinal()]) {
            case 1:
                return vxq.f245809d;
            case 2:
                return vxq.f245806a;
            case 3:
                return vxq.f245807b;
            case 4:
                return vxq.f245808c;
            case 5:
                return vxq.f245810e;
            case 6:
                return vxq.f245811f;
            default:
                return vxq.f245806a;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final tiv0 m50724k(exh0 exh0Var, boolean z, boolean z2) {
        if (!exh0Var.f63770a.f63766L0) {
            return tiv0.f220750e;
        }
        if (z) {
            return wjg1.m88314D(exh0Var, 8).m29995E1();
        }
        bnj0 bnj0VarM88314D = wjg1.m88314D(exh0Var, 8);
        return pwg1.m71280o(bnj0VarM88314D).mo30001I(bnj0VarM88314D, z2);
    }

    /* JADX INFO: renamed from: l */
    public static final String m50725l(Uri uri, String str, boolean z) {
        String encodedPath = z ? Uri.parse(str).getEncodedPath() : Uri.parse(str).getPath();
        String strM88494r1 = encodedPath != null ? wl51.m88494r1(encodedPath, '/') : null;
        if (strM88494r1 == null) {
            strM88494r1 = "";
        }
        String encodedPath2 = z ? uri.getEncodedPath() : uri.getPath();
        String strM88469S0 = wl51.m88469S0(wl51.m88469S0(encodedPath2 != null ? encodedPath2 : "", strM88494r1), "/");
        String encodedQuery = z ? uri.getEncodedQuery() : uri.getQuery();
        return encodedQuery != null ? klh.m56834f(strM88469S0, "?", encodedQuery) : strM88469S0;
    }

    /* JADX INFO: renamed from: m */
    public static final String m50726m(Uri uri, boolean z) {
        String encodedPath = z ? uri.getEncodedPath() : uri.getPath();
        if (encodedPath == null) {
            return "";
        }
        String encodedQuery = z ? uri.getEncodedQuery() : uri.getQuery();
        return encodedQuery != null ? klh.m56834f(encodedPath, "?", encodedQuery) : encodedPath;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m50727n(voz0 voz0Var) {
        Object objM33623g = voz0Var.f243555a.m33623g(toz0.f222347b);
        if (objM33623g == null) {
            objM33623g = null;
        }
        return objM33623g != null;
    }

    /* JADX INFO: renamed from: o */
    public static final void m50728o(apz0 apz0Var) {
        wjg1.m88319I(apz0Var).m59604F();
    }

    /* JADX INFO: renamed from: p */
    public static final int m50729p(r0t0 r0t0Var) {
        int i = r0t0Var == null ? -1 : j2t0.f108144a[r0t0Var.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: q */
    public static final int m50730q(zgz0 zgz0Var, int i) {
        int i2;
        int[] iArr = zgz0Var.f282749f;
        int i3 = i + 1;
        int length = zgz0Var.f282748e.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: r */
    public static khf m50731r(int i) {
        return khf.f122637a[i];
    }
}
