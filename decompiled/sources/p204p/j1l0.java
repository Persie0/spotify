package p204p;

import android.widget.FrameLayout;
import com.google.protobuf.Empty;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class j1l0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final j1l0 f107771L0;

    /* JADX INFO: renamed from: M0 */
    public static final j1l0 f107772M0;

    /* JADX INFO: renamed from: N0 */
    public static final j1l0 f107773N0;

    /* JADX INFO: renamed from: O0 */
    public static final j1l0 f107774O0;

    /* JADX INFO: renamed from: P0 */
    public static final j1l0 f107775P0;

    /* JADX INFO: renamed from: Q0 */
    public static final j1l0 f107776Q0;

    /* JADX INFO: renamed from: R0 */
    public static final j1l0 f107777R0;

    /* JADX INFO: renamed from: S0 */
    public static final j1l0 f107778S0;

    /* JADX INFO: renamed from: T0 */
    public static final j1l0 f107779T0;

    /* JADX INFO: renamed from: U0 */
    public static final j1l0 f107780U0;

    /* JADX INFO: renamed from: V0 */
    public static final j1l0 f107781V0;

    /* JADX INFO: renamed from: W0 */
    public static final j1l0 f107782W0;

    /* JADX INFO: renamed from: X */
    public static final j1l0 f107783X;

    /* JADX INFO: renamed from: X0 */
    public static final j1l0 f107784X0;

    /* JADX INFO: renamed from: Y */
    public static final j1l0 f107785Y;

    /* JADX INFO: renamed from: Y0 */
    public static final j1l0 f107786Y0;

    /* JADX INFO: renamed from: Z */
    public static final j1l0 f107787Z;

    /* JADX INFO: renamed from: Z0 */
    public static final j1l0 f107788Z0;

    /* JADX INFO: renamed from: a1 */
    public static final j1l0 f107789a1;

    /* JADX INFO: renamed from: b */
    public static final j1l0 f107790b;

    /* JADX INFO: renamed from: b1 */
    public static final j1l0 f107791b1;

    /* JADX INFO: renamed from: c */
    public static final j1l0 f107792c;

    /* JADX INFO: renamed from: c1 */
    public static final j1l0 f107793c1;

    /* JADX INFO: renamed from: d */
    public static final j1l0 f107794d;

    /* JADX INFO: renamed from: e */
    public static final j1l0 f107795e;

    /* JADX INFO: renamed from: f */
    public static final j1l0 f107796f;

    /* JADX INFO: renamed from: g */
    public static final j1l0 f107797g;

    /* JADX INFO: renamed from: h */
    public static final j1l0 f107798h;

    /* JADX INFO: renamed from: i */
    public static final j1l0 f107799i;

    /* JADX INFO: renamed from: t */
    public static final j1l0 f107800t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107801a;

    static {
        int i = 1;
        f107790b = new j1l0(i, 0);
        f107792c = new j1l0(i, 1);
        f107794d = new j1l0(i, 2);
        f107795e = new j1l0(i, 3);
        f107796f = new j1l0(i, 4);
        f107797g = new j1l0(i, 5);
        f107798h = new j1l0(i, 6);
        f107799i = new j1l0(i, 7);
        f107800t = new j1l0(i, 8);
        f107783X = new j1l0(i, 9);
        f107785Y = new j1l0(i, 10);
        f107787Z = new j1l0(i, 11);
        f107771L0 = new j1l0(i, 12);
        f107772M0 = new j1l0(i, 13);
        f107773N0 = new j1l0(i, 14);
        f107774O0 = new j1l0(i, 15);
        f107775P0 = new j1l0(i, 16);
        f107776Q0 = new j1l0(i, 17);
        f107777R0 = new j1l0(i, 18);
        f107778S0 = new j1l0(i, 19);
        f107779T0 = new j1l0(i, 20);
        f107780U0 = new j1l0(i, 21);
        f107781V0 = new j1l0(i, 22);
        f107782W0 = new j1l0(i, 23);
        f107784X0 = new j1l0(i, 24);
        f107786Y0 = new j1l0(i, 25);
        f107788Z0 = new j1l0(i, 26);
        f107789a1 = new j1l0(i, 27);
        f107791b1 = new j1l0(i, 28);
        f107793c1 = new j1l0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1l0(int i, int i2) {
        super(i);
        this.f107801a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        switch (this.f107801a) {
            case 0:
                return nau.f152117a;
            case 1:
                int iOrdinal = ((x0l0) obj).ordinal();
                if (iOrdinal == 0) {
                    return l1l0.f128753a;
                }
                if (iOrdinal == 1) {
                    return m1l0.f139028a;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                lp70 lp70Var = (lp70) obj;
                if (lp70Var.m59606H()) {
                    lp70Var.m59618U(false);
                }
                return w2a1.f247311a;
            case 3:
                return new lbm0();
            case 4:
                ((FrameLayout) obj).removeAllViews();
                return w2a1.f247311a;
            case 5:
                zeo0 zeo0Var = (zeo0) obj;
                return new bfo0(zeo0Var.m95990b(), zeo0Var.m95991c());
            case 6:
                return f3h1.m40690o((nno0) obj, new dno0());
            case 7:
                return ((ix70) obj).mo48974g().f76717c;
            case 8:
                return nhz0.m64531i((afq0) obj);
            case 9:
                Set setM34217a = ((cx50) obj).m34217a();
                if ((setM34217a instanceof Collection) && setM34217a.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = setM34217a.iterator();
                    while (it.hasNext()) {
                        if (!xgr0.f261369a.contains((xw50) it.next())) {
                            z = false;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 10:
                return g6f.m43753y0(((woo) obj).f253523c, null, null, null, etq0.f62776a1, 31);
            case 11:
                return bcg1.m28718C((gbs0) obj, null);
            case 12:
                return ((bbs0) obj).f25653c;
            case 13:
                return ddg1.m35745p((jcs0) obj, null);
            case 14:
                return ((ecs0) obj).f58383c;
            case 15:
                return new sns0(((pns0) obj).m70451a());
            case 16:
                return nau.f152117a;
            case 17:
                return new rxp0(mvl0.m62953p(new rxp0(((k5t0) obj).callStream("spotify.connectivity.pubsub.esperanto.proto.PubSub", "addOnNewConnectionID", Empty.m1933n()), 29)), 28);
            case 18:
                return w2a1.f247311a;
            case 19:
                return w2a1.f247311a;
            case 20:
                return nau.f152117a;
            case 21:
                int iOrdinal2 = ((t3v0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return y6v0.f269902a;
                }
                if (iOrdinal2 == 1) {
                    return z6v0.f279996a;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                return ((cb81) obj).m32150a();
            case 23:
                return ((aqv0) obj).m26901a();
            case 24:
                v6w0 v6w0Var = (v6w0) obj;
                return new v3m(v6w0Var.f237979a, v6w0Var.f237980b, s3m.f205305a, (p3m) null, (String) null, (eh00) null, 120);
            case 25:
                int iOrdinal3 = ((uil0) obj).ordinal();
                if (iOrdinal3 == 0) {
                    return zdx0.f281834a;
                }
                if (iOrdinal3 == 1 || iOrdinal3 == 2) {
                    return aex0.f14981a;
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                return nau.f152117a;
            case 27:
                return w2a1.f247311a;
            case 28:
                return gbu.f78413a;
            default:
                AbstractC2254pf.m69776s();
                return ja61.m52792n();
        }
    }
}
