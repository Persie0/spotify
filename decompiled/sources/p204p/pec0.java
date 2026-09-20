package p204p;

import android.graphics.Paint;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes10.dex */
public final class pec0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final pec0 f176700L0;

    /* JADX INFO: renamed from: M0 */
    public static final pec0 f176701M0;

    /* JADX INFO: renamed from: N0 */
    public static final pec0 f176702N0;

    /* JADX INFO: renamed from: O0 */
    public static final pec0 f176703O0;

    /* JADX INFO: renamed from: P0 */
    public static final pec0 f176704P0;

    /* JADX INFO: renamed from: Q0 */
    public static final pec0 f176705Q0;

    /* JADX INFO: renamed from: R0 */
    public static final pec0 f176706R0;

    /* JADX INFO: renamed from: S0 */
    public static final pec0 f176707S0;

    /* JADX INFO: renamed from: T0 */
    public static final pec0 f176708T0;

    /* JADX INFO: renamed from: U0 */
    public static final pec0 f176709U0;

    /* JADX INFO: renamed from: V0 */
    public static final pec0 f176710V0;

    /* JADX INFO: renamed from: W0 */
    public static final pec0 f176711W0;

    /* JADX INFO: renamed from: X */
    public static final pec0 f176712X;

    /* JADX INFO: renamed from: X0 */
    public static final pec0 f176713X0;

    /* JADX INFO: renamed from: Y */
    public static final pec0 f176714Y;

    /* JADX INFO: renamed from: Y0 */
    public static final pec0 f176715Y0;

    /* JADX INFO: renamed from: Z */
    public static final pec0 f176716Z;

    /* JADX INFO: renamed from: Z0 */
    public static final pec0 f176717Z0;

    /* JADX INFO: renamed from: a1 */
    public static final pec0 f176718a1;

    /* JADX INFO: renamed from: b */
    public static final pec0 f176719b;

    /* JADX INFO: renamed from: b1 */
    public static final pec0 f176720b1;

    /* JADX INFO: renamed from: c */
    public static final pec0 f176721c;

    /* JADX INFO: renamed from: c1 */
    public static final pec0 f176722c1;

    /* JADX INFO: renamed from: d */
    public static final pec0 f176723d;

    /* JADX INFO: renamed from: e */
    public static final pec0 f176724e;

    /* JADX INFO: renamed from: f */
    public static final pec0 f176725f;

    /* JADX INFO: renamed from: g */
    public static final pec0 f176726g;

    /* JADX INFO: renamed from: h */
    public static final pec0 f176727h;

    /* JADX INFO: renamed from: i */
    public static final pec0 f176728i;

    /* JADX INFO: renamed from: t */
    public static final pec0 f176729t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176730a;

    static {
        int i = 0;
        f176719b = new pec0(i, 0);
        f176721c = new pec0(i, 1);
        f176723d = new pec0(i, 2);
        f176724e = new pec0(i, 3);
        f176725f = new pec0(i, 4);
        f176726g = new pec0(i, 5);
        f176727h = new pec0(i, 6);
        f176728i = new pec0(i, 7);
        f176729t = new pec0(i, 8);
        f176712X = new pec0(i, 9);
        f176714Y = new pec0(i, 10);
        f176716Z = new pec0(i, 11);
        f176700L0 = new pec0(i, 12);
        f176701M0 = new pec0(i, 13);
        f176702N0 = new pec0(i, 14);
        f176703O0 = new pec0(i, 15);
        f176704P0 = new pec0(i, 16);
        f176705Q0 = new pec0(i, 17);
        f176706R0 = new pec0(i, 18);
        f176707S0 = new pec0(i, 19);
        f176708T0 = new pec0(i, 20);
        f176709U0 = new pec0(i, 21);
        f176710V0 = new pec0(i, 22);
        f176711W0 = new pec0(i, 23);
        f176713X0 = new pec0(i, 24);
        f176715Y0 = new pec0(i, 25);
        f176717Z0 = new pec0(i, 26);
        f176718a1 = new pec0(i, 27);
        f176720b1 = new pec0(i, 28);
        f176722c1 = new pec0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pec0(int i, int i2) {
        super(i);
        this.f176730a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f176730a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return l4b0.f129639c1;
            case 1:
                return Boolean.FALSE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return null;
            case 4:
                return new ybs(Float.NaN);
            case 5:
                return new ybs(0);
            case 6:
                return Boolean.FALSE;
            case 7:
                return null;
            case 8:
                return mbr.Companion.serializer();
            case 9:
                return ep3.Companion.serializer();
            case 10:
                return new Paint(1);
            case 11:
                return new Paint(1);
            case 12:
                return new Paint(1);
            case 13:
                eka1 eka1Var = new eka1();
                for (wja1 wja1Var : snc0.f210880b) {
                    eka1Var.m39276b(wja1Var.f251922a, wja1Var.f251923b);
                }
                return eka1Var;
            case 14:
                return sam.m77645B(Boolean.FALSE);
            case 15:
                return sam.m77645B(Boolean.FALSE);
            case 16:
            case 17:
            case 18:
            case 19:
                return w2a1Var;
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 22:
                return null;
            case 23:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 24:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 25:
                return new ew6(3);
            case 26:
                return w2a1Var;
            case 27:
                return new q4k(null, false, false, false, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741053);
            case 28:
                return new vkj0();
            default:
                return w2a1Var;
        }
    }
}
