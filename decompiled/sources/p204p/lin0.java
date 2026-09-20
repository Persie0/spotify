package p204p;

import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.lang.annotation.Annotation;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class lin0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final lin0 f133827L0;

    /* JADX INFO: renamed from: M0 */
    public static final lin0 f133828M0;

    /* JADX INFO: renamed from: N0 */
    public static final lin0 f133829N0;

    /* JADX INFO: renamed from: O0 */
    public static final lin0 f133830O0;

    /* JADX INFO: renamed from: P0 */
    public static final lin0 f133831P0;

    /* JADX INFO: renamed from: Q0 */
    public static final lin0 f133832Q0;

    /* JADX INFO: renamed from: R0 */
    public static final lin0 f133833R0;

    /* JADX INFO: renamed from: S0 */
    public static final lin0 f133834S0;

    /* JADX INFO: renamed from: T0 */
    public static final lin0 f133835T0;

    /* JADX INFO: renamed from: U0 */
    public static final lin0 f133836U0;

    /* JADX INFO: renamed from: V0 */
    public static final lin0 f133837V0;

    /* JADX INFO: renamed from: W0 */
    public static final lin0 f133838W0;

    /* JADX INFO: renamed from: X */
    public static final lin0 f133839X;

    /* JADX INFO: renamed from: X0 */
    public static final lin0 f133840X0;

    /* JADX INFO: renamed from: Y */
    public static final lin0 f133841Y;

    /* JADX INFO: renamed from: Y0 */
    public static final lin0 f133842Y0;

    /* JADX INFO: renamed from: Z */
    public static final lin0 f133843Z;

    /* JADX INFO: renamed from: Z0 */
    public static final lin0 f133844Z0;

    /* JADX INFO: renamed from: a1 */
    public static final lin0 f133845a1;

    /* JADX INFO: renamed from: b */
    public static final lin0 f133846b;

    /* JADX INFO: renamed from: b1 */
    public static final lin0 f133847b1;

    /* JADX INFO: renamed from: c */
    public static final lin0 f133848c;

    /* JADX INFO: renamed from: c1 */
    public static final lin0 f133849c1;

    /* JADX INFO: renamed from: d */
    public static final lin0 f133850d;

    /* JADX INFO: renamed from: e */
    public static final lin0 f133851e;

    /* JADX INFO: renamed from: f */
    public static final lin0 f133852f;

    /* JADX INFO: renamed from: g */
    public static final lin0 f133853g;

    /* JADX INFO: renamed from: h */
    public static final lin0 f133854h;

    /* JADX INFO: renamed from: i */
    public static final lin0 f133855i;

    /* JADX INFO: renamed from: t */
    public static final lin0 f133856t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133857a;

    static {
        int i = 0;
        f133846b = new lin0(i, 0);
        f133848c = new lin0(i, 1);
        f133850d = new lin0(i, 2);
        f133851e = new lin0(i, 3);
        f133852f = new lin0(i, 4);
        f133853g = new lin0(i, 5);
        f133854h = new lin0(i, 6);
        f133855i = new lin0(i, 7);
        f133856t = new lin0(i, 8);
        f133839X = new lin0(i, 9);
        f133841Y = new lin0(i, 10);
        f133843Z = new lin0(i, 11);
        f133827L0 = new lin0(i, 12);
        f133828M0 = new lin0(i, 13);
        f133829N0 = new lin0(i, 14);
        f133830O0 = new lin0(i, 15);
        f133831P0 = new lin0(i, 16);
        f133832Q0 = new lin0(i, 17);
        f133833R0 = new lin0(i, 18);
        f133834S0 = new lin0(i, 19);
        f133835T0 = new lin0(i, 20);
        f133836U0 = new lin0(i, 21);
        f133837V0 = new lin0(i, 22);
        f133838W0 = new lin0(i, 23);
        f133840X0 = new lin0(i, 24);
        f133842Y0 = new lin0(i, 25);
        f133844Z0 = new lin0(i, 26);
        f133845a1 = new lin0(i, 27);
        f133847b1 = new lin0(i, 28);
        f133849c1 = new lin0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lin0(int i, int i2) {
        super(i);
        this.f133857a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f133857a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return new hmk0("com.spotify.blend.tastematch.api.PendingInvitation", min0.INSTANCE, new Annotation[0]);
            case 1:
                return new mj5(hpn0.f93818a, 0);
            case 2:
                return new pn80(ql51.f189738a, u2b0.f226058a);
            case 3:
                eka1 eka1Var = new eka1();
                for (wja1 wja1Var : gtn0.f84243b) {
                    eka1Var.m39276b(wja1Var.f251922a, wja1Var.f251923b);
                }
                return eka1Var;
            case 4:
                eka1 eka1Var2 = new eka1();
                for (wja1 wja1Var2 : ltn0.f136834b) {
                    eka1Var2.m39276b(wja1Var2.f251922a, wja1Var2.f251923b);
                }
                return eka1Var2;
            case 5:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 6:
                return sam.m77645B("");
            case 7:
                return null;
            case 8:
                return "";
            case 9:
                return null;
            case 10:
                ql51 ql51Var = ql51.f189738a;
                return new pn80(ql51Var, ql51Var);
            case 11:
            case 12:
                return w2a1Var;
            case 13:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 14:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 15:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 16:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 17:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 18:
                ql51 ql51Var2 = ql51.f189738a;
                return new pn80(ql51Var2, ql51Var2);
            case 19:
                return Boolean.FALSE;
            case 20:
                return new mj5(e450.f55982a, 0);
            case 21:
                return new mj5(bq50.f29679a, 0);
            case 22:
                eka1 eka1Var3 = new eka1();
                for (wja1 wja1Var3 : bup0.f31193b) {
                    eka1Var3.m39276b(wja1Var3.f251922a, wja1Var3.f251923b);
                }
                return eka1Var3;
            case 23:
                return w2a1Var;
            case 24:
                return new mj5(ql51.f189738a, 0);
            case 25:
                return MainThreadWorkRunner.m15627a();
            case 26:
                return Locale.forLanguageTag(ihf1.m50635s());
            case 27:
                return new mj5(exq0.f63836a, 0);
            case 28:
                return new mj5(kgd1.f122375a, 0);
            default:
                return new mj5(vgy.f241338a, 0);
        }
    }
}
