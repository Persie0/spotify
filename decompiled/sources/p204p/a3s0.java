package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a3s0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final a3s0 f12037L0;

    /* JADX INFO: renamed from: M0 */
    public static final a3s0 f12038M0;

    /* JADX INFO: renamed from: N0 */
    public static final a3s0 f12039N0;

    /* JADX INFO: renamed from: O0 */
    public static final a3s0 f12040O0;

    /* JADX INFO: renamed from: P0 */
    public static final a3s0 f12041P0;

    /* JADX INFO: renamed from: Q0 */
    public static final a3s0 f12042Q0;

    /* JADX INFO: renamed from: R0 */
    public static final a3s0 f12043R0;

    /* JADX INFO: renamed from: S0 */
    public static final a3s0 f12044S0;

    /* JADX INFO: renamed from: T0 */
    public static final a3s0 f12045T0;

    /* JADX INFO: renamed from: U0 */
    public static final a3s0 f12046U0;

    /* JADX INFO: renamed from: V0 */
    public static final a3s0 f12047V0;

    /* JADX INFO: renamed from: W0 */
    public static final a3s0 f12048W0;

    /* JADX INFO: renamed from: X */
    public static final a3s0 f12049X;

    /* JADX INFO: renamed from: X0 */
    public static final a3s0 f12050X0;

    /* JADX INFO: renamed from: Y */
    public static final a3s0 f12051Y;

    /* JADX INFO: renamed from: Y0 */
    public static final a3s0 f12052Y0;

    /* JADX INFO: renamed from: Z */
    public static final a3s0 f12053Z;

    /* JADX INFO: renamed from: Z0 */
    public static final a3s0 f12054Z0;

    /* JADX INFO: renamed from: a1 */
    public static final a3s0 f12055a1;

    /* JADX INFO: renamed from: b */
    public static final a3s0 f12056b;

    /* JADX INFO: renamed from: b1 */
    public static final a3s0 f12057b1;

    /* JADX INFO: renamed from: c */
    public static final a3s0 f12058c;

    /* JADX INFO: renamed from: c1 */
    public static final a3s0 f12059c1;

    /* JADX INFO: renamed from: d */
    public static final a3s0 f12060d;

    /* JADX INFO: renamed from: e */
    public static final a3s0 f12061e;

    /* JADX INFO: renamed from: f */
    public static final a3s0 f12062f;

    /* JADX INFO: renamed from: g */
    public static final a3s0 f12063g;

    /* JADX INFO: renamed from: h */
    public static final a3s0 f12064h;

    /* JADX INFO: renamed from: i */
    public static final a3s0 f12065i;

    /* JADX INFO: renamed from: t */
    public static final a3s0 f12066t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12067a;

    static {
        int i = 1;
        f12056b = new a3s0(i, 0);
        f12058c = new a3s0(i, 1);
        f12060d = new a3s0(i, 2);
        f12061e = new a3s0(i, 3);
        f12062f = new a3s0(i, 4);
        f12063g = new a3s0(i, 5);
        f12064h = new a3s0(i, 6);
        f12065i = new a3s0(i, 7);
        f12066t = new a3s0(i, 8);
        f12049X = new a3s0(i, 9);
        f12051Y = new a3s0(i, 10);
        f12053Z = new a3s0(i, 11);
        f12037L0 = new a3s0(i, 12);
        f12038M0 = new a3s0(i, 13);
        f12039N0 = new a3s0(i, 14);
        f12040O0 = new a3s0(i, 15);
        f12041P0 = new a3s0(i, 16);
        f12042Q0 = new a3s0(i, 17);
        f12043R0 = new a3s0(i, 18);
        f12044S0 = new a3s0(i, 19);
        f12045T0 = new a3s0(i, 20);
        f12046U0 = new a3s0(i, 21);
        f12047V0 = new a3s0(i, 22);
        f12048W0 = new a3s0(i, 23);
        f12050X0 = new a3s0(i, 24);
        f12052Y0 = new a3s0(i, 25);
        f12054Z0 = new a3s0(i, 26);
        f12055a1 = new a3s0(i, 27);
        f12057b1 = new a3s0(i, 28);
        f12059c1 = new a3s0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3s0(int i, int i2) {
        super(i);
        this.f12067a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f12067a) {
            case 0:
                if (obj != null) {
                    return (uu41) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.curation.state.State");
            case 1:
                return (String) obj;
            case 2:
                return (skx0) obj;
            case 3:
                return Boolean.valueOf(obj instanceof skx0);
            case 4:
                if (obj != null) {
                    return (skx0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.rootlistability.Rootlistability");
            case 5:
                return Boolean.valueOf((obj instanceof skx0) || (obj instanceof w2a1));
            case 6:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (skx0) obj;
            case 7:
                return Boolean.valueOf(obj instanceof uu41);
            case 8:
                if (obj != null) {
                    return (uu41) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.curation.state.State");
            case 9:
                return (String) obj;
            case 10:
                return (String) obj;
            case 11:
                ((fdx0) obj).m41384f(false);
                return w2a1.f247311a;
            case 12:
                Set set = (Set) obj;
                return Boolean.valueOf(!(set == null || set.isEmpty()));
            case 13:
                return new d5s0(f5s0.f66160g);
            case 14:
                return Boolean.valueOf((obj instanceof y6s0) || (obj instanceof w2a1));
            case 15:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (y6s0) obj;
            case 16:
                return Boolean.valueOf((obj instanceof daj) || (obj instanceof w2a1));
            case 17:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (daj) obj;
            case 18:
                return new f8s0(0L, 0L);
            case 19:
                return ((vml) obj).f242868a;
            case 20:
                return w2a1.f247311a;
            case 21:
                return Boolean.valueOf(obj instanceof v140);
            case 22:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 23:
                return (List) obj;
            case 24:
                return Boolean.valueOf((obj instanceof ktx) || (obj instanceof w2a1));
            case 25:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (ktx) obj;
            case 26:
                return Boolean.valueOf(obj instanceof ktx);
            case 27:
                if (obj != null) {
                    return (ktx) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.plugin.Extension");
            case 28:
                return ((vml) obj).f242868a;
            default:
                return ((vml) obj).f242868a;
        }
    }
}
