package p204p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class win0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final win0 f251687L0;

    /* JADX INFO: renamed from: M0 */
    public static final win0 f251688M0;

    /* JADX INFO: renamed from: N0 */
    public static final win0 f251689N0;

    /* JADX INFO: renamed from: O0 */
    public static final win0 f251690O0;

    /* JADX INFO: renamed from: P0 */
    public static final win0 f251691P0;

    /* JADX INFO: renamed from: Q0 */
    public static final win0 f251692Q0;

    /* JADX INFO: renamed from: R0 */
    public static final win0 f251693R0;

    /* JADX INFO: renamed from: S0 */
    public static final win0 f251694S0;

    /* JADX INFO: renamed from: T0 */
    public static final win0 f251695T0;

    /* JADX INFO: renamed from: U0 */
    public static final win0 f251696U0;

    /* JADX INFO: renamed from: V0 */
    public static final win0 f251697V0;

    /* JADX INFO: renamed from: W0 */
    public static final win0 f251698W0;

    /* JADX INFO: renamed from: X */
    public static final win0 f251699X;

    /* JADX INFO: renamed from: X0 */
    public static final win0 f251700X0;

    /* JADX INFO: renamed from: Y */
    public static final win0 f251701Y;

    /* JADX INFO: renamed from: Y0 */
    public static final win0 f251702Y0;

    /* JADX INFO: renamed from: Z */
    public static final win0 f251703Z;

    /* JADX INFO: renamed from: Z0 */
    public static final win0 f251704Z0;

    /* JADX INFO: renamed from: a1 */
    public static final win0 f251705a1;

    /* JADX INFO: renamed from: b */
    public static final win0 f251706b;

    /* JADX INFO: renamed from: b1 */
    public static final win0 f251707b1;

    /* JADX INFO: renamed from: c */
    public static final win0 f251708c;

    /* JADX INFO: renamed from: c1 */
    public static final win0 f251709c1;

    /* JADX INFO: renamed from: d */
    public static final win0 f251710d;

    /* JADX INFO: renamed from: e */
    public static final win0 f251711e;

    /* JADX INFO: renamed from: f */
    public static final win0 f251712f;

    /* JADX INFO: renamed from: g */
    public static final win0 f251713g;

    /* JADX INFO: renamed from: h */
    public static final win0 f251714h;

    /* JADX INFO: renamed from: i */
    public static final win0 f251715i;

    /* JADX INFO: renamed from: t */
    public static final win0 f251716t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251717a;

    static {
        int i = 1;
        f251706b = new win0(i, 0);
        f251708c = new win0(i, 1);
        f251710d = new win0(i, 2);
        f251711e = new win0(i, 3);
        f251712f = new win0(i, 4);
        f251713g = new win0(i, 5);
        f251714h = new win0(i, 6);
        f251715i = new win0(i, 7);
        f251716t = new win0(i, 8);
        f251699X = new win0(i, 9);
        f251701Y = new win0(i, 10);
        f251703Z = new win0(i, 11);
        f251687L0 = new win0(i, 12);
        f251688M0 = new win0(i, 13);
        f251689N0 = new win0(i, 14);
        f251690O0 = new win0(i, 15);
        f251691P0 = new win0(i, 16);
        f251692Q0 = new win0(i, 17);
        f251693R0 = new win0(i, 18);
        f251694S0 = new win0(i, 19);
        f251695T0 = new win0(i, 20);
        f251696U0 = new win0(i, 21);
        f251697V0 = new win0(i, 22);
        f251698W0 = new win0(i, 23);
        f251700X0 = new win0(i, 24);
        f251702Y0 = new win0(i, 25);
        f251704Z0 = new win0(i, 26);
        f251705a1 = new win0(i, 27);
        f251707b1 = new win0(i, 28);
        f251709c1 = new win0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ win0(int i, int i2) {
        super(i);
        this.f251717a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        e2o0 e2o0Var;
        switch (this.f251717a) {
            case 0:
                sin0 sin0Var = (sin0) obj;
                ArrayList arrayList = sin0Var.f209575b;
                return !arrayList.isEmpty() ? new uin0(sin0Var.f209574a, arrayList, sin0Var.f209576c) : tin0.f220713a;
            case 1:
                return w2a1.f247311a;
            case 2:
                return w2a1.f247311a;
            case 3:
                return w2a1.f247311a;
            case 4:
                return vsn0.f244472a;
            case 5:
                return new mvn0(((gvn0) obj).f84790a, "", "", "", "", "", "", false, false, false);
            case 6:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 7:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 8:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 9:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 10:
                Bundle bundle = (Bundle) obj;
                return (bundle == null || (e2o0Var = (e2o0) bundle.getParcelable("pin_gate_model")) == null) ? new e2o0(j2o0.f108114a) : e2o0Var;
            case 11:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("pin_gate_model", (e2o0) obj);
                return bundle2;
            case 12:
                jpz0.m53989c((mpz0) obj);
                return w2a1.f247311a;
            case 13:
                return new hlg0((slg0) obj);
            case 14:
                return new o3o0(false, false, false);
            case 15:
                return w2a1.f247311a;
            case 16:
                return w2a1.f247311a;
            case 17:
                return new dco0(null);
            case 18:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 19:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 20:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 21:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 22:
                return Boolean.valueOf(((zb4) obj).m95821d());
            case 23:
                return Boolean.valueOf(((zb4) obj).m95818a());
            case 24:
                return Boolean.valueOf(((zb4) obj).m95820c());
            case 25:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 26:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 27:
                return Boolean.valueOf(((zb4) obj).m95819b());
            case 28:
                return Boolean.valueOf(((zb4) obj).m95819b());
            default:
                return Boolean.valueOf(((zb4) obj).m95819b());
        }
    }
}
