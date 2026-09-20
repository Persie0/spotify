package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class gko extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final gko f80842L0;

    /* JADX INFO: renamed from: M0 */
    public static final gko f80843M0;

    /* JADX INFO: renamed from: N0 */
    public static final gko f80844N0;

    /* JADX INFO: renamed from: O0 */
    public static final gko f80845O0;

    /* JADX INFO: renamed from: P0 */
    public static final gko f80846P0;

    /* JADX INFO: renamed from: Q0 */
    public static final gko f80847Q0;

    /* JADX INFO: renamed from: R0 */
    public static final gko f80848R0;

    /* JADX INFO: renamed from: S0 */
    public static final gko f80849S0;

    /* JADX INFO: renamed from: T0 */
    public static final gko f80850T0;

    /* JADX INFO: renamed from: U0 */
    public static final gko f80851U0;

    /* JADX INFO: renamed from: V0 */
    public static final gko f80852V0;

    /* JADX INFO: renamed from: W0 */
    public static final gko f80853W0;

    /* JADX INFO: renamed from: X */
    public static final gko f80854X;

    /* JADX INFO: renamed from: X0 */
    public static final gko f80855X0;

    /* JADX INFO: renamed from: Y */
    public static final gko f80856Y;

    /* JADX INFO: renamed from: Y0 */
    public static final gko f80857Y0;

    /* JADX INFO: renamed from: Z */
    public static final gko f80858Z;

    /* JADX INFO: renamed from: Z0 */
    public static final gko f80859Z0;

    /* JADX INFO: renamed from: a1 */
    public static final gko f80860a1;

    /* JADX INFO: renamed from: b */
    public static final gko f80861b;

    /* JADX INFO: renamed from: b1 */
    public static final gko f80862b1;

    /* JADX INFO: renamed from: c */
    public static final gko f80863c;

    /* JADX INFO: renamed from: c1 */
    public static final gko f80864c1;

    /* JADX INFO: renamed from: d */
    public static final gko f80865d;

    /* JADX INFO: renamed from: e */
    public static final gko f80866e;

    /* JADX INFO: renamed from: f */
    public static final gko f80867f;

    /* JADX INFO: renamed from: g */
    public static final gko f80868g;

    /* JADX INFO: renamed from: h */
    public static final gko f80869h;

    /* JADX INFO: renamed from: i */
    public static final gko f80870i;

    /* JADX INFO: renamed from: t */
    public static final gko f80871t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80872a;

    static {
        int i = 1;
        f80861b = new gko(i, 0);
        f80863c = new gko(i, 1);
        f80865d = new gko(i, 2);
        f80866e = new gko(i, 3);
        f80867f = new gko(i, 4);
        f80868g = new gko(i, 5);
        f80869h = new gko(i, 6);
        f80870i = new gko(i, 7);
        f80871t = new gko(i, 8);
        f80854X = new gko(i, 9);
        f80856Y = new gko(i, 10);
        f80858Z = new gko(i, 11);
        f80842L0 = new gko(i, 12);
        f80843M0 = new gko(i, 13);
        f80844N0 = new gko(i, 14);
        f80845O0 = new gko(i, 15);
        f80846P0 = new gko(i, 16);
        f80847Q0 = new gko(i, 17);
        f80848R0 = new gko(i, 18);
        f80849S0 = new gko(i, 19);
        f80850T0 = new gko(i, 20);
        f80851U0 = new gko(i, 21);
        f80852V0 = new gko(i, 22);
        f80853W0 = new gko(i, 23);
        f80855X0 = new gko(i, 24);
        f80857Y0 = new gko(i, 25);
        f80859Z0 = new gko(i, 26);
        f80860a1 = new gko(i, 27);
        f80862b1 = new gko(i, 28);
        f80864c1 = new gko(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gko(int i, int i2) {
        super(i);
        this.f80872a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f80872a;
        pro0 pro0Var = pro0.f180654b;
        pro0 pro0Var2 = pro0.f180655c;
        pro0 pro0Var3 = pro0.f180653a;
        switch (i) {
            case 0:
                bv41 bv41Var = (bv41) obj;
                if (bv41Var == null) {
                    return null;
                }
                tjo tjoVar = lko.f134395a;
                int iOrdinal = bv41Var.ordinal();
                if (iOrdinal == 0) {
                    return pro0Var;
                }
                if (iOrdinal == 1) {
                    return pro0Var2;
                }
                if (iOrdinal == 2) {
                    return pro0Var3;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                return Boolean.valueOf((obj instanceof qas) || (obj instanceof w2a1));
            case 2:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (qas) obj;
            case 3:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 4:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 5:
                return ((v6w0) obj).f237979a;
            case 6:
                return w2a1.f247311a;
            case 7:
                return Boolean.valueOf((obj instanceof bv41) || (obj instanceof w2a1));
            case 8:
                return Boolean.valueOf((obj instanceof bv41) || (obj instanceof w2a1));
            case 9:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (bv41) obj;
            case 10:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (bv41) obj;
            case 11:
                v6w0 v6w0Var = (v6w0) obj;
                String str = v6w0Var.f237982d;
                return new ot60(v6w0Var.f237980b, v6w0Var.f237979a, str != null ? str : "");
            case 12:
                v6w0 v6w0Var2 = (v6w0) obj;
                String str2 = v6w0Var2.f237980b;
                String str3 = v6w0Var2.f237982d;
                return new ot60(str2, v6w0Var2.f237979a, str3 != null ? str3 : "");
            case 13:
                bv41 bv41Var2 = (bv41) obj;
                if (bv41Var2 == null) {
                    return null;
                }
                int iOrdinal2 = bv41Var2.ordinal();
                if (iOrdinal2 == 0) {
                    return pro0Var;
                }
                if (iOrdinal2 == 1) {
                    return pro0Var2;
                }
                if (iOrdinal2 == 2) {
                    return pro0Var3;
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                bv41 bv41Var3 = (bv41) obj;
                if (bv41Var3 == null) {
                    return null;
                }
                int iOrdinal3 = bv41Var3.ordinal();
                if (iOrdinal3 == 0) {
                    return pro0Var;
                }
                if (iOrdinal3 == 1) {
                    return pro0Var2;
                }
                if (iOrdinal3 == 2) {
                    return pro0Var3;
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                return ((v6w0) obj).f237979a;
            case 16:
                return ((v6w0) obj).f237979a;
            case 17:
                return ((v6w0) obj).f237979a;
            case 18:
                return ((v6w0) obj).f237979a;
            case 19:
                return ((v6w0) obj).f237979a;
            case 20:
                return ((v6w0) obj).f237979a;
            case 21:
                return ((v6w0) obj).f237979a;
            case 22:
                return ((v6w0) obj).f237979a;
            case 23:
                return ((v6w0) obj).f237979a;
            case 24:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (tu00) obj;
            case 25:
                return Boolean.valueOf((obj instanceof ok11) || (obj instanceof w2a1));
            case 26:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (ok11) obj;
            case 27:
                return Boolean.valueOf((obj instanceof y7t0) || (obj instanceof w2a1));
            case 28:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (y7t0) obj;
            default:
                return Boolean.valueOf((obj instanceof daj) || (obj instanceof w2a1));
        }
    }
}
