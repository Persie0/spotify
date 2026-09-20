package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes5.dex */
public final class bba0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final bba0 f25492L0;

    /* JADX INFO: renamed from: M0 */
    public static final bba0 f25493M0;

    /* JADX INFO: renamed from: N0 */
    public static final bba0 f25494N0;

    /* JADX INFO: renamed from: O0 */
    public static final bba0 f25495O0;

    /* JADX INFO: renamed from: P0 */
    public static final bba0 f25496P0;

    /* JADX INFO: renamed from: Q0 */
    public static final bba0 f25497Q0;

    /* JADX INFO: renamed from: R0 */
    public static final bba0 f25498R0;

    /* JADX INFO: renamed from: S0 */
    public static final bba0 f25499S0;

    /* JADX INFO: renamed from: T0 */
    public static final bba0 f25500T0;

    /* JADX INFO: renamed from: U0 */
    public static final bba0 f25501U0;

    /* JADX INFO: renamed from: V0 */
    public static final bba0 f25502V0;

    /* JADX INFO: renamed from: W0 */
    public static final bba0 f25503W0;

    /* JADX INFO: renamed from: X */
    public static final bba0 f25504X;

    /* JADX INFO: renamed from: X0 */
    public static final bba0 f25505X0;

    /* JADX INFO: renamed from: Y */
    public static final bba0 f25506Y;

    /* JADX INFO: renamed from: Y0 */
    public static final bba0 f25507Y0;

    /* JADX INFO: renamed from: Z */
    public static final bba0 f25508Z;

    /* JADX INFO: renamed from: Z0 */
    public static final bba0 f25509Z0;

    /* JADX INFO: renamed from: a1 */
    public static final bba0 f25510a1;

    /* JADX INFO: renamed from: b */
    public static final bba0 f25511b;

    /* JADX INFO: renamed from: b1 */
    public static final bba0 f25512b1;

    /* JADX INFO: renamed from: c */
    public static final bba0 f25513c;

    /* JADX INFO: renamed from: c1 */
    public static final bba0 f25514c1;

    /* JADX INFO: renamed from: d */
    public static final bba0 f25515d;

    /* JADX INFO: renamed from: e */
    public static final bba0 f25516e;

    /* JADX INFO: renamed from: f */
    public static final bba0 f25517f;

    /* JADX INFO: renamed from: g */
    public static final bba0 f25518g;

    /* JADX INFO: renamed from: h */
    public static final bba0 f25519h;

    /* JADX INFO: renamed from: i */
    public static final bba0 f25520i;

    /* JADX INFO: renamed from: t */
    public static final bba0 f25521t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25522a;

    static {
        int i = 0;
        f25511b = new bba0(i, 0);
        f25513c = new bba0(i, 1);
        f25515d = new bba0(i, 2);
        f25516e = new bba0(i, 3);
        f25517f = new bba0(i, 4);
        f25518g = new bba0(i, 5);
        f25519h = new bba0(i, 6);
        f25520i = new bba0(i, 7);
        f25521t = new bba0(i, 8);
        f25504X = new bba0(i, 9);
        f25506Y = new bba0(i, 10);
        f25508Z = new bba0(i, 11);
        f25492L0 = new bba0(i, 12);
        f25493M0 = new bba0(i, 13);
        f25494N0 = new bba0(i, 14);
        f25495O0 = new bba0(i, 15);
        f25496P0 = new bba0(i, 16);
        f25497Q0 = new bba0(i, 17);
        f25498R0 = new bba0(i, 18);
        f25499S0 = new bba0(i, 19);
        f25500T0 = new bba0(i, 20);
        f25501U0 = new bba0(i, 21);
        f25502V0 = new bba0(i, 22);
        f25503W0 = new bba0(i, 23);
        f25505X0 = new bba0(i, 24);
        f25507Y0 = new bba0(i, 25);
        f25509Z0 = new bba0(i, 26);
        f25510a1 = new bba0(i, 27);
        f25512b1 = new bba0(i, 28);
        f25514c1 = new bba0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bba0(int i, int i2) {
        super(i);
        this.f25522a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f25522a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                throw new IllegalStateException("No BetamaxPlayerPool found in local composition");
            case 1:
                throw new IllegalStateException("No BetamaxCacheStorage found in local composition");
            case 2:
                throw new IllegalStateException("No CampfireProperties found in local composition");
            case 3:
                throw new IllegalStateException("No clock instance provided");
            case 4:
                throw new IllegalStateException("No clock instance provided");
            case 5:
                return rfg1.m75446p(0, 0.0f, 14);
            case 6:
                return fij.f69895a;
            case 7:
                throw new IllegalStateException("DataLoader snapshot is not provided.");
            case 8:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 9:
                return new n6f(n6f.f150866f);
            case 10:
                return xwt.f266743a;
            case 11:
            case 12:
            case 13:
                return null;
            case 14:
                throw new IllegalStateException("No AdCarouselItemElement provided.");
            case 15:
                throw new IllegalStateException("No ImageGalleryLogger provided.");
            case 16:
                throw new IllegalStateException("No MediaContentElement provided.");
            case 17:
                throw new IllegalStateException("No PlayButtonElement provided.");
            case 18:
                throw new IllegalStateException("No ThumbnailElement provided.");
            case 19:
                throw new IllegalStateException("No BetamaxCacheStorage found in local composition");
            case 20:
                throw new IllegalStateException("No BetamaxPlayerPool found in local composition");
            case 21:
                throw new IllegalStateException("No Clock found in local composition");
            case 22:
                throw new IllegalStateException(("No " + qpv0.f191387a.mo54112b(nu01.class).mo29111F() + " found in local composition").toString());
            case 23:
                throw new IllegalStateException("No ViewModel factory map provided");
            case 24:
                return null;
            case 25:
            case 26:
            case 27:
                return w2a1Var;
            case 28:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            default:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
        }
    }
}
