package p204p;

import android.app.Application;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.GetCommentDisplayResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public final class r46 implements j5w0, jf9, iuk, Init, BiFunction, Function, rd50, vd50, rem, pfe1, gw51 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195663a;

    public r46() {
        this.f195663a = 14;
        iq60 iq60Var = iq60.f104645h;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m74708A(String str, gn80 gn80Var) {
        return m74726U(str).f47709c == gn80Var;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m74709B(String str, gn80... gn80VarArr) {
        dd41 dd41VarM74726U = m74726U(str);
        for (gn80 gn80Var : gn80VarArr) {
            if (gn80Var == dd41VarM74726U.f47709c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m74710C(String str, LinkedHashSet linkedHashSet) {
        he41 he41Var = m74726U(str).f47710d;
        if (he41Var == null) {
            return false;
        }
        return linkedHashSet.contains(he41Var.getType());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m74711D(String str, fka1 fka1Var) {
        he41 he41Var = m74726U(str).f47710d;
        return wj50.m88271j(he41Var != null ? he41Var.getType() : null, fka1Var);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m74712E(String str, fka1... fka1VarArr) {
        he41 he41Var = m74726U(str).f47710d;
        if (he41Var != null) {
            for (fka1 fka1Var : fka1VarArr) {
                if (wj50.m88271j(fka1Var, he41Var.getType())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static cx21 m74713F(ConstraintLayout constraintLayout, mo4 mo4Var) {
        return new cx21(29, constraintLayout, mo4Var);
    }

    /* JADX INFO: renamed from: G */
    public static tjo m74714G(r46 r46Var, boolean z, int i) {
        boolean z2 = (i & 1) != 0;
        boolean z3 = (i & 4) == 0 ? z : false;
        ro80 ro80VarM44508o = geg1.m44508o();
        jqv0 jqv0Var = qpv0.f191387a;
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(daj.class)), 2, b7w.f24414X, new pko(o5w.f162119U0), b7w.f24416Y));
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(g0w.class)), 2, b7w.f24418Z, new pko(o5w.f162120V0), b7w.f24402L0));
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(wzk.class)), 2, b7w.f24403M0, new pko(o5w.f162121W0), b7w.f24404N0));
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 2, b7w.f24405O0, new pko(o5w.f162123X0), b7w.f24406P0));
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(v140.class)), 2, b7w.f24407Q0, new pko(o5w.f162125Y0), b7w.f24421b));
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(y7t0.class)), 2, b7w.f24423c, new pko(o5w.f162127Z0), b7w.f24425d));
        if (z2) {
            ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(p9c1.class)), 2, b7w.f24426e, new pko(o5w.f162128a1), b7w.f24427f));
        }
        ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(tu00.class)), 2, b7w.f24428g, new pko(o5w.f162130b1), b7w.f24429h));
        if (z3) {
            ro80VarM44508o.add(new rko(new jqx(jqv0Var.mo54112b(h1q0.class)), 2, b7w.f24430i, new pko(o5w.f162132c1), b7w.f24431t));
        }
        return new tjo(geg1.m44506m(ro80VarM44508o), new mgi(r46Var, 23));
    }

    /* JADX INFO: renamed from: H */
    public static void m74715H(Application application, String str, String str2, m5p m5pVar, iau0 iau0Var) {
        synchronized (wau0.f249610n) {
            c9k c9kVar = wau0.f249613q;
            if (c9kVar != null) {
                x0h1.m89578u(c9kVar, null, 0, new oau0(iau0Var, application, str, str2, m5pVar, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static dd41 m74716I(String str) {
        if (str.length() != 22) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return m74726U("spotify:internal:navigation:podcast:episode:" + str + ":comments");
    }

    /* JADX INFO: renamed from: J */
    public static dd41 m74717J() {
        return m74726U("spotify:internal:comments:reaction-sheet");
    }

    /* JADX INFO: renamed from: K */
    public static dd41 m74718K(String str, String str2) {
        if (str.length() != 22) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str2.length() != 22) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return m74726U("spotify:internal:navigation:podcast:episode:" + str + ":comments:" + str2);
    }

    /* JADX INFO: renamed from: L */
    public static dd41 m74719L(String str) {
        if (str.length() == 22) {
            return m74726U("spotify:episode:".concat(str));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: N */
    public static Set m74720N() {
        return dd41.f47702f;
    }

    /* JADX INFO: renamed from: O */
    public static LinkedHashSet m74721O() {
        return dd41.f47703g;
    }

    /* JADX INFO: renamed from: Q */
    public static avo0 m74722Q(fk30 fk30Var, fk30 fk30Var2) {
        it30 it30VarTarget = fk30Var.target();
        String strUri = it30VarTarget != null ? it30VarTarget.uri() : null;
        String strTitle = fk30Var.text().title();
        String strSubtitle = fk30Var.text().subtitle();
        String strTitle2 = fk30Var2 != null ? fk30Var2.text().title() : null;
        String strDescription = fk30Var.text().description();
        if (strUri == null) {
            strUri = "";
        }
        String str = strUri;
        wq30 wq30VarMain = fk30Var.images().main();
        dk30 dk30VarImages = fk30Var.images();
        wq30 wq30VarBackground = wq30VarMain == null ? dk30VarImages.background() : dk30VarImages.main();
        return new avo0(0, "", strTitle, strSubtitle, strTitle2, strDescription, str, wq30VarBackground != null ? wq30VarBackground.uri() : null);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m74723R(String str) {
        dd41 dd41VarM74726U = m74726U(str);
        return (dd41VarM74726U.f47709c == gn80.DUMMY && dd41VarM74726U.f47710d == null) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public static dd41 m74724S(String str, String str2) {
        return m74726U("spotify:list:" + Uri.encode(str) + ":" + Uri.encode(str2));
    }

    /* JADX INFO: renamed from: T */
    public static dd41 m74725T(String str) {
        return m74726U("spotify:listening-activity:details:" + Uri.encode(str));
    }

    /* JADX INFO: renamed from: U */
    public static dd41 m74726U(String str) {
        Map map = dd41.f47706j;
        dd41 dd41Var = (dd41) map.get(str);
        if (dd41Var != null) {
            return dd41Var;
        }
        dd41 dd41Var2 = new dd41(str);
        map.put(str, dd41Var2);
        return dd41Var2;
    }

    /* JADX INFO: renamed from: V */
    public static ArrayList m74727V(nt30 nt30Var) {
        List<fk30> listBody = nt30Var.body();
        if (listBody.size() == 1 && !((fk30) listBody.get(0)).children().isEmpty()) {
            fk30 fk30Var = (fk30) listBody.get(0);
            ArrayList arrayList = new ArrayList(fk30Var.children().size());
            for (fk30 fk30Var2 : fk30Var.children()) {
                it30 it30VarTarget = fk30Var2.target();
                if ((it30VarTarget != null ? it30VarTarget.uri() : null) != null) {
                    arrayList.add(new yrh(fk30Var2.mo41867id(), fk30Var2.text().title(), null, m74722Q(fk30Var2, null)));
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(nt30Var.body().size());
        for (fk30 fk30Var3 : listBody) {
            if (fk30Var3.children().isEmpty()) {
                it30 it30VarTarget2 = fk30Var3.target();
                if ((it30VarTarget2 != null ? it30VarTarget2.uri() : null) != null) {
                    arrayList2.add(new yrh(fk30Var3.mo41867id(), fk30Var3.text().title(), null, m74722Q(fk30Var3, null)));
                }
            } else {
                ArrayList arrayList3 = new ArrayList(fk30Var3.children().size());
                for (fk30 fk30Var4 : fk30Var3.children()) {
                    it30 it30VarTarget3 = fk30Var4.target();
                    if ((it30VarTarget3 != null ? it30VarTarget3.uri() : null) != null) {
                        arrayList3.add(m74722Q(fk30Var4, fk30Var3));
                    }
                }
                arrayList2.add(new eh41(fk30Var3.mo41867id(), fk30Var3.text().title(), arrayList3));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: W */
    public static dd41 m74728W(String str) {
        return m74726U("spotify:playlist:".concat(str));
    }

    /* JADX INFO: renamed from: X */
    public static dd41 m74729X(String str) {
        if (str.length() == 22) {
            return m74726U("spotify:show:".concat(str));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: Y */
    public static dd41 m74730Y(String str) {
        if (str.length() != 22) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return m74726U("spotify:show:" + str + ":settings");
    }

    /* JADX INFO: renamed from: Z */
    public static dd41 m74731Z(String str) {
        if (str.length() == 22) {
            return m74726U("spotify:track:".concat(str));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: a0 */
    public static dd41 m74732a0(String str, String str2) {
        String strM38564m = edb.m38564m("spotify:user:", Uri.encode(str));
        if (str2 != null) {
            strM38564m = klh.m56834f(strM38564m, ":", str2);
        }
        return m74726U(strM38564m);
    }

    /* JADX INFO: renamed from: b0 */
    public static dd41 m74733b0(String str) {
        return m74726U("spotify:presents:wrappedshareinstance:".concat(str));
    }

    /* JADX INFO: renamed from: o */
    public static final Lock m74734o(String str) {
        Lock lock;
        HashMap map = yhr0.f272953e;
        HashMap map2 = yhr0.f272953e;
        synchronized (map2) {
            try {
                Object reentrantLock = map2.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map2.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lock;
    }

    /* JADX INFO: renamed from: p */
    public static dd41 m74735p(String str) {
        if (str.length() == 22) {
            return m74726U("spotify:artist:".concat(str));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: w */
    public static dd41 m74736w(String str) {
        return m74726U("spotify:user:" + Uri.encode(str) + ":collection:your-episodes");
    }

    /* JADX INFO: renamed from: z */
    public static dd41 m74737z(String str) {
        if (str.length() == 22) {
            return m74726U("spotify:concept:".concat(str));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: M */
    public String m74738M(zvm0 zvm0Var) {
        String str = zvm0Var.f286742a;
        List listM88477a1 = wl51.m88477a1(str, new String[]{"---"}, 0, 6);
        return listM88477a1.size() == 2 ? (String) listM88477a1.get(1) : str;
    }

    /* JADX INFO: renamed from: P */
    public String m74739P(zvm0 zvm0Var) {
        List listM88477a1 = wl51.m88477a1(zvm0Var.f286742a, new String[]{"---"}, 0, 6);
        if (listM88477a1.size() == 2) {
            return (String) listM88477a1.get(0);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f195663a) {
            case 8:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 15:
                GetCommentDisplayResponse getCommentDisplayResponse = (GetCommentDisplayResponse) obj;
                return new vlf(getCommentDisplayResponse.m22183n().m22147u(), new qgf(1, new bh71(Collections.singletonList(getCommentDisplayResponse.m22183n())), 1, getCommentDisplayResponse.m22184o(), "", null), new enw0(opo.m67574x(Collections.singletonList(getCommentDisplayResponse.m22185p())), 1, (String) null, (String) null, false, 57));
            case 18:
                return ikc0.m50936h("key_on_demand_enabled", ((Boolean) obj).booleanValue());
            default:
                return qep0.f187985h.get(obj);
        }
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: b */
    public int mo45919b(r300 r300Var) {
        return 1;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: c */
    public vh00 mo52484c() {
        return z90.f280605Q0;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        switch (this.f195663a) {
            case 12:
                mje mjeVarM61981a = mje.m61981a(i);
                return mjeVarM61981a == null ? mje.UNRECOGNIZED : mjeVarM61981a;
            default:
                j3a1 j3a1VarM52255a = j3a1.m52255a(i);
                return j3a1VarM52255a == null ? j3a1.UNRECOGNIZED : j3a1VarM52255a;
        }
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: d */
    public oq91 mo52485d(String str) {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: e */
    public oq91 mo52486e(String str) {
        return null;
    }

    @Override // p204p.rem
    /* JADX INFO: renamed from: f */
    public Iterable mo30748f(Object obj) {
        return (Iterable) iq60.f104645h.get((up60) obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        xwk xwkVar = (xwk) obj;
        owk owkVar = xwkVar.f266696a;
        return First.m15574b(xwk.m92291c(xwkVar, null, k8f0.m55741a(xwkVar.f266697b, owkVar.f170730d, owkVar.f170729c), 3));
    }

    @Override // p204p.rd50
    public od50 findValueByNumber(int i) {
        if (i == 0) {
            return dry.BLOCKING;
        }
        if (i == 1) {
            return dry.BACKGROUND_SYNC;
        }
        if (i == 2) {
            return dry.ASYNC;
        }
        if (i == 3) {
            return dry.PUSH_INITIATED;
        }
        if (i != 4) {
            return null;
        }
        return dry.RECONNECT;
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: g */
    public boolean mo45920g(r300 r300Var) {
        return false;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: h */
    public av91 mo52487h(pv91 pv91Var, tu41 tu41Var, String str) {
        return ((dhg0) pv91Var).m36041h(str);
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: i */
    public iw51 mo45921i(r300 r300Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    /* JADX INFO: renamed from: j */
    public void m74740j(tvh0 tvh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-439813632);
        if ((i & 48) == 0) {
            i2 = i | (xq00Var.m91770i(gh00Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            boolean z = false;
            wgu wguVar = wgu.f251150c;
            fxh0 fxh0VarM39673I = epv0.m39673I("CHANGE_COVER_IMAGE", cxh0.f43038a);
            String strM54977L = k0e1.m54977L(R.string.edit_playlist_cover_art_change_image_content_description, xq00Var);
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z = true;
            }
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new gvq(12, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), wguVar, fxh0VarM39673I, null, null, null, null, null, null, null, jeg.f111565a, xq00Var, 432, 48, 2040);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek(this, tvh0Var, gh00Var, i, 28);
        }
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: k */
    public oq91 mo52488k(String str) {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: m */
    public oq91 mo52490m(String str) {
        return null;
    }

    @Override // p204p.pfe1
    /* JADX INFO: renamed from: n */
    public fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        pfe1 vb5Var;
        switch (edb.m38547C(i)) {
            case 0:
                vb5Var = new vb5(1);
                break;
            case 1:
                vb5Var = new zve();
                break;
            case 2:
                vb5Var = new hy30(2);
                break;
            case 3:
                vb5Var = new hy30(3);
                break;
            case 4:
                vb5Var = new hy30(1);
                break;
            case 5:
                vb5Var = new vb5(7);
                break;
            case 6:
                vb5Var = new cos(1);
                break;
            case 7:
                vb5Var = new cos(0);
                break;
            case 8:
                vb5Var = new hy30(0);
                break;
            case 9:
            case 12:
            case 13:
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(edb.m38548D(i)));
            case 10:
                vb5Var = new ri5(19);
                break;
            case 11:
                vb5Var = new gg5(22);
                break;
            case 14:
                vb5Var = new py51();
                break;
            case 15:
                vb5Var = new cos(2);
                break;
        }
        return vb5Var.mo33508n(str, i, 200, 200, map);
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: q */
    public oq91 mo52491q(String str) {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: r */
    public av91 mo52492r(pv91 pv91Var, tu41 tu41Var, String str) {
        return ((dhg0) pv91Var).m36042i(str);
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: s */
    public av91 mo52493s(pv91 pv91Var, String str) {
        return ((dhg0) pv91Var).m36041h(str);
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: t */
    public av91 mo52494t(pv91 pv91Var, String str) {
        return ((dhg0) pv91Var).m36040g();
    }

    /* JADX INFO: renamed from: u */
    public zvm0 m74741u(String str, String str2) {
        return new zvm0(klh.m56834f(str, "---", str2));
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: v */
    public oq91 mo52495v() {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: x */
    public av91 mo52496x(pv91 pv91Var, tu41 tu41Var, String str) {
        return ((dhg0) pv91Var).m36040g();
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: y */
    public oq91 mo52497y(String str) {
        return null;
    }

    public /* synthetic */ r46(int i) {
        this.f195663a = i;
    }

    public /* synthetic */ r46(int i, Object obj, Object obj2) {
        this.f195663a = i;
    }

    public /* synthetic */ r46(Object obj, int i) {
        this.f195663a = i;
    }

    public /* synthetic */ r46(boolean z, int i) {
        this.f195663a = i;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        xul0 xul0Var = (xul0) obj;
        return xul0Var.mo49279c() ? xul0Var : bvg1.m30630r((List) obj2);
    }

    @Override // p204p.jf9
    /* JADX INFO: renamed from: a */
    public long mo53155a(long j) {
        return j;
    }
}
