package p204p;

import com.google.protobuf.Empty;
import com.spotify.contextmenu.platform.ContextMenuContentLoadException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$MapTimestampResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class crq0 implements Function, Init, Predicate, yh00, BiFunction, vg31, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41371a;

    /* JADX INFO: renamed from: b */
    public static final crq0 f41362b = new crq0(0);

    /* JADX INFO: renamed from: c */
    public static final crq0 f41363c = new crq0(1);

    /* JADX INFO: renamed from: d */
    public static final crq0 f41364d = new crq0(3);

    /* JADX INFO: renamed from: e */
    public static final crq0 f41365e = new crq0(4);

    /* JADX INFO: renamed from: f */
    public static final crq0 f41366f = new crq0(5);

    /* JADX INFO: renamed from: g */
    public static final crq0 f41367g = new crq0(6);

    /* JADX INFO: renamed from: h */
    public static final crq0 f41368h = new crq0(7);

    /* JADX INFO: renamed from: i */
    public static final crq0 f41369i = new crq0(8);

    /* JADX INFO: renamed from: t */
    public static final crq0 f41370t = new crq0(9);

    /* JADX INFO: renamed from: X */
    public static final crq0 f41355X = new crq0(10);

    /* JADX INFO: renamed from: Y */
    public static final crq0 f41357Y = new crq0(11);

    /* JADX INFO: renamed from: Z */
    public static final crq0 f41359Z = new crq0(12);

    /* JADX INFO: renamed from: L0 */
    public static final crq0 f41343L0 = new crq0(13);

    /* JADX INFO: renamed from: M0 */
    public static final crq0 f41344M0 = new crq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final crq0 f41345N0 = new crq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final crq0 f41346O0 = new crq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final crq0 f41347P0 = new crq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final crq0 f41348Q0 = new crq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final crq0 f41349R0 = new crq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final crq0 f41350S0 = new crq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final crq0 f41351T0 = new crq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final crq0 f41352U0 = new crq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final crq0 f41353V0 = new crq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final crq0 f41354W0 = new crq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final crq0 f41356X0 = new crq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final crq0 f41358Y0 = new crq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final crq0 f41360Z0 = new crq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final crq0 f41361a1 = new crq0(28);

    public /* synthetic */ crq0(int i) {
        this.f41371a = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m33744a(s0t0 s0t0Var) {
        int i = s0t0Var == null ? -1 : i2t0.f97920a[s0t0Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 2;
            }
        }
        return 1;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        o231 o231VarM66094a;
        switch (this.f41371a) {
            case 14:
                return new ik21((PlayerState) obj, (am81) obj2);
            case 15:
                o231 o231Var = (o231) obj;
                n231 n231Var = (n231) obj2;
                sko0 sko0VarM78376a = o231Var.f160930b;
                n231 n231Var2 = o231Var.f160929a;
                if (n231Var2 == null || !wj50.m88271j(n231Var2.f149617a, n231Var.f149617a)) {
                    String str = n231Var.f149617a;
                    String str2 = n231Var.f149618b;
                    long j = n231Var.f149619c;
                    sko0 sko0Var = new sko0(j, 0L, n231Var.f149621e, str, str2);
                    if (sko0VarM78376a == null) {
                        sko0VarM78376a = null;
                    } else if (n231Var2 != null && !n231Var2.f149620d) {
                        sko0VarM78376a = sko0.m78376a(sko0VarM78376a, sko0VarM78376a.f210175d + (j - n231Var2.f149619c));
                    }
                    o231VarM66094a = o231.m66094a(o231Var, null, sko0Var, g6f.m43714b1(g6f.m43700N0(o231Var.f160931c, h6f.m46716M(sko0VarM78376a)), 19), 1);
                } else {
                    if (sko0VarM78376a == null) {
                        sko0VarM78376a = null;
                    } else if (!n231Var2.f149620d) {
                        sko0VarM78376a = sko0.m78376a(sko0VarM78376a, sko0VarM78376a.f210175d + (n231Var.f149619c - n231Var2.f149619c));
                    }
                    o231VarM66094a = o231.m66094a(o231Var, null, sko0VarM78376a, null, 5);
                }
                return o231.m66094a(o231VarM66094a, n231Var, null, null, 6);
            default:
                return new l241(((Number) obj).intValue(), (k241) obj2);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f41371a) {
            case 4:
                return First.m15574b((you0) obj);
            default:
                return First.m15575c((g3d1) obj, gbu.f78413a);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !igg1.m50541t(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new dya1(str4, str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f41371a) {
            case 5:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
            case 6:
                return !((List) obj).isEmpty();
            case 23:
                return ((Integer) obj).intValue() == 0;
            case 25:
                return ((Boolean) obj).booleanValue();
            default:
                return !((YourLibraryResponse) obj).m98199q().m98204q();
        }
    }

    public crq0(fm0 fm0Var) {
        this.f41371a = 29;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f41371a) {
            case 0:
                return new szw((mrw) obj);
            case 1:
                return new ssr0((String) obj);
            case 2:
            case 4:
            case 5:
            case 6:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                AdDetectionOuterClass$MapTimestampResponse adDetectionOuterClass$MapTimestampResponse = (AdDetectionOuterClass$MapTimestampResponse) obj;
                if (!adDetectionOuterClass$MapTimestampResponse.m2290o() && adDetectionOuterClass$MapTimestampResponse.m2291p()) {
                    return new fjc0(adDetectionOuterClass$MapTimestampResponse.m2289n().m2263n());
                }
                return gjc0.f80435a;
            case 3:
                return zot0.f284872a;
            case 7:
                return new wve1(((Boolean) obj).booleanValue());
            case 8:
                List list = ((fxx) obj).f74479a;
                return list.size() > 5 ? list.subList(0, 5) : list;
            case 9:
                return new uty0((c5x0) obj);
            case 10:
                qnz0 qnz0Var = (qnz0) obj;
                return new grx0(qnz0Var.f190724e, qnz0Var.f190725f, qnz0Var.f190720a, qnz0Var.f190723d, qnz0Var.f190726g);
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                Throwable contextMenuContentLoadException = (Throwable) obj;
                if (contextMenuContentLoadException instanceof HttpError) {
                    contextMenuContentLoadException = new ContextMenuContentLoadException(contextMenuContentLoadException);
                }
                return Single.error(contextMenuContentLoadException);
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return Observable.just(new t521(new dui0(zBooleanValue)), new d521(zBooleanValue));
            case 18:
                return new rf51((iva1) obj);
            case 19:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport error";
                }
                return new iz71(message);
            case 20:
                return (Completable) obj;
            case 21:
                x791 x791Var = (x791) obj;
                return new za91(x791Var.f258862b, x791Var.f258861a);
        }
    }
}
