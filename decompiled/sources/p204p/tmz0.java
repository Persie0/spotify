package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class tmz0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final tmz0 f221804L0;

    /* JADX INFO: renamed from: M0 */
    public static final tmz0 f221805M0;

    /* JADX INFO: renamed from: N0 */
    public static final tmz0 f221806N0;

    /* JADX INFO: renamed from: O0 */
    public static final tmz0 f221807O0;

    /* JADX INFO: renamed from: P0 */
    public static final tmz0 f221808P0;

    /* JADX INFO: renamed from: Q0 */
    public static final tmz0 f221809Q0;

    /* JADX INFO: renamed from: R0 */
    public static final tmz0 f221810R0;

    /* JADX INFO: renamed from: S0 */
    public static final tmz0 f221811S0;

    /* JADX INFO: renamed from: T0 */
    public static final tmz0 f221812T0;

    /* JADX INFO: renamed from: U0 */
    public static final tmz0 f221813U0;

    /* JADX INFO: renamed from: V0 */
    public static final tmz0 f221814V0;

    /* JADX INFO: renamed from: W0 */
    public static final tmz0 f221815W0;

    /* JADX INFO: renamed from: X */
    public static final tmz0 f221816X;

    /* JADX INFO: renamed from: X0 */
    public static final tmz0 f221817X0;

    /* JADX INFO: renamed from: Y */
    public static final tmz0 f221818Y;

    /* JADX INFO: renamed from: Y0 */
    public static final tmz0 f221819Y0;

    /* JADX INFO: renamed from: Z */
    public static final tmz0 f221820Z;

    /* JADX INFO: renamed from: Z0 */
    public static final tmz0 f221821Z0;

    /* JADX INFO: renamed from: a1 */
    public static final tmz0 f221822a1;

    /* JADX INFO: renamed from: b */
    public static final tmz0 f221823b;

    /* JADX INFO: renamed from: b1 */
    public static final tmz0 f221824b1;

    /* JADX INFO: renamed from: c */
    public static final tmz0 f221825c;

    /* JADX INFO: renamed from: c1 */
    public static final tmz0 f221826c1;

    /* JADX INFO: renamed from: d */
    public static final tmz0 f221827d;

    /* JADX INFO: renamed from: e */
    public static final tmz0 f221828e;

    /* JADX INFO: renamed from: f */
    public static final tmz0 f221829f;

    /* JADX INFO: renamed from: g */
    public static final tmz0 f221830g;

    /* JADX INFO: renamed from: h */
    public static final tmz0 f221831h;

    /* JADX INFO: renamed from: i */
    public static final tmz0 f221832i;

    /* JADX INFO: renamed from: t */
    public static final tmz0 f221833t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221834a;

    static {
        int i = 1;
        f221823b = new tmz0(i, 0);
        f221825c = new tmz0(i, 1);
        f221827d = new tmz0(i, 2);
        f221828e = new tmz0(i, 3);
        f221829f = new tmz0(i, 4);
        f221830g = new tmz0(i, 5);
        f221831h = new tmz0(i, 6);
        f221832i = new tmz0(i, 7);
        f221833t = new tmz0(i, 8);
        f221816X = new tmz0(i, 9);
        f221818Y = new tmz0(i, 10);
        f221820Z = new tmz0(i, 11);
        f221804L0 = new tmz0(i, 12);
        f221805M0 = new tmz0(i, 13);
        f221806N0 = new tmz0(i, 14);
        f221807O0 = new tmz0(i, 15);
        f221808P0 = new tmz0(i, 16);
        f221809Q0 = new tmz0(i, 17);
        f221810R0 = new tmz0(i, 18);
        f221811S0 = new tmz0(i, 19);
        f221812T0 = new tmz0(i, 20);
        f221813U0 = new tmz0(i, 21);
        f221814V0 = new tmz0(i, 22);
        f221815W0 = new tmz0(i, 23);
        f221817X0 = new tmz0(i, 24);
        f221819Y0 = new tmz0(i, 25);
        f221821Z0 = new tmz0(i, 26);
        f221822a1 = new tmz0(i, 27);
        f221824b1 = new tmz0(i, 28);
        f221826c1 = new tmz0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmz0(int i, int i2) {
        super(i);
        this.f221834a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f221834a) {
            case 0:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof w2a1));
            case 1:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (Boolean) obj;
            case 2:
                return w2a1.f247311a;
            case 3:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 4:
                qnz0 qnz0Var = (qnz0) obj;
                return pp91.m70529j(new pqm0("selectionBundle", new zmz0(qnz0Var.f190727h, qnz0Var.f190728i)));
            case 5:
                ((qsp) ((hmh0) obj)).f192162a = crz0.f41425h;
                return w2a1.f247311a;
            case 6:
                return "country_code";
            case 7:
                return (String) obj;
            case 8:
                return Boolean.valueOf(obj instanceof f551);
            case 9:
                if (obj != null) {
                    return (f551) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
            case 10:
                return Boolean.valueOf(obj instanceof String);
            case 11:
                if (obj != null) {
                    return (String) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            case 12:
                return new e551((String) obj);
            case 13:
                return ((f551) obj).f65941a;
            case 14:
                return "country_code";
            case 15:
                return (String) obj;
            case 16:
                return Boolean.valueOf(obj instanceof String);
            case 17:
                if (obj != null) {
                    return (String) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            case 18:
                return qt41.f192292a;
            case 19:
                return Collections.singletonList(((nuz0) obj).f158744a);
            case 20:
                return Boolean.valueOf((obj instanceof erc1) || (obj instanceof w2a1));
            case 21:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 22:
                return Boolean.valueOf((obj instanceof ee7) || (obj instanceof w2a1));
            case 23:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (ee7) obj;
            case 24:
                return Boolean.valueOf(obj instanceof v140);
            case 25:
                if (obj != null) {
                    return (v140) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
            case 26:
                return (String) obj;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return new ex80((String) obj, null, null, null, 14);
        }
    }
}
