package p204p;

import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class mly implements BiFunction, Function, vja1, Init, ehz, yh00, Predicate, iuk, Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144976a;

    /* JADX INFO: renamed from: b */
    public static final mly f144965b = new mly(0);

    /* JADX INFO: renamed from: c */
    public static final mly f144967c = new mly(1);

    /* JADX INFO: renamed from: d */
    public static final mly f144969d = new mly(2);

    /* JADX INFO: renamed from: e */
    public static final mly f144970e = new mly(3);

    /* JADX INFO: renamed from: f */
    public static final mly f144971f = new mly(4);

    /* JADX INFO: renamed from: g */
    public static final mly f144972g = new mly(5);

    /* JADX INFO: renamed from: h */
    public static final mly f144973h = new mly(6);

    /* JADX INFO: renamed from: i */
    public static final mly f144974i = new mly(7);

    /* JADX INFO: renamed from: t */
    public static final mly f144975t = new mly(8);

    /* JADX INFO: renamed from: X */
    public static final mly f144958X = new mly(9);

    /* JADX INFO: renamed from: Y */
    public static final mly f144960Y = new mly(10);

    /* JADX INFO: renamed from: Z */
    public static final mly f144962Z = new mly(11);

    /* JADX INFO: renamed from: L0 */
    public static final mly f144946L0 = new mly(12);

    /* JADX INFO: renamed from: M0 */
    public static final mly f144947M0 = new mly(13);

    /* JADX INFO: renamed from: N0 */
    public static final mly f144948N0 = new mly(14);

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ mly f144949O0 = new mly(15);

    /* JADX INFO: renamed from: P0 */
    public static final mly f144950P0 = new mly(16);

    /* JADX INFO: renamed from: Q0 */
    public static final mly f144951Q0 = new mly(17);

    /* JADX INFO: renamed from: R0 */
    public static final mly f144952R0 = new mly(18);

    /* JADX INFO: renamed from: S0 */
    public static final mly f144953S0 = new mly(19);

    /* JADX INFO: renamed from: T0 */
    public static final mly f144954T0 = new mly(20);

    /* JADX INFO: renamed from: U0 */
    public static final mly f144955U0 = new mly(21);

    /* JADX INFO: renamed from: V0 */
    public static final mly f144956V0 = new mly(22);

    /* JADX INFO: renamed from: W0 */
    public static final mly f144957W0 = new mly(23);

    /* JADX INFO: renamed from: X0 */
    public static final mly f144959X0 = new mly(24);

    /* JADX INFO: renamed from: Y0 */
    public static final mly f144961Y0 = new mly(25);

    /* JADX INFO: renamed from: Z0 */
    public static final mly f144963Z0 = new mly(26);

    /* JADX INFO: renamed from: a1 */
    public static final mly f144964a1 = new mly(27);

    /* JADX INFO: renamed from: b1 */
    public static final mly f144966b1 = new mly(28);

    /* JADX INFO: renamed from: c1 */
    public static final mly f144968c1 = new mly(29);

    public /* synthetic */ mly(int i) {
        this.f144976a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((Long) obj, (Boolean) obj2, (Map) obj3);
    }

    @Override // p204p.ehz
    /* JADX INFO: renamed from: a */
    public gd70 mo39049a(j1t0 j1t0Var, String str, jd21 jd21Var, jd21 jd21Var2) {
        if (str.equals("kotlin.jvm.PlatformType")) {
            return j1t0Var.m82141j(fp60.f71752f) ? new tbu0(jd21Var, jd21Var2, 0) : pug1.m71080k(jd21Var, jd21Var2);
        }
        return ehw.m39006b(chw.ERROR_FLEXIBLE_TYPE, str, jd21Var.toString(), jd21Var2.toString());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f144976a) {
            case 0:
                return new v1k(true, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, false, false, ((Boolean) obj2).booleanValue(), false, false, 61350);
            case 7:
                return g6f.m43700N0((List) obj2, (List) obj);
            case 16:
                return new pqm0((api) obj, (xul0) obj2);
            default:
                return new pqm0((List) obj, ((fxx) obj2).f74479a);
        }
    }

    /* JADX INFO: renamed from: b */
    public g3h1 m62247b(r300 r300Var) {
        String str = r300Var.f195387p;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new qb5(i2);
                case "application/x-icy":
                    return new nz30();
                case "application/id3":
                    return new rz30(null);
                case "application/x-emsg":
                    return new qb5(i);
                case "application/x-scte35":
                    return new e641();
            }
        }
        throw new IllegalArgumentException(edb.m38564m("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX INFO: renamed from: c */
    public boolean m62248c(r300 r300Var) {
        String str = r300Var.f195387p;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((hv10) obj);
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        switch (this.f144976a) {
            case 2:
                return new xw00(mec0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("user_name");
                if (str4 != null && (str3 = (String) linkedHashMap.get("playlist_id")) != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str3.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new jvp0(str4, str3, mec0Var, str2, str);
                }
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f144976a) {
            case 12:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
            default:
                return ((xul0) obj).mo49279c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f144976a) {
            case 1:
                return tf3.f219837a;
            case 2:
            case 3:
            case 6:
            case 7:
            case 12:
            case 14:
            case 15:
            case 16:
            case 21:
            case 23:
            case 25:
            default:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 4:
                return new z830(z730.f280085f);
            case 5:
                an50 an50Var = (an50) obj;
                if (an50Var instanceof xm50) {
                    return Single.just(new um50(((xm50) an50Var).f263293a));
                }
                if (an50Var instanceof ym50) {
                    return Single.just(tm50.f221604a);
                }
                if (an50Var instanceof zm50) {
                    return Single.just(new vm50(((zm50) an50Var).f284161a));
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return new ga80(cep0.f37165a, (String) obj);
            case 9:
                return Boolean.valueOf(((jn90) obj).f114050e);
            case 10:
                return (tmm0) ((qam0) obj);
            case 11:
                return new z6b0(((Boolean) obj).booleanValue());
            case 13:
                return new l5d0((Throwable) obj);
            case 17:
                return ((j8k0) obj).f109954c;
            case 18:
                return Boolean.valueOf(((tky0) obj).f221272a > 0);
            case 19:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 20:
                return ((EsOffline$TotalProgressResponse) obj).m16212o();
            case 22:
                ekt ektVar = (ekt) obj;
                return new g1x(ektVar.f60532b, ektVar.f60533c);
            case 24:
                return ((thj) obj).f220443a;
            case 26:
                return kkc0.m56706s0(((PlayerState) obj).contextMetadata());
            case 27:
                return lau.f131415a;
        }
    }
}
