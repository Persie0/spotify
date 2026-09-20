package p204p;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.core.graphics.drawable.IconCompat;
import com.google.protobuf.Timestamp;
import com.spotify.base.java.logging.Logger;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.OccupancyChannelEvent;
import com.spotify.offline_esperanto.proto.EsOffline$ContextProgress;
import com.spotify.offline_esperanto.proto.EsOffline$ContextsProgressResponse;
import com.spotify.offline_esperanto.proto.EsOffline$DevicesWithContextResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class y8z implements zlc0, Predicate, Function, tn61, BiFunction, hwf, pb31, cco0, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270448a;

    /* JADX INFO: renamed from: b */
    public static final y8z f270437b = new y8z(0);

    /* JADX INFO: renamed from: c */
    public static final y8z f270439c = new y8z(1);

    /* JADX INFO: renamed from: d */
    public static final y8z f270441d = new y8z(2);

    /* JADX INFO: renamed from: e */
    public static final y8z f270442e = new y8z(3);

    /* JADX INFO: renamed from: f */
    public static final y8z f270443f = new y8z(4);

    /* JADX INFO: renamed from: g */
    public static final y8z f270444g = new y8z(5);

    /* JADX INFO: renamed from: h */
    public static final y8z f270445h = new y8z(6);

    /* JADX INFO: renamed from: i */
    public static final y8z f270446i = new y8z(7);

    /* JADX INFO: renamed from: t */
    public static final y8z f270447t = new y8z(8);

    /* JADX INFO: renamed from: X */
    public static final y8z f270430X = new y8z(9);

    /* JADX INFO: renamed from: Y */
    public static final y8z f270432Y = new y8z(10);

    /* JADX INFO: renamed from: Z */
    public static final y8z f270434Z = new y8z(11);

    /* JADX INFO: renamed from: L0 */
    public static final y8z f270418L0 = new y8z(12);

    /* JADX INFO: renamed from: M0 */
    public static final y8z f270419M0 = new y8z(13);

    /* JADX INFO: renamed from: N0 */
    public static final y8z f270420N0 = new y8z(14);

    /* JADX INFO: renamed from: O0 */
    public static final y8z f270421O0 = new y8z(15);

    /* JADX INFO: renamed from: P0 */
    public static final y8z f270422P0 = new y8z(16);

    /* JADX INFO: renamed from: Q0 */
    public static final y8z f270423Q0 = new y8z(17);

    /* JADX INFO: renamed from: R0 */
    public static final y8z f270424R0 = new y8z(18);

    /* JADX INFO: renamed from: S0 */
    public static final y8z f270425S0 = new y8z(19);

    /* JADX INFO: renamed from: T0 */
    public static final y8z f270426T0 = new y8z(20);

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ y8z f270427U0 = new y8z(21);

    /* JADX INFO: renamed from: V0 */
    public static final y8z f270428V0 = new y8z(22);

    /* JADX INFO: renamed from: W0 */
    public static final y8z f270429W0 = new y8z(23);

    /* JADX INFO: renamed from: X0 */
    public static final y8z f270431X0 = new y8z(24);

    /* JADX INFO: renamed from: Y0 */
    public static final y8z f270433Y0 = new y8z(25);

    /* JADX INFO: renamed from: Z0 */
    public static final y8z f270435Z0 = new y8z(26);

    /* JADX INFO: renamed from: a1 */
    public static final y8z f270436a1 = new y8z(27);

    /* JADX INFO: renamed from: b1 */
    public static final y8z f270438b1 = new y8z(28);

    /* JADX INFO: renamed from: c1 */
    public static final y8z f270440c1 = new y8z(29);

    public /* synthetic */ y8z(int i) {
        this.f270448a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String strConcat;
        switch (this.f270448a) {
            case 2:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Assisted Curation Genres Loader: failed to load genres: %s", th.getMessage());
                return new w410();
            case 3:
                return ((lcf) obj) instanceof icf ? u4m.f226774a : new t4m(3);
            case 4:
                return ((e301) obj).f55571a;
            case 5:
                return Single.just(new m291(lau.f131415a));
            case 6:
            case 8:
            case 12:
            case 13:
            case 15:
            case 16:
            case 18:
            case 21:
            case 22:
            case 23:
            case 27:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsPrefs$PrefValues.m19514q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 7:
                return IconCompat.m389c((Bitmap) obj);
            case 9:
                Boolean bool = ((OccupancyChannelEvent) obj).f5233b.f5231e;
                return new xv90(bool != null ? bool.booleanValue() : false);
            case 10:
                return ((e301) obj).f55572b ? ira0.f104935a : ira0.f104936b;
            case 11:
                return new r7b0((gcp0) obj);
            case 14:
                return Boolean.valueOf(e72.m37981O((ContextTrack) obj));
            case 17:
                ke20 ke20Var = (ke20) obj;
                String str = ke20Var.f121779a;
                gak0 gak0Var = ke20Var.f121780b;
                return new me20(str, gak0Var.f78064a, gak0Var.f78065b, gak0Var.f78066c);
            case 19:
                ae50 ae50VarM16102o = ((EsOffline$ContextsProgressResponse) obj).m16102o();
                int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM16102o, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : ae50VarM16102o) {
                    linkedHashMap.put(((EsOffline$ContextProgress) obj2).getUri(), obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), ((EsOffline$ContextProgress) entry.getValue()).m16099n());
                }
                return linkedHashMap2;
            case 20:
                EsOffline$DevicesWithContextResponse esOffline$DevicesWithContextResponse = (EsOffline$DevicesWithContextResponse) obj;
                if (esOffline$DevicesWithContextResponse.m16118o() > 0) {
                    return new ggr(new RuntimeException(String.valueOf(esOffline$DevicesWithContextResponse.m16118o())));
                }
                ae50<EsOffline$DevicesWithContextResponse.DeviceWithContext> ae50VarM16117n = esOffline$DevicesWithContextResponse.m16117n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16117n, 10));
                for (EsOffline$DevicesWithContextResponse.DeviceWithContext deviceWithContext : ae50VarM16117n) {
                    boolean zM16121p = deviceWithContext.m16121p();
                    boolean zM16090o = deviceWithContext.m16120o().m16105o().m16090o();
                    f5r f5rVarM80979a = tjc0.m80979a(deviceWithContext.m16120o());
                    a1x0 a1x0VarM80981c = tjc0.m80981c(deviceWithContext.m16119n());
                    boolean zM16107r = deviceWithContext.m16120o().m16107r();
                    boolean isLocal = deviceWithContext.m16120o().getIsLocal();
                    Timestamp timestampM16106q = deviceWithContext.m16120o().m16106q();
                    arrayList.add(new fgr(zM16121p, zM16090o, f5rVarM80979a, a1x0VarM80981c, zM16107r, isLocal, (timestampM16106q.m1969s() * ((long) 1000)) + ((long) (timestampM16106q.m1968r() / 1000000))));
                }
                return new hgr(arrayList);
            case 24:
                return (ContextTrack) ((PlayerState) obj).track().mo49278b();
            case 25:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().mo49283h();
                int iIntValue = -7829368;
                if (contextTrack != null) {
                    String strM37971E = e72.m37971E(contextTrack);
                    Integer numValueOf = null;
                    if (strM37971E != null) {
                        String strM88469S0 = wl51.m88469S0(strM37971E, "#");
                        if (wl51.m88460J0(strM88469S0)) {
                            strM88469S0 = null;
                        }
                        if (strM88469S0 != null && (strConcat = wl51.m88500x0(6, strM88469S0).concat(wl51.m88489m1(6, strM88469S0))) != null) {
                            try {
                                numValueOf = Integer.valueOf(Color.parseColor("#".concat(strConcat)));
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                return Observable.just(new j820(iIntValue));
            case 26:
                return (Long) ((xul0) obj).mo49280e(0L);
            case 28:
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj3 : ((fxx) obj).f74479a) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    axx axxVar = (axx) obj3;
                    if (i >= 10 || !(axxVar.f21017E == 1 || i == 0)) {
                        return new fxx(arrayList2, null, null, null);
                    }
                    arrayList2.add(axxVar);
                    i = i2;
                }
                return new fxx(arrayList2, null, null, null);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new tup0(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f270448a) {
            case 1:
                return ((o2x0) obj).f161171a.f149852O0;
            case 12:
                return mkg1.m62160v((e301) obj);
            case 18:
                yke0 yke0Var = (yke0) obj;
                return (yke0Var instanceof wke0) || (yke0Var instanceof rke0);
            default:
                pqm0 pqm0Var = (pqm0) obj;
                return ((xul0) pqm0Var.f180350a).mo49279c() || ((xul0) pqm0Var.f180351b).mo49279c();
        }
    }

    public String toString() {
        switch (this.f270448a) {
            case 16:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // p204p.zlc0
    /* JADX INFO: renamed from: t0 */
    public void mo93135t0(String str) {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((ContextTrack) obj, (am81) obj2);
    }
}
