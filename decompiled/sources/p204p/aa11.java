package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.signup.signup.p150v2.proto.Tracking;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class aa11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final aa11 f13708L0;

    /* JADX INFO: renamed from: M0 */
    public static final aa11 f13709M0;

    /* JADX INFO: renamed from: N0 */
    public static final aa11 f13710N0;

    /* JADX INFO: renamed from: O0 */
    public static final aa11 f13711O0;

    /* JADX INFO: renamed from: P0 */
    public static final aa11 f13712P0;

    /* JADX INFO: renamed from: Q0 */
    public static final aa11 f13713Q0;

    /* JADX INFO: renamed from: R0 */
    public static final aa11 f13714R0;

    /* JADX INFO: renamed from: S0 */
    public static final aa11 f13715S0;

    /* JADX INFO: renamed from: T0 */
    public static final aa11 f13716T0;

    /* JADX INFO: renamed from: U0 */
    public static final aa11 f13717U0;

    /* JADX INFO: renamed from: V0 */
    public static final aa11 f13718V0;

    /* JADX INFO: renamed from: W0 */
    public static final aa11 f13719W0;

    /* JADX INFO: renamed from: X */
    public static final aa11 f13720X;

    /* JADX INFO: renamed from: X0 */
    public static final aa11 f13721X0;

    /* JADX INFO: renamed from: Y */
    public static final aa11 f13722Y;

    /* JADX INFO: renamed from: Y0 */
    public static final aa11 f13723Y0;

    /* JADX INFO: renamed from: Z */
    public static final aa11 f13724Z;

    /* JADX INFO: renamed from: Z0 */
    public static final aa11 f13725Z0;

    /* JADX INFO: renamed from: a1 */
    public static final aa11 f13726a1;

    /* JADX INFO: renamed from: b */
    public static final aa11 f13727b;

    /* JADX INFO: renamed from: b1 */
    public static final aa11 f13728b1;

    /* JADX INFO: renamed from: c */
    public static final aa11 f13729c;

    /* JADX INFO: renamed from: c1 */
    public static final aa11 f13730c1;

    /* JADX INFO: renamed from: d */
    public static final aa11 f13731d;

    /* JADX INFO: renamed from: e */
    public static final aa11 f13732e;

    /* JADX INFO: renamed from: f */
    public static final aa11 f13733f;

    /* JADX INFO: renamed from: g */
    public static final aa11 f13734g;

    /* JADX INFO: renamed from: h */
    public static final aa11 f13735h;

    /* JADX INFO: renamed from: i */
    public static final aa11 f13736i;

    /* JADX INFO: renamed from: t */
    public static final aa11 f13737t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13738a;

    static {
        int i = 0;
        f13727b = new aa11(i, 0);
        f13729c = new aa11(i, 1);
        f13731d = new aa11(i, 2);
        f13732e = new aa11(i, 3);
        f13733f = new aa11(i, 4);
        f13734g = new aa11(i, 5);
        f13735h = new aa11(i, 6);
        f13736i = new aa11(i, 7);
        f13737t = new aa11(i, 8);
        f13720X = new aa11(i, 9);
        f13722Y = new aa11(i, 10);
        f13724Z = new aa11(i, 11);
        f13708L0 = new aa11(i, 12);
        f13709M0 = new aa11(i, 13);
        f13710N0 = new aa11(i, 14);
        f13711O0 = new aa11(i, 15);
        f13712P0 = new aa11(i, 16);
        f13713Q0 = new aa11(i, 17);
        f13714R0 = new aa11(i, 18);
        f13715S0 = new aa11(i, 19);
        f13716T0 = new aa11(i, 20);
        f13717U0 = new aa11(i, 21);
        f13718V0 = new aa11(i, 22);
        f13719W0 = new aa11(i, 23);
        f13721X0 = new aa11(i, 24);
        f13723Y0 = new aa11(i, 25);
        f13725Z0 = new aa11(i, 26);
        f13726a1 = new aa11(i, 27);
        f13728b1 = new aa11(i, 28);
        f13730c1 = new aa11(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa11(int i, int i2) {
        super(i);
        this.f13738a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f13738a;
        w2a1 w2a1Var = w2a1.f247311a;
        a2w a2wVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 1:
                return null;
            case 2:
                return new pn80(ql51.f189738a, bc11.f25750a);
            case 3:
                return null;
            case 4:
                return UUID.randomUUID().toString();
            case 5:
                return new vl11(new bq11(new ql11(a2wVar, new pl11(null, Collections.singletonMap("formatListAttributes", Boolean.TRUE)), 5)), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 262141);
            case 6:
                return Boolean.TRUE;
            case 7:
            case 8:
            case 9:
                return w2a1Var;
            case 10:
                return new ew6(3);
            case 11:
                return new vkj0();
            case 12:
                return null;
            case 13:
                return w2a1Var;
            case 14:
                gt81 gt81VarM21404r = Tracking.m21404r();
                gt81VarM21404r.m45680q();
                return (Tracking) gt81VarM21404r.build();
            case 15:
                ql51 ql51Var = ql51.f189738a;
                return new pn80(ql51Var, ql51Var);
            case 16:
                return new lme(503, "Timed out waiting for client token");
            case 17:
                return null;
            case 18:
                return Boolean.TRUE;
            case 19:
                st91 st91Var = st91.f213865b;
                return new zng0();
            case 20:
                return sam.m77645B(Boolean.FALSE);
            case 21:
                return "wearable";
            case 22:
                return new nfg0();
            case 23:
                return null;
            case 24:
                return WorkRunners.m15651a();
            case 25:
                return WorkRunners.m15651a();
            case 26:
                return new n6f(n6f.f150871k);
            case 27:
                return new po31(0);
            case 28:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            default:
                return Boolean.FALSE;
        }
    }
}
