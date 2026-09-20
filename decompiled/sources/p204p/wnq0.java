package p204p;

import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class wnq0 implements Function, yh00, Function3, Predicate, a250, ega, BiFunction, Init {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253264a;

    /* JADX INFO: renamed from: b */
    public static final wnq0 f253254b = new wnq0(0);

    /* JADX INFO: renamed from: c */
    public static final wnq0 f253256c = new wnq0(1);

    /* JADX INFO: renamed from: d */
    public static final wnq0 f253257d = new wnq0(2);

    /* JADX INFO: renamed from: e */
    public static final wnq0 f253258e = new wnq0(3);

    /* JADX INFO: renamed from: f */
    public static final wnq0 f253259f = new wnq0(4);

    /* JADX INFO: renamed from: g */
    public static final wnq0 f253260g = new wnq0(5);

    /* JADX INFO: renamed from: h */
    public static final wnq0 f253261h = new wnq0(6);

    /* JADX INFO: renamed from: i */
    public static final wnq0 f253262i = new wnq0(7);

    /* JADX INFO: renamed from: t */
    public static final wnq0 f253263t = new wnq0(8);

    /* JADX INFO: renamed from: X */
    public static final wnq0 f253247X = new wnq0(9);

    /* JADX INFO: renamed from: Y */
    public static final wnq0 f253249Y = new wnq0(10);

    /* JADX INFO: renamed from: Z */
    public static final wnq0 f253251Z = new wnq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final wnq0 f253235L0 = new wnq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final wnq0 f253236M0 = new wnq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final wnq0 f253237N0 = new wnq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final wnq0 f253238O0 = new wnq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final wnq0 f253239P0 = new wnq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final wnq0 f253240Q0 = new wnq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final wnq0 f253241R0 = new wnq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final gx31 f253242S0 = new gx31(12);

    /* JADX INFO: renamed from: T0 */
    public static final wnq0 f253243T0 = new wnq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final wnq0 f253244U0 = new wnq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final wnq0 f253245V0 = new wnq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final wnq0 f253246W0 = new wnq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final wnq0 f253248X0 = new wnq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final wnq0 f253250Y0 = new wnq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final wnq0 f253252Z0 = new wnq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final wnq0 f253253a1 = new wnq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final wnq0 f253255b1 = new wnq0(28);

    public /* synthetic */ wnq0(int i) {
        this.f253264a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final kcf m88611b(String str) {
        return new kcf(2, str != null ? dq60.m36606f("com.spotify.music.extra.ERROR", str) : null);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((String) obj, (hg40) obj2, (am81) obj3);
    }

    @Override // p204p.ega
    /* JADX INFO: renamed from: a */
    public long mo38839a(int i, gx8 gx8Var) {
        String str = ((db71) gx8Var.f85221e).f47230a.f36033a.f107641b;
        return dvg1.m37112n(fbg1.m41241i(i, str), fbg1.m41240h(i, str));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f253264a) {
            case 0:
                return new eoq0((fpq0) obj);
            case 1:
                gmr0 gmr0Var = (gmr0) obj;
                String str = gmr0Var.f81451b;
                String str2 = gmr0Var.f81455f;
                if (str2 == null) {
                    str2 = "";
                }
                return new hsr0(str, str2, gmr0Var.f81461l);
            case 2:
                mks0 mks0Var = (mks0) obj;
                return new pqm0(Boolean.valueOf(mks0Var.f144672e), mks0Var.f144673f);
            case 3:
                lcf lcfVar = (lcf) obj;
                return lcfVar instanceof hcf ? new sot0(((hcf) lcfVar).f89783a) : tot0.f222319a;
            case 4:
                e291 e291Var = (e291) obj;
                return new u290(e291Var.f55398c, e291Var.f55400e, e291Var.f55410o, e291Var.f55399d);
            case 5:
                return ((List) obj).isEmpty() ? Observable.timer(500L, TimeUnit.MILLISECONDS) : Observable.empty();
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
            case 17:
            case 19:
            case 20:
            case 22:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return IsCuratedResponse.m98128r(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.IsCuratedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 9:
                return z5d1.f279546a;
            case 11:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 12:
                Boolean bool = (Boolean) ((gv31) obj).f84602a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 13:
                return new p521((oz00) obj);
            case 15:
                return Boolean.valueOf(dxf1.m37222K((Map) obj));
            case 16:
                return new wz21((jf31) obj);
            case 18:
                return new kf51((hdn0) obj);
            case 21:
                return ((Boolean) obj).booleanValue() ? y191.f268206a : x191.f257108a;
            case 23:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 24:
                return new gxc1(((Boolean) obj).booleanValue() ? 1 : 2);
            case 25:
                return C2244p5.f174033a;
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((dxa1) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f253264a) {
            case 7:
                Boolean bool = (Boolean) ((pqm0) obj).f180351b;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            default:
                return !cks.m33193l(((cks) obj).f39083a);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f253264a) {
            case 17:
                return new pqm0((List) obj, Boolean.valueOf(!((u341) obj2).equals(t341.f216707a)));
            default:
                return new pqm0((PlayerState) obj, (Boolean) obj2);
        }
    }
}
