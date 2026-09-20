package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.Comment;
import java.util.Collections;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dwg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f53697a;

    /* JADX INFO: renamed from: a */
    public static final void m37157a(ow80 ow80Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1765897347);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(ow80Var) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            vb9 vb9Var = d7f0.f46142M0;
            float f = 24;
            xi5 xi5VarM29370g = bj5.m29370g(f);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, f, 0.0f, f, f, 2);
            irx0 irx0VarM36744a = drx0.m36744a(xi5VarM29370g, vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
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
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            y85.m93057b(m2m0.m60606d(ow80Var.f170670a), qgj.f188480a, null, m2m0.m60605c(ow80Var.f170671b), 0L, false, xq00Var2, 56, 52);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
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
            String str = ow80Var.f170672c;
            if71 if71Var = leu.m58818d(xq00Var2).f64968d;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            xq00Var2 = xq00Var;
            ahf1.m25932d(str, null, if71Var, j, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            ahf1.m25932d(ow80Var.f170673d, null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2359s1(ow80Var, fxh0Var2, i, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0260  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r14v2, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [p.xq00] */
    /* JADX INFO: renamed from: b */
    public static final void m37158b(y6s0 y6s0Var, long j, xq00 xq00Var, int i) {
        ?? r14;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        cxh0 cxh0Var;
        ?? r1;
        cxh0 cxh0Var2;
        ?? r15;
        ?? r4;
        int i3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1780617198);
        int i4 = 2;
        int i5 = 1;
        int i6 = i | (xq00Var2.m91770i(y6s0Var) ? 4 : 2) | (xq00Var2.m91762e(edb.m38547C(1)) ? 32 : 16) | (xq00Var2.m91764f(j) ? 256 : 128);
        if (xq00Var2.m91752Y(i6 & 1, (i6 & 147) != 146)) {
            Resources resources = ((Context) xq00Var2.m91774k(AndroidCompositionLocals_androidKt.f502b)).getResources();
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(4), d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var3 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var3);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            sl71 sl71Var = null;
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
            wj50.m88279p(resources);
            boolean z4 = y6s0Var instanceof w6s0;
            if (z4) {
                uz3 uz3Var = new uz3(i5, resources);
                hvi0 hvi0Var = cks.f39079b;
                w6s0 w6s0Var = (w6s0) y6s0Var;
                sl71Var = (sl71) uz3Var.invoke(new cks(jwg1.m54450E(w6s0Var.f248465b - w6s0Var.f248466c, ils.MILLISECONDS)));
            } else {
                if (!(y6s0Var instanceof x6s0)) {
                    throw new NoWhenBranchMatchedException();
                }
                long j2 = ((x6s0) y6s0Var).f258746b;
                if (j2 != 0) {
                    uz3 uz3Var2 = new uz3(i4, resources);
                    hvi0 hvi0Var2 = cks.f39079b;
                    sl71Var = (sl71) uz3Var2.invoke(new cks(jwg1.m54450E(j2, ils.MILLISECONDS)));
                }
            }
            sl71 sl71Var2 = sl71Var;
            int iM38547C = edb.m38547C(1);
            if (iM38547C == 0) {
                z = true;
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z4 || ((y6s0Var instanceof x6s0) && !((x6s0) y6s0Var).f258745a)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z || sl71Var2 == null) {
                z2 = z4;
                i2 = 1;
                z3 = false;
                cxh0Var = cxh0Var3;
                xq00Var2.m91771i0(-969704620);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-969911421);
                boolean zM91770i = xq00Var2.m91770i(sl71Var2);
                Object objM91750T = xq00Var2.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new qks(sl71Var2, 0);
                    xq00Var2.m91793t0(objM91750T);
                }
                int i7 = (i6 << 3) & 7168;
                z2 = z4;
                cxh0Var = cxh0Var3;
                i2 = 1;
                z3 = false;
                ahf1.m25932d(sl71Var2.f210315a, zoz0.m96644b(cxh0Var3, false, (gh00) objM91750T), leu.m58818d(xq00Var2).f64974j, j, null, null, 0, false, null, 0, null, xq00Var2, i7, 0, 2032);
                xq00Var2.m91788r(false);
            }
            boolean zMo87307f = y6s0Var.mo87307f();
            int iM38547C2 = edb.m38547C(i2);
            int i8 = i2;
            ?? r5 = zMo87307f;
            if (iM38547C2 != 0) {
                if (iM38547C2 != i8) {
                    throw new NoWhenBranchMatchedException();
                }
                r5 = ((y6s0Var instanceof x6s0) && zMo87307f) ? i8 : z3;
            }
            if (r5 != 0) {
                xq00Var2.m91771i0(-969535329);
                if (z) {
                    xq00Var2.m91771i0(-969523673);
                    i3 = i8;
                    ahf1.m25932d("•", null, leu.m58818d(xq00Var2).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var2, 6, 0, 2042);
                    xq00Var2.m91788r(z3);
                } else {
                    i3 = i8;
                    xq00Var2.m91771i0(-969449676);
                    xq00Var2.m91788r(z3);
                }
                ahf1.m25932d(k0e1.m54977L(R.string.progress_state_finished_progress, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, j, null, null, 0, false, null, 0, null, xq00Var2, (i6 << 3) & 7168, 0, 2034);
                cxh0Var2 = cxh0Var;
                y85.m93057b(kou.f124911c, qgj.f188480a, epv0.m39673I("durationProgressIcon", mi21.m61834r(12, cxh0Var2)), leu.m58815a(xq00Var).f112825c.f221220c, 0L, false, xq00Var, kou.f124912d | 48, 48);
                xq00 xq00Var3 = xq00Var;
                xq00Var3.m91788r(z3);
                r1 = i3;
                r15 = xq00Var3;
            } else {
                r1 = i8;
                cxh0Var2 = cxh0Var;
                xq00Var2.m91771i0(-969023116);
                xq00Var2.m91788r(z3);
            }
            if (z2) {
                r15 = xq00Var2;
                r4 = r1;
            } else {
                r15 = xq00Var2;
                if (m37168l(y6s0Var) <= 0.0f || (m37168l(y6s0Var) >= 1.0d && y6s0Var.mo87307f())) {
                    r4 = z3;
                } else {
                    r15 = xq00Var2;
                    r4 = r1;
                }
            }
            if (r4 != 0) {
                r15.m91771i0(-968970230);
                ja61.m52782d(m37168l(y6s0Var), 0, 12, 0L, 0L, r15, epv0.m39673I("durationProgressProgress", mi21.m61838v(88, cxh0Var2)));
                r15.m91788r(z3);
            } else {
                r15.m91771i0(-968806860);
                r15.m91788r(z3);
            }
            r15.m91788r(r1);
            r14 = r15;
        } else {
            xq00Var2.m91757b0();
            r14 = xq00Var2;
        }
        pgv0 pgv0VarM91796v = r14.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new btg(y6s0Var, j, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m37159c(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2;
        String str2 = str;
        xq00Var.m91775k0(1548604479);
        int i2 = (xq00Var.m91766g(str2) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = new d731();
                xq00Var.m91793t0(objM91750T);
            }
            d731 d731Var = (d731) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            xuk xukVar = (xuk) objM91750T2;
            rkk.m75753e(d731Var, fxh0Var, i8h.f99790a, xq00Var, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 384, 0);
            xq00Var2 = xq00Var;
            boolean zM91770i = xq00Var2.m91770i(xukVar) | xq00Var2.m91770i(d731Var) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objM91750T3 = xq00Var2.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                kbi0 kbi0Var = new kbi0(24, xukVar, d731Var, str, eh00Var, null);
                str2 = str;
                xq00Var2.m91793t0(kbi0Var);
                objM91750T3 = kbi0Var;
            }
            hz40.m49237i(str2, (th00) objM91750T3, xq00Var2);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str2, fxh0Var, eh00Var, i, 13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m37160d(q3d1 q3d1Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1808644550);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(q3d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, nec.m64246i(r9g1.m75068p(mi21.m61822f(1.0f, cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148189e)), leu.m58815a(xq00Var).f112823a.f229874a.f123093a, kxf1.f127485a));
            zi5 zi5Var = bj5.f27610a;
            aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f), d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y);
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
            jwg1.m54454d(0, q3d1Var.f184849a, xq00Var, null);
            ysj0.m94486a(0, 0, xq00Var, mi21.m61822f(1.0f, cxh0Var));
            ang1.m26495d(q3d1Var.f184850b, rkk.m75772x(-891423125, new f2s0(15, gh00Var), xq00Var), mi21.m61822f(1.0f, cxh0Var), xq00Var, 48);
            ysj0.m94486a(0, 0, xq00Var, mi21.m61822f(1.0f, cxh0Var));
            gwg1.m45942n(q3d1Var, xq00Var, i2 & 14);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rdb1(q3d1Var, gh00Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m37161e(fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1906054303);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("group-device-volume-slider", zsf1.m96830A(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n(i2 & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ecd(false, i, fyfVar, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m37162f(g3w g3wVar) {
        if (g3wVar instanceof b3w) {
            return 1;
        }
        if (wj50.m88271j(g3wVar, d3w.f45023a)) {
            return 2;
        }
        if (wj50.m88271j(g3wVar, e3w.f55896a)) {
            return 3;
        }
        if (wj50.m88271j(g3wVar, c3w.f33768a) || wj50.m88271j(g3wVar, f3w.f65606a)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final lxe m37163g(e940 e940Var, czd0 czd0Var, uh30 uh30Var, Uri uri) {
        Object[] objArr;
        int i;
        czd0Var.getClass();
        Uri uriM34430a = czd0.m34430a(uri);
        wsv0 wsv0Var = uh30.f230353a;
        Uri uriM83118a = uriM34430a == null ? Uri.EMPTY : uh30.m83118a(uriM34430a.toString());
        String queryParameter = uri.getQueryParameter("transformation");
        int i2 = 3;
        if (queryParameter == null || queryParameter.isEmpty()) {
            objArr = 3;
        } else {
            String upperCase = queryParameter.toUpperCase(Locale.ENGLISH);
            if (upperCase == null) {
                throw new NullPointerException("Name is null");
            }
            if (upperCase.equals("CIRCULAR")) {
                objArr = 1;
            } else if (upperCase.equals("ROUNDED_CORNER")) {
                objArr = 2;
            } else {
                if (!upperCase.equals("NONE")) {
                    throw new IllegalArgumentException("No enum constant com.spotify.mediasession.imageprovider.MediaUriUtil.Transformation.".concat(upperCase));
                }
                objArr = 3;
            }
        }
        lxe lxeVarMo24606b = e940Var.mo24606b(uriM83118a);
        lxeVarMo24606b.m60179e();
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        lxeVarMo24606b.f137801g = false;
        Object obj = null;
        if (objArr == 1) {
            lxeVarMo24606b.m60192r(new vb5((boolean) (objArr3 == true ? 1 : 0), i2));
        } else if (objArr == 2) {
            lxeVarMo24606b.m60192r(new djs0(obj, 19));
        }
        String queryParameter2 = uri.getQueryParameter("dimension");
        if (!kgg1.m56363z(queryParameter2)) {
            String upperCase2 = queryParameter2.toUpperCase(Locale.ENGLISH);
            if (upperCase2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (upperCase2.equals("LARGE")) {
                objArr2 = 1;
            } else if (upperCase2.equals("NORMAL")) {
                objArr2 = 2;
            } else {
                if (!upperCase2.equals("SMALL")) {
                    throw new IllegalArgumentException("No enum constant com.spotify.mediasession.imageprovider.MediaUriUtil.ImageDimension.".concat(upperCase2));
                }
                objArr2 = 3;
            }
        }
        if (objArr2 != 0) {
            if (objArr2 == 1) {
                i = 640;
            } else if (objArr2 == 2) {
                i = 320;
            } else {
                if (objArr2 != 3) {
                    throw null;
                }
                i = 160;
            }
            lxeVarMo24606b.m60190p(i, i, 3);
            lxeVarMo24606b.m60178d();
        }
        return lxeVarMo24606b;
    }

    /* JADX INFO: renamed from: h */
    public static if71 m37164h() {
        return if71.f101703d;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m37165i(t4v0 t4v0Var) {
        p4v0 p4v0Var = t4v0Var.f217090m;
        return (p4v0Var != null ? p4v0Var.f174015b : 0) > 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m37166j(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    /* JADX INFO: renamed from: k */
    public static final pqm0 m37167k(kmf kmfVar) {
        qm70 qm70Var = kmfVar.f124137g;
        gbu gbuVar = gbu.f78413a;
        if (qm70Var == null || !qm70Var.mo47932a(kmfVar)) {
            return new pqm0(kmfVar, gbuVar);
        }
        kmf kmfVarM56898a = kmf.m56898a(kmfVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 524223);
        daa0 daa0Var = kmfVarM56898a.f124135e;
        if (qm70Var instanceof hm70) {
            return new pqm0(kmfVarM56898a, Collections.singleton(new yjf(((hm70) qm70Var).f92854a, null, false)));
        }
        boolean z = qm70Var instanceof im70;
        wfc1 wfc1Var = wfc1.f250798a;
        jkf jkfVar = jkf.f113302a;
        if (z) {
            Comment commentM56899b = kmfVarM56898a.m56899b(((im70) qm70Var).f103637a);
            if (commentM56899b == null) {
                return new pqm0(kmfVarM56898a, gbuVar);
            }
            if (commentM56899b.m22150y()) {
                return new pqm0(kmfVarM56898a, Collections.singleton(hkf.f92430a));
            }
            return !daa0Var.m35477a(Boolean.TRUE) ? new pqm0(kmf.m56898a(kmfVarM56898a, null, null, null, null, null, null, null, null, false, null, null, null, false, null, commentM56899b, null, null, false, 491519), bk5.m29624m1(new lkf[]{jkfVar, new yjf(commentM56899b.m22147u(), null, true)})) : new pqm0(kmf.m56898a(kmfVarM56898a, null, null, null, null, null, null, null, null, false, null, null, null, false, null, commentM56899b, null, null, false, 491519), bk5.m29624m1(new lkf[]{new bkf(wfc1Var), new yjf(commentM56899b.m22147u(), null, true)}));
        }
        if (qm70Var instanceof jm70) {
            jm70 jm70Var = (jm70) qm70Var;
            return new pqm0(kmfVarM56898a, Collections.singleton(new fkf(kmfVarM56898a.f124131a, jm70Var.f113784a, jm70Var.f113785b, jm70Var.f113786c, false)));
        }
        if (qm70Var.equals(km70.f124076a)) {
            return daa0Var.m35477a(Boolean.TRUE) ? new pqm0(kmfVarM56898a, Collections.singleton(new bkf(wfc1Var))) : new pqm0(kmfVarM56898a, Collections.singleton(jkfVar));
        }
        if (qm70Var instanceof lm70) {
            return new pqm0(kmf.m56898a(kmfVarM56898a, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, true, 262143), Collections.singleton(new zjf(((lm70) qm70Var).f134807a)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final float m37168l(y6s0 y6s0Var) {
        if (!(y6s0Var instanceof w6s0)) {
            if (y6s0Var instanceof x6s0) {
                return 0.0f;
            }
            throw new NoWhenBranchMatchedException();
        }
        w6s0 w6s0Var = (w6s0) y6s0Var;
        long j = w6s0Var.f248465b;
        if (j == 0) {
            return 0.0f;
        }
        long j2 = w6s0Var.f248466c;
        if (j2 > j) {
            j2 = j;
        }
        return j2 / j;
    }
}
