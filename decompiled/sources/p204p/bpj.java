package p204p;

import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class bpj extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final bpj f29484L0;

    /* JADX INFO: renamed from: M0 */
    public static final bpj f29485M0;

    /* JADX INFO: renamed from: N0 */
    public static final bpj f29486N0;

    /* JADX INFO: renamed from: O0 */
    public static final bpj f29487O0;

    /* JADX INFO: renamed from: P0 */
    public static final bpj f29488P0;

    /* JADX INFO: renamed from: Q0 */
    public static final bpj f29489Q0;

    /* JADX INFO: renamed from: R0 */
    public static final bpj f29490R0;

    /* JADX INFO: renamed from: S0 */
    public static final bpj f29491S0;

    /* JADX INFO: renamed from: T0 */
    public static final bpj f29492T0;

    /* JADX INFO: renamed from: U0 */
    public static final bpj f29493U0;

    /* JADX INFO: renamed from: V0 */
    public static final bpj f29494V0;

    /* JADX INFO: renamed from: W0 */
    public static final bpj f29495W0;

    /* JADX INFO: renamed from: X */
    public static final bpj f29496X;

    /* JADX INFO: renamed from: X0 */
    public static final bpj f29497X0;

    /* JADX INFO: renamed from: Y */
    public static final bpj f29498Y;

    /* JADX INFO: renamed from: Y0 */
    public static final bpj f29499Y0;

    /* JADX INFO: renamed from: Z */
    public static final bpj f29500Z;

    /* JADX INFO: renamed from: Z0 */
    public static final bpj f29501Z0;

    /* JADX INFO: renamed from: a1 */
    public static final bpj f29502a1;

    /* JADX INFO: renamed from: b */
    public static final bpj f29503b;

    /* JADX INFO: renamed from: b1 */
    public static final bpj f29504b1;

    /* JADX INFO: renamed from: c */
    public static final bpj f29505c;

    /* JADX INFO: renamed from: c1 */
    public static final bpj f29506c1;

    /* JADX INFO: renamed from: d */
    public static final bpj f29507d;

    /* JADX INFO: renamed from: e */
    public static final bpj f29508e;

    /* JADX INFO: renamed from: f */
    public static final bpj f29509f;

    /* JADX INFO: renamed from: g */
    public static final bpj f29510g;

    /* JADX INFO: renamed from: h */
    public static final bpj f29511h;

    /* JADX INFO: renamed from: i */
    public static final bpj f29512i;

    /* JADX INFO: renamed from: t */
    public static final bpj f29513t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29514a;

    static {
        int i = 0;
        f29503b = new bpj(i, 0);
        f29505c = new bpj(i, 1);
        f29507d = new bpj(i, 2);
        f29508e = new bpj(i, 3);
        f29509f = new bpj(i, 4);
        f29510g = new bpj(i, 5);
        f29511h = new bpj(i, 6);
        f29512i = new bpj(i, 7);
        f29513t = new bpj(i, 8);
        f29496X = new bpj(i, 9);
        f29498Y = new bpj(i, 10);
        f29500Z = new bpj(i, 11);
        f29484L0 = new bpj(i, 12);
        f29485M0 = new bpj(i, 13);
        f29486N0 = new bpj(i, 14);
        f29487O0 = new bpj(i, 15);
        f29488P0 = new bpj(i, 16);
        f29489Q0 = new bpj(i, 17);
        f29490R0 = new bpj(i, 18);
        f29491S0 = new bpj(i, 19);
        f29492T0 = new bpj(i, 20);
        f29493U0 = new bpj(i, 21);
        f29494V0 = new bpj(i, 22);
        f29495W0 = new bpj(i, 23);
        f29497X0 = new bpj(i, 24);
        f29499Y0 = new bpj(i, 25);
        f29501Z0 = new bpj(i, 26);
        f29502a1 = new bpj(i, 27);
        f29504b1 = new bpj(i, 28);
        f29506c1 = new bpj(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpj(int i, int i2) {
        super(i);
        this.f29514a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f29514a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 1:
                return new rze();
            case 2:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 3:
                return new q4k(null, false, false, false, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741823);
            case 4:
                return new q4k(null, false, false, false, false, false, false, null, false, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741823);
            case 5:
                return s571.m77246e(w4u0.f247891b.mo29121f(), "fallback-");
            case 6:
                return w2a1Var;
            case 7:
                return sam.m77645B(Boolean.FALSE);
            case 8:
                st91 st91Var = st91.f213865b;
                return new gug0();
            case 9:
                throw new IllegalStateException("No AnimatedVisibilityScope provided");
            case 10:
                throw new IllegalStateException("No SharedTransitionScope provided");
            case 11:
                return w2a1Var;
            case 12:
                return Double.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            case 13:
                return new File("/proc/self/stat");
            case 14:
                return new File("/proc/self/stat");
            case 15:
                return FirebaseCrashlytics.getInstance();
            case 16:
            case 17:
                return w2a1Var;
            case 18:
                return sam.m77645B("");
            case 19:
                return w2a1Var;
            case 20:
                return sam.m77645B(Boolean.TRUE);
            case 21:
                return new mj5(ql51.f189738a, 0);
            case 22:
                return jag1.m52819d(new m6s0(nau.f152117a));
            case 23:
                return pp91.m70528i();
            case 24:
                return new mj5(t940.f218186a, 0);
            case 25:
            case 26:
                return w2a1Var;
            case 27:
                return sam.m77645B(null);
            case 28:
            default:
                return w2a1Var;
        }
    }
}
