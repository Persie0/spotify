package p204p;

import com.spotify.image.esperanto.proto.EsImage$ImageData;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class d7f0 implements Predicate, Function, BiFunction, Function3, Producer, xax0, vja1 {

    /* JADX INFO: renamed from: c */
    public static boolean f46162c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46185a;

    /* JADX INFO: renamed from: b */
    public static final d7f0 f46160b = new d7f0(0);

    /* JADX INFO: renamed from: d */
    public static final d7f0 f46164d = new d7f0(1);

    /* JADX INFO: renamed from: e */
    public static final wb9 f46166e = new wb9(-1.0f, -1.0f);

    /* JADX INFO: renamed from: f */
    public static final wb9 f46168f = new wb9(0.0f, -1.0f);

    /* JADX INFO: renamed from: g */
    public static final wb9 f46170g = new wb9(1.0f, -1.0f);

    /* JADX INFO: renamed from: h */
    public static final wb9 f46172h = new wb9(-1.0f, 0.0f);

    /* JADX INFO: renamed from: i */
    public static final wb9 f46174i = new wb9(0.0f, 0.0f);

    /* JADX INFO: renamed from: t */
    public static final wb9 f46184t = new wb9(1.0f, 0.0f);

    /* JADX INFO: renamed from: X */
    public static final wb9 f46153X = new wb9(-1.0f, 1.0f);

    /* JADX INFO: renamed from: Y */
    public static final wb9 f46155Y = new wb9(0.0f, 1.0f);

    /* JADX INFO: renamed from: Z */
    public static final wb9 f46157Z = new wb9(1.0f, 1.0f);

    /* JADX INFO: renamed from: L0 */
    public static final vb9 f46141L0 = new vb9(-1.0f);

    /* JADX INFO: renamed from: M0 */
    public static final vb9 f46142M0 = new vb9(0.0f);

    /* JADX INFO: renamed from: N0 */
    public static final vb9 f46143N0 = new vb9(1.0f);

    /* JADX INFO: renamed from: O0 */
    public static final ub9 f46144O0 = new ub9(-1.0f);

    /* JADX INFO: renamed from: P0 */
    public static final ub9 f46145P0 = new ub9(0.0f);

    /* JADX INFO: renamed from: Q0 */
    public static final ub9 f46146Q0 = new ub9(1.0f);

    /* JADX INFO: renamed from: R0 */
    public static final d7f0 f46147R0 = new d7f0(3);

    /* JADX INFO: renamed from: S0 */
    public static final d7f0 f46148S0 = new d7f0(4);

    /* JADX INFO: renamed from: T0 */
    public static final d7f0 f46149T0 = new d7f0(5);

    /* JADX INFO: renamed from: U0 */
    public static final d7f0 f46150U0 = new d7f0(6);

    /* JADX INFO: renamed from: V0 */
    public static final d7f0 f46151V0 = new d7f0(7);

    /* JADX INFO: renamed from: W0 */
    public static final d7f0 f46152W0 = new d7f0(8);

    /* JADX INFO: renamed from: X0 */
    public static final d7f0 f46154X0 = new d7f0(9);

    /* JADX INFO: renamed from: Y0 */
    public static final d7f0 f46156Y0 = new d7f0(10);

    /* JADX INFO: renamed from: Z0 */
    public static final d7f0 f46158Z0 = new d7f0(11);

    /* JADX INFO: renamed from: a1 */
    public static final d7f0 f46159a1 = new d7f0(12);

    /* JADX INFO: renamed from: b1 */
    public static final d7f0 f46161b1 = new d7f0(13);

    /* JADX INFO: renamed from: c1 */
    public static final d7f0 f46163c1 = new d7f0(14);

    /* JADX INFO: renamed from: d1 */
    public static final d7f0 f46165d1 = new d7f0(15);

    /* JADX INFO: renamed from: e1 */
    public static final d7f0 f46167e1 = new d7f0(16);

    /* JADX INFO: renamed from: f1 */
    public static final d7f0 f46169f1 = new d7f0(17);

    /* JADX INFO: renamed from: g1 */
    public static final d7f0 f46171g1 = new d7f0(18);

    /* JADX INFO: renamed from: h1 */
    public static final d7f0 f46173h1 = new d7f0(19);

    /* JADX INFO: renamed from: i1 */
    public static final d7f0 f46175i1 = new d7f0(20);

    /* JADX INFO: renamed from: j1 */
    public static final /* synthetic */ d7f0 f46176j1 = new d7f0(21);

    /* JADX INFO: renamed from: k1 */
    public static final d7f0 f46177k1 = new d7f0(22);

    /* JADX INFO: renamed from: l1 */
    public static final d7f0 f46178l1 = new d7f0(23);

    /* JADX INFO: renamed from: m1 */
    public static final d7f0 f46179m1 = new d7f0(24);

    /* JADX INFO: renamed from: n1 */
    public static final d7f0 f46180n1 = new d7f0(25);

    /* JADX INFO: renamed from: o1 */
    public static final d7f0 f46181o1 = new d7f0(26);

    /* JADX INFO: renamed from: p1 */
    public static final d7f0 f46182p1 = new d7f0(27);

    /* JADX INFO: renamed from: q1 */
    public static final d7f0 f46183q1 = new d7f0(29);

    public /* synthetic */ d7f0(int i) {
        this.f46185a = i;
    }

    /* JADX INFO: renamed from: a */
    public static Set m35201a(int i, boolean z, boolean z2) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return haz.m46944p(8, false, z, z2, false);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        switch (this.f46185a) {
            case 12:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((Boolean) obj3).getClass();
                return pft0.m69840u((tbp0) obj, bool);
            default:
                Boolean bool2 = (Boolean) obj;
                return new das((List) obj3, bool2.booleanValue(), !bool2.booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f46185a) {
            case 4:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            case 5:
                return new jc8(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 6:
                Set set = (Set) obj;
                n2a n2aVar = (n2a) obj2;
                if (n2aVar instanceof m2a) {
                    return s601.m77308k0("social_radar", set);
                }
                if (n2aVar instanceof k2a) {
                    return s601.m77304g0("social_radar", set);
                }
                if (n2aVar instanceof l2a) {
                    return gbu.f78413a;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return new pqm0((ta80) obj, (dvl0) obj2);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        switch (this.f46185a) {
            case 20:
                return new DispatcherWorker(xsr.f265651a);
            default:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        return new jqb0(mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f46185a) {
            case 1:
                return ((gms) obj) instanceof fms;
            case 7:
                return ((String) obj).length() > 0;
            case 8:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((api) it.next()).mo26697m()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((gv31) obj).f84603b == 1;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f46185a) {
            case 3:
                e301 e301Var = (e301) obj;
                if (!e301Var.f55572b || e301Var.f55574d) {
                    return e301Var.f55573c ? ig4.f101877a : ig4.f101879c;
                }
                return ig4.f101878b;
            case 9:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
            case 10:
                return new cpi((cwi) obj);
            case 11:
                ehy0 ehy0Var = (ehy0) obj;
                if (ehy0Var instanceof chy0) {
                    lji ljiVar = (lji) ((chy0) ehy0Var).f38149a;
                    return new w0j(ljiVar.mo56602e(), ljiVar.mo56601d());
                }
                if (ehy0Var.equals(dhy0.f49188a)) {
                    return x0j.f256887b;
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                return (gmr0) ((xul0) obj).mo49278b();
            case 14:
                return ((Boolean) obj).booleanValue() ? sg5.f208720a : sg5.f208721b;
            case 16:
                xkw xkwVarM12007s = EsImage$ImageData.m12007s();
                xkwVarM12007s.m91368m();
                return (EsImage$ImageData) xkwVarM12007s.build();
            case 18:
                ehy0 ehy0Var2 = (ehy0) obj;
                if (ehy0Var2 instanceof chy0) {
                    return new ott(((lji) ((chy0) ehy0Var2).f38149a).mo56602e());
                }
                return ptt.f181253a;
            case 19:
                return nhg1.m64494n((EsResponseWithReasons$ResponseWithReasons) obj);
            case 23:
                return x2a1.f257409a;
            default:
                return Boolean.valueOf(((PlayerState) obj).track().mo49279c());
        }
    }
}
