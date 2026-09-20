package p204p;

import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.voiceassistants.errorhandler.NotAuthenticatedException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class alq0 implements BiFunction, Function, Predicate, Init, tpk, s731, rq31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16945a;

    /* JADX INFO: renamed from: b */
    public static final alq0 f16936b = new alq0(0);

    /* JADX INFO: renamed from: c */
    public static final alq0 f16937c = new alq0(1);

    /* JADX INFO: renamed from: d */
    public static final alq0 f16938d = new alq0(2);

    /* JADX INFO: renamed from: e */
    public static final alq0 f16939e = new alq0(3);

    /* JADX INFO: renamed from: f */
    public static final alq0 f16940f = new alq0(4);

    /* JADX INFO: renamed from: g */
    public static final alq0 f16941g = new alq0(5);

    /* JADX INFO: renamed from: h */
    public static final alq0 f16942h = new alq0(6);

    /* JADX INFO: renamed from: i */
    public static final alq0 f16943i = new alq0(7);

    /* JADX INFO: renamed from: t */
    public static final alq0 f16944t = new alq0(8);

    /* JADX INFO: renamed from: X */
    public static final alq0 f16929X = new alq0(9);

    /* JADX INFO: renamed from: Y */
    public static final alq0 f16931Y = new alq0(10);

    /* JADX INFO: renamed from: Z */
    public static final alq0 f16933Z = new alq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ alq0 f16917L0 = new alq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final alq0 f16918M0 = new alq0(14);

    /* JADX INFO: renamed from: N0 */
    public static final alq0 f16919N0 = new alq0(15);

    /* JADX INFO: renamed from: O0 */
    public static final alq0 f16920O0 = new alq0(16);

    /* JADX INFO: renamed from: P0 */
    public static final alq0 f16921P0 = new alq0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final alq0 f16922Q0 = new alq0(18);

    /* JADX INFO: renamed from: R0 */
    public static final alq0 f16923R0 = new alq0(19);

    /* JADX INFO: renamed from: S0 */
    public static final alq0 f16924S0 = new alq0(20);

    /* JADX INFO: renamed from: T0 */
    public static final alq0 f16925T0 = new alq0(21);

    /* JADX INFO: renamed from: U0 */
    public static final alq0 f16926U0 = new alq0(22);

    /* JADX INFO: renamed from: V0 */
    public static final alq0 f16927V0 = new alq0(23);

    /* JADX INFO: renamed from: W0 */
    public static final alq0 f16928W0 = new alq0(24);

    /* JADX INFO: renamed from: X0 */
    public static final alq0 f16930X0 = new alq0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final alq0 f16932Y0 = new alq0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final alq0 f16934Z0 = new alq0(27);

    /* JADX INFO: renamed from: a1 */
    public static final alq0 f16935a1 = new alq0(28);

    public /* synthetic */ alq0(int i) {
        this.f16945a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final dx10 m26356a(C1893gd c1893gd, C2289qd c2289qd) {
        String str = c1893gd.f78681X;
        if (str == null) {
            str = "facebook";
        }
        int i = 29;
        InterfaceC2491vd onq0Var = str.equals("instagram") ? new onq0(i) : new mmq0(i);
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", onq0Var.mo62321a());
        bundle.putString("client_id", c1893gd.f78689h);
        bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        String str2 = dx10.f53819j;
        dx10 dx10VarM48882r = hvi0.m48882r(c1893gd, onq0Var.mo62322b(), c2289qd);
        dx10VarM48882r.f53825d = bundle;
        dx10VarM48882r.f53829h = eh30.f59473a;
        return dx10VarM48882r;
    }

    /* JADX INFO: renamed from: b */
    public static final dx10 m26357b(C1893gd c1893gd, C2252pd c2252pd) {
        Bundle bundleM36606f = dq60.m36606f("fields", "permission,status");
        String str = dx10.f53819j;
        dx10 dx10VarM48882r = hvi0.m48882r(c1893gd, "me/permissions", c2252pd);
        dx10VarM48882r.f53825d = bundleM36606f;
        dx10VarM48882r.f53829h = eh30.f59473a;
        return dx10VarM48882r;
    }

    /* JADX INFO: renamed from: c */
    public static String[] m26358c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashSet m26359e(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: f */
    public static LinkedHashSet m26360f(String str, String... strArr) {
        return m26359e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: g */
    public static LinkedHashSet m26361g(String str, String... strArr) {
        return m26359e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f16945a) {
            case 1:
                return Boolean.FALSE;
            case 2:
                return new l5s0((Map) obj);
            case 3:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new fot0(message);
            case 4:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 16:
            case 17:
            case 19:
            case 22:
            default:
                return new lf3((av80) obj);
            case 5:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof k2x0) {
                    return Boolean.FALSE;
                }
                if (p2x0Var instanceof m2x0) {
                    return Boolean.valueOf(((qu80) ((m2x0) p2x0Var).f139474a).f192599e.f271278w.f156638b);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return Boolean.valueOf(((pe01) obj).f176587d);
            case 10:
                return (ContextTrack) ((xul0) obj).mo49278b();
            case 11:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 14:
                Logger.m3973i("Age verification failed with exception, failing open", (Throwable) obj);
                return new h521(mh2.f143687a);
            case 15:
                return ((PlayerState) obj).contextUri();
            case 18:
                if (!(((lcf) obj) instanceof icf)) {
                    na6.m63971s("Puffin: Failed to pause music during onboarding");
                }
                return CompletableEmpty.f7437a;
            case 20:
                return new hzq0((qu80) obj);
            case 21:
                return Boolean.valueOf(dxf1.m37216E((Map) obj));
            case 23:
                return ((ContextTrack) obj).uri();
            case 24:
                e301 e301Var = (e301) obj;
                boolean z = e301Var.f55572b;
                if (z && !e301Var.f55574d) {
                    return Flowable.m23313I(e301Var.f55571a);
                }
                if (!z && !e301Var.f55573c) {
                    return Flowable.m23326x(new NotAuthenticatedException());
                }
                int i = Flowable.f7192a;
                return FlowableEmpty.f7745b;
            case 25:
                pqm0 pqm0Var = (pqm0) obj;
                Double d = (Double) pqm0Var.f180350a;
                Double d2 = (Double) pqm0Var.f180351b;
                boolean z2 = false;
                if (d != null && d2 != null && d2.doubleValue() > d.doubleValue()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: renamed from: d */
    public C2529wd m26362d() {
        C2529wd c2529wd;
        C2529wd c2529wd2 = C2529wd.f250156g;
        if (c2529wd2 != null) {
            return c2529wd2;
        }
        synchronized (this) {
            c2529wd = C2529wd.f250156g;
            if (c2529wd == null) {
                aba0 aba0VarM25342a = aba0.m25342a(p8y.m69343a());
                C2011jd c2011jd = new C2011jd(0);
                C2529wd c2529wd3 = new C2529wd();
                c2529wd3.f250160a = aba0VarM25342a;
                c2529wd3.f250161b = c2011jd;
                c2529wd3.f250163d = new AtomicBoolean(false);
                c2529wd3.f250164e = new Date(0L);
                C2529wd.f250156g = c2529wd3;
                c2529wd = c2529wd3;
            }
        }
        return c2529wd;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f16945a) {
            case 7:
                return First.m15574b((aqw0) obj);
            case 19:
                rw61 rw61Var = (rw61) obj;
                wj50.m88279p(rw61Var);
                Set setM77306i0 = s601.m77306i0(uv61.f234380a);
                if (rw61Var.m76508b()) {
                    setM77306i0.add(wv61.f255425a);
                }
                return First.m15575c(rw61Var, setM77306i0);
            default:
                return First.m15574b((lba1) obj);
        }
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Short.valueOf(((p3x0) obj).m69093g());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return !((iqx) ((gqx) obj)).f104863f;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f16945a) {
            case 0:
                return new pqm0((ciq0) obj, (Boolean) obj2);
            default:
                return new pqm0((am81) obj, (Boolean) obj2);
        }
    }
}
