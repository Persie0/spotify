package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wl31 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final wl31 f252353L0;

    /* JADX INFO: renamed from: M0 */
    public static final wl31 f252354M0;

    /* JADX INFO: renamed from: N0 */
    public static final wl31 f252355N0;

    /* JADX INFO: renamed from: O0 */
    public static final wl31 f252356O0;

    /* JADX INFO: renamed from: P0 */
    public static final wl31 f252357P0;

    /* JADX INFO: renamed from: Q0 */
    public static final wl31 f252358Q0;

    /* JADX INFO: renamed from: R0 */
    public static final wl31 f252359R0;

    /* JADX INFO: renamed from: S0 */
    public static final wl31 f252360S0;

    /* JADX INFO: renamed from: T0 */
    public static final wl31 f252361T0;

    /* JADX INFO: renamed from: U0 */
    public static final wl31 f252362U0;

    /* JADX INFO: renamed from: V0 */
    public static final wl31 f252363V0;

    /* JADX INFO: renamed from: W0 */
    public static final wl31 f252364W0;

    /* JADX INFO: renamed from: X */
    public static final wl31 f252365X;

    /* JADX INFO: renamed from: X0 */
    public static final wl31 f252366X0;

    /* JADX INFO: renamed from: Y */
    public static final wl31 f252367Y;

    /* JADX INFO: renamed from: Y0 */
    public static final wl31 f252368Y0;

    /* JADX INFO: renamed from: Z */
    public static final wl31 f252369Z;

    /* JADX INFO: renamed from: Z0 */
    public static final wl31 f252370Z0;

    /* JADX INFO: renamed from: a1 */
    public static final wl31 f252371a1;

    /* JADX INFO: renamed from: b */
    public static final wl31 f252372b;

    /* JADX INFO: renamed from: b1 */
    public static final wl31 f252373b1;

    /* JADX INFO: renamed from: c */
    public static final wl31 f252374c;

    /* JADX INFO: renamed from: c1 */
    public static final wl31 f252375c1;

    /* JADX INFO: renamed from: d */
    public static final wl31 f252376d;

    /* JADX INFO: renamed from: e */
    public static final wl31 f252377e;

    /* JADX INFO: renamed from: f */
    public static final wl31 f252378f;

    /* JADX INFO: renamed from: g */
    public static final wl31 f252379g;

    /* JADX INFO: renamed from: h */
    public static final wl31 f252380h;

    /* JADX INFO: renamed from: i */
    public static final wl31 f252381i;

    /* JADX INFO: renamed from: t */
    public static final wl31 f252382t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252383a;

    static {
        int i = 1;
        f252372b = new wl31(i, 0);
        f252374c = new wl31(i, 1);
        f252376d = new wl31(i, 2);
        f252377e = new wl31(i, 3);
        f252378f = new wl31(i, 4);
        f252379g = new wl31(i, 5);
        f252380h = new wl31(i, 6);
        f252381i = new wl31(i, 7);
        f252382t = new wl31(i, 8);
        f252365X = new wl31(i, 9);
        f252367Y = new wl31(i, 10);
        f252369Z = new wl31(i, 11);
        f252353L0 = new wl31(i, 12);
        f252354M0 = new wl31(i, 13);
        f252355N0 = new wl31(i, 14);
        f252356O0 = new wl31(i, 15);
        f252357P0 = new wl31(i, 16);
        f252358Q0 = new wl31(i, 17);
        f252359R0 = new wl31(i, 18);
        f252360S0 = new wl31(i, 19);
        f252361T0 = new wl31(i, 20);
        f252362U0 = new wl31(i, 21);
        f252363V0 = new wl31(i, 22);
        f252364W0 = new wl31(i, 23);
        f252366X0 = new wl31(i, 24);
        f252368Y0 = new wl31(i, 25);
        f252370Z0 = new wl31(i, 26);
        f252371a1 = new wl31(i, 27);
        f252373b1 = new wl31(i, 28);
        f252375c1 = new wl31(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl31(int i, int i2) {
        super(i);
        this.f252383a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f252383a) {
            case 0:
                return ((rl31) obj).f200214a;
            case 1:
                return ((rl31) obj).f200214a;
            case 2:
                return ((rl31) obj).f200214a;
            case 3:
                return w2a1.f247311a;
            case 4:
                return new qm31();
            case 5:
                return new ex80(edb.m38564m("spotify:list:track-samples:", (String) g6f.m43687A0(wl51.m88477a1(((om31) obj).f166964a, new String[]{":"}, 0, 6))), null, null, null, 14);
            case 6:
                List list = (List) obj;
                return list == null ? lau.f131415a : list;
            case 7:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof w2a1));
            case 8:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (List) obj;
            case 9:
                return Boolean.valueOf(obj instanceof v140);
            case 10:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 11:
                return Boolean.valueOf(obj instanceof erc1);
            case 12:
                if (obj != null) {
                    return (erc1) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
            case 13:
                return Boolean.valueOf(obj instanceof jl31);
            case 14:
                if (obj != null) {
                    return (jl31) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
            case 15:
                return ((om31) obj).f166964a;
            case 16:
                return ((om31) obj).f166964a;
            case 17:
                return ((om31) obj).f166964a;
            case 18:
                return new xk31(((xm31) obj).f263280a, n6f.f150870j, (wk31) null, 12);
            case 19:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 20:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 21:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 22:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 23:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 24:
                return Boolean.valueOf((obj instanceof hz80) || (obj instanceof w2a1));
            case 25:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (hz80) obj;
            case 26:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 27:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 28:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            default:
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
        }
    }
}
