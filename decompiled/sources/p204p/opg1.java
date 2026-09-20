package p204p;

import android.content.Intent;
import android.graphics.Color;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class opg1 implements Function, a250, BiFunction, Predicate, t3b1, Function4, yh00 {

    /* JADX INFO: renamed from: b */
    public static opg1 f167922b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167933a;

    /* JADX INFO: renamed from: c */
    public static final opg1 f167924c = new opg1(1);

    /* JADX INFO: renamed from: d */
    public static final opg1 f167926d = new opg1(2);

    /* JADX INFO: renamed from: e */
    public static final opg1 f167927e = new opg1(3);

    /* JADX INFO: renamed from: f */
    public static final opg1 f167928f = new opg1(4);

    /* JADX INFO: renamed from: g */
    public static final opg1 f167929g = new opg1(5);

    /* JADX INFO: renamed from: h */
    public static final opg1 f167930h = new opg1(6);

    /* JADX INFO: renamed from: i */
    public static final opg1 f167931i = new opg1(7);

    /* JADX INFO: renamed from: t */
    public static final opg1 f167932t = new opg1(8);

    /* JADX INFO: renamed from: X */
    public static final opg1 f167915X = new opg1(9);

    /* JADX INFO: renamed from: Y */
    public static final opg1 f167917Y = new opg1(10);

    /* JADX INFO: renamed from: Z */
    public static final opg1 f167919Z = new opg1(11);

    /* JADX INFO: renamed from: L0 */
    public static final opg1 f167903L0 = new opg1(12);

    /* JADX INFO: renamed from: M0 */
    public static final opg1 f167904M0 = new opg1(13);

    /* JADX INFO: renamed from: N0 */
    public static final opg1 f167905N0 = new opg1(14);

    /* JADX INFO: renamed from: O0 */
    public static final opg1 f167906O0 = new opg1(15);

    /* JADX INFO: renamed from: P0 */
    public static final opg1 f167907P0 = new opg1(16);

    /* JADX INFO: renamed from: Q0 */
    public static final bmj f167908Q0 = new bmj(null, false, false);

    /* JADX INFO: renamed from: R0 */
    public static final opg1 f167909R0 = new opg1(18);

    /* JADX INFO: renamed from: S0 */
    public static final opg1 f167910S0 = new opg1(19);

    /* JADX INFO: renamed from: T0 */
    public static final opg1 f167911T0 = new opg1(20);

    /* JADX INFO: renamed from: U0 */
    public static final opg1 f167912U0 = new opg1(21);

    /* JADX INFO: renamed from: V0 */
    public static final opg1 f167913V0 = new opg1(22);

    /* JADX INFO: renamed from: W0 */
    public static final opg1 f167914W0 = new opg1(23);

    /* JADX INFO: renamed from: X0 */
    public static final opg1 f167916X0 = new opg1(24);

    /* JADX INFO: renamed from: Y0 */
    public static final opg1 f167918Y0 = new opg1(25);

    /* JADX INFO: renamed from: Z0 */
    public static final opg1 f167920Z0 = new opg1(26);

    /* JADX INFO: renamed from: a1 */
    public static final opg1 f167921a1 = new opg1(27);

    /* JADX INFO: renamed from: b1 */
    public static final opg1 f167923b1 = new opg1(28);

    /* JADX INFO: renamed from: c1 */
    public static final opg1 f167925c1 = new opg1(29);

    public /* synthetic */ opg1(int i) {
        this.f167933a = i;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m67527a() {
        if (f167922b == null) {
            f167922b = new opg1(0);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
    }

    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public Object mo41272f(yl60 yl60Var, float f) {
        boolean z = yl60Var.mo53768p() == 1;
        if (z) {
            yl60Var.mo53759a();
        }
        double dMo53765k = yl60Var.mo53765k();
        double dMo53765k2 = yl60Var.mo53765k();
        double dMo53765k3 = yl60Var.mo53765k();
        double dMo53765k4 = yl60Var.mo53768p() == 7 ? yl60Var.mo53765k() : 1.0d;
        if (z) {
            yl60Var.mo53761e();
        }
        if (dMo53765k <= 1.0d && dMo53765k2 <= 1.0d && dMo53765k3 <= 1.0d) {
            dMo53765k *= 255.0d;
            dMo53765k2 *= 255.0d;
            dMo53765k3 *= 255.0d;
            if (dMo53765k4 <= 1.0d) {
                dMo53765k4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo53765k4, (int) dMo53765k, (int) dMo53765k2, (int) dMo53765k3));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f167933a) {
            case 8:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
            case 9:
                return ((rw7) obj) instanceof rw7;
            case 14:
                return ((e301) obj).f55572b;
            case 16:
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
            case 19:
                gqx gqxVar2 = (gqx) obj;
                return !((iqx) gqxVar2).f104863f || gqxVar2.mo45451c();
            default:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function4
    /* JADX INFO: renamed from: y */
    public Object mo23409y(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objInvoke;
        eyl0 eyl0Var = (eyl0) obj;
        oqe oqeVar = new oqe((q2q0) obj2, (Map) obj3, (d5x0) obj4, 24);
        eyl0Var.getClass();
        if (eyl0Var instanceof dyl0) {
            objInvoke = oqeVar.invoke(eyl0Var);
        } else {
            if (!(eyl0Var instanceof byl0)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = (byl0) eyl0Var;
        }
        return (eyl0) objInvoke;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str;
        switch (this.f167933a) {
            case 1:
                return ((PlayerState) obj).track();
            case 2:
                Intent intent = (Intent) obj;
                wj50.m88279p(intent);
                return new f41(intent);
            case 3:
                return x72.f258789c;
            case 4:
                return Observable.just(pc3.f175945a);
            case 5:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 6:
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 21:
            case 25:
            default:
                return nhg1.m64494n((EsResponseWithReasons$ResponseWithReasons) obj);
            case 10:
                return Boolean.FALSE;
            case 11:
                String str2 = ((wy9) obj).f256233a;
                if (str2 == null) {
                    str2 = "";
                }
                return new ExternalAccessoryDescription("bluetooth", null, str2, "bluetooth", null, null, null, null, null, null, null, 2034, null);
            case 12:
                pqm0 pqm0Var = (pqm0) obj;
                rza rzaVar = (rza) pqm0Var.f180350a;
                if (rzaVar.f204105d.length() > 0) {
                    str = rzaVar.f204105d;
                } else {
                    str = (String) pqm0Var.f180351b;
                }
                return rza.m76780a(rzaVar, str, null, ContentMediaFormat.PARTIAL_CONTENT_PODCAST);
            case 13:
                return Boolean.valueOf(((pe01) obj).f176587d);
            case 18:
                return Boolean.valueOf(((lcf) obj) instanceof icf);
            case 20:
                azo azoVar = (azo) obj;
                wt7 wt7Var = azoVar.f21654a;
                if (wt7Var instanceof ut7) {
                    return new xa01(xoc1.f264169q2.f243453a, true, false);
                }
                if (wt7Var instanceof tt7) {
                    return new xa01(xoc1.f264169q2.f243453a, false, ((tt7) wt7Var).f223547a && azoVar.f21655b);
                }
                if (wj50.m88271j(wt7Var, vt7.f244565a)) {
                    return wa01.f249313a;
                }
                if (wj50.m88271j(wt7Var, vt7.f244566b)) {
                    return va01.f239077a;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                return ((y5p) ((xul0) obj).mo49278b()).f269498B.f239170a;
            case 23:
                return ((jc81) obj).f111016a;
            case 24:
                return new bor(((Boolean) obj).booleanValue());
            case 26:
                return ehf1.m38954t((l1m0) obj);
            case 27:
                return new v3w((db01) obj);
        }
    }
}
