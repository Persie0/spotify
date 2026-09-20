package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class pwv0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final pwv0 f182116L0;

    /* JADX INFO: renamed from: M0 */
    public static final pwv0 f182117M0;

    /* JADX INFO: renamed from: N0 */
    public static final pwv0 f182118N0;

    /* JADX INFO: renamed from: O0 */
    public static final pwv0 f182119O0;

    /* JADX INFO: renamed from: P0 */
    public static final pwv0 f182120P0;

    /* JADX INFO: renamed from: Q0 */
    public static final pwv0 f182121Q0;

    /* JADX INFO: renamed from: R0 */
    public static final pwv0 f182122R0;

    /* JADX INFO: renamed from: S0 */
    public static final pwv0 f182123S0;

    /* JADX INFO: renamed from: T0 */
    public static final pwv0 f182124T0;

    /* JADX INFO: renamed from: U0 */
    public static final pwv0 f182125U0;

    /* JADX INFO: renamed from: V0 */
    public static final pwv0 f182126V0;

    /* JADX INFO: renamed from: W0 */
    public static final pwv0 f182127W0;

    /* JADX INFO: renamed from: X */
    public static final pwv0 f182128X;

    /* JADX INFO: renamed from: X0 */
    public static final pwv0 f182129X0;

    /* JADX INFO: renamed from: Y */
    public static final pwv0 f182130Y;

    /* JADX INFO: renamed from: Y0 */
    public static final pwv0 f182131Y0;

    /* JADX INFO: renamed from: Z */
    public static final pwv0 f182132Z;

    /* JADX INFO: renamed from: Z0 */
    public static final pwv0 f182133Z0;

    /* JADX INFO: renamed from: a1 */
    public static final pwv0 f182134a1;

    /* JADX INFO: renamed from: b */
    public static final pwv0 f182135b;

    /* JADX INFO: renamed from: b1 */
    public static final pwv0 f182136b1;

    /* JADX INFO: renamed from: c */
    public static final pwv0 f182137c;

    /* JADX INFO: renamed from: c1 */
    public static final pwv0 f182138c1;

    /* JADX INFO: renamed from: d */
    public static final pwv0 f182139d;

    /* JADX INFO: renamed from: e */
    public static final pwv0 f182140e;

    /* JADX INFO: renamed from: f */
    public static final pwv0 f182141f;

    /* JADX INFO: renamed from: g */
    public static final pwv0 f182142g;

    /* JADX INFO: renamed from: h */
    public static final pwv0 f182143h;

    /* JADX INFO: renamed from: i */
    public static final pwv0 f182144i;

    /* JADX INFO: renamed from: t */
    public static final pwv0 f182145t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f182146a;

    static {
        int i = 0;
        f182135b = new pwv0(i, 0);
        f182137c = new pwv0(i, 1);
        f182139d = new pwv0(i, 2);
        f182140e = new pwv0(i, 3);
        f182141f = new pwv0(i, 4);
        f182142g = new pwv0(i, 5);
        f182143h = new pwv0(i, 6);
        f182144i = new pwv0(i, 7);
        f182145t = new pwv0(i, 8);
        f182128X = new pwv0(i, 9);
        f182130Y = new pwv0(i, 10);
        f182132Z = new pwv0(i, 11);
        f182116L0 = new pwv0(i, 12);
        f182117M0 = new pwv0(i, 13);
        f182118N0 = new pwv0(i, 14);
        f182119O0 = new pwv0(i, 15);
        f182120P0 = new pwv0(i, 16);
        f182121Q0 = new pwv0(i, 17);
        f182122R0 = new pwv0(i, 18);
        f182123S0 = new pwv0(i, 19);
        f182124T0 = new pwv0(i, 20);
        f182125U0 = new pwv0(i, 21);
        f182126V0 = new pwv0(i, 22);
        f182127W0 = new pwv0(i, 23);
        f182129X0 = new pwv0(i, 24);
        f182131Y0 = new pwv0(i, 25);
        f182133Z0 = new pwv0(i, 26);
        f182134a1 = new pwv0(i, 27);
        f182136b1 = new pwv0(i, 28);
        f182138c1 = new pwv0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwv0(int i, int i2) {
        super(i);
        this.f182146a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f182146a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                eka1 eka1Var = new eka1();
                for (wja1 wja1Var : qwv0.f193427b) {
                    eka1Var.m39276b(wja1Var.f251922a, wja1Var.f251923b);
                }
                return eka1Var;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return w2a1Var;
            case 6:
                return new pdh0(new vch0(st91.f213865b, 6));
            case 7:
                return w2a1Var;
            case 8:
                return new fbh0();
            case 9:
            case 10:
            case 11:
            case 12:
                return w2a1Var;
            case 13:
                return null;
            case 14:
                return new SingleSubject();
            case 15:
                return w2a1Var;
            case 16:
            case 17:
                return null;
            case 18:
                return w2a1Var;
            case 19:
                return new vum0(0);
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
            case 23:
            case 24:
                return w2a1Var;
            case 25:
                return Float.valueOf(0.0f);
            case 26:
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4, rgy0.f199048b);
                Scheduler scheduler = Schedulers.f10368a;
                return new ExecutorScheduler(executorServiceNewFixedThreadPool, false, false);
            case 27:
                return lau.f131415a;
            case 28:
            default:
                return w2a1Var;
        }
    }
}
