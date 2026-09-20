package p204p;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import p000.C1399f;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v3d1 {

    /* JADX INFO: renamed from: a */
    public static final ia5 f236834a = new ia5(23);

    /* JADX INFO: renamed from: b */
    public static sd40 f236835b;

    /* JADX INFO: renamed from: a */
    public static final void m84540a(qf40 qf40Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-749847410);
        int i2 = (xq00Var.m91770i(qf40Var) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
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
            Iterator itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 1920493087, qf40Var);
            while (itM42470n.hasNext()) {
                ulr ulrVar = (ulr) itM42470n.next();
                m84541b(ulrVar.f231620a, ulrVar.f231621b, null, xq00Var, 8);
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1399f(qf40Var, fxh0Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m84541b(wwu wwuVar, String str, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-759847556);
        int i2 = i | (xq00Var.m91770i(wwuVar) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            float f = leu.m58816b(xq00Var).f117230b.f224762e;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(f, cxh0Var);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            y85.m93057b(wwuVar, qgj.f188480a, null, 0L, 0L, false, xq00Var, 56 | (i2 & 14), 60);
            if71 if71Var = fr0.m42472p(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, xq00Var).f64974j;
            long j = leu.m58815a(xq00Var).f112824b.f138758b;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(str, new cr70(1.0f, true), if71Var, j, null, null, 0, false, null, 0, null, xq00Var, (i2 >> 3) & 14, 0, 2032);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hz1(wwuVar, str, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m84542c(int i, int i2, int i3, String str, xq00 xq00Var, fxh0 fxh0Var) {
        int i4;
        xq00Var.m91775k0(-401561163);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91766g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i5 |= xq00Var.m91762e(i == 0 ? -1 : edb.m38547C(i)) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i6 != 0) {
                i = 1;
            }
            qiu.m72876b(8, rkk.m75772x(724924640, new C1780dj(i, fxh0Var, str), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        int i7 = i;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new l0v(str, fxh0Var, i7, i2, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m84543d(int i, fxh0 fxh0Var, int i2, fyf fyfVar, xq00 xq00Var, int i3) {
        int i4;
        xq00Var.m91775k0(351023404);
        if ((i3 & 6) == 0) {
            i4 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= xq00Var.m91762e(i2 == 0 ? -1 : edb.m38547C(i2)) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= xq00Var.m91770i(fyfVar) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i4 & 1, (i4 & 1171) != 1170)) {
            qiu.m72876b(i, rkk.m75772x(540676247, new vad(i2, fxh0Var, fyfVar), xq00Var), xq00Var, (i4 & 14) | 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j0v(i, i2, i3, fyfVar, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m84544e(String str, int i, fxh0 fxh0Var, int i2, xq00 xq00Var, int i3, int i4) {
        int i5;
        int i6;
        xq00Var.m91775k0(-334466711);
        if ((i3 & 6) == 0) {
            i5 = (xq00Var.m91766g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= xq00Var.m91762e(edb.m38547C(i)) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        int i8 = i5 | 3072;
        int i9 = i4 & 16;
        if (i9 != 0) {
            i8 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            i8 |= xq00Var.m91762e(i2 == 0 ? -1 : edb.m38547C(i2)) ? 16384 : 8192;
        }
        int i10 = 1;
        if (xq00Var.m91752Y(i8 & 1, (i8 & 9363) != 9362)) {
            if (i7 != 0) {
                fxh0Var = cxh0.f43038a;
            }
            int i11 = i9 != 0 ? 2 : i2;
            boolean z = (i8 & 7168) == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new obd1(i10, 6);
                xq00Var.m91793t0(objM91750T);
            }
            m84543d(i, zoz0.m96644b(fxh0Var, false, (gh00) objM91750T), i11, rkk.m75772x(2114875845, new wuh(str, 20, (byte) 0), xq00Var), xq00Var, ((i8 >> 3) & 14) | 3072 | ((i8 >> 6) & 896));
            i6 = i11;
        } else {
            xq00Var.m91757b0();
            i6 = i2;
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k0v(str, i, fxh0Var2, i6, i3, i4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m84545f(fxh0 fxh0Var, String str, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        int i3;
        xq00Var.m91775k0(-1896269216);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                str = null;
            }
            qiu.m72876b(8, rkk.m75772x(-474457643, new gv8(str, fyfVar, fxh0Var, 3), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        String str2 = str;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y70(fxh0Var, (Object) str2, fyfVar, i, i2, 22);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m84546g(int i, int i2, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        xq00 xq00Var2;
        String str3;
        fxh0 fxh0Var2;
        String str4;
        xq00Var.m91775k0(-2138366597);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && xq00Var.m91766g(str2)) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                if (i4 != 0) {
                    fxh0Var = cxh0.f43038a;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    str4 = str;
                }
                fxh0 fxh0Var3 = fxh0Var;
                xq00Var.m91790s();
                int i5 = i3 >> 3;
                xq00Var2 = xq00Var;
                m84545f(fxh0Var3, str4, rkk.m75772x(-625213418, new wuh(str, 21, (byte) 0), xq00Var), xq00Var2, (i5 & 14) | 384 | (i5 & ContentType.LONG_FORM_ON_DEMAND), 0);
                fxh0Var2 = fxh0Var3;
                str3 = str4;
            } else {
                xq00Var.m91757b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            str4 = str2;
            fxh0 fxh0Var4 = fxh0Var;
            xq00Var.m91790s();
            int i6 = i3 >> 3;
            xq00Var2 = xq00Var;
            m84545f(fxh0Var4, str4, rkk.m75772x(-625213418, new wuh(str, 21, (byte) 0), xq00Var), xq00Var2, (i6 & 14) | 384 | (i6 & ContentType.LONG_FORM_ON_DEMAND), 0);
            fxh0Var2 = fxh0Var4;
            str3 = str4;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            str3 = str2;
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oy4(str, fxh0Var2, str3, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m84547h(boolean z, boolean z2, float f, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        boolean z3;
        cxh0 cxh0Var;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-247637450);
        int i2 = i | (xq00Var2.m91768h(z) ? 4 : 2) | (xq00Var2.m91768h(z2) ? 32 : 16) | (xq00Var2.m91760d(f) ? 256 : 128) | 3072 | (xq00Var2.m91770i(eh00Var) ? 16384 : 8192);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var2);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            if (z) {
                xq00Var2.m91771i0(-952504401);
                int i3 = ((i2 >> 6) & 14) | 384;
                z3 = true;
                cxh0Var = cxh0Var2;
                p271.m68900c(f, 4, i3, 16, leu.m58815a(xq00Var2).f112824b.f138757a, 0L, xq00Var2, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159606d, cxh0Var2));
                xq00Var2.m91788r(false);
            } else {
                z3 = true;
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(-952291834);
                xq00Var2.m91788r(false);
            }
            riw0.m75607a(new peu(u40.f226523c, eh00Var), wgu.f251150c, null, z2 ? sdu.f208086a : new qdu("Preview unavailable"), vvx.m86517r(xq00Var2), null, false, null, null, rkk.m75772x(1104450259, new op0(z, 26), xq00Var2), xq00Var, 12582960, 6, 844);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(z3);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wpy(z, z2, f, fxh0Var2, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m84548i(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1340173492);
        int i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            float f = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).screenWidthDp;
            float fM59890l = ltf1.m59890l(R.dimen.core_bottom_sheet_max_width, xq00Var);
            if (f > fM59890l) {
                f = fM59890l;
            }
            float f2 = f - leu.m58816b(xq00Var).f117230b.f224766i;
            bk01 bk01Var = bk01.f27801a;
            float f3 = bk01.f27802b;
            float f4 = x5r0.f258504b * f3;
            if (f4 <= f2) {
                f2 = f4;
            }
            float f5 = (f - f2) / 2;
            fxh0 fxh0VarM61824h = mi21.m61824h(f2 / f3, mi21.m61822f(1.0f, fxh0Var));
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d);
            j4m0 j4m0VarM96850j = zsf1.m96850j(f5, 0.0f, f5, 0.0f, 10);
            boolean zM91770i = xq00Var.m91770i(bk01Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new m6z(i3, 18);
                xq00Var.m91793t0(objM91750T);
            }
            fyg1.m43086j(fxh0VarM61824h, null, j4m0VarM96850j, xi5VarM29370g, null, null, false, null, (gh00) objM91750T, xq00Var, 12582912, 362);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i560(fxh0Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final int m84549j(int i, int i2) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return i2 == 1 ? R.string.creators_row_agent_artist_hint_title : R.string.creators_row_agent_artists_hint_title;
        }
        if (iM38547C == 1) {
            return i2 == 1 ? R.string.creators_row_agent_author_hint_title : R.string.creators_row_agent_authors_hint_title;
        }
        if (iM38547C == 2) {
            return i2 == 1 ? R.string.creators_row_agent_creator_hint_title : R.string.creators_row_agent_creators_hint_title;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static String m84550k(String str) {
        if (wl51.m88496t0(str, "open.spotify.com", false)) {
            return str;
        }
        if (!bm51.m29803n0(str, "spotify", false)) {
            str = "spotify:".concat(str);
        }
        if (wl51.m88496t0(str, "://", false)) {
            str = klh.m56834f(str.substring(0, wl51.m88458H0(str, "://", 0, false, 6)), "/", str.substring(wl51.m88458H0(str, "://", 0, false, 6) + 3));
        }
        return wl51.m88496t0(str, "/", false) ? dq60.m36614n("/", str, ":") : str;
    }

    /* JADX INFO: renamed from: l */
    public static File m84551l(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* JADX INFO: renamed from: m */
    public static final hox0 m84552m(h6d0 h6d0Var) {
        Object objMo30025g = h6d0Var.mo30025g();
        if (objMo30025g instanceof hox0) {
            return (hox0) objMo30025g;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final hox0 m84553n(t5o0 t5o0Var) {
        Object objMo30025g = t5o0Var.mo30025g();
        if (objMo30025g instanceof hox0) {
            return (hox0) objMo30025g;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final String m84554o(mna0 mna0Var) {
        if (mna0Var.equals(lna0.f135125a)) {
            return "spotify:windowed-song:click";
        }
        if (mna0Var.equals(kna0.f124368a)) {
            return "spotify:gated-song:click";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    public static final float m84555p(hox0 hox0Var) {
        if (hox0Var != null) {
            return hox0Var.f93645a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: q */
    public static xug0 m84556q() {
        return new xug0(10, (byte) 0);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m84557r(oao oaoVar) {
        return new rs4(false, oaoVar.f163398a.m94042W()).m76310a();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX INFO: renamed from: s */
    public static final zu41 m84558s(c3y c3yVar, d840 d840Var, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        String strM38212q;
        cbf0 cbf0VarM35556a3;
        String str;
        cbf0 cbf0VarM35556a4;
        v140 v140Var;
        cbf0 cbf0VarM35556a5;
        ok11 ok11Var;
        mk11 mk11Var;
        dbf0 dbf0VarM38368c;
        cbf0 cbf0VarM35556a6;
        cb7 cb7Var;
        d840 d840Var2 = d840Var;
        List<String> list = d840Var2.f46361c;
        un20 un20Var = d840Var2.f46360b;
        String str2 = d840Var2.f46359a;
        ebf0 ebf0Var = c3yVar.f33779a;
        if (ebf0Var == null) {
            return new vt41(str2, un20Var);
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(ub21.class, (String) obj);
            if (dbf0VarM38368c2 != null ? dbf0VarM38368c2 instanceof cbf0 : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            String str3 = "";
            z5 = true;
            if (!it.hasNext()) {
                break;
            }
            String str4 = (String) it.next();
            ArrayList arrayList3 = (!z2 || (dbf0VarM38368c = ebf0Var.m38368c(cb7.class, str4)) == null || (cbf0VarM35556a6 = dbf0VarM38368c.m35556a()) == null || (cb7Var = (cb7) cbf0VarM35556a6.f36107a) == null) ? null : cb7Var.f36029a;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z5 = false;
            }
            if (!z5) {
                str3 = ((bb7) g6f.m43741q0(arrayList3)).f25448a;
            } else if (z) {
                dbf0 dbf0VarM38368c3 = ebf0Var.m38368c(ok11.class, str4);
                String str5 = (dbf0VarM38368c3 == null || (cbf0VarM35556a5 = dbf0VarM38368c3.m35556a()) == null || (ok11Var = (ok11) cbf0VarM35556a5.f36107a) == null || (mk11Var = ok11Var.f166219g) == null) ? null : mk11Var.f144471a;
                if (str5 != null) {
                    str3 = str5;
                }
            }
            arrayList2.add(str3);
        }
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dbf0 dbf0VarM38368c4 = ebf0Var.m38368c(v140.class, (String) it2.next());
            if (dbf0VarM38368c4 == null || (cbf0VarM35556a4 = dbf0VarM38368c4.m35556a()) == null || (v140Var = (v140) cbf0VarM35556a4.f36107a) == null || (str = v140Var.f236244b) == null) {
                str = "";
            }
            arrayList4.add(str);
        }
        ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (String str6 : arrayList) {
            if (z4) {
                strM38212q = e95.m38212q(str6, ebf0Var);
            } else {
                dbf0 dbf0VarM38368c5 = ebf0Var.m38368c(ub21.class, str6);
                ktx ktxVar = (dbf0VarM38368c5 == null || (cbf0VarM35556a3 = dbf0VarM38368c5.m35556a()) == null) ? null : (ktx) cbf0VarM35556a3.f36107a;
                if (ktxVar == null) {
                    throw new IllegalArgumentException(klh.m56834f(ub21.class.getSimpleName(), " not found for uri: ", str6).toString());
                }
                strM38212q = ((ub21) ktxVar).f228615a;
            }
            arrayList5.add(strM38212q);
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList6 = new ArrayList(i6f.m49804T(list, 10));
            for (String str7 : list) {
                arrayList6.add(new i840(str2));
            }
            return new ot41(str2, arrayList6, un20Var);
        }
        boolean z7 = g6f.m43727j0(arrayList4).size() > 1;
        ArrayList<l840> arrayList7 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            String str8 = (String) next;
            if (z3) {
                dbf0 dbf0VarM38368c6 = ebf0Var.m38368c(ea41.class, str8);
                if (g391.m43460s((dbf0VarM38368c6 == null || (cbf0VarM35556a2 = dbf0VarM38368c6.m35556a()) == null) ? null : (ea41) cbf0VarM35556a2.f36107a)) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            dbf0 dbf0VarM38368c7 = ebf0Var.m38368c(ub21.class, str8);
            ktx ktxVar2 = (dbf0VarM38368c7 == null || (cbf0VarM35556a = dbf0VarM38368c7.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a;
            if (ktxVar2 == null) {
                throw new IllegalArgumentException(klh.m56834f(ub21.class.getSimpleName(), " not found for uri: ", str8).toString());
            }
            ub21 ub21Var = (ub21) ktxVar2;
            String strM43753y0 = (String) (z7 ? arrayList4.get(i) : arrayList2.get(i));
            String str9 = (String) arrayList5.get(i);
            boolean z8 = z7;
            boolean z9 = d840Var2.f46362d;
            f5u f5uVar = d840Var2.f46363e;
            String str10 = ub21Var.f228617c;
            String str11 = ub21Var.f228616b;
            if (strM43753y0.length() == 0) {
                strM43753y0 = g6f.m43753y0(ub21Var.f228620f, " • ", null, null, p740.f174575Z0, 30);
            }
            String str12 = strM43753y0;
            Set set = dd41.f47702f;
            ebf0 ebf0Var2 = ebf0Var;
            arrayList7.add(new g840(new z840(i, str8, str11, str10, str12, new x640(Collections.singletonList(new v96(r46.m74708A(ub21Var.f228618d, gn80.ARTIST) ? new m66(new h66(str9), false) : new g76(new h66(str9, z56.f279483d)), x96.f259282a)), null), ub21Var.f228622h, ub21Var.f228618d, null, null, null, false, false, false, false, z9, f5uVar, z6, 130816), str2));
            d840Var2 = d840Var;
            z7 = z8;
            it3 = it3;
            i = i2;
            ebf0Var = ebf0Var2;
            z5 = true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (l840 l840Var : arrayList7) {
            if (l840Var instanceof g840) {
                z840 z840Var = ((g840) l840Var).f77406a;
                linkedHashMap.put(z840Var.f280361b, id6.m50281h(z840Var.f280364e, z840Var.f280362c, z840Var.f280363d, z840Var.f280379t));
            } else if (l840Var instanceof j840) {
                z840 z840Var2 = ((j840) l840Var).f109789a;
                linkedHashMap.put(z840Var2.f280361b, id6.m50281h(z840Var2.f280364e, z840Var2.f280362c, z840Var2.f280363d, z840Var2.f280379t));
            } else {
                na6.m63971s("Trying to calculate max lines of an unsupported ImageLinkElementSize: " + l840Var);
            }
        }
        Iterator it4 = linkedHashMap.values().iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        b740 b740Var = (b740) it4.next();
        int i3 = b740Var.f24158a + b740Var.f24159b + b740Var.f24160c;
        while (it4.hasNext()) {
            b740 b740Var2 = (b740) it4.next();
            int i4 = b740Var2.f24160c + b740Var2.f24158a + b740Var2.f24159b;
            if (i3 < i4) {
                i3 = i4;
            }
        }
        b740 b740Var3 = new b740(0, 1, 2);
        ArrayList arrayList8 = new ArrayList(i6f.m49804T(arrayList7, 10));
        for (l840 g840Var : arrayList7) {
            if (g840Var instanceof g840) {
                g840 g840Var2 = (g840) g840Var;
                z840 z840Var3 = g840Var2.f77406a;
                z840 z840VarM95567a = z840.m95567a(z840Var3, Integer.valueOf(i3), null, 1015807);
                b740 b740Var4 = (b740) linkedHashMap.get(z840Var3.f280361b);
                if (b740Var4 == null) {
                    b740Var4 = b740Var3;
                }
                g840Var = new g840(z840.m95567a(z840VarM95567a, null, b740Var4, 983039), g840Var2.f77407b);
            }
            arrayList8.add(g840Var);
        }
        return new jt41(str2, arrayList8, un20Var);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m84559t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lpf1 lpf1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lpf1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(lpf1Var) != obj && atomicReferenceFieldUpdater.get(lpf1Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
