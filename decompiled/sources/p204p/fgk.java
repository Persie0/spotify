package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fgk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final fgk f69334L0;

    /* JADX INFO: renamed from: M0 */
    public static final fgk f69335M0;

    /* JADX INFO: renamed from: N0 */
    public static final fgk f69336N0;

    /* JADX INFO: renamed from: O0 */
    public static final fgk f69337O0;

    /* JADX INFO: renamed from: P0 */
    public static final fgk f69338P0;

    /* JADX INFO: renamed from: Q0 */
    public static final fgk f69339Q0;

    /* JADX INFO: renamed from: R0 */
    public static final fgk f69340R0;

    /* JADX INFO: renamed from: S0 */
    public static final fgk f69341S0;

    /* JADX INFO: renamed from: T0 */
    public static final fgk f69342T0;

    /* JADX INFO: renamed from: U0 */
    public static final fgk f69343U0;

    /* JADX INFO: renamed from: V0 */
    public static final fgk f69344V0;

    /* JADX INFO: renamed from: W0 */
    public static final fgk f69345W0;

    /* JADX INFO: renamed from: X */
    public static final fgk f69346X;

    /* JADX INFO: renamed from: X0 */
    public static final fgk f69347X0;

    /* JADX INFO: renamed from: Y */
    public static final fgk f69348Y;

    /* JADX INFO: renamed from: Y0 */
    public static final fgk f69349Y0;

    /* JADX INFO: renamed from: Z */
    public static final fgk f69350Z;

    /* JADX INFO: renamed from: Z0 */
    public static final fgk f69351Z0;

    /* JADX INFO: renamed from: a1 */
    public static final fgk f69352a1;

    /* JADX INFO: renamed from: b */
    public static final fgk f69353b;

    /* JADX INFO: renamed from: b1 */
    public static final fgk f69354b1;

    /* JADX INFO: renamed from: c */
    public static final fgk f69355c;

    /* JADX INFO: renamed from: c1 */
    public static final fgk f69356c1;

    /* JADX INFO: renamed from: d */
    public static final fgk f69357d;

    /* JADX INFO: renamed from: e */
    public static final fgk f69358e;

    /* JADX INFO: renamed from: f */
    public static final fgk f69359f;

    /* JADX INFO: renamed from: g */
    public static final fgk f69360g;

    /* JADX INFO: renamed from: h */
    public static final fgk f69361h;

    /* JADX INFO: renamed from: i */
    public static final fgk f69362i;

    /* JADX INFO: renamed from: t */
    public static final fgk f69363t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69364a;

    static {
        int i = 1;
        f69353b = new fgk(i, 0);
        f69355c = new fgk(i, 1);
        f69357d = new fgk(i, 2);
        f69358e = new fgk(i, 3);
        f69359f = new fgk(i, 4);
        f69360g = new fgk(i, 5);
        f69361h = new fgk(i, 6);
        f69362i = new fgk(i, 7);
        f69363t = new fgk(i, 8);
        f69346X = new fgk(i, 9);
        f69348Y = new fgk(i, 10);
        f69350Z = new fgk(i, 11);
        f69334L0 = new fgk(i, 12);
        f69335M0 = new fgk(i, 13);
        f69336N0 = new fgk(i, 14);
        f69337O0 = new fgk(i, 15);
        f69338P0 = new fgk(i, 16);
        f69339Q0 = new fgk(i, 17);
        f69340R0 = new fgk(i, 18);
        f69341S0 = new fgk(i, 19);
        f69342T0 = new fgk(i, 20);
        f69343U0 = new fgk(i, 21);
        f69344V0 = new fgk(i, 22);
        f69345W0 = new fgk(i, 23);
        f69347X0 = new fgk(i, 24);
        f69349Y0 = new fgk(i, 25);
        f69351Z0 = new fgk(i, 26);
        f69352a1 = new fgk(i, 27);
        f69354b1 = new fgk(i, 28);
        f69356c1 = new fgk(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgk(int i, int i2) {
        super(i);
        this.f69364a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f69364a) {
            case 0:
                return (String) obj;
            case 1:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 2:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 3:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 4:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 5:
                return (qtb) obj;
            case 6:
                return (cek) obj;
            case 7:
                jpz0.m53987a((mpz0) obj);
                return w2a1.f247311a;
            case 8:
                return Boolean.valueOf(obj instanceof cek);
            case 9:
                if (obj != null) {
                    return (cek) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.contribution.model.ContributionKindCapabilities");
            case 10:
                return (bek) obj;
            case 11:
                return (List) obj;
            case 12:
                return Boolean.valueOf(obj instanceof List);
            case 13:
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
            case 14:
                return Boolean.valueOf(obj instanceof List);
            case 15:
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
            case 16:
                return (List) obj;
            case 17:
                return (String) obj;
            case 18:
                return (String) obj;
            case 19:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 20:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 21:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 22:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 24:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 25:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 26:
                return Boolean.valueOf(obj instanceof Boolean);
            case 27:
                if (obj != null) {
                    return (Boolean) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            case 28:
                return gbu.f78413a;
            default:
                return new sjg0((slg0) obj);
        }
    }
}
