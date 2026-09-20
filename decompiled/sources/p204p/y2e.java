package p204p;

import android.graphics.Color;
import android.graphics.Paint;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes7.dex */
public final class y2e extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final y2e f268564L0;

    /* JADX INFO: renamed from: M0 */
    public static final y2e f268565M0;

    /* JADX INFO: renamed from: N0 */
    public static final y2e f268566N0;

    /* JADX INFO: renamed from: O0 */
    public static final y2e f268567O0;

    /* JADX INFO: renamed from: P0 */
    public static final y2e f268568P0;

    /* JADX INFO: renamed from: Q0 */
    public static final y2e f268569Q0;

    /* JADX INFO: renamed from: R0 */
    public static final y2e f268570R0;

    /* JADX INFO: renamed from: S0 */
    public static final y2e f268571S0;

    /* JADX INFO: renamed from: T0 */
    public static final y2e f268572T0;

    /* JADX INFO: renamed from: U0 */
    public static final y2e f268573U0;

    /* JADX INFO: renamed from: V0 */
    public static final y2e f268574V0;

    /* JADX INFO: renamed from: W0 */
    public static final y2e f268575W0;

    /* JADX INFO: renamed from: X */
    public static final y2e f268576X;

    /* JADX INFO: renamed from: X0 */
    public static final y2e f268577X0;

    /* JADX INFO: renamed from: Y */
    public static final y2e f268578Y;

    /* JADX INFO: renamed from: Y0 */
    public static final y2e f268579Y0;

    /* JADX INFO: renamed from: Z */
    public static final y2e f268580Z;

    /* JADX INFO: renamed from: Z0 */
    public static final y2e f268581Z0;

    /* JADX INFO: renamed from: a1 */
    public static final y2e f268582a1;

    /* JADX INFO: renamed from: b */
    public static final y2e f268583b;

    /* JADX INFO: renamed from: b1 */
    public static final y2e f268584b1;

    /* JADX INFO: renamed from: c */
    public static final y2e f268585c;

    /* JADX INFO: renamed from: c1 */
    public static final y2e f268586c1;

    /* JADX INFO: renamed from: d */
    public static final y2e f268587d;

    /* JADX INFO: renamed from: e */
    public static final y2e f268588e;

    /* JADX INFO: renamed from: f */
    public static final y2e f268589f;

    /* JADX INFO: renamed from: g */
    public static final y2e f268590g;

    /* JADX INFO: renamed from: h */
    public static final y2e f268591h;

    /* JADX INFO: renamed from: i */
    public static final y2e f268592i;

    /* JADX INFO: renamed from: t */
    public static final y2e f268593t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268594a;

    static {
        int i = 0;
        f268583b = new y2e(i, 0);
        f268585c = new y2e(i, 1);
        f268587d = new y2e(i, 2);
        f268588e = new y2e(i, 3);
        f268589f = new y2e(i, 4);
        f268590g = new y2e(i, 5);
        f268591h = new y2e(i, 6);
        f268592i = new y2e(i, 7);
        f268593t = new y2e(i, 8);
        f268576X = new y2e(i, 9);
        f268578Y = new y2e(i, 10);
        f268580Z = new y2e(i, 11);
        f268564L0 = new y2e(i, 12);
        f268565M0 = new y2e(i, 13);
        f268566N0 = new y2e(i, 14);
        f268567O0 = new y2e(i, 15);
        f268568P0 = new y2e(i, 16);
        f268569Q0 = new y2e(i, 17);
        f268570R0 = new y2e(i, 18);
        f268571S0 = new y2e(i, 19);
        f268572T0 = new y2e(i, 20);
        f268573U0 = new y2e(i, 21);
        f268574V0 = new y2e(i, 22);
        f268575W0 = new y2e(i, 23);
        f268577X0 = new y2e(i, 24);
        f268579Y0 = new y2e(i, 25);
        f268581Z0 = new y2e(i, 26);
        f268582a1 = new y2e(i, 27);
        f268584b1 = new y2e(i, 28);
        f268586c1 = new y2e(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2e(int i, int i2) {
        super(i);
        this.f268594a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f268594a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
            case 1:
                return w2a1Var;
            case 2:
                return Boolean.FALSE;
            case 3:
                return null;
            case 4:
                Paint paint = new Paint(1);
                paint.setColor(Color.argb(89, 0, 0, 0));
                return paint;
            case 5:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 7:
                return new x4y(null);
            case 8:
                return Integer.valueOf(Color.parseColor("#FF0A59B8"));
            case 9:
                return Integer.valueOf(Color.parseColor("#FF19E68C"));
            case 10:
                return MainThreadWorkRunner.m15627a();
            case 11:
                return w2a1Var;
            case 12:
                return sam.m77645B(Boolean.FALSE);
            case 13:
                return w2a1Var;
            case 14:
                return 0;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return w2a1Var;
            case 23:
                return sam.m77645B(0);
            case 24:
                return sam.m77645B(Float.valueOf(0.0f));
            case 25:
                return sam.m77645B(0);
            case 26:
            case 27:
                return w2a1Var;
            case 28:
                return sam.m77645B(Boolean.FALSE);
            default:
                return sam.m77645B(Boolean.FALSE);
        }
    }
}
