package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class zol extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final zol f284814L0;

    /* JADX INFO: renamed from: M0 */
    public static final zol f284815M0;

    /* JADX INFO: renamed from: N0 */
    public static final zol f284816N0;

    /* JADX INFO: renamed from: O0 */
    public static final zol f284817O0;

    /* JADX INFO: renamed from: P0 */
    public static final zol f284818P0;

    /* JADX INFO: renamed from: Q0 */
    public static final zol f284819Q0;

    /* JADX INFO: renamed from: R0 */
    public static final zol f284820R0;

    /* JADX INFO: renamed from: S0 */
    public static final zol f284821S0;

    /* JADX INFO: renamed from: T0 */
    public static final zol f284822T0;

    /* JADX INFO: renamed from: U0 */
    public static final zol f284823U0;

    /* JADX INFO: renamed from: V0 */
    public static final zol f284824V0;

    /* JADX INFO: renamed from: W0 */
    public static final zol f284825W0;

    /* JADX INFO: renamed from: X */
    public static final zol f284826X;

    /* JADX INFO: renamed from: X0 */
    public static final zol f284827X0;

    /* JADX INFO: renamed from: Y */
    public static final zol f284828Y;

    /* JADX INFO: renamed from: Y0 */
    public static final zol f284829Y0;

    /* JADX INFO: renamed from: Z */
    public static final zol f284830Z;

    /* JADX INFO: renamed from: Z0 */
    public static final zol f284831Z0;

    /* JADX INFO: renamed from: a1 */
    public static final zol f284832a1;

    /* JADX INFO: renamed from: b */
    public static final zol f284833b;

    /* JADX INFO: renamed from: b1 */
    public static final zol f284834b1;

    /* JADX INFO: renamed from: c */
    public static final zol f284835c;

    /* JADX INFO: renamed from: c1 */
    public static final zol f284836c1;

    /* JADX INFO: renamed from: d */
    public static final zol f284837d;

    /* JADX INFO: renamed from: e */
    public static final zol f284838e;

    /* JADX INFO: renamed from: f */
    public static final zol f284839f;

    /* JADX INFO: renamed from: g */
    public static final zol f284840g;

    /* JADX INFO: renamed from: h */
    public static final zol f284841h;

    /* JADX INFO: renamed from: i */
    public static final zol f284842i;

    /* JADX INFO: renamed from: t */
    public static final zol f284843t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284844a;

    static {
        int i = 1;
        f284833b = new zol(i, 0);
        f284835c = new zol(i, 1);
        f284837d = new zol(i, 2);
        f284838e = new zol(i, 3);
        f284839f = new zol(i, 4);
        f284840g = new zol(i, 5);
        f284841h = new zol(i, 6);
        f284842i = new zol(i, 7);
        f284843t = new zol(i, 8);
        f284826X = new zol(i, 9);
        f284828Y = new zol(i, 10);
        f284830Z = new zol(i, 11);
        f284814L0 = new zol(i, 12);
        f284815M0 = new zol(i, 13);
        f284816N0 = new zol(i, 14);
        f284817O0 = new zol(i, 15);
        f284818P0 = new zol(i, 16);
        f284819Q0 = new zol(i, 17);
        f284820R0 = new zol(i, 18);
        f284821S0 = new zol(i, 19);
        f284822T0 = new zol(i, 20);
        f284823U0 = new zol(i, 21);
        f284824V0 = new zol(i, 22);
        f284825W0 = new zol(i, 23);
        f284827X0 = new zol(i, 24);
        f284829Y0 = new zol(i, 25);
        f284831Z0 = new zol(i, 26);
        f284832a1 = new zol(i, 27);
        f284834b1 = new zol(i, 28);
        f284836c1 = new zol(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zol(int i, int i2) {
        super(i);
        this.f284844a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        List list;
        switch (this.f284844a) {
            case 0:
                return ((fjh0) obj).m41847l();
            case 1:
                return edb.m38564m("spotify:user:", ((epl) obj).f61669a);
            case 2:
                return edb.m38564m("spotify:user:", ((epl) obj).f61669a);
            case 3:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 4:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 5:
                return Boolean.valueOf(obj instanceof v140);
            case 6:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 7:
                ((fdx0) obj).m41385g(1);
                return w2a1.f247311a;
            case 8:
                return (String) obj;
            case 9:
                return (String) obj;
            case 10:
                String str = (String) obj;
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    return new dy80(str);
                }
                return null;
            case 11:
                return (ey80) obj;
            case 12:
                return Boolean.valueOf((obj instanceof ey80) || (obj instanceof w2a1));
            case 13:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (ey80) obj;
            case 14:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 15:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 16:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 17:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 18:
                return new aql("", null);
            case 19:
                String str2 = ((zpl) obj).f285175a;
                if (str2.length() == 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    return new dy80(str2);
                }
                return null;
            case 20:
                ey80 ey80Var = (ey80) obj;
                if (ey80Var == null || (list = ey80Var.f63989b) == null) {
                    return lau.f131415a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    lnn0 lnn0Var = ((i8e0) obj2).f99769f;
                    if (lnn0Var == lnn0.f135182a || lnn0Var == lnn0.f135187f) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((i8e0) it.next()).f99764a);
                }
                return arrayList2;
            case 21:
                return Boolean.valueOf((obj instanceof ey80) || (obj instanceof w2a1));
            case 22:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (ey80) obj;
            case 23:
                return irl.f105010a;
            case 24:
                return (String) obj;
            case 25:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 26:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
        }
    }
}
