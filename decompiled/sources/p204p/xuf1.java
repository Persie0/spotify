package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.GraphPoint;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.GraphSection;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.HighlightedEntity;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xuf1 {

    /* JADX INFO: renamed from: a */
    public static final ktz0[] f266103a = new ktz0[0];

    /* JADX INFO: renamed from: b */
    public static sd40 f266104b;

    /* JADX INFO: renamed from: c */
    public static sd40 f266105c;

    /* JADX INFO: renamed from: a */
    public static final void m92162a(nuy nuyVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(668886235);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(nuyVar) ? 4 : 2) | (xq00Var2.m91770i(gh00Var) ? 32 : 16) | (xq00Var2.m91770i(fxh0Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
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
            boolean z = nuyVar.f158739d;
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objM91750T = xq00Var2.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new uvb(22, gh00Var, nuyVar);
                xq00Var2.m91793t0(objM91750T);
            }
            phu.m70050b(z, (gh00) objM91750T, null, null, 0, null, null, xq00Var2, 0, 124);
            float f = leu.m58816b(xq00Var2).f117230b.f224762e;
            cxh0 cxh0Var = cxh0.f43038a;
            riw0.m75615i(xq00Var2, mi21.m61838v(f, cxh0Var));
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = tfe.m80656n(xq00Var2);
            }
            voi0 voi0Var = (voi0) objM91750T2;
            boolean z3 = (i4 == 4) | (i3 == 32);
            Object objM91750T3 = xq00Var2.m91750T();
            if (z3 || objM91750T3 == ia7Var) {
                objM91750T3 = new q3c(20, gh00Var, nuyVar);
                xq00Var2.m91793t0(objM91750T3);
            }
            fxh0 fxh0VarM47245v = hdi.m47245v(cxh0Var, voi0Var, null, false, null, null, (eh00) objM91750T3, 28);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM47245v);
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
            ahf1.m25932d(nuyVar.f158737b, null, leu.m58818d(xq00Var2).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var2 = xq00Var;
            if (nuyVar.f158738c != null) {
                xq00Var2.m91771i0(-1663577405);
                ahf1.m25932d(nuyVar.f158738c, zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 0.0f, 0.0f, 13), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-1663344595);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qic(i, 9, nuyVar, gh00Var, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m92163b(String str, x740 x740Var, udu uduVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-693756753);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(x740Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(uduVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46157Z, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            boolean z = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 14) == 4);
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new du90(3, str, x740Var);
                xq00Var2.m91793t0(objM91750T);
            }
            riw0.m75607a(new peu(u40.f226523c, (eh00) objM91750T), new tgu(4), null, uduVar, null, null, false, null, null, uqg.f233011a, xq00Var, (i3 << 6) & 57344, 6, 1004);
            xq00Var2 = xq00Var;
            y85.m93057b(mru.f146615c, qgj.f188480a, zsf1.m96865y(3, nec.m64246i(mi21.m61834r(20, cxh0Var), n6f.f150866f, hmx0.f93097a)), n6f.f150862b, 0L, true, xq00Var2, mru.f146616d | 196656, 16);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(str, (ai00) x740Var, (Object) uduVar, (Object) fxh0Var2, i, 18);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m92164c(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(628962267);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            float f2 = leu.m58816b(xq00Var).f117230b.f224764g;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(k0e1.m54977L(R.string.remote_devices_title, xq00Var), epv0.m39673I("on-other-networks-text", mi21.m61822f(1.0f, zsf1.m96866z(cxh0Var, f2, f))), leu.m58818d(xq00Var).f64975k, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i560(fxh0Var2, i, 24);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Set m92165d(ktz0 ktz0Var) {
        if (ktz0Var instanceof l5b) {
            return ((l5b) ktz0Var).mo58213a();
        }
        HashSet hashSet = new HashSet(ktz0Var.mo33222e());
        int iMo33222e = ktz0Var.mo33222e();
        for (int i = 0; i < iMo33222e; i++) {
            hashSet.add(ktz0Var.mo33223f(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e */
    public static final ktz0[] m92166e(List list) {
        ktz0[] ktz0VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (ktz0VarArr = (ktz0[]) list.toArray(new ktz0[0])) == null) ? f266103a : ktz0VarArr;
    }

    /* JADX INFO: renamed from: f */
    public static Object m92167f(cyh0 cyh0Var, Object obj, th00 th00Var) {
        return th00Var.invoke(obj, cyh0Var);
    }

    /* JADX INFO: renamed from: g */
    public static huk m92168g(cyh0 cyh0Var, iuk iukVar) {
        return cct.m32323v(cyh0Var, iukVar);
    }

    /* JADX INFO: renamed from: h */
    public static jjc m92169h(Context context) {
        jbb jbbVarM63736l;
        phr0 phr0Var = phr0.f177710g;
        synchronized (phr0Var.f177711a) {
            jbbVarM63736l = phr0Var.f177712b;
            if (jbbVarM63736l == null) {
                jbbVarM63736l = n5h1.m63736l(new us30(28, phr0Var, new ygb(context)));
                phr0Var.f177712b = jbbVarM63736l;
            }
        }
        g4n0 g4n0Var = new g4n0(new kgi(context, 4), 21);
        return x4w0.m89929T(jbbVarM63736l, new drw(g4n0Var, 10), e95.m38202g());
    }

    /* JADX INFO: renamed from: i */
    public static int m92170i(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m92171j(Uri uri) {
        return wj50.m88271j(uri.getScheme(), "file") || wj50.m88271j(uri.getScheme(), "content");
    }

    /* JADX INFO: renamed from: k */
    public static boolean m92172k(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.getWindow().getAttributes().flags & 67108864) != 0 || Color.alpha(activity.getWindow().getStatusBarColor()) < 255;
    }

    /* JADX INFO: renamed from: l */
    public static final up60 m92173l(sr60 sr60Var) {
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y instanceof up60) {
            return (up60) kq60VarMo27067y;
        }
        if (!(kq60VarMo27067y instanceof ur60)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + kq60VarMo27067y);
        }
        throw new IllegalArgumentException("Captured type parameter " + kq60VarMo27067y + " from generic non-reified function. Such functionality cannot be supported because " + kq60VarMo27067y + " is erased, either specify serializer explicitly or make calling function inline with reified " + kq60VarMo27067y + '.');
    }

    /* JADX INFO: renamed from: m */
    public static final jy40 m92174m(GraphSection graphSection, String str, ky40 ky40Var) {
        int color = Color.parseColor(str);
        fuz0 fuz0VarM40079a = euz0.m40079a(graphSection.m11339u());
        String subtitle = graphSection.getSubtitle();
        String strM11338t = graphSection.m11338t();
        ky40 ky40Var2 = ky40.f127648a;
        int i = ky40Var == ky40Var2 ? R.string.user_stats_tracks_bpm_graph_main_label : R.string.user_stats_artist_popularity_graph_main_label;
        String strM11337s = graphSection.m11337s();
        ae50 ae50VarM11336r = graphSection.m11336r();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM11336r, 10));
        int i2 = 0;
        for (Object obj : ae50VarM11336r) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            arrayList.add(new lyv(i2, ((GraphPoint) obj).getValue()));
            i2 = i3;
        }
        int iM11333n = graphSection.m11333n();
        Integer numValueOf = Integer.valueOf(iM11333n);
        if (ky40Var != ky40.f127649b || iM11333n == 0) {
            numValueOf = null;
        }
        gy40 gy40Var = new gy40(fuz0VarM40079a, subtitle, strM11338t, i, strM11337s, color, arrayList, numValueOf);
        int i4 = ky40Var == ky40Var2 ? R.string.user_stats_tracks_bpm_highlighted_lowest_track_label : R.string.f6027x247a42c0;
        int i5 = ky40Var == ky40Var2 ? R.string.user_stats_tracks_bpm_highlighted_highest_track_label : R.string.f6026xc728b94c;
        HighlightedEntity highlightedEntityM11335q = graphSection.m11335q();
        hy40 hy40Var = new hy40(highlightedEntityM11335q.getTitle(), highlightedEntityM11335q.getSubtitle(), highlightedEntityM11335q.getImageUrl(), highlightedEntityM11335q.getUri());
        HighlightedEntity highlightedEntityM11334p = graphSection.m11334p();
        return new jy40(ky40Var, gy40Var, new iy40(i4, i5, hy40Var, new hy40(highlightedEntityM11334p.getTitle(), highlightedEntityM11334p.getSubtitle(), highlightedEntityM11334p.getImageUrl(), highlightedEntityM11334p.getUri()), color), "Insights");
    }

    /* JADX INFO: renamed from: n */
    public static juk m92175n(cyh0 cyh0Var, iuk iukVar) {
        return cct.m32326y(cyh0Var, iukVar);
    }

    /* JADX INFO: renamed from: o */
    public static LinkedHashMap m92176o(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new LinkedHashMap(i2);
    }

    /* JADX INFO: renamed from: p */
    public static juk m92177p(cyh0 cyh0Var, juk jukVar) {
        return opo.m67570t(cyh0Var, jukVar);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m92178q(c5t0 c5t0Var) {
        return c5t0Var.f34287j;
    }

    /* JADX INFO: renamed from: r */
    public static final fxh0 m92179r(fxh0 fxh0Var, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? fxh0Var : l0y0.m57833o(fxh0Var, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, null, 524284);
    }

    /* JADX INFO: renamed from: s */
    public static final qt5 m92180s(q56 q56Var) {
        n6f n6fVar;
        String str = q56Var.f185406a;
        List list = q56Var.f185409d;
        Long l = q56Var.f185410e;
        if (l != null) {
            long jLongValue = l.longValue();
            int i = n6f.f150872l;
            n6fVar = new n6f(m3l.m60710q(jLongValue));
        } else {
            n6fVar = null;
        }
        return new qt5(str, list, n6fVar);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m92181t(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !h3h1.m46523a();
        }
        if (!h3h1.m46523a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            h3h1.f87235a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
