package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes6.dex */
public final class sfe0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final sfe0 f208544L0;

    /* JADX INFO: renamed from: M0 */
    public static final sfe0 f208545M0;

    /* JADX INFO: renamed from: N0 */
    public static final sfe0 f208546N0;

    /* JADX INFO: renamed from: O0 */
    public static final sfe0 f208547O0;

    /* JADX INFO: renamed from: P0 */
    public static final sfe0 f208548P0;

    /* JADX INFO: renamed from: Q0 */
    public static final sfe0 f208549Q0;

    /* JADX INFO: renamed from: R0 */
    public static final sfe0 f208550R0;

    /* JADX INFO: renamed from: S0 */
    public static final sfe0 f208551S0;

    /* JADX INFO: renamed from: T0 */
    public static final sfe0 f208552T0;

    /* JADX INFO: renamed from: U0 */
    public static final sfe0 f208553U0;

    /* JADX INFO: renamed from: V0 */
    public static final sfe0 f208554V0;

    /* JADX INFO: renamed from: W0 */
    public static final sfe0 f208555W0;

    /* JADX INFO: renamed from: X */
    public static final sfe0 f208556X;

    /* JADX INFO: renamed from: X0 */
    public static final sfe0 f208557X0;

    /* JADX INFO: renamed from: Y */
    public static final sfe0 f208558Y;

    /* JADX INFO: renamed from: Y0 */
    public static final sfe0 f208559Y0;

    /* JADX INFO: renamed from: Z */
    public static final sfe0 f208560Z;

    /* JADX INFO: renamed from: Z0 */
    public static final sfe0 f208561Z0;

    /* JADX INFO: renamed from: a1 */
    public static final sfe0 f208562a1;

    /* JADX INFO: renamed from: b */
    public static final sfe0 f208563b;

    /* JADX INFO: renamed from: b1 */
    public static final sfe0 f208564b1;

    /* JADX INFO: renamed from: c */
    public static final sfe0 f208565c;

    /* JADX INFO: renamed from: c1 */
    public static final sfe0 f208566c1;

    /* JADX INFO: renamed from: d */
    public static final sfe0 f208567d;

    /* JADX INFO: renamed from: e */
    public static final sfe0 f208568e;

    /* JADX INFO: renamed from: f */
    public static final sfe0 f208569f;

    /* JADX INFO: renamed from: g */
    public static final sfe0 f208570g;

    /* JADX INFO: renamed from: h */
    public static final sfe0 f208571h;

    /* JADX INFO: renamed from: i */
    public static final sfe0 f208572i;

    /* JADX INFO: renamed from: t */
    public static final sfe0 f208573t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f208574a;

    static {
        int i = 0;
        f208563b = new sfe0(i, 0);
        f208565c = new sfe0(i, 1);
        f208567d = new sfe0(i, 2);
        f208568e = new sfe0(i, 3);
        f208569f = new sfe0(i, 4);
        f208570g = new sfe0(i, 5);
        f208571h = new sfe0(i, 6);
        f208572i = new sfe0(i, 7);
        f208573t = new sfe0(i, 8);
        f208556X = new sfe0(i, 9);
        f208558Y = new sfe0(i, 10);
        f208560Z = new sfe0(i, 11);
        f208544L0 = new sfe0(i, 12);
        f208545M0 = new sfe0(i, 13);
        f208546N0 = new sfe0(i, 14);
        f208547O0 = new sfe0(i, 15);
        f208548P0 = new sfe0(i, 16);
        f208549Q0 = new sfe0(i, 17);
        f208550R0 = new sfe0(i, 18);
        f208551S0 = new sfe0(i, 19);
        f208552T0 = new sfe0(i, 20);
        f208553U0 = new sfe0(i, 21);
        f208554V0 = new sfe0(i, 22);
        f208555W0 = new sfe0(i, 23);
        f208557X0 = new sfe0(i, 24);
        f208559Y0 = new sfe0(i, 25);
        f208561Z0 = new sfe0(i, 26);
        f208562a1 = new sfe0(i, 27);
        f208564b1 = new sfe0(i, 28);
        f208566c1 = new sfe0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfe0(int i, int i2) {
        super(i);
        this.f208574a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f208574a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return w2a1Var;
            case 1:
                return new mj5(lje0.f134074a, 0);
            case 2:
                return sam.m77645B(Boolean.TRUE);
            case 3:
                return sam.m77645B(Boolean.FALSE);
            case 4:
                return new vzv("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingError", fte0.values());
            case 5:
                return w2a1Var;
            case 6:
                ql51 ql51Var = ql51.f189738a;
                return new pn80(ql51Var, new mj5(ql51Var, 1));
            case 7:
                return Boolean.FALSE;
            case 8:
                throw new IllegalStateException("LocalMidSectionItemIndex not provided. Only available inside a MidSection element.");
            case 9:
                return new mj5(ql51.f189738a, 1);
            case 10:
                return new pn80(ql51.f189738a, u2b0.f226058a);
            case 11:
                return w2a1Var;
            case 12:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 13:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 14:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 15:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 16:
                return new mj5(bid.f27401a, 0);
            case 17:
                return null;
            case 18:
            case 19:
            case 20:
                return w2a1Var;
            case 21:
                return null;
            case 22:
                return "Exactly one option title property must be populated.";
            case 23:
                return "Only one option description property may be populated.";
            case 24:
                return "";
            case 25:
                return WorkRunners.m15651a();
            case 26:
                return WorkRunners.m15651a();
            case 27:
                return w2a1Var;
            case 28:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            default:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
        }
    }
}
