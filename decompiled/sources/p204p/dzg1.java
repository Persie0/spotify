package p204p;

import android.content.res.Resources;
import android.net.Uri;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dzg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f54667a;

    /* JADX INFO: renamed from: g */
    public static final void m37453g(qma qmaVar, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-190071950);
        int i2 = i | (xq00Var.m91766g(qmaVar) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            emk.m39435d(zsf1.m96830A(mi21.m61822f(1.0f, fxh0Var), leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, 2), null, qmaVar.f190169a, qmaVar.f190170b, qmaVar.f190171c, new peu(u40.f226523c, eh00Var), new tgu(4), null, xq00Var, 0, 386);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz4(qmaVar, fxh0Var, eh00Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m37454h(xh30 xh30Var, boolean z, fxh0 fxh0Var, float f, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1631674806);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(xh30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91760d(f) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61842z(mi21.m61822f(1.0f, zxc.m97185e(f, fxh0Var)), null, 3), 0.0f, 0.0f, 0.0f, 8, 7);
            zhi0 zhi0Var = bj5.f27612c;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
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
            String str = xh30Var.f261427a;
            if71 if71VarM78324i = sjf1.m78324i(leu.m58818d(xq00Var).f64967c, z, xq00Var);
            long j = leu.m58815a(xq00Var).f112824b.f138757a;
            o630 o630Var = new o630(ub9Var);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = ok20.f166250e;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(str, zoz0.m96644b(o630Var, false, (gh00) objM91750T), if71VarM78324i, j, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var2 = xq00Var;
            xq00Var2.m91771i0(1802520118);
            xq00Var2.m91788r(false);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gwd(xh30Var, z, fxh0Var, f, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final yiv0 m37455i(String str) {
        return new yiv0(str);
    }

    /* JADX INFO: renamed from: j */
    public static final void m37456j(kl71 kl71Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        kl71 kl71Var2;
        xq00Var.m91775k0(-156688841);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(kl71Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(fxh0Var, oyf1.m68467i0(0, 0, 1, xq00Var), false, 14);
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, zsf1.m96866z(AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0VarM68493v0), leu.m58816b(xq00Var).f117230b.f224767j, leu.m58816b(xq00Var).f117230b.f224763f));
            ub9 ub9Var = d7f0.f46145P0;
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61820d);
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
            wze1.m89434j(null, xq00Var, 0);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM62688m = ms2.m62688m(cxh0Var, f, xq00Var, cxh0Var, 1.0f);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = b371.f22942Z0;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM62688m, true, (gh00) objM91750T);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96644b);
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
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = b371.f22943a1;
                xq00Var.m91793t0(objM91750T2);
            }
            ahf1.m25932d(kl71Var.f123816b, zsf1.m96830A(zoz0.m96644b(cxh0Var, false, (gh00) objM91750T2), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var).f64969e, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            kl71Var2 = kl71Var;
            ahf1.m25932d(kl71Var2.f123817c, zsf1.m96830A(cxh0Var, AbstractC0000a.m17p(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            xq00Var.m91788r(true);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224765h, cxh0Var));
            r3h1.m74657e(0, kl71Var2.f123818d, kl71Var2.f123819e, xq00Var, null, null);
            xq00Var.m91788r(true);
        } else {
            kl71Var2 = kl71Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dl71(kl71Var2, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m37457k(xs11 xs11Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1029507993);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(xs11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            p2h1.m68943i(((i2 << 3) & 896) | 6, "Watch Feed", xs11Var.f265455b + " · " + xs11Var.f265457d.size() + " card(s)", xq00Var, fxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rdb1(xs11Var, fxh0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final String m37458l(String str) {
        String strM35694A;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        String strM35721s = dd41VarM74726U.m35721s();
        if (strM35721s == null || (strM35694A = dd41VarM74726U.m35694A()) == null) {
            return str;
        }
        List<String> listM88477a1 = wl51.m88477a1(wl51.m88469S0(strM35694A, "spotify:"), new String[]{":"}, 0, 6);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a1, 10));
        for (String str2 : listM88477a1) {
            if (wj50.m88271j(Uri.decode(str2), strM35721s)) {
                str2 = "aduser";
            }
            arrayList.add(str2);
        }
        return edb.m38564m("spotify:", g6f.m43753y0(arrayList, ":", null, null, null, 62));
    }

    /* JADX INFO: renamed from: m */
    public static final rbh0 m37459m(ebg0 ebg0Var, yk11 yk11Var) {
        rcm0 rcm0Var = yk11Var.f273549h;
        return new rbh0(new g4h0(new g4h0(ebg0Var, rcm0Var.f197895b, rcm0Var.f197894a, rcm0Var.f197897d), ""), yk11Var.f273548g, 3);
    }

    /* JADX INFO: renamed from: n */
    public static final void m37460n(LinkedHashSet linkedHashSet, aq6 aq6Var) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((bq6) it.next()).mo30184b(aq6Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m37461o(LinkedHashSet linkedHashSet, aq6 aq6Var) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((bq6) it.next()).mo30183a(aq6Var);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final ica0 m37462p(CosmosCoroutineTransport cosmosCoroutineTransport) {
        return new ica0(cosmosCoroutineTransport);
    }

    /* JADX INFO: renamed from: q */
    public static final int m37463q(boolean z) {
        return z ? R.string.reorder_playlist_items_page_title : R.string.edit_playlist_items_page_title;
    }

    /* JADX INFO: renamed from: r */
    public static final String m37464r(Resources resources, boolean z) {
        String string = z ? resources.getString(R.string.heart_active_button_content_description) : resources.getString(R.string.heart_button_content_description);
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: w */
    public static uwt m37465w(pu8 pu8Var) {
        return new uwt(new dt50(pu8Var, p740.f174574Z));
    }

    /* JADX INFO: renamed from: s */
    public Object m37466s(int i) {
        kj50 kj50VarM96290r = mo27504t().m96290r(i);
        return ((vu70) kj50VarM96290r.f123249c).getType().invoke(Integer.valueOf(i - kj50VarM96290r.f123247a));
    }

    /* JADX INFO: renamed from: t */
    public abstract zk1 mo27504t();

    /* JADX INFO: renamed from: u */
    public int m37467u() {
        return mo27504t().f283580c;
    }

    /* JADX INFO: renamed from: v */
    public Object m37468v(int i) {
        Object objInvoke;
        kj50 kj50VarM96290r = mo27504t().m96290r(i);
        int i2 = i - kj50VarM96290r.f123247a;
        gh00 key = ((vu70) kj50VarM96290r.f123249c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new mnp(i) : objInvoke;
    }
}
