package p204p;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.widget.NestedScrollView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes8.dex */
public final class ucj0 implements Function, h9f, Producer, gb01, q431, yh00, t6m0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229072a;

    /* JADX INFO: renamed from: b */
    public final Object f229073b;

    public /* synthetic */ ucj0(Object obj, int i) {
        this.f229072a = i;
        this.f229073b = obj;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m82775l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX INFO: renamed from: s */
    public static void m82776s(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    @Override // p204p.h9f
    /* JADX INFO: renamed from: a */
    public void mo46867a(int i) {
        ((gbk0) this.f229073b).f78329Z.getBackground().setTint(i);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object obj2;
        Single map;
        Object objJust;
        switch (this.f229072a) {
            case 0:
                vcj0 vcj0Var = (vcj0) this.f229073b;
                hv31 hv31VarMo35842b = vcj0Var.f240140a.mo35842b(vcj0Var.f240144e, (String) obj);
                vcj0.m85189a(vcj0Var, hv31VarMo35842b);
                return k0e1.m54988g(((mv31) hv31VarMo35842b).m62897r(vcj0.m85190b()), dau.f47107a).map(lby.f131752P0);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 14:
            case 17:
            case 18:
            case 20:
            case 23:
            case 24:
            case 25:
            default:
                Throwable th = (Throwable) obj;
                String str = ((fnq0) this.f229073b).f71349a;
                return (str == null || wl51.m88460J0(str)) ? new znq0(4) : xnq0.m91513a(th);
            case 6:
                lt2 lt2Var = (lt2) ((ook0) this.f229073b).f167649a;
                return lt2Var.f136677d.m43619b("nls://playlist-ai-creation", ip2.f104353Z).map(k8f0.f120349f).filter(new gt2(((zes0) obj).f282123a, 0)).distinctUntilChanged().concatMap(new egb1(lt2Var, 9));
            case 7:
                Object obj3 = (ta0) obj;
                ppk0 ppk0Var = (ppk0) this.f229073b;
                if (!(obj3 instanceof ra0)) {
                    if (obj3.equals(pa0.f175333a)) {
                        Observable observableJust = Observable.just(kbt0.f121278a);
                        wj50.m88279p(observableJust);
                        return observableJust;
                    }
                    if (!obj3.equals(qa0.f186702a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Observable observableJust2 = Observable.just(nbt0.f152349a);
                    wj50.m88279p(observableJust2);
                    return observableJust2;
                }
                fpk0 fpk0Var = ppk0Var.f180058c;
                ra0 ra0Var = (ra0) obj3;
                if (ra0Var instanceof oa0) {
                    obj2 = ((oa0) ra0Var).f163171a;
                } else {
                    if (!(ra0Var instanceof sa0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((sa0) ra0Var).f207099a;
                }
                Observable observableSwitchMap = ((Observable) fpk0Var.invoke(obj2)).switchMap(new a5j0(7, ppk0Var, obj3));
                wj50.m88279p(observableSwitchMap);
                return observableSwitchMap;
            case 8:
                jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
                kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
                boe1 boe1Var = (boe1) this.f229073b;
                goe1 goe1VarM98237o = YourLibraryConfig$YourLibrarySortOrder.m98237o();
                goe1VarM98237o.m45341m(hoe1.RECENTLY_PLAYED_OR_ADDED);
                kqe1VarM98179G.m57098H((YourLibraryConfig$YourLibrarySortOrder) goe1VarM98237o.build());
                aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
                aoe1VarM98214r.m26586q(boe1Var);
                aoe1VarM98214r.m26586q(boe1.DOWNLOADED);
                kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
                jqe1VarM98173q.m54085m(kqe1VarM98179G);
                jqe1VarM98173q.m54087r((YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) obj);
                return (YourLibraryRequest) jqe1VarM98173q.build();
            case 9:
                pqm0 pqm0Var = (pqm0) obj;
                a7n a7nVar = ((d3l0) this.f229073b).f44936c;
                v1l0 v1l0Var = (v1l0) pqm0Var.f180350a;
                if (((Boolean) pqm0Var.f180351b).booleanValue()) {
                    ArrayList arrayList = v1l0Var.f236410a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        int i = ((u1l0) obj4).f225859b;
                        if (i == 2 || i == 5 || i == 6) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((u1l0) it.next()).f225858a);
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList3);
                    if (!setM43736n1.isEmpty()) {
                        hv31 hv31Var = (hv31) a7nVar.get();
                        fv31 fv31Var = d3l0.f44933g;
                        if (!wj50.m88271j(hv31Var.mo48706a(fv31Var), setM43736n1)) {
                            lv31 lv31VarEdit = ((hv31) a7nVar.get()).edit();
                            lv31VarEdit.m60052e(fv31Var, setM43736n1);
                            lv31VarEdit.m60054g();
                            setM43736n1.size();
                            setM43736n1.toString();
                        }
                    }
                } else {
                    Logger.m3973i("Ignoring offline resources update, the product type is not premium.", new Object[0]);
                }
                return w2a1.f247311a;
            case 10:
                return j8y0.m52715b(((xel0) this.f229073b).f260736b, ((cfl0) obj).f37399a).m23307y();
            case 11:
                qbt0 qbt0Var = (qbt0) obj;
                l2m l2mVar = (l2m) this.f229073b;
                if (qbt0Var instanceof nbt0) {
                    return Single.just(btl0.f30898a);
                }
                if (qbt0Var instanceof jbt0) {
                    String str2 = ((jbt0) qbt0Var).f110877a.mo91522b().f12896d;
                    if (str2 == null) {
                        map = Single.just(((Resources) ((id8) l2mVar.f129040d).f100968b).getString(R.string.filter_model_generic));
                        wj50.m88279p(map);
                    } else {
                        map = ((q6u) ((mqr) l2mVar.f129039c).f146344c).m72253g(str2).map(m1y.f139141T0);
                        wj50.m88279p(map);
                    }
                    Single map2 = map.map(new jwj0(qbt0Var, 9));
                    wj50.m88279p(map2);
                    return map2;
                }
                if (qbt0Var instanceof mbt0) {
                    mbt0 mbt0Var = (mbt0) qbt0Var;
                    jp20 jp20Var = mbt0Var.f141967a;
                    if (jp20Var instanceof hp20) {
                        return Single.just(new atl0(jp20Var));
                    }
                    if (jp20Var instanceof ip20) {
                        return k0e1.m54988g((fiz) ((C2445u9) l2mVar.f129041e).invoke(), dau.f47107a).firstOrError().flatMap(new fbk0(mbt0Var, 7));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (qbt0Var instanceof kbt0) {
                    return Single.just(ssl0.f213676d);
                }
                if (qbt0Var instanceof hbt0) {
                    return Single.just(zsl0.f285974a);
                }
                if (qbt0Var instanceof ibt0) {
                    return Single.just(ssl0.f213673a);
                }
                if (qbt0Var instanceof lbt0) {
                    return Single.just(ssl0.f213677e);
                }
                if (qbt0Var.equals(obt0.f163718a)) {
                    return Single.just(ssl0.f213679g);
                }
                if (qbt0Var instanceof pbt0) {
                    return Single.just(itl0.f105625a);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                w2m0 w2m0Var = (w2m0) this.f229073b;
                ArrayList arrayList4 = new ArrayList();
                for (axx axxVarM27436b : (List) obj) {
                    Uri uri = axxVarM27436b.f21025e;
                    if (uri != null && !uri.equals(Uri.EMPTY)) {
                        if (!Pattern.compile("android\\.resource://com\\.spotify\\.music(.debug)?/drawable/(playlist|podcast|album|artist|audiobook)_placeholder").matcher(uri.toString()).matches()) {
                            axxVarM27436b = axx.m27436b(axxVarM27436b, null, null, ((czd0) w2m0Var.f247389d).m34434e(uri, axxVarM27436b.f21018F, 3), 0, null, null, 0, null, null, null, null, -33, 3);
                        }
                    }
                    arrayList4.add(lfg1.m58874C(axxVarM27436b));
                }
                return new fxx(arrayList4, null, null, null);
            case 13:
                return !((Boolean) obj).booleanValue() ? Observable.never() : Observable.create(new jwj0((t040) this.f229073b, 11));
            case 15:
                wqy0 wqy0Var = (wqy0) obj;
                mc1 mc1Var = (mc1) this.f229073b;
                ((us91) mc1Var.f142011d).getClass();
                String strM83878a = us91.m83878a();
                String str3 = wqy0Var.f254202d;
                wfz wfzVar = wqy0Var.f254204f;
                int i2 = wqy0Var.f254206h;
                String str4 = wqy0Var.f254205g;
                z3z z3zVar = new z3z(strM83878a, str3, wfzVar, i2, str4, wqy0Var.f254208j);
                boolean z = str4.length() == 0;
                mcu mcuVar = (mcu) mc1Var.f142010c;
                tzb0 tzb0Var = (tzb0) ((oab0) ((frv0) mcuVar.f142252e).f72669b).m66541c(new vzy(str3, wfzVar, i2, str4));
                Single map3 = (tzb0Var != null ? Single.just(tzb0Var) : Single.defer(new ve0(7, mcuVar, z3zVar))).map(new fbk0(z3zVar, 12)).map(new ihk0(mc1Var, wqy0Var, z, 3));
                boolean z2 = z;
                return map3.onErrorReturn(new gr7(mc1Var, wqy0Var, z2, z3zVar, 6)).toObservable().compose(z2 ? (C2263po) mc1Var.f142009b : hc3.f89673X);
            case 16:
                p8p0 p8p0Var = ((awn0) this.f229073b).f20563d;
                wj50.m88279p(p8p0Var);
                return p8p0Var.mo48412a((h8p0) obj);
            case 19:
                return new pqm0((cyo0) obj, (p5v0) this.f229073b);
            case 21:
                String str5 = (String) obj;
                hy21 hy21Var = (hy21) ((e6a0) this.f229073b).f56599c;
                wj50.m88279p(str5);
                return hy21Var.m49110d(str5).filter(yyx.f277612X0).map(zyx.f287710Z0).toFlowable(BackpressureStrategy.f7190d);
            case 22:
                p2x0 p2x0Var = (p2x0) obj;
                ctn0 ctn0Var = new ctn0((rip0) this.f229073b, 2);
                if (p2x0Var instanceof k2x0) {
                    objJust = ctn0Var.invoke(((k2x0) p2x0Var).f118699a);
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objJust = Single.just(u4m.f226774a);
                }
                return (SingleSource) objJust;
            case 26:
                ArrayList arrayListM68132b = ((ovh0) this.f229073b).m68132b();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayListM68132b) {
                    if (obj5 instanceof tcq0) {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    j6f.m52564V(((tcq0) it2.next()).mo57798c(), arrayList6);
                }
                return g6f.m43736n1(arrayList6);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m82777b(String str) {
        String strM82782j = m82782j(str);
        return "1".equals(strM82782j) || Boolean.parseBoolean(strM82782j);
    }

    /* JADX INFO: renamed from: c */
    public Integer m82778c(String str) {
        String strM82782j = m82782j(str);
        if (TextUtils.isEmpty(strM82782j)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM82782j));
        } catch (NumberFormatException unused) {
            m82776s(str);
            return null;
        }
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: d */
    public st91 mo44196d() {
        return ((xug0) this.f229073b).mo24361d();
    }

    /* JADX INFO: renamed from: e */
    public JSONArray m82779e(String str) {
        String strM82782j = m82782j(str);
        if (TextUtils.isEmpty(strM82782j)) {
            return null;
        }
        try {
            return new JSONArray(strM82782j);
        } catch (JSONException unused) {
            m82776s(str);
            return null;
        }
    }

    @Override // p204p.q431
    /* JADX INFO: renamed from: f */
    public void mo28183f(u231 u231Var) {
        ((lbk0) this.f229073b).mo58667d(u231Var, "PlayModePicker.Dialog");
    }

    /* JADX INFO: renamed from: g */
    public String m82780g(Resources resources, String str, String str2) {
        String[] strArr;
        String strM82782j = m82782j(str2);
        if (!TextUtils.isEmpty(strM82782j)) {
            return strM82782j;
        }
        String strM82782j2 = m82782j(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strM82782j2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM82782j2, "string", str);
        if (identifier == 0) {
            m82776s(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayM82779e = m82779e(str2.concat("_loc_args"));
        if (jSONArrayM82779e == null) {
            strArr = null;
        } else {
            int length = jSONArrayM82779e.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayM82779e.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            m82776s(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((edk0) this.f229073b).f58535b);
    }

    @Override // p204p.t6m0
    /* JADX INFO: renamed from: h */
    public nsj mo40414h(bmm0 bmm0Var, Bundle bundle) {
        return new viq0();
    }

    /* JADX INFO: renamed from: i */
    public float m82781i() {
        return -((NestedScrollView) this.f229073b).getVerticalScrollFactorCompat();
    }

    /* JADX INFO: renamed from: j */
    public String m82782j(String str) {
        Bundle bundle = (Bundle) this.f229073b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public Object m82783k(String str, ibk ibkVar) {
        b8n0 b8n0Var;
        if (ibkVar instanceof b8n0) {
            b8n0Var = (b8n0) ibkVar;
            int i = b8n0Var.f24626c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b8n0Var.f24626c = i - Integer.MIN_VALUE;
            } else {
                b8n0Var = new b8n0(this, ibkVar);
            }
        } else {
            b8n0Var = new b8n0(this, ibkVar);
        }
        Object obj = b8n0Var.f24624a;
        int i2 = b8n0Var.f24626c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = ((h5w) this.f229073b).m46699a(Collections.singletonList(str)).map(lby.f131758V0);
        b8n0Var.f24626c = 1;
        Object objM96567o = zn91.m96567o(map, b8n0Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX INFO: renamed from: m */
    public Bundle m82784m() {
        Bundle bundle = (Bundle) this.f229073b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // p204p.t6m0
    /* JADX INFO: renamed from: n */
    public tio mo40418n() {
        return (jwj0) this.f229073b;
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: o */
    public av91 mo44197o() {
        xug0 xug0Var = (xug0) this.f229073b;
        xug0Var.getClass();
        return new av91("", "", new dv91("drag", 1), new bv91("ui_navigate_back", 1, nau.f152117a), xug0Var.f266109b, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.gb01
    /* JADX INFO: renamed from: p */
    public av91 mo44198p() {
        xug0 xug0Var = (xug0) this.f229073b;
        xug0Var.getClass();
        return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), xug0Var.f266109b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: q */
    public boolean m82785q(float f) {
        if (f == 0.0f) {
            return false;
        }
        m82786r();
        ((NestedScrollView) this.f229073b).m407p((int) f);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void m82786r() {
        ((NestedScrollView) this.f229073b).f812d.abortAnimation();
    }

    public ucj0(int i) {
        this.f229072a = i;
        switch (i) {
            case 25:
                this.f229073b = Pattern.compile("spotify:show:[a-zA-Z0-9]{22}:episode:[a-zA-Z0-9]{22}");
                break;
            case 26:
            default:
                this.f229073b = new xug0(6, (byte) 0);
                break;
            case 27:
                this.f229073b = new jwj0();
                break;
        }
    }

    public ucj0(Bundle bundle) {
        this.f229072a = 2;
        this.f229073b = new Bundle(bundle);
    }
}
