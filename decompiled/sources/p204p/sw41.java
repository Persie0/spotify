package p204p;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.spotify.contentagnostic.p051v2.ColorSet;
import com.spotify.contentagnostic.p051v2.ColorSetContrastOptions;
import com.spotify.contentagnostic.p051v2.Image;
import com.spotify.contentagnostic.p051v2.ImageInstance;
import com.spotify.music.R;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sw41 {

    /* JADX INFO: renamed from: a */
    public static final wj30[] f214583a = new wj30[0];

    /* JADX INFO: renamed from: b */
    public static sd40 f214584b;

    /* JADX INFO: renamed from: a */
    public static final void m79509a(qol qolVar, int i, float f, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        fxh0 fxh0VarM37368M;
        ia7 ia7Var = t6x0.f217647t;
        int i3 = qolVar.f190999b;
        xq00Var.m91775k0(1040130102);
        int i4 = i2 | (xq00Var.m91766g(qolVar) ? 4 : 2) | 3072;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 1171) != 1170)) {
            float fMo35989Z0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35989Z0(28);
            boolean zM91760d = xq00Var.m91760d(fMo35989Z0);
            Object objM91750T = xq00Var.m91750T();
            if (zM91760d || objM91750T == ia7Var) {
                objM91750T = new mw6(i, 1, fMo35989Z0);
                xq00Var.m91793t0(objM91750T);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM29069L = bga.m29069L(cxh0Var, (gh00) objM91750T);
            if (i3 == 2) {
                xq00Var.m91771i0(-1672775683);
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = fll.f70814i;
                    xq00Var.m91793t0(objM91750T2);
                }
                fxh0VarM37368M = dyu.m37368M(f, z520.m95415B(cxh0Var, (gh00) objM91750T2));
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1672385238);
                xq00Var.m91788r(false);
                fxh0VarM37368M = cxh0Var;
            }
            fxh0 fxh0VarMo34315F = fxh0VarM29069L.mo34315F(fxh0VarM37368M);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
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
            l0y0.m57821c(Uri.parse(qolVar.f190998a), qgj.f188480a, r9g1.m75068p(cxh0Var, i3 == 2 ? hmx0.f93097a : hmx0.m47993b(4)), new ybs(32), null, null, null, null, null, null, false, false, xq00Var, 3120, 0, 4080);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gml(qolVar, i, f, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m79510b(dlx dlxVar, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i) {
        Object obj;
        xq00Var.m91775k0(1957711329);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91770i(dlxVar) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
            String strM54977L = k0e1.m54977L(R.string.parental_consent_transition_changes_subheading, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64975k;
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = k3y.f119006X0;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(strM54977L, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            k3u0.m55297a(0, k0e1.m54977L(R.string.parental_consent_transition_change_prefix_music, xq00Var), k0e1.m54978M(R.string.parental_consent_transition_change_music, new Object[]{k0e1.m54977L(R.string.parental_consent_transition_change_prefix_music, xq00Var)}, xq00Var), xq00Var, null);
            k3u0.m55297a(0, k0e1.m54977L(R.string.parental_consent_transition_change_prefix_recommendations, xq00Var), k0e1.m54978M(R.string.parental_consent_transition_change_recommendations, new Object[]{k0e1.m54977L(R.string.parental_consent_transition_change_prefix_recommendations, xq00Var)}, xq00Var), xq00Var, null);
            k3u0.m55297a(0, k0e1.m54977L(R.string.parental_consent_transition_change_prefix_data, xq00Var), k0e1.m54978M(R.string.parental_consent_transition_change_data, new Object[]{k0e1.m54977L(R.string.parental_consent_transition_change_prefix_data, xq00Var)}, xq00Var), xq00Var, null);
            if (dlxVar instanceof blx) {
                xq00Var.m91771i0(-383466271);
                k3u0.m55297a(0, k0e1.m54977L(R.string.parental_consent_transition_change_prefix_free, xq00Var), k0e1.m54978M(R.string.parental_consent_transition_change_free, new Object[]{k0e1.m54977L(R.string.parental_consent_transition_change_prefix_free, xq00Var)}, xq00Var), xq00Var, null);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-383149141);
                xq00Var.m91788r(false);
            }
            if (z) {
                xq00Var.m91771i0(-383097061);
                k3u0.m55297a(0, k0e1.m54977L(R.string.parental_consent_transition_change_prefix_addons, xq00Var), k0e1.m54978M(R.string.parental_consent_transition_change_addons, new Object[]{k0e1.m54977L(R.string.parental_consent_transition_change_prefix_addons, xq00Var)}, xq00Var), xq00Var, null);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-382774165);
                xq00Var.m91788r(false);
            }
            String strM42466j = fr0.m42466j(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, R.string.parental_consent_transition_same_subheading, xq00Var);
            if71 if71Var2 = leu.m58818d(xq00Var).f64975k;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = k3y.f119008Y0;
                xq00Var.m91793t0(objM91750T2);
            }
            ahf1.m25932d(strM42466j, zoz0.m96644b(cxh0Var, false, (gh00) objM91750T2), if71Var2, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cxh0Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ahf1.m25932d("•", zsf1.m96832C(cxh0Var, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 11), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 6, 0, 2040);
            ahf1.m25932d(k0e1.m54977L(R.string.parental_consent_transition_same_music, xq00Var), null, leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2042);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            obj = cxh0Var;
        } else {
            xq00Var.m91757b0();
            obj = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wo0(dlxVar, z, obj, i, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m79511c(int i, int i2, int i3, Integer num, xq00 xq00Var, fxh0 fxh0Var) {
        int i4;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-2036443344);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var2.m91766g(num) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var2.m91762e(edb.m38547C(i)) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var2.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0Var2 = i5 != 0 ? cxh0Var : fxh0Var;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0Var2);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            v3d1.m84545f(mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159603a, cxh0Var), null, rkk.m75772x(-521608281, new evm0(i, 16, false), xq00Var2), xq00Var2, 384, 2);
            if (num != null) {
                xq00Var2.m91771i0(-2121869282);
                riw0.m75615i(xq00Var2, mi21.m61834r(4, cxh0Var));
                ahf1.m25932d(s571.m77251j("\u2066", k0e1.m54971F(R.plurals.speed_badge_bpm_label, num.intValue(), new Object[]{num}, xq00Var2), "\u2069 • "), null, null, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2038);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-2121600202);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ral0(num, i, fxh0Var2, i2, i3, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final s4a0 m79512d(d6a0 d6a0Var, Scheduler scheduler) {
        return new s4a0(Observable.create(new t180(d6a0Var, 9)).subscribeOn(scheduler), new t690(d6a0Var, 20), new t790(d6a0Var, 12));
    }

    /* JADX INFO: renamed from: e */
    public static s4a0 m79513e(d6a0 d6a0Var) {
        Scheduler scheduler = AndroidSchedulers.f7175a;
        RxAndroidPlugins.m23280b(scheduler);
        return m79512d(d6a0Var, scheduler);
    }

    /* JADX INFO: renamed from: f */
    public static final int m79514f(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 3;
        }
        if (iM38547C == 1) {
            return 1;
        }
        if (iM38547C == 2) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final yjx0 m79515g(Bundle bundle) {
        return new yjx0(bundle != null ? bundle.containsKey(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED) : false ? qxg1.m74132p(bundle) : "default", bundle != null ? bundle.getString("com.spotify.music.extra.CLIENT_ID", null) : null, bundle != null ? bundle.getString("com.spotify.music.extra.VERSION", null) : null, bundle != null ? bundle.containsKey(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED) : false, bundle != null ? bundle.containsKey(MediaBrowserServiceCompat.BrowserRoot.EXTRA_RECENT) : false, (hg40) null, bundle, 80);
    }

    /* JADX INFO: renamed from: h */
    public static qfq m79516h(xlg0 xlg0Var) {
        return new qfq(xlg0Var.mo24361d());
    }

    /* JADX INFO: renamed from: i */
    public static im91 m79517i(xq00 xq00Var) {
        return jg31.m53259E(cks.m33198q(leu.m58817c(xq00Var).f235363b.f225041c, ils.MILLISECONDS), 0, ((pku) leu.m58817c(xq00Var).f235362a.f197473d).f178550a, 2);
    }

    /* JADX INFO: renamed from: k */
    public static ryu m79518k(xq00 xq00Var) {
        return new ryu(33, leu.m58816b(xq00Var).f117234f.f148186b, leu.m58816b(xq00Var).f117234f.f148185a);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m79519l(uy80 uy80Var) {
        Long l = uy80Var.f235215k;
        return (l != null ? l.longValue() : 0L) >= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: m */
    public static yt91 m79520m(String str, wj30 wj30Var) {
        ?? arrayList;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = wj30Var.string("ubi:app", "");
        yt91VarM50626j.f276047a = wj30Var.string("ubi:specification_id", "");
        yt91VarM50626j.f276052f = wj30Var.string("ubi:specification_version", "");
        yt91VarM50626j.f276053g = wj30Var.string("ubi:generator_version", "");
        yt91VarM50626j.f276057k = wj30Var.string("ubi:annotator_version", "");
        yt91VarM50626j.f276058l = wj30Var.string("ubi:annotator_configuration_version", "");
        yt91VarM50626j.f276048b = wj30Var.string("ubi:pageIdentifier");
        yt91VarM50626j.f276050d = wj30Var.string("ubi:pageUri", str);
        yt91VarM50626j.f276049c = wj30Var.intValue("ubi:pagePosition");
        yt91VarM50626j.f276051e = wj30Var.string("ubi:pageReason");
        wj30[] wj30VarArrBundleArray = wj30Var.bundleArray("ubi:path");
        WeakHashMap weakHashMap = e0b1.f54934a;
        if (wj30VarArrBundleArray == null) {
            wj30VarArrBundleArray = f214583a;
        }
        wj30[] wj30VarArr = wj30VarArrBundleArray;
        if (wj30VarArr.length > 0) {
            arrayList = new ArrayList(wj30VarArr.length);
            for (wj30 wj30Var2 : wj30VarArr) {
                String strString = wj30Var2.string("name", "");
                String strString2 = wj30Var2.string("id");
                String strString3 = wj30Var2.string("uri");
                String strString4 = wj30Var2.string("reason");
                Integer numIntValue = wj30Var2.intValue("position");
                ofg1.m66846o(strString, "path node name");
                arrayList.add(new bu91(strString, strString2, numIntValue, strString3, strString4));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = yt91VarM50626j.f276055i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        return yt91VarM50626j;
    }

    /* JADX INFO: renamed from: n */
    public static final jiu m79521n(ColorSet colorSet) {
        int i = oku.f166673f;
        return oku.m67264d(rfg1.m75433c(colorSet.m7793o().m7937s(), colorSet.m7793o().m7936r(), colorSet.m7793o().m7935p(), colorSet.m7793o().m7934o()), rfg1.m75433c(colorSet.m7794p().m7937s(), colorSet.m7794p().m7936r(), colorSet.m7794p().m7935p(), colorSet.m7794p().m7934o()), rfg1.m75433c(colorSet.m7795r().m7937s(), colorSet.m7795r().m7936r(), colorSet.m7795r().m7935p(), colorSet.m7795r().m7934o()), rfg1.m75433c(colorSet.m7797t().m7937s(), colorSet.m7797t().m7936r(), colorSet.m7797t().m7935p(), colorSet.m7797t().m7934o()), rfg1.m75433c(colorSet.m7796s().m7937s(), colorSet.m7796s().m7936r(), colorSet.m7796s().m7935p(), colorSet.m7796s().m7934o()));
    }

    /* JADX INFO: renamed from: o */
    public static final w240 m79522o(ColorSetContrastOptions colorSetContrastOptions) {
        if (colorSetContrastOptions.equals(colorSetContrastOptions.getDefaultInstanceForType())) {
            return null;
        }
        return new w240(m79521n(colorSetContrastOptions.m7808s()), m79521n(colorSetContrastOptions.m7806q()), m79521n(colorSetContrastOptions.m7807r()), new n6f(rfg1.m75433c(colorSetContrastOptions.m7805p().m7937s(), colorSetContrastOptions.m7805p().m7936r(), colorSetContrastOptions.m7805p().m7935p(), colorSetContrastOptions.m7805p().m7934o())));
    }

    /* JADX INFO: renamed from: p */
    public static final m340 m79523p(Image image) {
        ae50 ae50VarM7876q = image.m7876q();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM7876q, 10));
        Iterator<E> it = ae50VarM7876q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ImageInstance imageInstance = (ImageInstance) it.next();
            rfz rfzVar = new rfz(imageInstance.m7879o().m7856o());
            int i = n940.f151703b[imageInstance.m7880p().ordinal()];
            a340 a340Var = a340.f11861b;
            if (i != 1) {
                if (i == 2) {
                    a340Var = a340.f11860a;
                } else if (i == 3) {
                    a340Var = a340.f11862c;
                } else if (i == 4) {
                    a340Var = a340.f11863d;
                }
            }
            arrayList.add(new z240(rfzVar, a340Var));
        }
        return new m340(arrayList, m79522o(image.m7875p()), n940.f151702a[image.m7877r().ordinal()] != 1 ? 1 : 2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m79524q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo41613j();
}
