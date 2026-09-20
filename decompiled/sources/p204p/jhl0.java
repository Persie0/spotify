package p204p;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public static final ia5 f112502a = new ia5(18);

    /* JADX INFO: renamed from: b */
    public static sd40 f112503b;

    /* JADX INFO: renamed from: a */
    public static final void m53407a(qgc qgcVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1279403735);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(qgcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            int i4 = i3 & 14;
            boolean z2 = z | (i4 == 4);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new q3c(8, gh00Var, qgcVar);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(fxh0VarM61822f, false, null, null, null, (eh00) objM91750T, 15), leu.m58816b(xq00Var).f117233e.f137887c, leu.m58816b(xq00Var).f117230b.f224763f);
            boolean z3 = i4 == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var) {
                objM91750T2 = new wga(qgcVar, 25);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM96866z, false, (gh00) objM91750T2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
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
            ahf1.m25932d(qgcVar.f188437a, null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ot6(qgcVar, gh00Var, fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m53408b(uku ukuVar, tfu tfuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(271291566);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(ukuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(tfuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            fxh0Var2 = fxh0Var;
            i2 |= xq00Var.m91770i(fxh0Var2) ? 256 : 128;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            kgg1.m56339b(Uri.parse(ukuVar.f231367a), fxh0Var2, tfuVar, ukuVar.f231368b, ukuVar.f231369c, ukuVar.f231370d, 0L, false, xq00Var, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i2 << 3) & 896), 192);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vku(ukuVar, tfuVar, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final n6a0 m53409c(Typeface typeface) {
        return new n6a0(new s5f1(typeface, 19));
    }

    /* JADX INFO: renamed from: d */
    public static final void m53410d(ac61 ac61Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-789478646);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ac61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(cxh0.f43038a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            sgg1.m78061e(ac61Var.f14276b, ac61Var.f14277c, eh00Var2, rkk.m75772x(-534070041, new a720(ac61Var, 11), xq00Var), xq00Var2, (i2 & 896) | 24576 | ((i2 << 6) & 7168));
        } else {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e100(ac61Var, eh00Var2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m53411e(qf40 qf40Var, th00 th00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1368803878);
        int i2 = (xq00Var.m91770i(qf40Var) ? 4 : 2) | i | (xq00Var.m91770i(th00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            m53412f(qf40Var, th00Var, xq00Var, i2 & 126);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts31(qf40Var, th00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m53412f(qf40 qf40Var, th00 th00Var, xq00 xq00Var, int i) {
        ia7 ia7Var;
        th00 th00Var2 = th00Var;
        xq00 xq00Var2 = xq00Var;
        ub9 ub9Var = d7f0.f46144O0;
        ia7 ia7Var2 = t6x0.f217647t;
        xq00Var2.m91775k0(-1697361171);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91770i(qf40Var) ? 4 : 2) | (xq00Var2.m91770i(th00Var2) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == ia7Var2) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                Iterator<E> it = qf40Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(nr31.m65468c((nr31) it.next(), false, null, 15));
                }
                nr31[] nr31VarArr = (nr31[]) arrayList.toArray(new nr31[0]);
                objM91750T = sam.m77686y(Arrays.copyOf(nr31VarArr, nr31VarArr.length));
                xq00Var2.m91793t0(objM91750T);
            }
            gb31 gb31Var = (gb31) objM91750T;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), 16, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            gb31 gb31Var2 = gb31Var;
            ia7 ia7Var3 = ia7Var2;
            float f = 1.0f;
            ub9 ub9Var2 = ub9Var;
            ahf1.m25932d(k0e1.m54977L(R.string.filter_and_sort_sort_section_title, xq00Var2), mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64969e, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(5), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            riw0.m75615i(xq00Var2, mi21.m61834r(8, cxh0Var));
            xq00Var2.m91771i0(122692612);
            ListIterator listIterator = gb31Var2.listIterator();
            while (true) {
                e030 e030Var = (e030) listIterator;
                if (!e030Var.hasNext()) {
                    break;
                }
                nr31 nr31Var = (nr31) e030Var.next();
                fxh0 fxh0VarM61822f = mi21.m61822f(f, cxh0Var);
                ub9 ub9Var3 = ub9Var2;
                aaf aafVarM87496a2 = w9f.m87496a(bj5.f27612c, ub9Var3, xq00Var2, 0);
                int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le2);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, roh.f201262g, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var2);
                zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var2);
                zsf1.m96833D(roh.f201266k, xq00Var2);
                zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var2);
                kyu kyuVar = new kyu(null, 2, null, null, 27);
                fxh0 fxh0VarM61822f2 = mi21.m61822f(f, cxh0Var);
                gb31 gb31Var3 = gb31Var2;
                boolean zM91770i = xq00Var2.m91770i(gb31Var3) | xq00Var2.m91770i(nr31Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                Object objM91750T2 = xq00Var2.m91750T();
                if (zM91770i) {
                    ia7Var = ia7Var3;
                } else {
                    ia7Var = ia7Var3;
                    if (objM91750T2 == ia7Var) {
                    }
                    gb31Var2 = gb31Var3;
                    ia7Var3 = ia7Var;
                    ub9Var2 = ub9Var3;
                    p711.m69222a(fxh0VarM61822f2, kyuVar, null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T2), null, null, null, null, rkk.m75772x(-595134043, new us31(nr31Var, 0), xq00Var2), rkk.m75772x(275687556, new us31(nr31Var, 1), xq00Var2), null, null, rkk.m75772x(-1406814943, new us31(nr31Var, 2), xq00Var2), xq00Var, 64, 197040, 26556);
                    xq00Var2 = xq00Var;
                    xq00Var2.m91788r(true);
                    f = 1.0f;
                }
                objM91750T2 = new gyt0(gb31Var3, nr31Var, th00Var, 26);
                xq00Var2.m91793t0(objM91750T2);
                gb31Var2 = gb31Var3;
                ia7Var3 = ia7Var;
                ub9Var2 = ub9Var3;
                p711.m69222a(fxh0VarM61822f2, kyuVar, null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T2), null, null, null, null, rkk.m75772x(-595134043, new us31(nr31Var, 0), xq00Var2), rkk.m75772x(275687556, new us31(nr31Var, 1), xq00Var2), null, null, rkk.m75772x(-1406814943, new us31(nr31Var, 2), xq00Var2), xq00Var, 64, 197040, 26556);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(true);
                f = 1.0f;
            }
            th00Var2 = th00Var;
            xq00Var2.m91788r(false);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts31(qf40Var, th00Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m53413g(Context context, Throwable th) {
        try {
            ig31.m50506x(context);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m53414h(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(s571.m77246e(i, "at index "));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m53415i(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m53414h(i2, objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m53416j(Object... objArr) {
        m53415i(objArr.length, objArr);
    }

    /* JADX INFO: renamed from: k */
    public static final Bundle m53417k(Bundle bundle, List list, th00 th00Var) {
        i9d0 i9d0Var = i9d0.f99990b;
        if (bundle == null) {
            th00Var.invoke(i9d0Var, "extras is null");
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!bundle.containsKey(str)) {
                th00Var.invoke(i9d0Var, "'" + str + "' is required");
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: l */
    public static final j15 m53418l(j15 j15Var, ew31 ew31Var, ew31 ew31Var2, ew31 ew31Var3, eh00 eh00Var, yb71 yb71Var, if71 if71Var, int i, int i2, boolean z, xq00 xq00Var, int i3, int i4) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91771i0(-223630023);
        boolean z2 = (i4 & 512) != 0 ? false : z;
        String strM38564m = edb.m38564m(" ", k0e1.m54977L(R.string.song_dna_map_detail_card_see_more, xq00Var));
        int i5 = yb71.m93235b(yb71Var, j15Var, if71Var, 0, false, 0, e8j.m38111b(0, i, 0, 0, 13), null, null, null, 1980).f47231b.f279922f;
        if (i5 <= i2 && !z2) {
            xq00Var.m91788r(false);
            return j15Var;
        }
        int i6 = 6;
        boolean z3 = true;
        if (i5 > i2 || !z2) {
            xq00Var.m91771i0(-664689687);
            xq00Var.m91788r(false);
            j15 j15VarM52117f = j15Var.subSequence(0, m53422p(j15Var, strM38564m, ew31Var, ew31Var2, if71Var, yb71Var, i, i2));
            g15 g15Var = new g15();
            g15Var.m43332h(j15VarM52117f);
            int iM43338n = g15Var.m43338n(ew31Var);
            try {
                g15Var.m43331g("...");
                g15Var.m43335k(iM43338n);
                sb71 sb71Var = new sb71(ew31Var2, ew31Var3, 6);
                if ((((i3 & 57344) ^ 24576) <= 16384 || !xq00Var.m91766g(eh00Var)) && (i3 & 24576) != 16384) {
                    z3 = false;
                }
                Object objM91750T = xq00Var.m91750T();
                if (z3 || objM91750T == ia7Var) {
                    objM91750T = new bde(8, eh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                int iM43336l = g15Var.m43336l(new wl80("see_more", sb71Var, (gm80) objM91750T));
                try {
                    g15Var.m43331g(strM38564m);
                    return tfe.m80653k(g15Var, iM43336l, xq00Var, false);
                } catch (Throwable th) {
                    g15Var.m43335k(iM43336l);
                    throw th;
                }
            } catch (Throwable th2) {
                g15Var.m43335k(iM43338n);
                throw th2;
            }
        }
        xq00Var.m91771i0(-666578052);
        g15 g15Var2 = new g15();
        g15Var2.m43332h(j15Var);
        int iM43338n2 = g15Var2.m43338n(ew31Var);
        try {
            g15Var2.m43331g("...");
            g15Var2.m43335k(iM43338n2);
            int iM43338n3 = g15Var2.m43338n(ew31Var2);
            try {
                g15Var2.m43331g(strM38564m);
                g15Var2.m43335k(iM43338n3);
                if (yb71.m93235b(yb71Var, g15Var2.m43339o(), if71Var, 0, false, 0, e8j.m38111b(0, i, 0, 0, 13), null, null, null, 1980).f47231b.f279922f <= i2) {
                    xq00Var.m91771i0(-666102357);
                    g15 g15Var3 = new g15();
                    g15Var3.m43332h(j15Var);
                    int iM43338n4 = g15Var3.m43338n(ew31Var);
                    try {
                        g15Var3.m43331g("...");
                        g15Var3.m43335k(iM43338n4);
                        sb71 sb71Var2 = new sb71(ew31Var2, ew31Var3, i6);
                        if ((((i3 & 57344) ^ 24576) <= 16384 || !xq00Var.m91766g(eh00Var)) && (i3 & 24576) != 16384) {
                            z3 = false;
                        }
                        Object objM91750T2 = xq00Var.m91750T();
                        if (z3 || objM91750T2 == ia7Var) {
                            objM91750T2 = new bde(5, eh00Var);
                            xq00Var.m91793t0(objM91750T2);
                        }
                        int iM43336l2 = g15Var3.m43336l(new wl80("see_more", sb71Var2, (gm80) objM91750T2));
                        try {
                            g15Var3.m43331g(strM38564m);
                            g15Var3.m43335k(iM43336l2);
                            j15 j15VarM43339o = g15Var3.m43339o();
                            xq00Var.m91788r(false);
                            xq00Var.m91788r(false);
                            xq00Var.m91788r(false);
                            return j15VarM43339o;
                        } catch (Throwable th3) {
                            g15Var3.m43335k(iM43336l2);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        g15Var3.m43335k(iM43338n4);
                        throw th4;
                    }
                }
                xq00Var.m91771i0(-665673751);
                xq00Var.m91788r(false);
                j15 j15VarM52117f2 = j15Var.subSequence(0, m53422p(j15Var, strM38564m, ew31Var, ew31Var2, if71Var, yb71Var, i, i2));
                g15 g15Var4 = new g15();
                g15Var4.m43332h(j15VarM52117f2);
                int iM43338n5 = g15Var4.m43338n(ew31Var);
                try {
                    g15Var4.m43331g("...");
                    g15Var4.m43335k(iM43338n5);
                    sb71 sb71Var3 = new sb71(ew31Var2, ew31Var3, 6);
                    if ((((i3 & 57344) ^ 24576) <= 16384 || !xq00Var.m91766g(eh00Var)) && (i3 & 24576) != 16384) {
                        z3 = false;
                    }
                    Object objM91750T3 = xq00Var.m91750T();
                    if (z3 || objM91750T3 == ia7Var) {
                        objM91750T3 = new bde(7, eh00Var);
                        xq00Var.m91793t0(objM91750T3);
                    }
                    int iM43336l3 = g15Var4.m43336l(new wl80("see_more", sb71Var3, (gm80) objM91750T3));
                    try {
                        g15Var4.m43331g(strM38564m);
                        g15Var4.m43335k(iM43336l3);
                        j15 j15VarM43339o2 = g15Var4.m43339o();
                        xq00Var.m91788r(false);
                        xq00Var.m91788r(false);
                        return j15VarM43339o2;
                    } catch (Throwable th5) {
                        g15Var4.m43335k(iM43336l3);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    g15Var4.m43335k(iM43338n5);
                    throw th6;
                }
            } catch (Throwable th7) {
                g15Var2.m43335k(iM43338n3);
                throw th7;
            }
        } catch (Throwable th8) {
            g15Var2.m43335k(iM43338n2);
            throw th8;
        }
    }

    /* JADX INFO: renamed from: m */
    public static vcg0 m53419m(Integer num, st91 st91Var) {
        return new vcg0(num, st91Var);
    }

    /* JADX INFO: renamed from: n */
    public static final rr60 m53420n(AbstractC2641z8 abstractC2641z8, frh frhVar, String str) {
        rr60 rr60VarMo73404a = abstractC2641z8.mo73404a(frhVar, str);
        if (rr60VarMo73404a != null) {
            return rr60VarMo73404a;
        }
        ujg1.m83279t(str, abstractC2641z8.mo73406c());
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static final rr60 m53421o(AbstractC2641z8 abstractC2641z8, deu deuVar, Object obj) {
        rr60 rr60VarMo73405b = abstractC2641z8.mo73405b(deuVar, obj);
        if (rr60VarMo73405b != null) {
            return rr60VarMo73405b;
        }
        up60 up60VarMo54112b = qpv0.f191387a.mo54112b(obj.getClass());
        up60 up60VarMo73406c = abstractC2641z8.mo73406c();
        String strMo29111F = up60VarMo54112b.mo29111F();
        if (strMo29111F == null) {
            strMo29111F = String.valueOf(up60VarMo54112b);
        }
        ujg1.m83279t(strMo29111F, up60VarMo73406c);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static final int m53422p(j15 j15Var, String str, ew31 ew31Var, ew31 ew31Var2, if71 if71Var, yb71 yb71Var, int i, int i2) {
        String str2 = j15Var.f107641b;
        int length = str2.length();
        int length2 = str2.length() / 2;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) / 2;
            g15 g15Var = new g15();
            g15Var.m43332h(j15Var.subSequence(0, i4));
            int iM43338n = g15Var.m43338n(ew31Var);
            try {
                g15Var.m43331g("...");
                g15Var.m43335k(iM43338n);
                int iM43338n2 = g15Var.m43338n(ew31Var2);
                try {
                    g15Var.m43331g(str);
                    g15Var.m43335k(iM43338n2);
                    if (yb71.m93235b(yb71Var, g15Var.m43339o(), if71Var, 0, false, 0, e8j.m38111b(0, i, 0, 0, 13), null, null, null, 1980).f47231b.f279922f <= i2) {
                        i3 = i4 + 1;
                        length2 = i4;
                    } else {
                        length = i4 - 1;
                    }
                } catch (Throwable th) {
                    g15Var.m43335k(iM43338n2);
                    throw th;
                }
            } catch (Throwable th2) {
                g15Var.m43335k(iM43338n);
                throw th2;
            }
        }
        return length2;
    }

    /* JADX INFO: renamed from: q */
    public static Object[] m53423q(int i, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    /* JADX INFO: renamed from: r */
    public static final Integer m53424r(String str, Bundle bundle) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static C2529wd m53425s(w8b w8bVar) {
        C2529wd c2529wd = new C2529wd();
        c2529wd.m87800r("https://spclient.wg.spotify.com/");
        c2529wd.f250160a = w8bVar;
        return c2529wd;
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m53426t(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int length = bArr[i2].length;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }
}
