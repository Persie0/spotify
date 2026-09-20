package p204p;

import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class hkr0 implements Function, vem0, Init, Producer, nsf0, Predicate, fa31, com.spotify.mobius.functions.Function, mn81, oec1 {

    /* JADX INFO: renamed from: Z0 */
    public static final hkr0 f92491Z0;

    /* JADX INFO: renamed from: a1 */
    public static final hkr0 f92492a1;

    /* JADX INFO: renamed from: b1 */
    public static final hkr0 f92494b1;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92505a;

    /* JADX INFO: renamed from: b */
    public static final hkr0 f92493b = new hkr0(0);

    /* JADX INFO: renamed from: c */
    public static final hkr0 f92495c = new hkr0(1);

    /* JADX INFO: renamed from: d */
    public static final hkr0 f92497d = new hkr0(2);

    /* JADX INFO: renamed from: e */
    public static final hkr0 f92499e = new hkr0(3);

    /* JADX INFO: renamed from: f */
    public static final hkr0 f92500f = new hkr0(4);

    /* JADX INFO: renamed from: g */
    public static final hkr0 f92501g = new hkr0(5);

    /* JADX INFO: renamed from: h */
    public static final hkr0 f92502h = new hkr0(6);

    /* JADX INFO: renamed from: i */
    public static final hkr0 f92503i = new hkr0(7);

    /* JADX INFO: renamed from: t */
    public static final hkr0 f92504t = new hkr0(8);

    /* JADX INFO: renamed from: X */
    public static final hkr0 f92486X = new hkr0(9);

    /* JADX INFO: renamed from: Y */
    public static final hkr0 f92488Y = new hkr0(10);

    /* JADX INFO: renamed from: Z */
    public static final hkr0 f92490Z = new hkr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final hkr0 f92474L0 = new hkr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final hkr0 f92475M0 = new hkr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final hkr0 f92476N0 = new hkr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final hkr0 f92477O0 = new hkr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final hkr0 f92478P0 = new hkr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final hkr0 f92479Q0 = new hkr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final hkr0 f92480R0 = new hkr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final hkr0 f92481S0 = new hkr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final hkr0 f92482T0 = new hkr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final hkr0 f92483U0 = new hkr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final hkr0 f92484V0 = new hkr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final hkr0 f92485W0 = new hkr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final hkr0 f92487X0 = new hkr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final hkr0 f92489Y0 = new hkr0(25);

    /* JADX INFO: renamed from: c1 */
    public static final hkr0 f92496c1 = new hkr0(27);

    /* JADX INFO: renamed from: d1 */
    public static final hkr0 f92498d1 = new hkr0(28);

    static {
        int i = 26;
        f92491Z0 = new hkr0(i);
        f92492a1 = new hkr0(i);
        f92494b1 = new hkr0(i);
    }

    public /* synthetic */ hkr0(int i) {
        this.f92505a = i;
    }

    @Override // p204p.fa31
    /* JADX INFO: renamed from: a */
    public int mo41135a(int i, int i2, int i3, int i4) {
        return ((i / 2) - (i2 / 2)) - i3;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f92505a) {
            case 0:
                boolean zM37244s = dxf1.m37244s("offline", (Map) obj);
                if (zM37244s) {
                    return vql0.f243960a;
                }
                if (zM37244s) {
                    throw new NoWhenBranchMatchedException();
                }
                return wql0.f254055a;
            case 3:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof m2x0) {
                    return new icf();
                }
                if (p2x0Var instanceof k2x0) {
                    return new hcf(((k2x0) p2x0Var).f118699a.mo27977b());
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return new j6y0(false, null, 0.0f);
            case 10:
                na6.m63957e("[Puffin] SetCoreFiltersUseCase failed");
                return Completable.m23286j(new C1889g9(3));
            case 13:
                return new n421((vti0) obj);
            case 15:
                ((iua0) obj).f105898a.f101910s.invoke();
                return new vhx(false, null);
            case 19:
                return ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
            case 21:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    ozw0 ozw0Var = (ozw0) entry.getValue();
                    String str = null;
                    if (ozw0Var instanceof nzw0) {
                        z240 z240VarM60640a = ((nzw0) ozw0Var).f160180a.m60640a(a340.f11861b);
                        if (z240VarM60640a != null) {
                            str = z240VarM60640a.f278475a.f198763a;
                        }
                    } else if (!(ozw0Var instanceof lzw0) && !(ozw0Var instanceof mzw0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(key, str);
                }
                return new tpt0(linkedHashMap);
            default:
                return new nle1((rle1) obj);
        }
    }

    @Override // p204p.oec1
    /* JADX INFO: renamed from: b */
    public eh00 mo41931b(final AbstractC2441u6 abstractC2441u6) {
        ay1 ay1Var = new ay1(abstractC2441u6, 25);
        abstractC2441u6.addOnAttachStateChangeListener(ay1Var);
        o9q0 o9q0Var = new o9q0() { // from class: p.nec1
            @Override // p204p.o9q0
            /* JADX INFO: renamed from: a */
            public final void mo39564a() {
                abstractC2441u6.m82425g();
            }
        };
        mvl0.m62945h(abstractC2441u6, o9q0Var);
        return new qv31(abstractC2441u6, ay1Var, o9q0Var, 28);
    }

    @Override // p204p.vem0
    /* JADX INFO: renamed from: d */
    public Parcelable mo47851d(dd41 dd41Var, e301 e301Var) {
        String strM35694A = dd41Var.m35694A();
        wj50.m88279p(strM35694A);
        return new t0s0(strM35694A, e301Var.f55571a);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f92505a) {
            case 2:
                return First.m15574b((fct0) obj);
            case 5:
                return First.m15574b((cuv0) obj);
            default:
                return First.m15574b((fdw0) obj);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f92505a) {
            case 9:
                return !((Boolean) ((pqm0) obj).f180351b).booleanValue();
            case 12:
                return !((iqx) ((gqx) obj)).f104863f;
            case 14:
                return ((iy21) obj).f106829d != null;
            case 16:
                return ((Boolean) obj).booleanValue();
            case 17:
                return ((PlayerState) obj).track().mo49279c();
            case 22:
                return !((iqx) ((gqx) obj)).f104863f;
            default:
                return !((xul0) obj).mo49279c();
        }
    }

    @Override // p204p.nsf0
    /* JADX INFO: renamed from: c */
    public void mo35382c(String str, String str2, d850 d850Var) {
    }
}
