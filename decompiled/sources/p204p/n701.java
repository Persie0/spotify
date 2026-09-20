package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes10.dex */
public final class n701 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final n701 f151001L0;

    /* JADX INFO: renamed from: M0 */
    public static final n701 f151002M0;

    /* JADX INFO: renamed from: N0 */
    public static final n701 f151003N0;

    /* JADX INFO: renamed from: O0 */
    public static final n701 f151004O0;

    /* JADX INFO: renamed from: P0 */
    public static final n701 f151005P0;

    /* JADX INFO: renamed from: Q0 */
    public static final n701 f151006Q0;

    /* JADX INFO: renamed from: R0 */
    public static final n701 f151007R0;

    /* JADX INFO: renamed from: S0 */
    public static final n701 f151008S0;

    /* JADX INFO: renamed from: T0 */
    public static final n701 f151009T0;

    /* JADX INFO: renamed from: U0 */
    public static final n701 f151010U0;

    /* JADX INFO: renamed from: V0 */
    public static final n701 f151011V0;

    /* JADX INFO: renamed from: W0 */
    public static final n701 f151012W0;

    /* JADX INFO: renamed from: X */
    public static final n701 f151013X;

    /* JADX INFO: renamed from: X0 */
    public static final n701 f151014X0;

    /* JADX INFO: renamed from: Y */
    public static final n701 f151015Y;

    /* JADX INFO: renamed from: Y0 */
    public static final n701 f151016Y0;

    /* JADX INFO: renamed from: Z */
    public static final n701 f151017Z;

    /* JADX INFO: renamed from: Z0 */
    public static final n701 f151018Z0;

    /* JADX INFO: renamed from: a1 */
    public static final n701 f151019a1;

    /* JADX INFO: renamed from: b */
    public static final n701 f151020b;

    /* JADX INFO: renamed from: b1 */
    public static final n701 f151021b1;

    /* JADX INFO: renamed from: c */
    public static final n701 f151022c;

    /* JADX INFO: renamed from: c1 */
    public static final n701 f151023c1;

    /* JADX INFO: renamed from: d */
    public static final n701 f151024d;

    /* JADX INFO: renamed from: e */
    public static final n701 f151025e;

    /* JADX INFO: renamed from: f */
    public static final n701 f151026f;

    /* JADX INFO: renamed from: g */
    public static final n701 f151027g;

    /* JADX INFO: renamed from: h */
    public static final n701 f151028h;

    /* JADX INFO: renamed from: i */
    public static final n701 f151029i;

    /* JADX INFO: renamed from: t */
    public static final n701 f151030t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151031a;

    static {
        int i = 0;
        f151020b = new n701(i, 0);
        f151022c = new n701(i, 1);
        f151024d = new n701(i, 2);
        f151025e = new n701(i, 3);
        f151026f = new n701(i, 4);
        f151027g = new n701(i, 5);
        f151028h = new n701(i, 6);
        f151029i = new n701(i, 7);
        f151030t = new n701(i, 8);
        f151013X = new n701(i, 9);
        f151015Y = new n701(i, 10);
        f151017Z = new n701(i, 11);
        f151001L0 = new n701(i, 12);
        f151002M0 = new n701(i, 13);
        f151003N0 = new n701(i, 14);
        f151004O0 = new n701(i, 15);
        f151005P0 = new n701(i, 16);
        f151006Q0 = new n701(i, 17);
        f151007R0 = new n701(i, 18);
        f151008S0 = new n701(i, 19);
        f151009T0 = new n701(i, 20);
        f151010U0 = new n701(i, 21);
        f151011V0 = new n701(i, 22);
        f151012W0 = new n701(i, 23);
        f151014X0 = new n701(i, 24);
        f151016Y0 = new n701(i, 25);
        f151018Z0 = new n701(i, 26);
        f151019a1 = new n701(i, 27);
        f151021b1 = new n701(i, 28);
        f151023c1 = new n701(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n701(int i, int i2) {
        super(i);
        this.f151031a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f151031a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                return "Exactly one title property must be populated.";
            case 1:
                return "Exactly one message property must be populated.";
            case 2:
                return "Exactly one confirm button action text property must be populated.";
            case 3:
                return sam.m77645B(null);
            case 4:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 5:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 6:
                return sam.m77645B(new o971(0L, 7, (String) null));
            case 7:
                return "Only one section title property may be populated.";
            case 8:
                return "Only one section note property may be populated.";
            case 9:
                return "Exactly one title property must be populated.";
            case 10:
                return "Only one section note property may be populated.";
            case 11:
                return new vum0(0);
            case 12:
                return null;
            case 13:
                return h6f.m46715L(up01.f232548d, kp01.f124948d, rp01.f201396d, fp01.f71659d, bq01.f29640d, wp01.f253636d, xp01.f264405d, cq01.f40697d, dq01.f51788d, np01.f156838d, lp01.f135591d, mp01.f145818d, jp01.f114542d, hp01.f93667d, ip01.f104325d, eq01.f61756d, op01.f167731d, vp01.f243563d, zp01.f284897d, aq01.f18050d, tp01.f222377d, ep01.f61529d, qp01.f191110d, gp01.f83051d, yp01.f274789d, pp01.f179843d);
            case 14:
                return w2a1Var;
            case 15:
                ql51 ql51Var = ql51.f189738a;
                return new pn80(ql51Var, ql51Var);
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 18:
                return w2a1Var;
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory7 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 22:
                WorkRunners.MyThreadFactory myThreadFactory8 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 23:
                return w2a1Var;
            case 24:
                return sam.m77645B("");
            case 25:
                st91 st91Var = st91.f213865b;
                return new ydh0();
            case 26:
                return new ueh0(st91.f213865b);
            case 27:
            case 28:
                return w2a1Var;
            default:
                WorkRunners.MyThreadFactory myThreadFactory9 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
        }
    }
}
