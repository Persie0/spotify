package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes9.dex */
public final class z3a0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final z3a0 f278823L0;

    /* JADX INFO: renamed from: M0 */
    public static final z3a0 f278824M0;

    /* JADX INFO: renamed from: N0 */
    public static final z3a0 f278825N0;

    /* JADX INFO: renamed from: O0 */
    public static final z3a0 f278826O0;

    /* JADX INFO: renamed from: P0 */
    public static final z3a0 f278827P0;

    /* JADX INFO: renamed from: Q0 */
    public static final z3a0 f278828Q0;

    /* JADX INFO: renamed from: R0 */
    public static final z3a0 f278829R0;

    /* JADX INFO: renamed from: S0 */
    public static final z3a0 f278830S0;

    /* JADX INFO: renamed from: T0 */
    public static final z3a0 f278831T0;

    /* JADX INFO: renamed from: U0 */
    public static final z3a0 f278832U0;

    /* JADX INFO: renamed from: V0 */
    public static final z3a0 f278833V0;

    /* JADX INFO: renamed from: W0 */
    public static final z3a0 f278834W0;

    /* JADX INFO: renamed from: X */
    public static final z3a0 f278835X;

    /* JADX INFO: renamed from: X0 */
    public static final z3a0 f278836X0;

    /* JADX INFO: renamed from: Y */
    public static final z3a0 f278837Y;

    /* JADX INFO: renamed from: Y0 */
    public static final z3a0 f278838Y0;

    /* JADX INFO: renamed from: Z */
    public static final z3a0 f278839Z;

    /* JADX INFO: renamed from: Z0 */
    public static final z3a0 f278840Z0;

    /* JADX INFO: renamed from: a1 */
    public static final z3a0 f278841a1;

    /* JADX INFO: renamed from: b */
    public static final z3a0 f278842b;

    /* JADX INFO: renamed from: b1 */
    public static final z3a0 f278843b1;

    /* JADX INFO: renamed from: c */
    public static final z3a0 f278844c;

    /* JADX INFO: renamed from: c1 */
    public static final z3a0 f278845c1;

    /* JADX INFO: renamed from: d */
    public static final z3a0 f278846d;

    /* JADX INFO: renamed from: e */
    public static final z3a0 f278847e;

    /* JADX INFO: renamed from: f */
    public static final z3a0 f278848f;

    /* JADX INFO: renamed from: g */
    public static final z3a0 f278849g;

    /* JADX INFO: renamed from: h */
    public static final z3a0 f278850h;

    /* JADX INFO: renamed from: i */
    public static final z3a0 f278851i;

    /* JADX INFO: renamed from: t */
    public static final z3a0 f278852t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278853a;

    static {
        int i = 1;
        f278842b = new z3a0(i, 0);
        f278844c = new z3a0(i, 1);
        f278846d = new z3a0(i, 2);
        f278847e = new z3a0(i, 3);
        f278848f = new z3a0(i, 4);
        f278849g = new z3a0(i, 5);
        f278850h = new z3a0(i, 6);
        f278851i = new z3a0(i, 7);
        f278852t = new z3a0(i, 8);
        f278835X = new z3a0(i, 9);
        f278837Y = new z3a0(i, 10);
        f278839Z = new z3a0(i, 11);
        f278823L0 = new z3a0(i, 12);
        f278824M0 = new z3a0(i, 13);
        f278825N0 = new z3a0(i, 14);
        f278826O0 = new z3a0(i, 15);
        f278827P0 = new z3a0(i, 16);
        f278828Q0 = new z3a0(i, 17);
        f278829R0 = new z3a0(i, 18);
        f278830S0 = new z3a0(i, 19);
        f278831T0 = new z3a0(i, 20);
        f278832U0 = new z3a0(i, 21);
        f278833V0 = new z3a0(i, 22);
        f278834W0 = new z3a0(i, 23);
        f278836X0 = new z3a0(i, 24);
        f278838Y0 = new z3a0(i, 25);
        f278840Z0 = new z3a0(i, 26);
        f278841a1 = new z3a0(i, 27);
        f278843b1 = new z3a0(i, 28);
        f278845c1 = new z3a0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3a0(int i, int i2) {
        super(i);
        this.f278853a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f278853a) {
            case 0:
                return Boolean.valueOf(obj instanceof daj);
            case 1:
                if (obj != null) {
                    return (daj) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
            case 2:
                return (gtx0) obj;
            case 3:
                return (v791) obj;
            case 4:
                return (qpu0) obj;
            case 5:
                return (vy81) obj;
            case 6:
                return Boolean.valueOf(obj instanceof vy81);
            case 7:
                if (obj != null) {
                    return (vy81) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
            case 8:
                return w2a1.f247311a;
            case 9:
                uw70.m84090b((uw70) obj, Alert.DURATION_SHOW_INDEFINITELY, null, bqg.f29811a, 6);
                return w2a1.f247311a;
            case 10:
                oig1.m67028p((uoz0) obj, "TEST_TAG_LOADING");
                return w2a1.f247311a;
            case 11:
                wy41 wy41Var = AndroidCompositionLocals_androidKt.f502b;
                wpn0 wpn0Var = (wpn0) obj;
                wpn0Var.getClass();
                Context baseContext = (Context) rqg1.m76244o(wpn0Var, wy41Var);
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        return (Activity) baseContext;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                baseContext = null;
                return (Activity) baseContext;
            case 12:
                return w2a1.f247311a;
            case 13:
                return new sca0(((ty80) obj).f224877f.f271256a);
            case 14:
                return new vfa0(((ufa0) obj).f229733a);
            case 15:
                ((icp) obj).f100858d = new C1870fr(5, 22, (fbk) null);
                return w2a1.f247311a;
            case 16:
                return w2a1.f247311a;
            case 17:
                jpz0.m54004r((mpz0) obj, 0);
                return w2a1.f247311a;
            case 18:
                return wl51.m88491o1((String) obj).toString();
            case 19:
                return pp91.m70529j(new pqm0("LocationSearchModel", (wka0) obj));
            case 20:
                String str = xoc1.f264224x1.f243453a;
                String str2 = ((hla0) obj).f92656a;
                return str2 != null ? klh.m56834f(str, "?pageState=", str2) : str;
            case 21:
                dna0 dna0Var = (dna0) obj;
                return new uoa0(dna0Var, h1m0.f86661d, stf1.m79250j(dna0Var));
            case 22:
                return w2a1.f247311a;
            case 23:
                return w2a1.f247311a;
            case 24:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 25:
                jpz0.m54004r((mpz0) obj, 0);
                return w2a1.f247311a;
            case 26:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 27:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 28:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            default:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
        }
    }
}
