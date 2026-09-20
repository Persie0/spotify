package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import com.google.protobuf.Empty;
import com.spotify.accessory.statemanager.AccessoryStateManager$Event;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateResult;
import com.spotify.connectivity.esperanto.proto.GetStateResponse;
import com.spotify.connectivity.hosts.esperanto.proto.EsHosts$Hosts;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p000.AbstractC0000a;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class gk40 implements Predicate, Function, BiFunction, Function3, iuk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80728a;

    /* JADX INFO: renamed from: b */
    public static final gk40 f80718b = new gk40(0);

    /* JADX INFO: renamed from: c */
    public static final gk40 f80720c = new gk40(1);

    /* JADX INFO: renamed from: d */
    public static final gk40 f80721d = new gk40(2);

    /* JADX INFO: renamed from: e */
    public static final gk40 f80722e = new gk40(3);

    /* JADX INFO: renamed from: f */
    public static final gk40 f80723f = new gk40(4);

    /* JADX INFO: renamed from: g */
    public static final gk40 f80724g = new gk40(5);

    /* JADX INFO: renamed from: h */
    public static final gk40 f80725h = new gk40(6);

    /* JADX INFO: renamed from: i */
    public static final gk40 f80726i = new gk40(7);

    /* JADX INFO: renamed from: t */
    public static final gk40 f80727t = new gk40(8);

    /* JADX INFO: renamed from: X */
    public static final gk40 f80711X = new gk40(9);

    /* JADX INFO: renamed from: Y */
    public static final gk40 f80713Y = new gk40(10);

    /* JADX INFO: renamed from: Z */
    public static final gk40 f80715Z = new gk40(11);

    /* JADX INFO: renamed from: L0 */
    public static final gk40 f80699L0 = new gk40(12);

    /* JADX INFO: renamed from: M0 */
    public static final gk40 f80700M0 = new gk40(13);

    /* JADX INFO: renamed from: N0 */
    public static final gk40 f80701N0 = new gk40(14);

    /* JADX INFO: renamed from: O0 */
    public static final gk40 f80702O0 = new gk40(15);

    /* JADX INFO: renamed from: P0 */
    public static final gk40 f80703P0 = new gk40(16);

    /* JADX INFO: renamed from: Q0 */
    public static final gk40 f80704Q0 = new gk40(17);

    /* JADX INFO: renamed from: R0 */
    public static final gk40 f80705R0 = new gk40(18);

    /* JADX INFO: renamed from: S0 */
    public static final gk40 f80706S0 = new gk40(19);

    /* JADX INFO: renamed from: T0 */
    public static final gk40 f80707T0 = new gk40(20);

    /* JADX INFO: renamed from: U0 */
    public static final gk40 f80708U0 = new gk40(21);

    /* JADX INFO: renamed from: V0 */
    public static final gk40 f80709V0 = new gk40(23);

    /* JADX INFO: renamed from: W0 */
    public static final /* synthetic */ gk40 f80710W0 = new gk40(24);

    /* JADX INFO: renamed from: X0 */
    public static final /* synthetic */ gk40 f80712X0 = new gk40(25);

    /* JADX INFO: renamed from: Y0 */
    public static final gk40 f80714Y0 = new gk40(26);

    /* JADX INFO: renamed from: Z0 */
    public static final gk40 f80716Z0 = new gk40(27);

    /* JADX INFO: renamed from: a1 */
    public static final gk40 f80717a1 = new gk40(28);

    /* JADX INFO: renamed from: b1 */
    public static final gk40 f80719b1 = new gk40(29);

    public /* synthetic */ gk40(int i) {
        this.f80728a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final void m45027c() {
        if (p2l.f173365a.contains(gk40.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = p8y.m69343a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            p2l.m68953a(gk40.class, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m45028d(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z, String str, int i, boolean z2) {
        Set set = p2l.f173365a;
        if (set.contains(gk40.class)) {
            return;
        }
        try {
            gk40 gk40Var = f80718b;
            LinkedHashMap linkedHashMapM45034b = gk40Var.m45034b(gk40Var.m45033a(concurrentHashMap, z), concurrentHashMap2, str);
            if (set.contains(gk40Var)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapM45034b.entrySet()) {
                    m68.m60951d(i, (String) entry.getKey(), (String) entry.getValue(), z, z2);
                }
            } catch (Throwable th) {
                p2l.m68953a(gk40Var, th);
            }
        } catch (Throwable th2) {
            p2l.m68953a(gk40.class, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static yab m45029e(Context context, IntentFilter intentFilter) {
        return nxf1.m65827f(new dbz(context, intentFilter, null, 1));
    }

    /* JADX INFO: renamed from: f */
    public static final void m45030f() {
        if (p2l.f173365a.contains(gk40.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) wl51.m88477a1((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            m45027c();
        } catch (Throwable th) {
            p2l.m68953a(gk40.class, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m45031g() {
        if (p2l.f173365a.contains(gk40.class)) {
            return;
        }
        try {
            try {
                p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            p2l.m68953a(gk40.class, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m45032h() {
        if (p2l.f173365a.contains(gk40.class)) {
            return;
        }
        try {
            m45031g();
            try {
                SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            p2l.m68953a(gk40.class, th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        q700 q700Var = (q700) obj;
        Boolean bool = (Boolean) obj3;
        if (!((Boolean) obj2).booleanValue()) {
            return new inm0(2);
        }
        if (q700Var == q700.f185975d) {
            return new inm0(1);
        }
        return bool.booleanValue() ? new jnm0(3) : zfg1.m96026o(q700Var);
    }

    /* JADX INFO: renamed from: a */
    public HashMap m45033a(Map map, boolean z) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : kkc0.m56706s0(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f80728a) {
            case 3:
                return Boolean.valueOf(((c94) obj).f35395a);
            case 4:
                return Boolean.valueOf(!AbstractC0000a.m4c(1).equals((String) obj));
            case 5:
            case 6:
            case 7:
            case 9:
            case 14:
            case 15:
            case 22:
            case 24:
            case 25:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 8:
                xul0 xul0Var = (xul0) obj;
                return Boolean.valueOf(!xul0Var.mo49279c() || ((api) xul0Var.mo49278b()).mo26697m());
            case 10:
                ehy0 ehy0Var = (ehy0) obj;
                if (!(ehy0Var instanceof chy0)) {
                    return gvx0.f84853a;
                }
                lji ljiVar = (lji) ((chy0) ehy0Var).f38149a;
                return new fvx0(ljiVar.mo56602e(), ljiVar.mo56601d());
            case 11:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetStateResponse.m7508q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.esperanto.proto.GetStateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 12:
                return Boolean.valueOf(((q5c1) obj) instanceof o5c1);
            case 13:
                return new CompletableFromAction(new s12((CookieManager) obj, 11));
            case 16:
                return Observable.just((w2a1) obj).delay(1500L, TimeUnit.MILLISECONDS);
            case 17:
                return Boolean.valueOf(((f1s) obj) == f1s.f64955a);
            case 18:
                ehy0 ehy0Var2 = (ehy0) obj;
                if (!(ehy0Var2 instanceof chy0)) {
                    return rst.f202403a;
                }
                RetrofitMaker retrofitMaker = ((nj7) ((chy0) ehy0Var2).f38149a).mo61931b().f121181g;
                jyx jyxVar = (jyx) retrofitMaker.createWebgateService(jyx.class, "android-external-integration-quasar");
                xwx xwxVar = (xwx) retrofitMaker.createWebgateService(xwx.class, "android-external-integration-quasar");
                wgb0 wgb0Var = new wgb0((hml0) retrofitMaker.createWebgateService(hml0.class, "android-external-integration-quasar"), 21);
                pke pkeVar = (pke) retrofitMaker.createWebgateService(pke.class, "android-external-integration-quasar");
                rth rthVar = new rth();
                rthVar.m76391l(null, "https://partnerapi.spotify.net/");
                return new qst(jyxVar, xwxVar, wgb0Var, pkeVar, (vt30) retrofitMaker.createCustomHostService(vt30.class, rthVar.m76382c()));
            case 19:
                return Boolean.valueOf(((EsPrefs$Value) obj).m19527q());
            case 20:
                return new txo0((PlayerState) obj);
            case 21:
                xul0 xul0Var2 = (xul0) obj;
                return xul0Var2.mo49279c() ? new w6y((gmr0) xul0Var2.mo49278b()) : v6y.f237989a;
            case 23:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsHosts$Hosts.m7516o(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.hosts.esperanto.proto.EsHosts.Hosts: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 26:
                return Boolean.valueOf(((xe90) obj).f260668a);
            case 27:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsAuthenticateResult$AuthenticateResult.m3570v(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.authentication.login5esperanto.EsAuthenticateResult.AuthenticateResult: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public LinkedHashMap m45034b(HashMap map, Map map2, String str) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put(kyx.f127930a, str);
                    if (jSONObject2 != null) {
                        linkedHashMap.put(jSONObject.toString(), jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        api apiVar;
        switch (this.f80728a) {
            case 1:
                AccessoryStateManager$Event accessoryStateManager$Event = (AccessoryStateManager$Event) obj;
                return (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Connected) || (accessoryStateManager$Event instanceof AccessoryStateManager$Event.Updated);
            case 2:
                return ((fqx) obj).f72301b != null;
            case 5:
                return ((xul0) obj).mo49279c();
            case 6:
                qy9 qy9Var = (qy9) obj;
                return qy9Var.f193853a && qy9Var.f193854b != null;
            case 7:
                return ((Boolean) obj).booleanValue();
            case 14:
                return wj50.m88271j(((Intent) obj).getAction(), "android.net.conn.RESTRICT_BACKGROUND_CHANGED");
            default:
                xul0 xul0Var = (xul0) obj;
                dgr dgrVar = (dgr) xul0Var.mo49283h();
                if (dgrVar != null && (apiVar = dgrVar.f48885b) != null && apiVar.mo26697m()) {
                    return true;
                }
                dgr dgrVar2 = (dgr) xul0Var.mo49283h();
                return (dgrVar2 != null ? dgrVar2.f48885b : null) == null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return kkc0.m56700m0((Map) obj, (Map) obj2);
    }
}
