package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ztg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f286164a;

    /* JADX INFO: renamed from: a */
    public static final void m96910a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1109418928);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var2).f112823a.f229876c, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
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
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224763f, mi21.m61822f(1.0f, cxh0Var));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96865y);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(k0e1.m54977L(R.string.configuration_loading_failed_title, xq00Var2), null, leu.m58818d(xq00Var2).f64968d, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            ahf1.m25932d(k0e1.m54977L(R.string.configuration_loading_failed_subtitle, xq00Var2), zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 13), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2032);
            tgu tguVar = new tgu();
            String strM54977L = k0e1.m54977L(R.string.configuration_loading_failed_retry_button, xq00Var2);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), tguVar, zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224768k, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, o8g.f162807a, xq00Var, 0, 48, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(eh00Var, fxh0Var2, i, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96911b(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(470476064);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g("spotify.com/293432943984") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            qoe qoeVar = (qoe) xq00Var.m91774k(wsh.f254615f);
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xuk xukVar = (xuk) objM91750T;
            String strM54977L = k0e1.m54977L(R.string.share_invite_link_page_copy_description, xq00Var);
            boolean zM91770i = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(xukVar) | xq00Var.m91770i(qoeVar) | xq00Var.m91766g(strM54977L) | ((i3 & 14) == 4) | xq00Var.m91770i(context);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                vjk0 vjk0Var = new vjk0(eh00Var, xukVar, qoeVar, strM54977L, context, 13);
                xq00Var.m91793t0(vjk0Var);
                objM91750T2 = vjk0Var;
            }
            m96912c(new peu(u40.f226523c, (eh00) objM91750T2), fxh0Var, xq00Var, i3 & 910);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new euu0(eh00Var, fxh0Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96912c(peu peuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(788731291);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g("spotify.com/293432943984") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(peuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = mo01.f145513O0;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0Var, true, (gh00) objM91750T);
            vju vjuVar = vju.f242057e;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b);
            float f = leu.m58816b(xq00Var).f117230b.f224762e;
            zn91.m96545d(fxh0VarM96644b, null, fmx0VarM47993b, vjuVar, new j4m0(f, f, f, f), null, false, null, fo3.f71408a, peuVar, null, rkk.m75772x(819016836, new c1r0(3, 7), xq00Var), xq00Var, (i2 << 24) & 1879048192, 48, 1250);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o0z(peuVar, fxh0Var, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0180  */
    /* JADX WARN: Code duplicated, block: B:39:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x01de  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f2  */
    /* JADX INFO: renamed from: d */
    public static final void m96913d(int i, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        ia7 ia7Var;
        int i2;
        boolean z;
        boolean z2;
        Object objM91750T;
        gh00 gh00Var2 = gh00Var;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-348208767);
        ug5 ug5Var = xq00Var2.f264811a;
        int i3 = i | (xq00Var2.m91770i(gh00Var2) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            Object objM91750T2 = xq00Var2.m91750T();
            ia7 ia7Var2 = t6x0.f217647t;
            if (objM91750T2 == ia7Var2) {
                objM91750T2 = j4x.m52407e(0, xq00Var2);
            }
            vum0 vum0Var = (vum0) objM91750T2;
            float f = leu.m58816b(xq00Var2).f117230b.f224763f;
            float f2 = leu.m58816b(xq00Var2).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(epv0.m39673I("GranularRatingsButton", zsf1.m96832C(cxh0Var, f, 0.0f, f2, 0.0f, 10)), hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148188d)), leu.m58815a(xq00Var2).f112823a.f229874a.f123093a, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
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
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            ub9 ub9Var = d7f0.f46145P0;
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(xi5VarM29370g, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            vi5 vi5Var = bj5.f27614e;
            fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var);
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objM91750T3 = xq00Var2.m91750T();
            if (z3) {
                ia7Var = ia7Var2;
            } else {
                ia7Var = ia7Var2;
                if (objM91750T3 == ia7Var) {
                }
                fxh0 fxh0VarM96832C = zsf1.m96832C(hdi.m47247x(fxh0VarM61822f2, false, null, null, null, (eh00) objM91750T3, 15), 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 13);
                irx0 irx0VarM36744a = drx0.m36744a(vi5Var, d7f0.f46141L0, xq00Var2, 0);
                int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
                xq00Var2.m91779m0();
                ia7 ia7Var3 = ia7Var;
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var2);
                AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar3, xq00Var2, vlhVar);
                zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var2);
                i2 = 1;
                ahf1.m25932d(k0e1.m54977L(R.string.granular_ratings_button_header_text, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2026);
                xq00Var2.m91788r(true);
                int iM86437v = vum0Var.m86437v();
                boolean zM91770i = xq00Var2.m91770i(vum0Var);
                if (i4 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zM91770i | z;
                objM91750T = xq00Var2.m91750T();
                if (!z2 || objM91750T == ia7Var3) {
                    gh00Var2 = gh00Var;
                    objM91750T = new mi0(gh00Var2, vum0Var, i2);
                    xq00Var2.m91793t0(objM91750T);
                } else {
                    gh00Var2 = gh00Var;
                }
                tkf1.m81007d(iM86437v, (gh00) objM91750T, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7), 0.0f, xq00Var2, 0, 8);
                xq00Var2 = xq00Var2;
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(true);
                fxh0Var2 = cxh0Var;
            }
            objM91750T3 = new tc00(25, gh00Var2);
            xq00Var2.m91793t0(objM91750T3);
            fxh0 fxh0VarM96832C2 = zsf1.m96832C(hdi.m47247x(fxh0VarM61822f2, false, null, null, null, (eh00) objM91750T3, 15), 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 0.0f, 13);
            irx0 irx0VarM36744a2 = drx0.m36744a(vi5Var, d7f0.f46141L0, xq00Var2, 0);
            int iHashCode4 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m4 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var2, fxh0VarM96832C2);
            xq00Var2.m91779m0();
            ia7 ia7Var4 = ia7Var;
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m4, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode4, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s4, yhhVar4, xq00Var2);
            i2 = 1;
            ahf1.m25932d(k0e1.m54977L(R.string.granular_ratings_button_header_text, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2026);
            xq00Var2.m91788r(true);
            int iM86437v2 = vum0Var.m86437v();
            boolean zM91770i2 = xq00Var2.m91770i(vum0Var);
            if (i4 == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = zM91770i2 | z;
            objM91750T = xq00Var2.m91750T();
            if (z2) {
                gh00Var2 = gh00Var;
                objM91750T = new mi0(gh00Var2, vum0Var, i2);
                xq00Var2.m91793t0(objM91750T);
            } else {
                gh00Var2 = gh00Var;
                objM91750T = new mi0(gh00Var2, vum0Var, i2);
                xq00Var2.m91793t0(objM91750T);
            }
            tkf1.m81007d(iM86437v2, (gh00) objM91750T, zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 7), 0.0f, xq00Var2, 0, 8);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new idt(gh00Var2, fxh0Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: e */
    public static final void m96914e(int i, int i2, gh00 gh00Var, rru0 rru0Var, fxh0 fxh0Var, xq00 xq00Var, int i3) {
        xq00 xq00Var2;
        cxh0 cxh0Var;
        ?? r5;
        xq00 xq00Var3;
        xq00 xq00Var4 = xq00Var;
        xq00Var4.m91775k0(1791595587);
        int i4 = i3 | (xq00Var4.m91762e(i) ? 4 : 2) | (xq00Var4.m91762e(i2) ? 32 : 16) | (xq00Var4.m91770i(gh00Var) ? 256 : 128) | (xq00Var4.m91762e(rru0Var.ordinal()) ? 2048 : 1024) | (xq00Var4.m91770i(fxh0Var) ? 16384 : 8192);
        if (xq00Var4.m91752Y(i4 & 1, (i4 & 9363) != 9362)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("ereader_page_slider", zsf1.m96830A(mi21.m61822f(1.0f, fxh0Var), leu.m58816b(xq00Var4).f117233e.f137888d, 0.0f, 2));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var4, 0);
            int iHashCode = Long.hashCode(xq00Var4.f264809T);
            wpn0 wpn0VarM91778m = xq00Var4.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var4, fxh0VarM39673I);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var4.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var4.m91779m0();
            if (xq00Var4.f264808S) {
                xq00Var4.m91776l(eh00Var);
            } else {
                xq00Var4.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var4);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var4);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var4);
            zsf1.m96833D(roh.f201266k, xq00Var4);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var4);
            cxh0 cxh0Var2 = cxh0.f43038a;
            if (i2 > 1) {
                xq00Var4.m91771i0(-2095753397);
                float f = i;
                ete eteVar = new ete(1.0f, i2);
                long j = rru0Var.f202118b;
                long jM63765b = n6f.m63765b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var2);
                boolean z = ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i4 & 896) == 256);
                Object objM91750T = xq00Var4.m91750T();
                if (z || objM91750T == t6x0.f217647t) {
                    objM91750T = new n8c(gh00Var, i2, 4);
                    xq00Var4.m91793t0(objM91750T);
                }
                cxh0Var = cxh0Var2;
                r5 = 1;
                g391.m43444c(f, (gh00) objM91750T, fxh0VarM61822f, false, eteVar, 0, j, jM63765b, null, xq00Var4, 0, 616);
                xq00 xq00Var5 = xq00Var4;
                xq00Var5.m91788r(false);
                xq00Var3 = xq00Var5;
            } else {
                xq00 xq00Var6 = xq00Var4;
                cxh0Var = cxh0Var2;
                r5 = 1;
                xq00Var6.m91771i0(-2095411095);
                xq00Var6.m91788r(false);
                xq00Var3 = xq00Var6;
            }
            xq00 xq00Var7 = xq00Var3;
            ahf1.m25932d(s571.m77247f(i, "Page ", i2, " of "), epv0.m39673I("ereader_page_indicator", cxh0Var), new if71(0L, epv0.m39702v(11), null, null, 0L, 0L, 0, 0, 0L, null, 0, 16777213), n6f.m63765b(rru0Var.f202118b, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, new ol80(r5), 0, null, xq00Var7, 0, 0, 1776);
            xq00 xq00Var8 = xq00Var7;
            xq00Var8.m91788r(r5);
            xq00Var2 = xq00Var8;
        } else {
            xq00Var4.m91757b0();
            xq00Var2 = xq00Var4;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(i, i2, gh00Var, rru0Var, fxh0Var, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m96915f(eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1954448923);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | 3072;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            tvd1 tvd1Var = (tvd1) xq00Var2.m91774k(rwb0.f203317b);
            if (tvd1Var == null) {
                xq00Var2.m91771i0(-241884180);
                WeakHashMap weakHashMap = cxd1.f42984x;
                tvd1Var = bxd1.m30815d(xq00Var2).f42991g;
            } else {
                xq00Var2.m91771i0(-241885792);
            }
            xq00Var2.m91788r(false);
            fxh0 fxh0VarM90492n = xfg1.m90492n(fxh0VarM61822f, new ni80(tvd1Var, 16));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM90492n);
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
            wjg1.m88322a(null, d8h.f46462a, false, null, dlm0.f50256a, null, null, null, xq00Var2, 48, 237);
            ysj0.m94486a(0, 1, xq00Var2, null);
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(mi21.m61822f(1.0f, cxh0Var), oyf1.m68467i0(0, 0, 1, xq00Var2), false, 14);
            WeakHashMap weakHashMap2 = cxd1.f42984x;
            fxh0 fxh0VarM96831B = zsf1.m96831B(AbstractC0000a.m19r(bxd1.m30815d(xq00Var2).f42991g, 32, fxh0VarM68493v0), leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224762e, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f);
            aaf aafVarM87496a2 = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224763f), d7f0.f46145P0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96831B);
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
            ahf1.m25932d(k0e1.m54977L(R.string.share_invite_link_page_description, xq00Var2), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64971g, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            xq00Var2 = xq00Var;
            dyu.m37371c(new peu(u40.f226523c, eh00Var2), ugu.f230259c, null, null, null, null, null, null, null, null, d8h.f46463b, xq00Var2, 0, 48, 2044);
            eh00Var3 = eh00Var;
            m96911b(54, eh00Var3, xq00Var2, mi21.m61822f(1.0f, cxh0Var));
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            eh00Var3 = eh00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pa30(eh00Var3, eh00Var2, fxh0Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m96916g(float f, int i) {
        return m9f.m61221i(Color.argb((int) (f * 255.0f), 0, 0, 0), i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r10 == r8) goto L28;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m96917h(cw0 cw0Var, ibk ibkVar) {
        tv0 tv0Var;
        if (ibkVar instanceof tv0) {
            tv0Var = (tv0) ibkVar;
            int i = tv0Var.f223988c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tv0Var.f223988c = i - Integer.MIN_VALUE;
            } else {
                tv0Var = new tv0(ibkVar);
            }
        } else {
            tv0Var = new tv0(ibkVar);
        }
        Object objM76980u = tv0Var.f223987b;
        int i2 = tv0Var.f223988c;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            vv0 vv0Var = new vv0(cw0Var, fbkVar, 0);
            tv0Var.f223986a = cw0Var;
            tv0Var.f223988c = 1;
            objM76980u = s1h1.m76980u(5000L, vv0Var, tv0Var);
            if (objM76980u != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            cw0Var = tv0Var.f223986a;
            bga.m29073P(objM76980u);
        } else if (i2 == 2) {
            cw0Var = tv0Var.f223986a;
            bga.m29073P(objM76980u);
            vv0 vv0Var2 = new vv0(cw0Var, fbkVar, 1);
            tv0Var.f223986a = cw0Var;
            tv0Var.f223988c = 3;
            objM76980u = s1h1.m76980u(5000L, vv0Var2, tv0Var);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cw0Var = tv0Var.f223986a;
            bga.m29073P(objM76980u);
        }
        fh0 fh0Var = (fh0) objM76980u;
        if (fh0Var != null) {
            return fh0Var;
        }
        throw new IllegalStateException(("Ad transition to Active timed out for " + cw0Var.f42585a.f147472a + ".").toString());
        if (((qv0) objM76980u) == null) {
            throw new IllegalStateException(("No ad became available for " + cw0Var.f42585a.f147472a + " within 5000ms.").toString());
        }
        tv0Var.f223986a = cw0Var;
        tv0Var.f223988c = 2;
        if (cw0Var.m34078e(tv0Var) != yukVar) {
            vv0 vv0Var3 = new vv0(cw0Var, fbkVar, 1);
            tv0Var.f223986a = cw0Var;
            tv0Var.f223988c = 3;
            objM76980u = s1h1.m76980u(5000L, vv0Var3, tv0Var);
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: i */
    public static String m96918i(gva gvaVar) {
        StringBuilder sb = new StringBuilder(gvaVar.size());
        for (int i = 0; i < gvaVar.size(); i++) {
            byte bMo34014a = gvaVar.mo34014a(i);
            if (bMo34014a == 34) {
                sb.append("\\\"");
            } else if (bMo34014a == 39) {
                sb.append("\\'");
            } else if (bMo34014a != 92) {
                switch (bMo34014a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo34014a < 32 || bMo34014a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo34014a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo34014a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo34014a & 7) + 48));
                        } else {
                            sb.append((char) bMo34014a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m96919j(String str) {
        return m96918i(gva.m45888f(str));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m96920l(ej50 ej50Var) {
        return ej50Var.f60139h || ej50Var.f60136e;
    }

    /* JADX INFO: renamed from: m */
    public static v8f m96921m(xq00 xq00Var) {
        return (v8f) xq00Var.m91774k(w8f.f248921a);
    }

    /* JADX INFO: renamed from: n */
    public static final p7f0 m96922n(ofm0 ofm0Var) {
        sa70 sa70Var = (sa70) ofm0Var.mo15684j0(sa70.class).mo31538a();
        if (sa70Var != null) {
            return sa70Var.f207152a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static x1i0 m96923o(xq00 xq00Var) {
        return (x1i0) xq00Var.m91774k(p3d0.f173616a);
    }

    /* JADX INFO: renamed from: p */
    public static hi01 m96924p(xq00 xq00Var) {
        return (hi01) xq00Var.m91774k(ki01.f122754a);
    }

    /* JADX INFO: renamed from: q */
    public static qp91 m96925q(xq00 xq00Var) {
        return (qp91) xq00Var.m91774k(up91.f232603a);
    }

    /* JADX INFO: renamed from: r */
    public static final t050 m96926r(z8k z8kVar, yjk0 yjk0Var) {
        return ((b9k) z8kVar).m28489g("ActiveDeviceIdSaverDaemon", new ccj0(yjk0Var, 27));
    }

    /* JADX INFO: renamed from: s */
    public static void m96927s(Activity activity) {
        View viewM38205j;
        int iHashCode = activity.hashCode();
        HashMap map = kjc1.f123305d;
        HashMap map2 = null;
        if (!p2l.f173365a.contains(kjc1.class)) {
            try {
                map2 = kjc1.f123305d;
            } catch (Throwable th) {
                p2l.m68953a(kjc1.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object kjc1Var = map2.get(numValueOf);
        if (kjc1Var == null) {
            kjc1Var = new kjc1(activity);
            map2.put(numValueOf, kjc1Var);
        }
        kjc1 kjc1Var2 = (kjc1) kjc1Var;
        Set set = p2l.f173365a;
        if (set.contains(kjc1.class)) {
            return;
        }
        try {
            if (set.contains(kjc1Var2)) {
                return;
            }
            try {
                if (!kjc1Var2.f123308c.getAndSet(true) && (viewM38205j = e95.m38205j((Activity) kjc1Var2.f123306a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM38205j.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(kjc1Var2);
                        kjc1Var2.m56562a();
                        return;
                    }
                    return;
                    p2l.m68953a(kjc1.class, th);
                }
            } catch (Throwable th2) {
                p2l.m68953a(kjc1Var2, th2);
            }
        } catch (Throwable th3) {
            p2l.m68953a(kjc1.class, th3);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m96928t(Activity activity) {
        View viewM38205j;
        int iHashCode = activity.hashCode();
        HashMap map = kjc1.f123305d;
        HashMap map2 = null;
        if (!p2l.f173365a.contains(kjc1.class)) {
            try {
                map2 = kjc1.f123305d;
            } catch (Throwable th) {
                p2l.m68953a(kjc1.class, th);
            }
        }
        kjc1 kjc1Var = (kjc1) map2.remove(Integer.valueOf(iHashCode));
        if (kjc1Var != null) {
            Set set = p2l.f173365a;
            if (set.contains(kjc1.class)) {
                return;
            }
            try {
                if (!set.contains(kjc1Var)) {
                    try {
                        if (kjc1Var.f123308c.getAndSet(false) && (viewM38205j = e95.m38205j((Activity) kjc1Var.f123306a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewM38205j.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(kjc1Var);
                            }
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(kjc1Var, th2);
                    }
                }
            } catch (Throwable th3) {
                p2l.m68953a(kjc1.class, th3);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo78361k();
}
