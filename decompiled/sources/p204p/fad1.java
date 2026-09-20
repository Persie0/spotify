package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class fad1 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final fad1 f67515L0;

    /* JADX INFO: renamed from: M0 */
    public static final fad1 f67516M0;

    /* JADX INFO: renamed from: N0 */
    public static final fad1 f67517N0;

    /* JADX INFO: renamed from: O0 */
    public static final fad1 f67518O0;

    /* JADX INFO: renamed from: P0 */
    public static final fad1 f67519P0;

    /* JADX INFO: renamed from: Q0 */
    public static final fad1 f67520Q0;

    /* JADX INFO: renamed from: R0 */
    public static final fad1 f67521R0;

    /* JADX INFO: renamed from: S0 */
    public static final fad1 f67522S0;

    /* JADX INFO: renamed from: T0 */
    public static final fad1 f67523T0;

    /* JADX INFO: renamed from: U0 */
    public static final fad1 f67524U0;

    /* JADX INFO: renamed from: V0 */
    public static final fad1 f67525V0;

    /* JADX INFO: renamed from: W0 */
    public static final fad1 f67526W0;

    /* JADX INFO: renamed from: X */
    public static final fad1 f67527X;

    /* JADX INFO: renamed from: X0 */
    public static final fad1 f67528X0;

    /* JADX INFO: renamed from: Y */
    public static final fad1 f67529Y;

    /* JADX INFO: renamed from: Y0 */
    public static final fad1 f67530Y0;

    /* JADX INFO: renamed from: Z */
    public static final fad1 f67531Z;

    /* JADX INFO: renamed from: Z0 */
    public static final fad1 f67532Z0;

    /* JADX INFO: renamed from: a1 */
    public static final fad1 f67533a1;

    /* JADX INFO: renamed from: b */
    public static final fad1 f67534b;

    /* JADX INFO: renamed from: b1 */
    public static final fad1 f67535b1;

    /* JADX INFO: renamed from: c */
    public static final fad1 f67536c;

    /* JADX INFO: renamed from: c1 */
    public static final fad1 f67537c1;

    /* JADX INFO: renamed from: d */
    public static final fad1 f67538d;

    /* JADX INFO: renamed from: e */
    public static final fad1 f67539e;

    /* JADX INFO: renamed from: f */
    public static final fad1 f67540f;

    /* JADX INFO: renamed from: g */
    public static final fad1 f67541g;

    /* JADX INFO: renamed from: h */
    public static final fad1 f67542h;

    /* JADX INFO: renamed from: i */
    public static final fad1 f67543i;

    /* JADX INFO: renamed from: t */
    public static final fad1 f67544t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67545a;

    static {
        int i = 2;
        f67534b = new fad1(i, 0);
        f67536c = new fad1(i, 1);
        f67538d = new fad1(i, 2);
        f67539e = new fad1(i, 3);
        f67540f = new fad1(i, 4);
        f67541g = new fad1(i, 5);
        f67542h = new fad1(i, 6);
        f67543i = new fad1(i, 7);
        f67544t = new fad1(i, 8);
        f67527X = new fad1(i, 9);
        f67529Y = new fad1(i, 10);
        f67531Z = new fad1(i, 11);
        f67515L0 = new fad1(i, 12);
        f67516M0 = new fad1(i, 13);
        f67517N0 = new fad1(i, 14);
        f67518O0 = new fad1(i, 15);
        f67519P0 = new fad1(i, 16);
        f67520Q0 = new fad1(i, 17);
        f67521R0 = new fad1(i, 18);
        f67522S0 = new fad1(i, 19);
        f67523T0 = new fad1(i, 20);
        f67524U0 = new fad1(i, 21);
        f67525V0 = new fad1(i, 22);
        f67526W0 = new fad1(i, 23);
        f67528X0 = new fad1(i, 24);
        f67530Y0 = new fad1(i, 25);
        f67532Z0 = new fad1(i, 26);
        f67533a1 = new fad1(i, 27);
        f67535b1 = new fad1(i, 28);
        f67537c1 = new fad1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fad1(int i, int i2) {
        super(i);
        this.f67545a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        long j;
        yhi yhiVar;
        switch (this.f67545a) {
            case 0:
                ufu ufuVar = ((jiu) obj).f112823a;
                int iOrdinal = ((ixu) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = ufuVar.f229876c;
                } else if (iOrdinal == 1) {
                    j = ufuVar.f229878e;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = ufuVar.f229877d;
                }
                return new n6f(j);
            case 1:
                return new n6f(((jiu) obj).f112824b.f138757a);
            case 2:
                return ((aad1) obj).f13824b;
            case 3:
                return new rbd1((qbd1) obj);
            case 4:
                return null;
            case 5:
                return ((d8d1) obj).f46429b;
            case 6:
                return ((z9d1) obj).f280755b;
            case 7:
                ((Number) obj2).intValue();
                return w2a1.f247311a;
            case 8:
                return (hwh0) obj;
            case 9:
                pe10 pe10Var = (pe10) obj2;
                return pe10Var instanceof i50 ? pe10Var : obj;
            case 10:
                return obj;
            case 11:
                pe10 pe10Var2 = (pe10) obj2;
                return pe10Var2 instanceof tud1 ? pe10Var2 : obj;
            case 12:
                pe10 pe10Var3 = (pe10) obj2;
                return pe10Var3 instanceof dq20 ? pe10Var3 : obj;
            case 13:
                return w2a1.f247311a;
            case 14:
                return w2a1.f247311a;
            case 15:
                return new o2e1(((n2e1) obj).f149751a, ((Boolean) obj2).booleanValue());
            case 16:
                av31 av31Var = (av31) obj2;
                if (av31Var instanceof yu31) {
                    return new mjo(new jjo(((yu31) av31Var).f276272a.toString()));
                }
                if (av31Var instanceof zu31) {
                    return new ojo(((zu31) av31Var).f286335a);
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                return new j3e1((hz80) obj, ((Boolean) obj2).booleanValue());
            case 18:
                return (ggz0) obj2;
            case 19:
                return (w9e1) obj2;
            case 20:
                return (oae1) obj2;
            case 21:
                return new n6f(((jiu) obj).f112823a.f229875b.f123093a);
            case 22:
                z2y z2yVar = (z2y) obj2;
                tw8 tw8Var = z2yVar.f278687a;
                String str = tw8Var.f224361i;
                String str2 = tw8Var.f224360h;
                String str3 = tw8Var.f224362j;
                String str4 = tw8Var.f224363k;
                try {
                    yhiVar = new yhi(ibe1.m50173b(str), ibe1.m50173b(str2), ibe1.m50173b(str3), ibe1.m50173b(str4));
                    break;
                } catch (Exception e) {
                    StringBuilder sbM38573v = edb.m38573v("\n      Failed to parse colors in WrappedBannerElement, using fallbacks.\n      Colors: bg=", str, ", text=", str2, ",\n      ctaBg=");
                    sbM38573v.append(str3);
                    sbM38573v.append(", ctaText=");
                    sbM38573v.append(str4);
                    sbM38573v.append("\n    ");
                    Logger.m3974j(e, xl51.m91377Z(sbM38573v.toString()), new Object[0]);
                    yhiVar = ibe1.f100521a;
                }
                return new rbe1(tw8Var.f224353a, tw8Var.f224354b, z2yVar.f278688b, z2yVar.f278689c, z2yVar.f278690d, z2yVar.f278691e, z2yVar.f278692f, yhiVar.f272905a, yhiVar.f272906b, tw8Var.f224355c, tw8Var.f224364l, yhiVar.f272908d, yhiVar.f272907c, z2yVar.f278693g);
            case 23:
                return ((gbe1) obj).f78288c;
            case 24:
                return Next.m15608j();
            case 25:
                return Next.m15608j();
            case 26:
                return Next.m15607i(sje1.f209829a, Collections.singleton(vft.f241026a));
            case 27:
                return First.m15575c((tje1) obj2, Collections.singleton(vft.f241026a));
            case 28:
                return (ike1) obj2;
            default:
                return Boolean.valueOf(wj50.m88271j(((ame1) obj).f17126a, ((ame1) obj2).f17126a));
        }
    }
}
