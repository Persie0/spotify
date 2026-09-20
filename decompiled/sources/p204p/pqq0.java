package p204p;

import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$DetectResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;
import spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class pqq0 implements Function, Predicate, Init, BiPredicate, vg31, Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180395a;

    /* JADX INFO: renamed from: b */
    public static final pqq0 f180385b = new pqq0(0);

    /* JADX INFO: renamed from: c */
    public static final pqq0 f180387c = new pqq0(1);

    /* JADX INFO: renamed from: d */
    public static final pqq0 f180388d = new pqq0(2);

    /* JADX INFO: renamed from: e */
    public static final pqq0 f180389e = new pqq0(3);

    /* JADX INFO: renamed from: f */
    public static final pqq0 f180390f = new pqq0(4);

    /* JADX INFO: renamed from: g */
    public static final pqq0 f180391g = new pqq0(5);

    /* JADX INFO: renamed from: h */
    public static final pqq0 f180392h = new pqq0(6);

    /* JADX INFO: renamed from: i */
    public static final pqq0 f180393i = new pqq0(7);

    /* JADX INFO: renamed from: t */
    public static final pqq0 f180394t = new pqq0(8);

    /* JADX INFO: renamed from: X */
    public static final pqq0 f180378X = new pqq0(9);

    /* JADX INFO: renamed from: Y */
    public static final pqq0 f180380Y = new pqq0(10);

    /* JADX INFO: renamed from: Z */
    public static final pqq0 f180382Z = new pqq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final pqq0 f180366L0 = new pqq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final pqq0 f180367M0 = new pqq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final pqq0 f180368N0 = new pqq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final pqq0 f180369O0 = new pqq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final pqq0 f180370P0 = new pqq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final pqq0 f180371Q0 = new pqq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final pqq0 f180372R0 = new pqq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final pqq0 f180373S0 = new pqq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final pqq0 f180374T0 = new pqq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final pqq0 f180375U0 = new pqq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final pqq0 f180376V0 = new pqq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final pqq0 f180377W0 = new pqq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final pqq0 f180379X0 = new pqq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final pqq0 f180381Y0 = new pqq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final pqq0 f180383Z0 = new pqq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final pqq0 f180384a1 = new pqq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final pqq0 f180386b1 = new pqq0(28);

    public /* synthetic */ pqq0(int i) {
        this.f180395a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((String) obj, (Integer) obj2, (Boolean) obj3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d4 A[PHI: r0
      0x00d4: PHI (r0v21 int) = (r0v20 int), (r0v22 int), (r0v23 int) binds: [B:13:0x00c7, B:17:0x00cd, B:20:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f180395a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return osr0.f168868a;
            case 2:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
            case 23:
            case 24:
            default:
                AdDetectionOuterClass$DetectResponse adDetectionOuterClass$DetectResponse = (AdDetectionOuterClass$DetectResponse) obj;
                ae50<AdDetectionOuterClass$DetectResponse.Range> ae50VarM2268n = adDetectionOuterClass$DetectResponse.m2268n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM2268n, 10));
                for (AdDetectionOuterClass$DetectResponse.Range range : ae50VarM2268n) {
                    arrayList.add(new sl0(range.m2283t(), range.m2279p(), range.m2277n(), range.m2282s(), range.m2278o(), fm0.m42039d(range.m2280q()), new rl0(range.m2281r().m2276n())));
                }
                ae50<AdDetectionOuterClass$DetectResponse.Range> ae50VarM2269o = adDetectionOuterClass$DetectResponse.m2269o();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM2269o, 10));
                for (AdDetectionOuterClass$DetectResponse.Range range2 : ae50VarM2269o) {
                    arrayList2.add(new sl0(range2.m2283t(), range2.m2279p(), range2.m2277n(), range2.m2282s(), range2.m2278o(), fm0.m42039d(range2.m2280q()), new rl0(range2.m2281r().m2276n())));
                }
                int iM2273s = adDetectionOuterClass$DetectResponse.m2273s();
                int iM2271q = adDetectionOuterClass$DetectResponse.m2271q();
                int iM2274t = adDetectionOuterClass$DetectResponse.m2274t();
                int iM42039d = fm0.m42039d(adDetectionOuterClass$DetectResponse.m2270p());
                int iOrdinal = adDetectionOuterClass$DetectResponse.m2272r().ordinal();
                int i2 = 2;
                if (iOrdinal != 1) {
                    i = 3;
                    if (iOrdinal != 2) {
                        i2 = 4;
                        if (iOrdinal == 3) {
                            i = i2;
                        } else if (iOrdinal != 4) {
                            i = 1;
                        } else {
                            i2 = 5;
                            i = i2;
                        }
                    }
                } else {
                    i = i2;
                }
                return new tl0(arrayList, arrayList2, iM2273s, iM2271q, iM2274t, iM42039d, i);
            case 3:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new qpt0(message);
            case 4:
                if (obj == null) {
                    return w191.f247034a;
                }
                throw new ClassCastException();
            case 5:
                return ((e301) obj).f55571a;
            case 6:
                return e72.m38023t((ContextTrack) obj);
            case 7:
                return new nf3((List) obj);
            case 8:
                return (List) obj;
            case 9:
                tzi tziVar = (tzi) obj;
                if (tziVar instanceof szi) {
                    return new hty0(rzi.f204155a);
                }
                if (tziVar instanceof qzi) {
                    return new hty0(new pzi(((qzi) tziVar).f194209a));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                return new ap11(((tl11) obj).f221296a);
            case 13:
                return new u521((j9n0) obj);
            case 18:
                return new qf51((ec51) obj);
            case 19:
                String message2 = ((Throwable) obj).getMessage();
                if (message2 == null) {
                    message2 = "Transport error";
                }
                return new iz71(message2);
            case 20:
                return ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
            case 22:
                na6.m63972t("Error while trying to fetch availability state.", (Throwable) obj);
                Set set = dd41.f47702f;
                return new r1j0(r46.m74726U(xoc1.f263839A0.f243453a));
            case 25:
                return ((Boolean) obj).booleanValue() ? nrd1.VIEW_NOT_READY : nrd1.ALL_CHECKS_CLEAR;
            case 26:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return YourLibraryTagsResponse.m98322p(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f180395a) {
            case 10:
                return First.m15574b((qnz0) obj);
            case 21:
                gb91 gb91Var = (gb91) obj;
                return First.m15575c(gb91Var, wj50.m88271j(gb91Var.f78249h, jb91.f110716a) ? Collections.singleton(pa91.f175454c) : gbu.f78413a);
            default:
                return First.m15575c((g3d1) obj, gbu.f78413a);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        n231 n231Var = (n231) obj;
        n231 n231Var2 = (n231) obj2;
        return wj50.m88271j(n231Var.f149617a, n231Var2.f149617a) && wj50.m88271j(n231Var.f149618b, n231Var2.f149618b) && n231Var.f149620d == n231Var2.f149620d;
    }

    public String toString() {
        switch (this.f180395a) {
            case 14:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }

    public pqq0(fm0 fm0Var) {
        this.f180395a = 29;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f180395a) {
            case 2:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return ((l1m0) obj) == l1m0.f128755a;
        }
    }
}
