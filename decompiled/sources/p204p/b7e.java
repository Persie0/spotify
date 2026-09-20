package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class b7e extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final b7e f24228L0;

    /* JADX INFO: renamed from: M0 */
    public static final b7e f24229M0;

    /* JADX INFO: renamed from: N0 */
    public static final b7e f24230N0;

    /* JADX INFO: renamed from: O0 */
    public static final b7e f24231O0;

    /* JADX INFO: renamed from: P0 */
    public static final b7e f24232P0;

    /* JADX INFO: renamed from: Q0 */
    public static final b7e f24233Q0;

    /* JADX INFO: renamed from: R0 */
    public static final b7e f24234R0;

    /* JADX INFO: renamed from: S0 */
    public static final b7e f24235S0;

    /* JADX INFO: renamed from: T0 */
    public static final b7e f24236T0;

    /* JADX INFO: renamed from: U0 */
    public static final b7e f24237U0;

    /* JADX INFO: renamed from: V0 */
    public static final b7e f24238V0;

    /* JADX INFO: renamed from: W0 */
    public static final b7e f24239W0;

    /* JADX INFO: renamed from: X */
    public static final b7e f24240X;

    /* JADX INFO: renamed from: X0 */
    public static final b7e f24241X0;

    /* JADX INFO: renamed from: Y */
    public static final b7e f24242Y;

    /* JADX INFO: renamed from: Y0 */
    public static final b7e f24243Y0;

    /* JADX INFO: renamed from: Z */
    public static final b7e f24244Z;

    /* JADX INFO: renamed from: Z0 */
    public static final b7e f24245Z0;

    /* JADX INFO: renamed from: a1 */
    public static final b7e f24246a1;

    /* JADX INFO: renamed from: b */
    public static final b7e f24247b;

    /* JADX INFO: renamed from: b1 */
    public static final b7e f24248b1;

    /* JADX INFO: renamed from: c */
    public static final b7e f24249c;

    /* JADX INFO: renamed from: c1 */
    public static final b7e f24250c1;

    /* JADX INFO: renamed from: d */
    public static final b7e f24251d;

    /* JADX INFO: renamed from: e */
    public static final b7e f24252e;

    /* JADX INFO: renamed from: f */
    public static final b7e f24253f;

    /* JADX INFO: renamed from: g */
    public static final b7e f24254g;

    /* JADX INFO: renamed from: h */
    public static final b7e f24255h;

    /* JADX INFO: renamed from: i */
    public static final b7e f24256i;

    /* JADX INFO: renamed from: t */
    public static final b7e f24257t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24258a;

    static {
        int i = 2;
        f24247b = new b7e(i, 0);
        f24249c = new b7e(i, 1);
        f24251d = new b7e(i, 2);
        f24252e = new b7e(i, 3);
        f24253f = new b7e(i, 4);
        f24254g = new b7e(i, 5);
        f24255h = new b7e(i, 6);
        f24256i = new b7e(i, 7);
        f24257t = new b7e(i, 8);
        f24240X = new b7e(i, 9);
        f24242Y = new b7e(i, 10);
        f24244Z = new b7e(i, 11);
        f24228L0 = new b7e(i, 12);
        f24229M0 = new b7e(i, 13);
        f24230N0 = new b7e(i, 14);
        f24231O0 = new b7e(i, 15);
        f24232P0 = new b7e(i, 16);
        f24233Q0 = new b7e(i, 17);
        f24234R0 = new b7e(i, 18);
        f24235S0 = new b7e(i, 19);
        f24236T0 = new b7e(i, 20);
        f24237U0 = new b7e(i, 21);
        f24238V0 = new b7e(i, 22);
        f24239W0 = new b7e(i, 23);
        f24241X0 = new b7e(i, 24);
        f24243Y0 = new b7e(i, 25);
        f24245Z0 = new b7e(i, 26);
        f24246a1 = new b7e(i, 27);
        f24248b1 = new b7e(i, 28);
        f24250c1 = new b7e(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7e(int i, int i2) {
        super(i);
        this.f24258a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24258a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 1;
        switch (i) {
            case 0:
                return new sqh0(new rqh0(1));
            case 1:
                return new sqh0(xph0.f264652X);
            case 2:
                return (f8e) ((RetrofitMaker) obj).createWebgateService(f8e.class, "android-gpb-choicescreenuc");
            case 3:
                rth rthVar = new rth();
                rthVar.m76391l(null, "https://wgint.spotify.net");
                return (f8e) ((RetrofitMaker) obj).createCustomHostService(f8e.class, rthVar.m76382c());
            case 4:
                return new sqh0(uqh0.f233019a);
            case 5:
                return new sqh0(new abc0(28, (RetrofitMaker) obj, (hv31) obj2));
            case 6:
                return new sqh0(new tqh0(new vir0(h6f.m46715L(new pt51("premium_individual_se", new jtk0("recurring-p1m-1", null), null), new pt51("premium_duo_se", new jtk0("recurring-p1m", null), null)), null, null)));
            case 7:
                return new sqh0(new e9f0(i2, 8));
            case 8:
                ((y6u) obj).f269898a = (qe10) obj2;
                return w2a1Var;
            case 9:
                ((y6u) obj).f269899b = (r8f) obj2;
                return w2a1Var;
            case 10:
                return new aoe((v140) obj, (erc1) obj2);
            case 11:
                return new pqm0((v140) obj, (erc1) obj2);
            case 12:
                return (wqe) obj2;
            case 13:
                return ufc1.m82980w(((djm0) obj).f49706b, (b250) obj2);
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return new en2(7);
            case 17:
                mih0 mih0Var = (mih0) obj;
                dv91 dv91Var = new dv91("hit", 1);
                String string = ((String) obj2).toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), mih0Var.f144028a, mih0Var.f144029b.f240134b, System.currentTimeMillis());
            case 18:
                int iOrdinal = ((irr) obj2).ordinal();
                if (iOrdinal == 0) {
                    return new qse(1);
                }
                if (iOrdinal == 1) {
                    return new qse(2);
                }
                if (iOrdinal == 2) {
                    return pse.f180831a;
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                return new eye((v140) obj, (qho) obj2);
            case 20:
                return ((Boolean) obj2).booleanValue() ? ize.f107205a : hze.f96904a;
            case 21:
                return Float.valueOf(((rze) obj2).f204143b.m84031v());
            case 22:
                ((z6u) obj).f279991c = (qe10) obj2;
                return w2a1Var;
            case 23:
                ((z6u) obj).f279993e = ((ib3) obj2).f100421a;
                return w2a1Var;
            case 24:
                ((z6u) obj).f279992d = ((kb3) obj2).f121073a;
                return w2a1Var;
            case 25:
                String str = (String) obj;
                pe10 pe10Var = (pe10) obj2;
                if (str.length() == 0) {
                    return pe10Var.toString();
                }
                return str + ", " + pe10Var;
            case 26:
                String str2 = (String) obj;
                smj smjVar = (smj) obj2;
                if (str2.length() == 0) {
                    return smjVar.toString();
                }
                return str2 + ", " + smjVar;
            case 27:
                String str3 = (String) obj;
                dxh0 dxh0Var = (dxh0) obj2;
                if (str3.length() == 0) {
                    return dxh0Var.toString();
                }
                return str3 + ", " + dxh0Var;
            case 28:
                xcf xcfVar = (xcf) obj;
                aef aefVar = (aef) obj2;
                String str4 = xcfVar.f260219a;
                return !wj50.m88271j(str4, aefVar.f14859a) ? Next.m15607i(aef.m25719a(aefVar, xcfVar.f260219a, null, null, 6), Collections.singleton(new sdf(str4))) : Next.m15608j();
            default:
                xcf xcfVar2 = (xcf) obj;
                aef aefVar2 = (aef) obj2;
                String str5 = xcfVar2.f260219a;
                return (wl51.m88460J0(str5) || str5.equals(aefVar2.f14859a)) ? First.m15574b(aefVar2) : First.m15575c(aef.m25719a(aefVar2, xcfVar2.f260219a, null, null, 6), bk5.m29624m1(new udf[]{new sdf(str5), new tdf(str5)}));
        }
    }
}
