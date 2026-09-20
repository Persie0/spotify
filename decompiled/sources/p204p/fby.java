package p204p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.offline_esperanto.proto.EsOffline$BulkRedownloadCancelResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class fby implements Function, ix20, t3b1, BiFunction, tn61, Predicate, pke0, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67948a;

    /* JADX INFO: renamed from: b */
    public static final fby f67938b = new fby(0);

    /* JADX INFO: renamed from: c */
    public static final fby f67940c = new fby(1);

    /* JADX INFO: renamed from: d */
    public static final fby f67941d = new fby(2);

    /* JADX INFO: renamed from: e */
    public static final fby f67942e = new fby(3);

    /* JADX INFO: renamed from: f */
    public static final fby f67943f = new fby(4);

    /* JADX INFO: renamed from: g */
    public static final fby f67944g = new fby(5);

    /* JADX INFO: renamed from: h */
    public static final fby f67945h = new fby(6);

    /* JADX INFO: renamed from: i */
    public static final fby f67946i = new fby(7);

    /* JADX INFO: renamed from: t */
    public static final fby f67947t = new fby(8);

    /* JADX INFO: renamed from: X */
    public static final fby f67931X = new fby(9);

    /* JADX INFO: renamed from: Y */
    public static final fby f67933Y = new fby(11);

    /* JADX INFO: renamed from: Z */
    public static final fby f67935Z = new fby(12);

    /* JADX INFO: renamed from: L0 */
    public static final fby f67919L0 = new fby(13);

    /* JADX INFO: renamed from: M0 */
    public static final fby f67920M0 = new fby(14);

    /* JADX INFO: renamed from: N0 */
    public static final fby f67921N0 = new fby(15);

    /* JADX INFO: renamed from: O0 */
    public static final fby f67922O0 = new fby(16);

    /* JADX INFO: renamed from: P0 */
    public static final fby f67923P0 = new fby(17);

    /* JADX INFO: renamed from: Q0 */
    public static final fby f67924Q0 = new fby(18);

    /* JADX INFO: renamed from: R0 */
    public static final fby f67925R0 = new fby(19);

    /* JADX INFO: renamed from: S0 */
    public static final fby f67926S0 = new fby(20);

    /* JADX INFO: renamed from: T0 */
    public static final fby f67927T0 = new fby(21);

    /* JADX INFO: renamed from: U0 */
    public static final fby f67928U0 = new fby(22);

    /* JADX INFO: renamed from: V0 */
    public static final fby f67929V0 = new fby(23);

    /* JADX INFO: renamed from: W0 */
    public static final fby f67930W0 = new fby(24);

    /* JADX INFO: renamed from: X0 */
    public static final fby f67932X0 = new fby(25);

    /* JADX INFO: renamed from: Y0 */
    public static final fby f67934Y0 = new fby(26);

    /* JADX INFO: renamed from: Z0 */
    public static final fby f67936Z0 = new fby(27);

    /* JADX INFO: renamed from: a1 */
    public static final fby f67937a1 = new fby(28);

    /* JADX INFO: renamed from: b1 */
    public static final fby f67939b1 = new fby(29);

    public /* synthetic */ fby(int i) {
        this.f67948a = i;
    }

    /* JADX INFO: renamed from: a */
    public static j3a0 m41266a(Object obj) {
        return new j3a0(obj);
    }

    /* JADX INFO: renamed from: b */
    public static m3a0 m41267b(Object obj) {
        return new m3a0(obj);
    }

    /* JADX INFO: renamed from: g */
    public static t3a0 m41271g(Throwable th) {
        return new t3a0(th);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f67948a) {
            case 8:
                ga80 ga80Var = (ga80) obj2;
                return kkc0.m56701n0((Map) obj, new pqm0(ga80Var.f78000a, ga80Var.f78001b));
            case 17:
                return new n3k0(((Boolean) obj2).booleanValue());
            case 18:
                return new pqm0((PlayerState) obj, (Map) obj2);
            default:
                return new fdp0((String) obj, (int) ((Long) obj2).longValue());
        }
    }

    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public Object mo41272f(yl60 yl60Var, float f) {
        return Integer.valueOf(Math.round(mm60.m62271d(yl60Var) * f));
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        switch (this.f67948a) {
            case 24:
                return new rso0(mec0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("playlist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str3.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new jup0(str3, mec0Var, str2, str);
                }
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((PlayerState) obj).track().mo49279c();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f67948a) {
            case 0:
                return Boolean.valueOf(((zjr0) obj).f283527a);
            case 1:
                return Boolean.valueOf(((YourLibraryResponse) obj).m98196n().size() == 0);
            case 2:
                pqm0 pqm0Var = (pqm0) obj;
                return new g6k0((String) pqm0Var.f180350a, (String) pqm0Var.f180351b);
            case 3:
                if (((Throwable) obj) instanceof KidsGraduationException.GraduationGeoIpMismatchException) {
                    return new bxw(2);
                }
                return new bxw(1);
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 24:
            default:
                return new s7q0((ClientPollResponse) obj);
            case 6:
                return Boolean.valueOf(!((g0j) obj).f75383c);
            case 7:
                return Boolean.valueOf(((e301) obj).f55572b);
            case 11:
                Boolean bool = (Boolean) ((gv31) obj).f84602a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 13:
                return ((gnc0) obj).f82685b;
            case 15:
                return (x6x0) ((pqm0) obj).f180351b;
            case 16:
                return ((e301) obj).f55571a;
            case 19:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline$BulkRedownloadCancelResponse.m16078n(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.BulkRedownloadCancelResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 20:
                return new a1l0(((r1l0) obj).f194884a);
            case 21:
                return (ObservableSource) ((eyl0) obj).m40321a(iel0.f101444V0, iel0.f101445W0);
            case 22:
                return ((PlayerState) obj).playbackId();
            case 23:
                return ((fxx) obj).f74479a;
            case 25:
                return Boolean.valueOf(((PlayerState) obj).isPlaying());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m41268c() {
    }

    /* JADX INFO: renamed from: d */
    public static void m41269d() {
    }

    /* JADX INFO: renamed from: e */
    public static void m41270e() {
    }
}
