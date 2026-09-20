package p204p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.profile.socialgraphimpl.proto.C1243x1e185427;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class oqq0 implements Function, Init, yh00, Predicate, Function4, tn61, vg31, qyc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168370a;

    /* JADX INFO: renamed from: b */
    public static final oqq0 f168360b = new oqq0(0);

    /* JADX INFO: renamed from: c */
    public static final oqq0 f168362c = new oqq0(1);

    /* JADX INFO: renamed from: d */
    public static final oqq0 f168363d = new oqq0(2);

    /* JADX INFO: renamed from: e */
    public static final oqq0 f168364e = new oqq0(3);

    /* JADX INFO: renamed from: f */
    public static final oqq0 f168365f = new oqq0(4);

    /* JADX INFO: renamed from: g */
    public static final oqq0 f168366g = new oqq0(5);

    /* JADX INFO: renamed from: h */
    public static final oqq0 f168367h = new oqq0(6);

    /* JADX INFO: renamed from: i */
    public static final oqq0 f168368i = new oqq0(7);

    /* JADX INFO: renamed from: t */
    public static final oqq0 f168369t = new oqq0(8);

    /* JADX INFO: renamed from: X */
    public static final oqq0 f168353X = new oqq0(9);

    /* JADX INFO: renamed from: Y */
    public static final oqq0 f168355Y = new oqq0(10);

    /* JADX INFO: renamed from: Z */
    public static final oqq0 f168357Z = new oqq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final oqq0 f168341L0 = new oqq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final oqq0 f168342M0 = new oqq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final oqq0 f168343N0 = new oqq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final oqq0 f168344O0 = new oqq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final oqq0 f168345P0 = new oqq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final oqq0 f168346Q0 = new oqq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final oqq0 f168347R0 = new oqq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final oqq0 f168348S0 = new oqq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final oqq0 f168349T0 = new oqq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final oqq0 f168350U0 = new oqq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final oqq0 f168351V0 = new oqq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final oqq0 f168352W0 = new oqq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final oqq0 f168354X0 = new oqq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final oqq0 f168356Y0 = new oqq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final oqq0 f168358Z0 = new oqq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final oqq0 f168359a1 = new oqq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final oqq0 f168361b1 = new oqq0(28);

    public /* synthetic */ oqq0(int i) {
        this.f168370a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m67655a(vj0 vj0Var, int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            int iOrdinal = vj0Var.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = vj0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final vj0 m67656b(int i, boolean z) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z) {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                return vj0.f241843c;
            }
        } else {
            if (z) {
                return vj0.f241842b;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return vj0.f241841a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        C1243x1e185427 c1243x1e185427;
        switch (this.f168370a) {
            case 0:
                return hcc0.f89751a;
            case 1:
                o2x0 o2x0Var = (o2x0) obj;
                return new ksr0(o2x0Var.f161171a.f149852O0 && (c1243x1e185427 = (C1243x1e185427) o2x0Var.f161172b) != null && c1243x1e185427.m19840n());
            case 2:
            case 5:
            case 6:
            case 7:
            case 10:
            case 16:
            default:
                return ((Boolean) obj).booleanValue() ? Single.just(nrd1.ALREADY_CONNECTED_TO_HEADSET) : Single.just(nrd1.ALL_CHECKS_CLEAR);
            case 3:
                lcf lcfVar = (lcf) obj;
                return lcfVar instanceof hcf ? new qpt0(((hcf) lcfVar).f89783a) : rpt0.f201644a;
            case 4:
                e291 e291Var = (e291) obj;
                return new pqm0(Boolean.valueOf(e291Var.f55410o), e291Var.f55398c);
            case 8:
                return ((fxx) obj).f74479a;
            case 9:
                return ((id3) obj).f100926j;
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 12:
                return new o2y(false);
            case 13:
                return ((o421) obj).f161519c;
            case 14:
                xj11 xj11Var = (xj11) obj;
                return new m1q0(xj11Var.f261996d, xj11Var.f262000h);
            case 15:
                ubp0 ubp0Var = (ubp0) obj;
                if (ubp0Var.f228855c.length() > 0) {
                    return Observable.just(new n231(ubp0Var.f228860h, ubp0Var.f228861i, ubp0Var.f228856d, ubp0Var.f228855c, ubp0Var.f228863k));
                }
                return Observable.empty();
            case 17:
                return ((ContextTrack) obj).uri();
            case 18:
                return new mf51((tu01) obj);
            case 19:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport error";
                }
                return new iz71(message);
            case 20:
                return (Completable) obj;
            case 21:
                return (wvh0) obj;
            case 22:
                if (((Boolean) obj).booleanValue()) {
                    return new s1j0(null, oxa1.class);
                }
                Logger.m3966b("Feature is disabled, won't navigate to feature.", new Object[0]);
                Set set = dd41.f47702f;
                return new r1j0(r46.m74726U(xoc1.f263839A0.f243453a));
            case 23:
                return Boolean.valueOf(!((Set) obj).isEmpty());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f168370a) {
            case 2:
                return First.m15574b((tb6) obj);
            default:
                zvh0 zvh0Var = (zvh0) obj;
                wj50.m88279p(zvh0Var);
                return First.m15574b(zvh0Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f168370a) {
            case 5:
                break;
        }
        return ((e301) obj).f55572b;
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        wj50.m88279p(str);
        return new yvv0(str, (Restrictions) obj2, (am81) obj3, (icc0) obj4);
    }
}
