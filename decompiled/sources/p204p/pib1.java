package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes7.dex */
public final class pib1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final pib1 f177884L0;

    /* JADX INFO: renamed from: M0 */
    public static final pib1 f177885M0;

    /* JADX INFO: renamed from: N0 */
    public static final pib1 f177886N0;

    /* JADX INFO: renamed from: O0 */
    public static final pib1 f177887O0;

    /* JADX INFO: renamed from: P0 */
    public static final pib1 f177888P0;

    /* JADX INFO: renamed from: Q0 */
    public static final pib1 f177889Q0;

    /* JADX INFO: renamed from: R0 */
    public static final pib1 f177890R0;

    /* JADX INFO: renamed from: S0 */
    public static final pib1 f177891S0;

    /* JADX INFO: renamed from: T0 */
    public static final pib1 f177892T0;

    /* JADX INFO: renamed from: U0 */
    public static final pib1 f177893U0;

    /* JADX INFO: renamed from: V0 */
    public static final pib1 f177894V0;

    /* JADX INFO: renamed from: W0 */
    public static final pib1 f177895W0;

    /* JADX INFO: renamed from: X */
    public static final pib1 f177896X;

    /* JADX INFO: renamed from: X0 */
    public static final pib1 f177897X0;

    /* JADX INFO: renamed from: Y */
    public static final pib1 f177898Y;

    /* JADX INFO: renamed from: Y0 */
    public static final pib1 f177899Y0;

    /* JADX INFO: renamed from: Z */
    public static final pib1 f177900Z;

    /* JADX INFO: renamed from: Z0 */
    public static final pib1 f177901Z0;

    /* JADX INFO: renamed from: a1 */
    public static final pib1 f177902a1;

    /* JADX INFO: renamed from: b */
    public static final pib1 f177903b;

    /* JADX INFO: renamed from: b1 */
    public static final pib1 f177904b1;

    /* JADX INFO: renamed from: c */
    public static final pib1 f177905c;

    /* JADX INFO: renamed from: c1 */
    public static final pib1 f177906c1;

    /* JADX INFO: renamed from: d */
    public static final pib1 f177907d;

    /* JADX INFO: renamed from: e */
    public static final pib1 f177908e;

    /* JADX INFO: renamed from: f */
    public static final pib1 f177909f;

    /* JADX INFO: renamed from: g */
    public static final pib1 f177910g;

    /* JADX INFO: renamed from: h */
    public static final pib1 f177911h;

    /* JADX INFO: renamed from: i */
    public static final pib1 f177912i;

    /* JADX INFO: renamed from: t */
    public static final pib1 f177913t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177914a;

    static {
        int i = 0;
        f177903b = new pib1(i, 0);
        f177905c = new pib1(i, 1);
        f177907d = new pib1(i, 2);
        f177908e = new pib1(i, 3);
        f177909f = new pib1(i, 4);
        f177910g = new pib1(i, 5);
        f177911h = new pib1(i, 6);
        f177912i = new pib1(i, 7);
        f177913t = new pib1(i, 8);
        f177896X = new pib1(i, 9);
        f177898Y = new pib1(i, 10);
        f177900Z = new pib1(i, 11);
        f177884L0 = new pib1(i, 12);
        f177885M0 = new pib1(i, 13);
        f177886N0 = new pib1(i, 14);
        f177887O0 = new pib1(i, 15);
        f177888P0 = new pib1(i, 16);
        f177889Q0 = new pib1(i, 17);
        f177890R0 = new pib1(i, 18);
        f177891S0 = new pib1(i, 19);
        f177892T0 = new pib1(i, 20);
        f177893U0 = new pib1(i, 21);
        f177894V0 = new pib1(i, 22);
        f177895W0 = new pib1(i, 23);
        f177897X0 = new pib1(i, 24);
        f177899Y0 = new pib1(i, 25);
        f177901Z0 = new pib1(i, 26);
        f177902a1 = new pib1(i, 27);
        f177904b1 = new pib1(i, 28);
        f177906c1 = new pib1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pib1(int i, int i2) {
        super(i);
        this.f177914a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f177914a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.FALSE;
            case 2:
                return fu3.EXPAND_FULL_VIDEO;
            case 3:
                return Boolean.TRUE;
            case 4:
                return Boolean.TRUE;
            case 5:
                return w2a1Var;
            case 6:
                return null;
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 8:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 9:
                return ewu0.Companion.serializer();
            case 10:
                return x3a1.Companion.serializer();
            case 11:
                return Boolean.FALSE;
            case 12:
                return new mj5(e450.f55982a, 0);
            case 13:
                return sam.m77645B(0L);
            case 14:
                return sam.m77645B(Boolean.FALSE);
            case 15:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 17:
            case 18:
            case 19:
                return w2a1Var;
            case 20:
                return null;
            case 21:
            case 22:
            case 23:
                return w2a1Var;
            case 24:
                return new mj5(on20.f167142a, 0);
            case 25:
                return new mj5(tp5.f222432a, 0);
            case 26:
                return null;
            case 27:
                return new vkj0();
            case 28:
            default:
                return w2a1Var;
        }
    }
}
