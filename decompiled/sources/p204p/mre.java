package p204p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class mre extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final mre f146480L0;

    /* JADX INFO: renamed from: M0 */
    public static final mre f146481M0;

    /* JADX INFO: renamed from: N0 */
    public static final mre f146482N0;

    /* JADX INFO: renamed from: O0 */
    public static final mre f146483O0;

    /* JADX INFO: renamed from: P0 */
    public static final mre f146484P0;

    /* JADX INFO: renamed from: Q0 */
    public static final mre f146485Q0;

    /* JADX INFO: renamed from: R0 */
    public static final mre f146486R0;

    /* JADX INFO: renamed from: S0 */
    public static final mre f146487S0;

    /* JADX INFO: renamed from: T0 */
    public static final mre f146488T0;

    /* JADX INFO: renamed from: U0 */
    public static final mre f146489U0;

    /* JADX INFO: renamed from: V0 */
    public static final mre f146490V0;

    /* JADX INFO: renamed from: W0 */
    public static final mre f146491W0;

    /* JADX INFO: renamed from: X */
    public static final mre f146492X;

    /* JADX INFO: renamed from: X0 */
    public static final mre f146493X0;

    /* JADX INFO: renamed from: Y */
    public static final mre f146494Y;

    /* JADX INFO: renamed from: Y0 */
    public static final mre f146495Y0;

    /* JADX INFO: renamed from: Z */
    public static final mre f146496Z;

    /* JADX INFO: renamed from: Z0 */
    public static final mre f146497Z0;

    /* JADX INFO: renamed from: a1 */
    public static final mre f146498a1;

    /* JADX INFO: renamed from: b */
    public static final mre f146499b;

    /* JADX INFO: renamed from: b1 */
    public static final mre f146500b1;

    /* JADX INFO: renamed from: c */
    public static final mre f146501c;

    /* JADX INFO: renamed from: c1 */
    public static final mre f146502c1;

    /* JADX INFO: renamed from: d */
    public static final mre f146503d;

    /* JADX INFO: renamed from: e */
    public static final mre f146504e;

    /* JADX INFO: renamed from: f */
    public static final mre f146505f;

    /* JADX INFO: renamed from: g */
    public static final mre f146506g;

    /* JADX INFO: renamed from: h */
    public static final mre f146507h;

    /* JADX INFO: renamed from: i */
    public static final mre f146508i;

    /* JADX INFO: renamed from: t */
    public static final mre f146509t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146510a;

    static {
        int i = 1;
        f146499b = new mre(i, 0);
        f146501c = new mre(i, 1);
        f146503d = new mre(i, 2);
        f146504e = new mre(i, 3);
        f146505f = new mre(i, 4);
        f146506g = new mre(i, 5);
        f146507h = new mre(i, 6);
        f146508i = new mre(i, 7);
        f146509t = new mre(i, 8);
        f146492X = new mre(i, 9);
        f146494Y = new mre(i, 10);
        f146496Z = new mre(i, 11);
        f146480L0 = new mre(i, 12);
        f146481M0 = new mre(i, 13);
        f146482N0 = new mre(i, 14);
        f146483O0 = new mre(i, 15);
        f146484P0 = new mre(i, 16);
        f146485Q0 = new mre(i, 17);
        f146486R0 = new mre(i, 18);
        f146487S0 = new mre(i, 19);
        f146488T0 = new mre(i, 20);
        f146489U0 = new mre(i, 21);
        f146490V0 = new mre(i, 22);
        f146491W0 = new mre(i, 23);
        f146493X0 = new mre(i, 24);
        f146495Y0 = new mre(i, 25);
        f146497Z0 = new mre(i, 26);
        f146498a1 = new mre(i, 27);
        f146500b1 = new mre(i, 28);
        f146502c1 = new mre(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mre(int i, int i2) {
        super(i);
        this.f146510a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6, types: [p.qla1] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str;
        nw80 nw80Var;
        e081 c081Var;
        boolean z = false;
        z = false;
        z = false;
        qla1 qla1Var = 0;
        qla1Var = 0;
        int i = 1;
        switch (this.f146510a) {
            case 0:
                return new ykl(((djm0) obj).f49705a);
            case 1:
                return Collections.singleton(((djm0) obj).f49705a);
            case 2:
                return gbu.f78413a;
            case 3:
                nre nreVar = (nre) obj;
                return new lql(nreVar.f157513a, nreVar.f157515c, nreVar.f157514b, true);
            case 4:
                return Collections.singleton(((nre) obj).f157513a);
            case 5:
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return new mih0(new vch0(xgg1.m90770c5().f36164a, xoc1.f264088g1.f243453a, (st91) obj));
            case 6:
                return pse.f180831a;
            case 7:
                hz80 hz80Var = (hz80) obj;
                if (hz80Var != null && hz80Var.f96818S0 > 1 && ((str = hz80Var.f96829e) == null || str.length() == 0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return Boolean.valueOf((obj instanceof hz80) || (obj instanceof w2a1));
            case 9:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (hz80) obj;
            case 10:
                s5a0 s5a0Var = ((vco) obj).f240176g;
                q5a0 q5a0Var = s5a0Var instanceof q5a0 ? (q5a0) s5a0Var : null;
                if (q5a0Var != null && (nw80Var = q5a0Var.f185487a) != null) {
                    qla1Var = nw80Var.f159050d;
                }
                return new sxe(qla1Var);
            case 11:
                return new ilg0((slg0) obj);
            case 12:
                return ((ylg0) obj).m94162a("spotify:new:playlist");
            case 13:
                return ((fye) obj).f74713a;
            case 14:
                return ((fye) obj).f74713a;
            case 15:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 16:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 17:
                return Boolean.valueOf(obj instanceof erc1);
            case 18:
                return (qho) obj;
            case 19:
                ln01 ln01Var = (ln01) obj;
                int i2 = ln01Var.f135070b;
                String strM91910c = ln01Var.f135069a.m91910c();
                e081 e081Var = ln01Var.f135071c;
                e081Var.getClass();
                if (e081Var instanceof d081) {
                    c081Var = d081.f43812a;
                } else if (e081Var instanceof b081) {
                    c081Var = b081.f21799a;
                } else {
                    if (!(e081Var instanceof c081)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c081Var = new c081((xye) ((c081) e081Var).f32713a);
                }
                return new cze(strM91910c, i2, c081Var);
            case 20:
                return (cze) obj;
            case 21:
                return hze.f96904a;
            case 22:
                ((icp) obj).f100858d = new lze(5, z ? 1 : 0, qla1Var);
                return w2a1.f247311a;
            case 23:
                float fFloatValue = ((Number) obj).floatValue();
                rze rzeVar = new rze();
                rzeVar.f204143b.m84032w(fFloatValue);
                return rzeVar;
            case 24:
                return new nm4(i);
            case 25:
                return (String) obj;
            case 26:
                return (uy80) obj;
            case 27:
                return Boolean.valueOf((obj instanceof uy80) || (obj instanceof w2a1));
            case 28:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (uy80) obj;
            default:
                return (String) obj;
        }
    }
}
