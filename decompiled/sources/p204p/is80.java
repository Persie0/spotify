package p204p;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.ExecutorServiceWorkRunner;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class is80 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final is80 f105158L0;

    /* JADX INFO: renamed from: M0 */
    public static final is80 f105159M0;

    /* JADX INFO: renamed from: N0 */
    public static final is80 f105160N0;

    /* JADX INFO: renamed from: O0 */
    public static final is80 f105161O0;

    /* JADX INFO: renamed from: P0 */
    public static final is80 f105162P0;

    /* JADX INFO: renamed from: Q0 */
    public static final is80 f105163Q0;

    /* JADX INFO: renamed from: R0 */
    public static final is80 f105164R0;

    /* JADX INFO: renamed from: S0 */
    public static final is80 f105165S0;

    /* JADX INFO: renamed from: T0 */
    public static final is80 f105166T0;

    /* JADX INFO: renamed from: U0 */
    public static final is80 f105167U0;

    /* JADX INFO: renamed from: V0 */
    public static final is80 f105168V0;

    /* JADX INFO: renamed from: W0 */
    public static final is80 f105169W0;

    /* JADX INFO: renamed from: X */
    public static final is80 f105170X;

    /* JADX INFO: renamed from: X0 */
    public static final is80 f105171X0;

    /* JADX INFO: renamed from: Y */
    public static final is80 f105172Y;

    /* JADX INFO: renamed from: Y0 */
    public static final is80 f105173Y0;

    /* JADX INFO: renamed from: Z */
    public static final is80 f105174Z;

    /* JADX INFO: renamed from: Z0 */
    public static final is80 f105175Z0;

    /* JADX INFO: renamed from: a1 */
    public static final is80 f105176a1;

    /* JADX INFO: renamed from: b */
    public static final is80 f105177b;

    /* JADX INFO: renamed from: b1 */
    public static final is80 f105178b1;

    /* JADX INFO: renamed from: c */
    public static final is80 f105179c;

    /* JADX INFO: renamed from: c1 */
    public static final is80 f105180c1;

    /* JADX INFO: renamed from: d */
    public static final is80 f105181d;

    /* JADX INFO: renamed from: e */
    public static final is80 f105182e;

    /* JADX INFO: renamed from: f */
    public static final is80 f105183f;

    /* JADX INFO: renamed from: g */
    public static final is80 f105184g;

    /* JADX INFO: renamed from: h */
    public static final is80 f105185h;

    /* JADX INFO: renamed from: i */
    public static final is80 f105186i;

    /* JADX INFO: renamed from: t */
    public static final is80 f105187t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105188a;

    static {
        int i = 0;
        f105177b = new is80(i, 0);
        f105179c = new is80(i, 1);
        f105181d = new is80(i, 2);
        f105182e = new is80(i, 3);
        f105183f = new is80(i, 4);
        f105184g = new is80(i, 5);
        f105185h = new is80(i, 6);
        f105186i = new is80(i, 7);
        f105187t = new is80(i, 8);
        f105170X = new is80(i, 9);
        f105172Y = new is80(i, 10);
        f105174Z = new is80(i, 11);
        f105158L0 = new is80(i, 12);
        f105159M0 = new is80(i, 13);
        f105160N0 = new is80(i, 14);
        f105161O0 = new is80(i, 15);
        f105162P0 = new is80(i, 16);
        f105163Q0 = new is80(i, 17);
        f105164R0 = new is80(i, 18);
        f105165S0 = new is80(i, 19);
        f105166T0 = new is80(i, 20);
        f105167U0 = new is80(i, 21);
        f105168V0 = new is80(i, 22);
        f105169W0 = new is80(i, 23);
        f105171X0 = new is80(i, 24);
        f105173Y0 = new is80(i, 25);
        f105175Z0 = new is80(i, 26);
        f105176a1 = new is80(i, 27);
        f105178b1 = new is80(i, 28);
        f105180c1 = new is80(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is80(int i, int i2) {
        super(i);
        this.f105188a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f105188a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(WorkRunners.f5771a);
                Preconditions.m15649b(executorServiceNewCachedThreadPool);
                return new ExecutorServiceWorkRunner(executorServiceNewCachedThreadPool);
            case 1:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 2:
            case 3:
            case 4:
            case 5:
                return w2a1Var;
            case 6:
                return new sz80("", 0L);
            case 7:
                return new xz80(false, null, null);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return w2a1Var;
            case 18:
                ufo.Companion.getClass();
                return tfo.m80701a("not_logged_in");
            case 19:
                return pg90.Companion.serializer();
            case 20:
                return new vzv("com.spotify.audiobookpremium.listeninghoursrequest.ListeningHoursRequestResponseEnum", pg90.values());
            case 21:
            case 22:
            case 23:
                return w2a1Var;
            case 24:
                return null;
            case 25:
                return w2a1Var;
            case 26:
            case 27:
                return null;
            case 28:
                throw new IllegalStateException("No AttentionAreaTracker provided");
            default:
                return null;
        }
    }
}
