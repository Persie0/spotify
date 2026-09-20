package p204p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class yp61 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final yp61 f274833L0;

    /* JADX INFO: renamed from: M0 */
    public static final yp61 f274834M0;

    /* JADX INFO: renamed from: N0 */
    public static final yp61 f274835N0;

    /* JADX INFO: renamed from: O0 */
    public static final yp61 f274836O0;

    /* JADX INFO: renamed from: P0 */
    public static final yp61 f274837P0;

    /* JADX INFO: renamed from: Q0 */
    public static final yp61 f274838Q0;

    /* JADX INFO: renamed from: R0 */
    public static final yp61 f274839R0;

    /* JADX INFO: renamed from: S0 */
    public static final yp61 f274840S0;

    /* JADX INFO: renamed from: T0 */
    public static final yp61 f274841T0;

    /* JADX INFO: renamed from: U0 */
    public static final yp61 f274842U0;

    /* JADX INFO: renamed from: V0 */
    public static final yp61 f274843V0;

    /* JADX INFO: renamed from: W0 */
    public static final yp61 f274844W0;

    /* JADX INFO: renamed from: X */
    public static final yp61 f274845X;

    /* JADX INFO: renamed from: X0 */
    public static final yp61 f274846X0;

    /* JADX INFO: renamed from: Y */
    public static final yp61 f274847Y;

    /* JADX INFO: renamed from: Y0 */
    public static final yp61 f274848Y0;

    /* JADX INFO: renamed from: Z */
    public static final yp61 f274849Z;

    /* JADX INFO: renamed from: Z0 */
    public static final yp61 f274850Z0;

    /* JADX INFO: renamed from: a1 */
    public static final yp61 f274851a1;

    /* JADX INFO: renamed from: b */
    public static final yp61 f274852b;

    /* JADX INFO: renamed from: b1 */
    public static final yp61 f274853b1;

    /* JADX INFO: renamed from: c */
    public static final yp61 f274854c;

    /* JADX INFO: renamed from: c1 */
    public static final yp61 f274855c1;

    /* JADX INFO: renamed from: d */
    public static final yp61 f274856d;

    /* JADX INFO: renamed from: e */
    public static final yp61 f274857e;

    /* JADX INFO: renamed from: f */
    public static final yp61 f274858f;

    /* JADX INFO: renamed from: g */
    public static final yp61 f274859g;

    /* JADX INFO: renamed from: h */
    public static final yp61 f274860h;

    /* JADX INFO: renamed from: i */
    public static final yp61 f274861i;

    /* JADX INFO: renamed from: t */
    public static final yp61 f274862t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274863a;

    static {
        int i = 1;
        f274852b = new yp61(i, 0);
        f274854c = new yp61(i, 1);
        f274856d = new yp61(i, 2);
        f274857e = new yp61(i, 3);
        f274858f = new yp61(i, 4);
        f274859g = new yp61(i, 5);
        f274860h = new yp61(i, 6);
        f274861i = new yp61(i, 7);
        f274862t = new yp61(i, 8);
        f274845X = new yp61(i, 9);
        f274847Y = new yp61(i, 10);
        f274849Z = new yp61(i, 11);
        f274833L0 = new yp61(i, 12);
        f274834M0 = new yp61(i, 13);
        f274835N0 = new yp61(i, 14);
        f274836O0 = new yp61(i, 15);
        f274837P0 = new yp61(i, 16);
        f274838Q0 = new yp61(i, 17);
        f274839R0 = new yp61(i, 18);
        f274840S0 = new yp61(i, 19);
        f274841T0 = new yp61(i, 20);
        f274842U0 = new yp61(i, 21);
        f274843V0 = new yp61(i, 22);
        f274844W0 = new yp61(i, 23);
        f274846X0 = new yp61(i, 24);
        f274848Y0 = new yp61(i, 25);
        f274850Z0 = new yp61(i, 26);
        f274851a1 = new yp61(i, 27);
        f274853b1 = new yp61(i, 28);
        f274855c1 = new yp61(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp61(int i, int i2) {
        super(i);
        this.f274863a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f274863a) {
            case 0:
                return Collections.singleton(((to61) obj).f222190a);
            case 1:
                return nau.f152117a;
            case 2:
                zo61 zo61Var = (zo61) obj;
                return new exv0(zo61Var.f284717a, zo61Var.f284718b, false);
            case 3:
                return Collections.singleton(((zo61) obj).f284717a);
            case 4:
                return nau.f152117a;
            case 5:
                dp61 dp61Var = (dp61) obj;
                return new exv0(dp61Var.f51199a, dp61Var.f51200b, false);
            case 6:
                return Collections.singleton(((dp61) obj).f51199a);
            case 7:
                return rew.f198441a;
            case 8:
                return gbu.f78413a;
            case 9:
                return xbu.f260006a;
            case 10:
                return gbu.f78413a;
            case 11:
                return w2a1.f247311a;
            case 12:
                return new iz80((String) obj);
            case 13:
                qho qhoVar = (qho) obj;
                if (qhoVar instanceof nho) {
                    return Boolean.FALSE;
                }
                if (qhoVar instanceof oho) {
                    return Boolean.valueOf(wj50.m88271j(((hz80) ((oho) qhoVar).f165512a).f96822X.get("is_genpods"), "true"));
                }
                if (qhoVar.equals(pho.f177693a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                return Boolean.valueOf(obj instanceof hz80);
            case 15:
                return (qho) obj;
            case 16:
                return Boolean.valueOf(((m511) obj).f140078a);
            case 17:
                Map map = ((m72) obj).f140629a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (v72) entry.getValue());
                }
                return linkedHashMap;
            case 18:
                return gbu.f78413a;
            case 19:
                return g6f.m43736n1(((oqh) obj).f168294b);
            case 20:
                return g6f.m43736n1(((uqh) obj).f233018c);
            case 21:
                return gbu.f78413a;
            case 22:
                return gbu.f78413a;
            case 23:
                return gbu.f78413a;
            case 24:
                return gbu.f78413a;
            case 25:
                return gbu.f78413a;
            case 26:
                return gbu.f78413a;
            case 27:
                return Collections.singleton(((pqh) obj).f180328a.f237979a);
            case 28:
                return gbu.f78413a;
            default:
                return new s36((st91) obj, 2);
        }
    }
}
