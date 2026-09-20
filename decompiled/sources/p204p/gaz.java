package p204p;

import android.net.Uri;
import androidx.work.OverwritingInputMerger;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$Context;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.ContextTrack;
import com.spotify.profile.profile.proto.ProfilelistResponse$SmallProfileList;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class gaz implements rwf, Function, Predicate, Init, hwf, a250, cco0, BiPredicate, BiFunction, vja1 {

    /* JADX INFO: renamed from: L0 */
    public static final gaz f78125L0;

    /* JADX INFO: renamed from: M0 */
    public static final gaz f78126M0;

    /* JADX INFO: renamed from: N0 */
    public static final gaz f78127N0;

    /* JADX INFO: renamed from: O0 */
    public static final gaz f78128O0;

    /* JADX INFO: renamed from: P0 */
    public static final gaz f78129P0;

    /* JADX INFO: renamed from: Q0 */
    public static final gaz f78130Q0;

    /* JADX INFO: renamed from: R0 */
    public static final gaz f78131R0;

    /* JADX INFO: renamed from: S0 */
    public static final gaz f78132S0;

    /* JADX INFO: renamed from: T0 */
    public static final gaz f78133T0;

    /* JADX INFO: renamed from: U0 */
    public static final gaz f78134U0;

    /* JADX INFO: renamed from: V0 */
    public static final gaz f78135V0;

    /* JADX INFO: renamed from: W0 */
    public static final gaz f78136W0;

    /* JADX INFO: renamed from: X */
    public static final gaz f78137X;

    /* JADX INFO: renamed from: X0 */
    public static final gaz f78138X0;

    /* JADX INFO: renamed from: Y */
    public static final Object f78139Y = new Object();

    /* JADX INFO: renamed from: Y0 */
    public static final gaz f78140Y0;

    /* JADX INFO: renamed from: Z */
    public static volatile gaz f78141Z;

    /* JADX INFO: renamed from: Z0 */
    public static final gaz f78142Z0;

    /* JADX INFO: renamed from: a1 */
    public static final gaz f78143a1;

    /* JADX INFO: renamed from: b */
    public static final gaz f78144b;

    /* JADX INFO: renamed from: b1 */
    public static final gaz f78145b1;

    /* JADX INFO: renamed from: c */
    public static final gaz f78146c;

    /* JADX INFO: renamed from: c1 */
    public static final gaz f78147c1;

    /* JADX INFO: renamed from: d */
    public static final gaz f78148d;

    /* JADX INFO: renamed from: e */
    public static final gaz f78149e;

    /* JADX INFO: renamed from: f */
    public static final gaz f78150f;

    /* JADX INFO: renamed from: g */
    public static final gaz f78151g;

    /* JADX INFO: renamed from: h */
    public static final gaz f78152h;

    /* JADX INFO: renamed from: i */
    public static final gaz f78153i;

    /* JADX INFO: renamed from: t */
    public static final gaz f78154t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78155a;

    static {
        byte b = 0;
        f78144b = new gaz(0, b);
        f78146c = new gaz(1, b);
        f78148d = new gaz(2, b);
        f78149e = new gaz(3, b);
        f78150f = new gaz(4, b);
        f78151g = new gaz(5, b);
        f78152h = new gaz(6, b);
        f78153i = new gaz(7, b);
        f78154t = new gaz(8, b);
        f78137X = new gaz(9, b);
        f78125L0 = new gaz(11, b);
        f78126M0 = new gaz(12, b);
        f78127N0 = new gaz(14, b);
        f78128O0 = new gaz(15, b);
        f78129P0 = new gaz(16, b);
        f78130Q0 = new gaz(17, b);
        f78131R0 = new gaz(18, b);
        f78132S0 = new gaz(19, b);
        f78133T0 = new gaz(20, b);
        f78134U0 = new gaz(21, b);
        f78135V0 = new gaz(22, b);
        f78136W0 = new gaz(23, b);
        f78138X0 = new gaz(24, b);
        f78140Y0 = new gaz(25, b);
        f78142Z0 = new gaz(26, b);
        f78143a1 = new gaz(27, b);
        f78145b1 = new gaz(28, b);
        f78147c1 = new gaz(29, b);
    }

    public /* synthetic */ gaz(int i, byte b) {
        this.f78155a = i;
    }

    /* JADX INFO: renamed from: a */
    public static OverwritingInputMerger m44189a(String str) {
        int i = dw40.f53601a;
        try {
            return (OverwritingInputMerger) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            m44190b().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static gaz m44190b() {
        gaz gazVar;
        synchronized (f78139Y) {
            try {
                if (f78141Z == null) {
                    f78141Z = new gaz(10, (byte) 0);
                }
                gazVar = f78141Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gazVar;
    }

    /* JADX INFO: renamed from: c */
    public static Set m44191c(boolean z, boolean z2) {
        return s601.m77312o0(new fww0(f5r0.class), new eww0(erc1.class), new fww0(v140.class), new fww0(x430.class), z2 ? new fww0(thj.class) : null, z ? new eww0(p9c1.class) : null, null);
    }

    /* JADX INFO: renamed from: d */
    public static Set m44192d() {
        return bk5.m29624m1(new gww0[]{new eww0(ok11.class), new eww0(erc1.class), new fww0(f5r0.class)});
    }

    /* JADX INFO: renamed from: f */
    public static void m44193f(gaz gazVar) {
        synchronized (f78139Y) {
            try {
                if (f78141Z == null) {
                    f78141Z = gazVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m44194g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        biq0 biq0Var;
        switch (this.f78155a) {
            case 1:
                ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList = (ProfilelistResponse$SmallProfileList) ((o2x0) obj).f161172b;
                return profilelistResponse$SmallProfileList == null ? ProfilelistResponse$SmallProfileList.m19806n() : profilelistResponse$SmallProfileList;
            case 2:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Assisted Curation Genres Loader: failed to parse genres: %s", th.getMessage());
                return lau.f131415a;
            case 3:
                return ((lcf) obj) instanceof icf ? u4m.f226774a : new t4m(3);
            case 4:
            case 6:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 21:
            case 23:
            case 24:
            case 26:
            case 27:
            default:
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                int i = 0;
                while (true) {
                    biq0Var = null;
                    if (i < length) {
                        Object obj2 = objArr[i];
                        biq0Var = obj2 instanceof biq0 ? (biq0) obj2 : null;
                        if (biq0Var == null) {
                            i++;
                        }
                    }
                }
                return biq0Var != null ? biq0Var : aiq0.f16080a;
            case 5:
                List list = (List) obj;
                int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : list) {
                    linkedHashMap.put(((gmr0) obj3).f81450a, obj3);
                }
                return linkedHashMap;
            case 7:
                return ((Uri) obj).toString();
            case 8:
                return Boolean.valueOf(((pe01) obj).f176598o);
            case 9:
                return Boolean.valueOf(((dz90) obj).f54589f == 2);
            case 11:
                return new k7b0(((Boolean) obj).booleanValue());
            case 14:
                return e72.m38002e0((ContextTrack) obj);
            case 17:
                return bk5.m29620k1((Object[]) obj);
            case 18:
                yke0 yke0Var = (yke0) obj;
                return yke0Var instanceof wke0 ? new xt2((wke0) yke0Var) : new wt2((rke0) yke0Var);
            case 19:
                ae50 ae50VarM16145p = ((EsOffline$GetContextsResponse) obj).m16145p();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16145p, 10));
                Iterator<E> it = ae50VarM16145p.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EsOffline$ContextInfo) it.next()).m16096o());
                }
                int iM31820L2 = c95.m31820L(i6f.m49804T(arrayList, 10));
                if (iM31820L2 < 16) {
                    iM31820L2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2);
                for (Object obj4 : arrayList) {
                    linkedHashMap2.put(((EsOffline$Context) obj4).getUri(), obj4);
                }
                return linkedHashMap2;
            case 20:
                byte[] bArr = (byte[]) obj;
                try {
                    return ResponseStatus.m16224p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.on_demand_set.proto.ResponseStatus: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 22:
                return new hzq0((Long) obj);
            case 25:
                return new nfv0((qro0) obj);
            case 28:
                return new typ0((List) obj);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((wsb0) obj);
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return z2h1.m95213t((Executor) sef0Var.mo54440d(new eht0(ok8.class, Executor.class)));
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str3.charAt(i);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new rup0(str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f78155a) {
            case 4:
                return ((String) obj).length() > 0;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public gaz(int i) {
        this.f78155a = 10;
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        ContextTrack contextTrack = (ContextTrack) obj;
        ContextTrack contextTrack2 = (ContextTrack) obj2;
        wj50.m88279p(contextTrack);
        String strM38002e0 = e72.m38002e0(contextTrack);
        wj50.m88279p(contextTrack2);
        return strM38002e0.equals(e72.m38002e0(contextTrack2));
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new am81(((Number) obj).longValue(), ((Number) obj2).longValue());
    }
}
