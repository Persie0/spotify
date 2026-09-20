package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class whk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final whk f251368L0;

    /* JADX INFO: renamed from: M0 */
    public static final whk f251369M0;

    /* JADX INFO: renamed from: N0 */
    public static final whk f251370N0;

    /* JADX INFO: renamed from: O0 */
    public static final whk f251371O0;

    /* JADX INFO: renamed from: P0 */
    public static final whk f251372P0;

    /* JADX INFO: renamed from: Q0 */
    public static final whk f251373Q0;

    /* JADX INFO: renamed from: R0 */
    public static final whk f251374R0;

    /* JADX INFO: renamed from: S0 */
    public static final whk f251375S0;

    /* JADX INFO: renamed from: T0 */
    public static final whk f251376T0;

    /* JADX INFO: renamed from: U0 */
    public static final whk f251377U0;

    /* JADX INFO: renamed from: V0 */
    public static final whk f251378V0;

    /* JADX INFO: renamed from: W0 */
    public static final whk f251379W0;

    /* JADX INFO: renamed from: X */
    public static final whk f251380X;

    /* JADX INFO: renamed from: X0 */
    public static final whk f251381X0;

    /* JADX INFO: renamed from: Y */
    public static final whk f251382Y;

    /* JADX INFO: renamed from: Y0 */
    public static final whk f251383Y0;

    /* JADX INFO: renamed from: Z */
    public static final whk f251384Z;

    /* JADX INFO: renamed from: Z0 */
    public static final whk f251385Z0;

    /* JADX INFO: renamed from: a1 */
    public static final whk f251386a1;

    /* JADX INFO: renamed from: b */
    public static final whk f251387b;

    /* JADX INFO: renamed from: b1 */
    public static final whk f251388b1;

    /* JADX INFO: renamed from: c */
    public static final whk f251389c;

    /* JADX INFO: renamed from: c1 */
    public static final whk f251390c1;

    /* JADX INFO: renamed from: d */
    public static final whk f251391d;

    /* JADX INFO: renamed from: e */
    public static final whk f251392e;

    /* JADX INFO: renamed from: f */
    public static final whk f251393f;

    /* JADX INFO: renamed from: g */
    public static final whk f251394g;

    /* JADX INFO: renamed from: h */
    public static final whk f251395h;

    /* JADX INFO: renamed from: i */
    public static final whk f251396i;

    /* JADX INFO: renamed from: t */
    public static final whk f251397t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251398a;

    static {
        int i = 1;
        f251387b = new whk(i, 0);
        f251389c = new whk(i, 1);
        f251391d = new whk(i, 2);
        f251392e = new whk(i, 3);
        f251393f = new whk(i, 4);
        f251394g = new whk(i, 5);
        f251395h = new whk(i, 6);
        f251396i = new whk(i, 7);
        f251397t = new whk(i, 8);
        f251380X = new whk(i, 9);
        f251382Y = new whk(i, 10);
        f251384Z = new whk(i, 11);
        f251368L0 = new whk(i, 12);
        f251369M0 = new whk(i, 13);
        f251370N0 = new whk(i, 14);
        f251371O0 = new whk(i, 15);
        f251372P0 = new whk(i, 16);
        f251373Q0 = new whk(i, 17);
        f251374R0 = new whk(i, 18);
        f251375S0 = new whk(i, 19);
        f251376T0 = new whk(i, 20);
        f251377U0 = new whk(i, 21);
        f251378V0 = new whk(i, 22);
        f251379W0 = new whk(i, 23);
        f251381X0 = new whk(i, 24);
        f251383Y0 = new whk(i, 25);
        f251385Z0 = new whk(i, 26);
        f251386a1 = new whk(i, 27);
        f251388b1 = new whk(i, 28);
        f251390c1 = new whk(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whk(int i, int i2) {
        super(i);
        this.f251398a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f251398a) {
            case 0:
                xhk xhkVar = (xhk) obj;
                return xhkVar.f261662a.f205854a + " (" + xhkVar.f261663b + ")";
            case 1:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof w2a1));
            case 2:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (List) obj;
            case 3:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 4:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 5:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof w2a1));
            case 6:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (List) obj;
            case 7:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 8:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 9:
                return ((jkk) obj).f113323b;
            case 10:
                return ((jkk) obj).f113322a;
            case 11:
                return ((jkk) obj).f113322a;
            case 12:
                return ((jkk) obj).f113323b;
            case 13:
                return new ex80(edb.m38564m("spotify:list:artist-connections:", ltf1.m59886h(((jkk) obj).f113323b)), null, null, null, 14);
            case 14:
                jkk jkkVar = (jkk) obj;
                return new ex80(edb.m38566o("spotify:list:artists-popular-collaborations:", ltf1.m59886h(jkkVar.f113323b), "_", ltf1.m59886h(jkkVar.f113322a)), null, null, null, 14);
            case 15:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof w2a1));
            case 16:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (List) obj;
            case 17:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof w2a1));
            case 18:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (List) obj;
            case 19:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 20:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 21:
                return Boolean.valueOf(obj instanceof v140);
            case 22:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 23:
                return Boolean.valueOf(obj instanceof v140);
            case 24:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 25:
                return Boolean.valueOf(obj instanceof erc1);
            case 26:
                return (qho) obj;
            case 27:
                return Boolean.valueOf(obj instanceof erc1);
            case 28:
                return (qho) obj;
            default:
                return (String) obj;
        }
    }
}
