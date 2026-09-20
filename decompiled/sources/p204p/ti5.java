package p204p;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ti5 implements wi5, ae10, qja1, j57, wjx, Function, uyb0, BiFunction, Predicate, vd50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220552a;

    public /* synthetic */ ti5(int i) {
        this.f220552a = i;
    }

    /* JADX INFO: renamed from: C */
    public static KeyEvent m80900C(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e) {
                yif1.m93821x0("Failed to get parcelable key event", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m80901I(Intent intent) {
        return "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction());
    }

    /* JADX INFO: renamed from: J */
    public static boolean m80902J(Intent intent) {
        return "android.intent.action.MEDIA_BUTTON".equals(intent.getAction());
    }

    /* JADX INFO: renamed from: K */
    public static void m80903K(m500 m500Var, kft0 kft0Var, String str, kv91 kv91Var, bvp bvpVar, t1k0 t1k0Var, oge0 oge0Var) {
        zpj0 zpj0Var = zpj0.f285149U0;
        if (m500Var.mo15683g0().m31604F("NotificationPermissionRationaleDialog") != null) {
            return;
        }
        k1k0 k1k0Var = new k1k0();
        k1k0Var.f118372C1 = kft0Var;
        k1k0Var.f118373D1 = str;
        k1k0Var.f118370A1 = kv91Var;
        k1k0Var.f118371B1 = bvpVar;
        k1k0Var.f118374E1 = t1k0Var;
        k1k0Var.f118375F1 = zpj0Var;
        k1k0Var.f118376G1 = oge0Var;
        c700 c700VarMo15683g0 = m500Var.mo15683g0();
        c700VarMo15683g0.getClass();
        xi8 xi8Var = new xi8(c700VarMo15683g0);
        xi8Var.m91100k(R.id.content, k1k0Var, "NotificationPermissionRationaleDialog", 1);
        xi8Var.m91096g(true, true);
    }

    /* JADX INFO: renamed from: L */
    public static zxv m80904L(int i) {
        return zxv.f287408d[i];
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public static final String m80905h(av91 av91Var) {
        Set set = d1p0.f44322c;
        ?? r0 = av91Var.f202551c.f19896b.f213866a;
        ArrayList arrayList = new ArrayList();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((zt91) it.next()).f286109d, arrayList);
        }
        return edb.m38564m("/", g6f.m43753y0(g6f.m43700N0(av91Var.f202551c.f19895a.f286109d, arrayList), "/", null, null, lpo0.f135814X0, 30));
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m80906m(StringBuilder sb, String str, Object obj, boolean z) {
        if (obj != null) {
            if (z) {
                sb.append(",");
            }
            sb.append(str + '=' + obj);
        } else {
            obj = null;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m80907n(Request request) {
        Map<String, String> headers = request.getHeaders();
        if (headers == null || !headers.containsKey("force-request") || !wj50.m88271j(headers.get("force-request"), "true")) {
            String uri = request.getUri();
            if (uri == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!bm51.m29803n0(uri, "sp://esperanto/spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider/getToken", false) && !bm51.m29803n0(uri, "sp://esperanto/spotify.authentication.login5esperanto.Login5/", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static oyp0 m80908q() {
        return new oyp0();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ce A[Catch: JSONException -> 0x0102, TryCatch #0 {JSONException -> 0x0102, blocks: (B:3:0x000d, B:5:0x0013, B:7:0x001d, B:9:0x0021, B:12:0x002f, B:14:0x003a, B:17:0x0044, B:20:0x004e, B:23:0x0056, B:25:0x005c, B:28:0x0066, B:31:0x0070, B:45:0x00ce, B:34:0x007e, B:37:0x008b, B:39:0x0094, B:43:0x00a8, B:52:0x00e4, B:54:0x00ec, B:55:0x00f2), top: B:59:0x000d }] */
    /* JADX INFO: renamed from: r */
    public static e8y m80909r(JSONObject jSONObject, Object obj) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        String str;
        boolean zOptBoolean;
        int iOptInt2;
        String str2;
        String str3;
        try {
            if (jSONObject.has("code")) {
                int i = jSONObject.getInt("code");
                Object objM63378r = n0b1.m63378r("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                if (objM63378r != null && (objM63378r instanceof JSONObject)) {
                    boolean z = true;
                    if (((JSONObject) objM63378r).has("error")) {
                        JSONObject jSONObject2 = (JSONObject) n0b1.m63378r("error", null, (JSONObject) objM63378r);
                        String strOptString3 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                        strOptString = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                        int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                        int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                        String strOptString4 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                        strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                        str = strOptString4;
                        zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                        iOptInt2 = iOptInt4;
                        str2 = strOptString3;
                        iOptInt = iOptInt3;
                    } else {
                        if (((JSONObject) objM63378r).has("error_code") || ((JSONObject) objM63378r).has("error_msg") || ((JSONObject) objM63378r).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objM63378r).optString("error_reason", null);
                            strOptString = ((JSONObject) objM63378r).optString("error_msg", null);
                            iOptInt = ((JSONObject) objM63378r).optInt("error_code", -1);
                            strOptString2 = null;
                            str = null;
                            zOptBoolean = false;
                            iOptInt2 = ((JSONObject) objM63378r).optInt("error_subcode", -1);
                            str2 = strOptString5;
                        } else {
                            strOptString2 = null;
                            str = null;
                            z = false;
                            zOptBoolean = false;
                            iOptInt2 = -1;
                            iOptInt = -1;
                            str2 = null;
                            str3 = null;
                        }
                        if (z) {
                            return new e8y(i, iOptInt, iOptInt2, str2, str3, strOptString2, str, obj, null, zOptBoolean);
                        }
                    }
                    str3 = strOptString;
                    if (z) {
                        return new e8y(i, iOptInt, iOptInt2, str2, str3, strOptString2, str, obj, null, zOptBoolean);
                    }
                }
                if (i > 299 || 200 > i) {
                    if (jSONObject.has("body")) {
                    }
                    return new e8y(i, -1, -1, null, null, null, null, obj, null, false);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static String m80910s(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static Bundle m80911u(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
        return obj instanceof Bundle ? (Bundle) obj : Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: B */
    public synchronized rb5 m80912B() {
        lty ltyVarM71023b = pty.m71023b(p8y.m69344b());
        if (ltyVarM71023b == null) {
            return rb5.f197469t.m83182A();
        }
        return ltyVarM71023b.f136909e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    @Override // p204p.uyb0
    /* JADX INFO: renamed from: F */
    public List mo75546F(MainLayout mainLayout, wyb0 wyb0Var, vyb0 vyb0Var) {
        boolean z;
        dzb0 dzb0Var = (dzb0) wyb0Var;
        boolean z2 = dzb0Var.f54609a != (mainLayout.getNavigationContainerTop().getVisibility() == 0);
        MainLayoutContentContainerView nowPlayingViewContainer = mainLayout.getNowPlayingViewContainer();
        if (nowPlayingViewContainer != null) {
            if (dzb0Var.f54610b == (nowPlayingViewContainer.getVisibility() == 0)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            k9y k9yVar = new k9y();
            Iterator<T> it = mainLayout.getNowPlayingViews().iterator();
            while (it.hasNext()) {
                k9yVar.mo55893c((View) it.next());
            }
            Iterator<T> it2 = mainLayout.getBottomGradientViews().iterator();
            while (it2.hasNext()) {
                k9yVar.mo55893c((View) it2.next());
            }
            xjc xjcVar = new xjc();
            xjcVar.mo55893c(mainLayout.getThinkingAgentContainer());
            return h6f.m46715L(k9yVar, xjcVar);
        }
        aj80 aj80Var = new aj80(80);
        aj80Var.mo55893c(mainLayout.getNavigationContainerTop());
        aj80Var.mo55893c(mainLayout.getLimitedExperienceIndicatorContainer());
        Iterator<T> it3 = mainLayout.getBottomGradientViews().iterator();
        while (it3.hasNext()) {
            aj80Var.mo55893c((View) it3.next());
        }
        if (!z) {
            Iterator<T> it4 = mainLayout.getNowPlayingViews().iterator();
            while (it4.hasNext()) {
                aj80Var.mo55893c((View) it4.next());
            }
        }
        aj80 aj80Var2 = new aj80(48);
        aj80Var2.mo55893c(mainLayout.getBannerContainer());
        xjc xjcVar2 = new xjc();
        if (z && z2) {
            Iterator<T> it5 = mainLayout.getNowPlayingViews().iterator();
            while (it5.hasNext()) {
                xjcVar2.mo55893c((View) it5.next());
            }
        }
        xjcVar2.mo55893c(mainLayout.getThinkingAgentContainer());
        return h6f.m46715L(aj80Var, aj80Var2, xjcVar2);
    }

    /* JADX INFO: renamed from: G */
    public String m80913G() {
        return Thread.currentThread().getName();
    }

    @Override // p204p.uyb0
    /* JADX INFO: renamed from: a */
    public void mo75547a(MainLayout mainLayout, wyb0 wyb0Var) {
        dzb0 dzb0Var = (dzb0) wyb0Var;
        boolean z = dzb0Var.f54610b;
        View navigationContainerTop = mainLayout.getNavigationContainerTop();
        boolean z2 = dzb0Var.f54609a;
        navigationContainerTop.setVisibility(z2 ? 0 : 8);
        Iterator<T> it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setVisibility(z ? 0 : 8);
        }
        mainLayout.getBannerContainer().setVisibility(dzb0Var.f54611c ? 0 : 8);
        boolean z3 = z2 || z;
        Iterator<T> it2 = mainLayout.getBottomGradientViews().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(z3 ? 0 : 8);
        }
        mainLayout.getLimitedExperienceIndicatorContainer().setVisibility(z2 ? 0 : 8);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((uvf0) obj2).m84056b() && wrf0.m88858b((Map) obj));
    }

    @Override // p204p.wjx
    /* JADX INFO: renamed from: b */
    public xjx[] mo57636b(vjx[] vjxVarArr, at8 at8Var) {
        xjx[] xjxVarArr = new xjx[vjxVarArr.length];
        for (int i = 0; i < vjxVarArr.length; i++) {
            vjx vjxVar = vjxVarArr[i];
            b6s b6sVar = null;
            if (vjxVar != null) {
                b6sVar = new b6s(vjxVar.f242078a, vjxVar.f242079b, b6sVar, 0);
            }
            xjxVarArr[i] = b6sVar;
        }
        return xjxVarArr;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        ks01 ks01Var = i != 0 ? null : ks01.UNSPECIFIED_TYPE;
        return ks01Var == null ? ks01.UNRECOGNIZED : ks01Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX INFO: renamed from: d */
    public void m80914d(wg60 wg60Var, gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1355179395);
        int i2 = i | (xq00Var.m91766g(wg60Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var2) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | 24576 | (xq00Var.m91766g(this) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            if (wg60Var instanceof ug60) {
                xq00Var.m91771i0(543522906);
                ug60 ug60Var = (ug60) wg60Var;
                wj60 wj60Var = ug60Var.f229998g;
                m3y m3yVar = ug60Var.f229997f;
                boolean z = m3yVar != null && m3yVar.f139778d;
                boolean z2 = ug60Var.f229999h;
                ax50 ax50Var = ug60Var.f229994c;
                ax50 ax50Var2 = ug60Var.f229995d;
                int iOrdinal = wj60Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 13) {
                        ax50Var = null;
                    }
                } else if (!z) {
                    if (z2) {
                        ax50Var = null;
                    } else {
                        ax50Var = ax50Var2;
                    }
                }
                int i3 = i2 << 3;
                amg1.m26417r(ug60Var, ax50Var, gh00Var, gh00Var2, eh00Var, xq00Var, 196608 | (i3 & 57344) | (i2 & 14) | (i3 & 896) | (i3 & 7168));
                xq00Var.m91788r(false);
            } else {
                if (!wg60Var.equals(vg60.f241148a)) {
                    throw lq51.m59703i(-952299559, xq00Var, false);
                }
                xq00Var.m91771i0(544211075);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts40(this, wg60Var, gh00Var, gh00Var2, eh00Var, fxh0Var2, i, 1);
        }
    }

    @Override // p204p.uyb0
    /* JADX INFO: renamed from: f */
    public wyb0 mo75548f(xyb0 xyb0Var) {
        skm0 skm0Var = xyb0Var.f267269a;
        if (skm0Var instanceof pkm0) {
            return new dzb0(true, xyb0Var.f267270b, true);
        }
        if (skm0Var instanceof qkm0) {
            return new dzb0(false, false, false);
        }
        if (skm0Var instanceof rkm0) {
            return new dzb0(true, false, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.qja1
    /* JADX INFO: renamed from: l */
    public boolean mo27923l(Uri uri) {
        String path = uri.getPath();
        return path != null && wl51.m88496t0(path, "/mobile/close/", false);
    }

    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        bj5.m29368e(i, iArr, iArr2, false);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        Set set = dd41.f47702f;
        return !r46.m74711D(((axx) obj).f21021a, nvp0.f158938f);
    }

    public String toString() {
        switch (this.f220552a) {
            case 0:
                return "AbsoluteArrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ti5(Object obj, int i) {
        this.f220552a = i;
    }

    public /* synthetic */ ti5(son sonVar, otn otnVar, int i) {
        this.f220552a = i;
    }

    public /* synthetic */ ti5(boolean z) {
        this.f220552a = 4;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        ljr0 jjr0Var;
        switch (this.f220552a) {
            case 13:
                throw ei6.m39072i(obj);
            case 21:
                return xnq0.m91513a((Throwable) obj);
            case 22:
                prt0 prt0Var = (prt0) obj;
                int iOrdinal = prt0Var.f180668c.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 1) {
                    i = 2;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
                int iM38547C = edb.m38547C(prt0Var.f180667b);
                if (iM38547C == 0) {
                    jjr0Var = new jjr0(prt0Var.f180676k, prt0Var.f180669d, prt0Var.f180670e, prt0Var.f180672g, prt0Var.f180673h, prt0Var.f180671f, prt0Var.f180674i, prt0Var.f180675j, prt0Var.f180677l, prt0Var.f180678m);
                } else if (iM38547C == 1) {
                    jjr0Var = new ijr0(i, prt0Var.f180676k, prt0Var.f180669d, prt0Var.f180670e, prt0Var.f180671f, prt0Var.f180672g, prt0Var.f180673h, prt0Var.f180674i, prt0Var.f180675j, prt0Var.f180677l, prt0Var.f180678m);
                } else if (iM38547C == 2) {
                    jjr0Var = kjr0.f123410l;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new wot0(jjr0Var);
            case 24:
                return wpy0.f253865h.get(obj);
            default:
                return r46.m74727V((nt30) obj);
        }
    }
}
