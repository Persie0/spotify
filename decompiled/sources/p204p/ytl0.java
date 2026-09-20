package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes10.dex */
public final class ytl0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final ytl0 f276146L0;

    /* JADX INFO: renamed from: M0 */
    public static final ytl0 f276147M0;

    /* JADX INFO: renamed from: N0 */
    public static final ytl0 f276148N0;

    /* JADX INFO: renamed from: O0 */
    public static final ytl0 f276149O0;

    /* JADX INFO: renamed from: P0 */
    public static final ytl0 f276150P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ytl0 f276151Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ytl0 f276152R0;

    /* JADX INFO: renamed from: S0 */
    public static final ytl0 f276153S0;

    /* JADX INFO: renamed from: T0 */
    public static final ytl0 f276154T0;

    /* JADX INFO: renamed from: U0 */
    public static final ytl0 f276155U0;

    /* JADX INFO: renamed from: V0 */
    public static final ytl0 f276156V0;

    /* JADX INFO: renamed from: W0 */
    public static final ytl0 f276157W0;

    /* JADX INFO: renamed from: X */
    public static final ytl0 f276158X;

    /* JADX INFO: renamed from: X0 */
    public static final ytl0 f276159X0;

    /* JADX INFO: renamed from: Y */
    public static final ytl0 f276160Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ytl0 f276161Y0;

    /* JADX INFO: renamed from: Z */
    public static final ytl0 f276162Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ytl0 f276163Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ytl0 f276164a1;

    /* JADX INFO: renamed from: b */
    public static final ytl0 f276165b;

    /* JADX INFO: renamed from: b1 */
    public static final ytl0 f276166b1;

    /* JADX INFO: renamed from: c */
    public static final ytl0 f276167c;

    /* JADX INFO: renamed from: c1 */
    public static final ytl0 f276168c1;

    /* JADX INFO: renamed from: d */
    public static final ytl0 f276169d;

    /* JADX INFO: renamed from: e */
    public static final ytl0 f276170e;

    /* JADX INFO: renamed from: f */
    public static final ytl0 f276171f;

    /* JADX INFO: renamed from: g */
    public static final ytl0 f276172g;

    /* JADX INFO: renamed from: h */
    public static final ytl0 f276173h;

    /* JADX INFO: renamed from: i */
    public static final ytl0 f276174i;

    /* JADX INFO: renamed from: t */
    public static final ytl0 f276175t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276176a;

    static {
        int i = 0;
        f276165b = new ytl0(i, 0);
        f276167c = new ytl0(i, 1);
        f276169d = new ytl0(i, 2);
        f276170e = new ytl0(i, 3);
        f276171f = new ytl0(i, 4);
        f276172g = new ytl0(i, 5);
        f276173h = new ytl0(i, 6);
        f276174i = new ytl0(i, 7);
        f276175t = new ytl0(i, 8);
        f276158X = new ytl0(i, 9);
        f276160Y = new ytl0(i, 10);
        f276162Z = new ytl0(i, 11);
        f276146L0 = new ytl0(i, 12);
        f276147M0 = new ytl0(i, 13);
        f276148N0 = new ytl0(i, 14);
        f276149O0 = new ytl0(i, 15);
        f276150P0 = new ytl0(i, 16);
        f276151Q0 = new ytl0(i, 17);
        f276152R0 = new ytl0(i, 18);
        f276153S0 = new ytl0(i, 19);
        f276154T0 = new ytl0(i, 20);
        f276155U0 = new ytl0(i, 21);
        f276156V0 = new ytl0(i, 22);
        f276157W0 = new ytl0(i, 23);
        f276159X0 = new ytl0(i, 24);
        f276161Y0 = new ytl0(i, 25);
        f276163Z0 = new ytl0(i, 26);
        f276164a1 = new ytl0(i, 27);
        f276166b1 = new ytl0(i, 28);
        f276168c1 = new ytl0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ytl0(int i, int i2) {
        super(i);
        this.f276176a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f276176a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 1:
                return w2a1Var;
            case 2:
                return sam.m77645B(new o971(0L, 6, ""));
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return w2a1Var;
            case 11:
                throw new IllegalStateException("no page properties available - is your composable really in a Page?");
            case 12:
                throw new IllegalStateException("no PageUiContext available - is your composable really in a Page?");
            case 13:
                return "";
            case 14:
                return slj0.f210432a;
            case 15:
                return sam.m77645B(null);
            case 16:
                return null;
            case 17:
                return vgg1.m85475p("com.spotify.blend.tastematch.api.group.PageType", nlm0.values(), new String[]{"PENDING_INVITATION", "READY_TO_JOIN_EMPTY_BLEND", "READY_TO_JOIN_ALREADY_CREATED_BLEND", "MAX_MEMBERS", "ALREADY_JOINED", "DELETED"}, new Annotation[][]{null, null, null, null, null, null});
            case 18:
                throw new IllegalStateException("no LocalPageUIEventProviderOwner available - is your composable really in a Page?");
            case 19:
                return w2a1Var;
            case 20:
                return sam.m77645B(null);
            case 21:
                return w2a1Var;
            case 22:
                return sam.m77645B(Boolean.FALSE);
            case 23:
                eka1 eka1Var = new eka1();
                for (wja1 wja1Var : izm0.f107261b) {
                    eka1Var.m39276b(wja1Var.f251922a, wja1Var.f251923b);
                }
                return eka1Var;
            case 24:
                return new vzv("com.spotify.partnerapps.domain.api.PartnerIntegrationsEntry.ConnectionStatus", u5n0.values());
            case 25:
                return new mj5(s5n0.f205866a, 0);
            case 26:
            case 27:
                return w2a1Var;
            case 28:
                return new mj5(ql51.f189738a, 0);
            default:
                return pp91.m70528i();
        }
    }
}
