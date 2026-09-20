package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kxb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final kxb0 f127389L0;

    /* JADX INFO: renamed from: M0 */
    public static final kxb0 f127390M0;

    /* JADX INFO: renamed from: N0 */
    public static final kxb0 f127391N0;

    /* JADX INFO: renamed from: O0 */
    public static final kxb0 f127392O0;

    /* JADX INFO: renamed from: P0 */
    public static final kxb0 f127393P0;

    /* JADX INFO: renamed from: Q0 */
    public static final kxb0 f127394Q0;

    /* JADX INFO: renamed from: R0 */
    public static final kxb0 f127395R0;

    /* JADX INFO: renamed from: S0 */
    public static final kxb0 f127396S0;

    /* JADX INFO: renamed from: T0 */
    public static final kxb0 f127397T0;

    /* JADX INFO: renamed from: U0 */
    public static final kxb0 f127398U0;

    /* JADX INFO: renamed from: V0 */
    public static final kxb0 f127399V0;

    /* JADX INFO: renamed from: W0 */
    public static final kxb0 f127400W0;

    /* JADX INFO: renamed from: X */
    public static final kxb0 f127401X;

    /* JADX INFO: renamed from: X0 */
    public static final kxb0 f127402X0;

    /* JADX INFO: renamed from: Y */
    public static final kxb0 f127403Y;

    /* JADX INFO: renamed from: Y0 */
    public static final kxb0 f127404Y0;

    /* JADX INFO: renamed from: Z */
    public static final kxb0 f127405Z;

    /* JADX INFO: renamed from: Z0 */
    public static final kxb0 f127406Z0;

    /* JADX INFO: renamed from: a1 */
    public static final kxb0 f127407a1;

    /* JADX INFO: renamed from: b */
    public static final kxb0 f127408b;

    /* JADX INFO: renamed from: b1 */
    public static final kxb0 f127409b1;

    /* JADX INFO: renamed from: c */
    public static final kxb0 f127410c;

    /* JADX INFO: renamed from: c1 */
    public static final kxb0 f127411c1;

    /* JADX INFO: renamed from: d */
    public static final kxb0 f127412d;

    /* JADX INFO: renamed from: e */
    public static final kxb0 f127413e;

    /* JADX INFO: renamed from: f */
    public static final kxb0 f127414f;

    /* JADX INFO: renamed from: g */
    public static final kxb0 f127415g;

    /* JADX INFO: renamed from: h */
    public static final kxb0 f127416h;

    /* JADX INFO: renamed from: i */
    public static final kxb0 f127417i;

    /* JADX INFO: renamed from: t */
    public static final kxb0 f127418t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127419a;

    static {
        int i = 1;
        f127408b = new kxb0(i, 0);
        f127410c = new kxb0(i, 1);
        f127412d = new kxb0(i, 2);
        f127413e = new kxb0(i, 3);
        f127414f = new kxb0(i, 4);
        f127415g = new kxb0(i, 5);
        f127416h = new kxb0(i, 6);
        f127417i = new kxb0(i, 7);
        f127418t = new kxb0(i, 8);
        f127401X = new kxb0(i, 9);
        f127403Y = new kxb0(i, 10);
        f127405Z = new kxb0(i, 11);
        f127389L0 = new kxb0(i, 12);
        f127390M0 = new kxb0(i, 13);
        f127391N0 = new kxb0(i, 14);
        f127392O0 = new kxb0(i, 15);
        f127393P0 = new kxb0(i, 16);
        f127394Q0 = new kxb0(i, 17);
        f127395R0 = new kxb0(i, 18);
        f127396S0 = new kxb0(i, 19);
        f127397T0 = new kxb0(i, 20);
        f127398U0 = new kxb0(i, 21);
        f127399V0 = new kxb0(i, 22);
        f127400W0 = new kxb0(i, 23);
        f127402X0 = new kxb0(i, 24);
        f127404Y0 = new kxb0(i, 25);
        f127406Z0 = new kxb0(i, 26);
        f127407a1 = new kxb0(i, 27);
        f127409b1 = new kxb0(i, 28);
        f127411c1 = new kxb0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxb0(int i, int i2) {
        super(i);
        this.f127419a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f127419a;
        rxb0 rxb0Var = qxb0.f193613b;
        pxb0 pxb0Var = pxb0.f182269b;
        oxb0 oxb0Var = oxb0.f170957b;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                rxb0.f203572a.getClass();
                nxb0 nxb0Var = nxb0.f159431a;
                if (obj.equals("default")) {
                    rxb0Var = oxb0Var;
                } else if (obj.equals("empty")) {
                    rxb0Var = pxb0Var;
                }
                return new mxb0(rxb0Var);
            case 1:
                if (obj.equals("default")) {
                    return oxb0Var;
                }
                return obj.equals("empty") ? pxb0Var : rxb0Var;
            case 2:
                return ((iyb0) obj).f106924a;
            case 3:
                return ((qwb0) obj).mo30124d();
            case 4:
                return ((iyb0) obj).f106927d;
            case 5:
                return ((qwb0) obj).mo30124d();
            case 6:
                v5j v5jVar = (v5j) obj;
                AbstractC1895gf.m44546o(v5jVar.f237515e, v5jVar.f237513c.f279580e, 0.0f, 0.0f, 6);
                return w2a1Var;
            case 7:
                v5j v5jVar2 = (v5j) obj;
                rbz.m75198p(null, "parent", v5jVar2);
                AbstractC1895gf.m44546o(v5jVar2.f237517g, v5jVar2.f237513c.f279582g, 0.0f, 0.0f, 6);
                return w2a1Var;
            case 8:
                v5j v5jVar3 = (v5j) obj;
                AbstractC1895gf.m44546o(v5jVar3.f237517g, v5jVar3.f237513c.f279582g, 0.0f, 0.0f, 6);
                return w2a1Var;
            case 9:
                v5j v5jVar4 = (v5j) obj;
                AbstractC1895gf.m44546o(v5jVar4.f237517g, v5jVar4.f237513c.f279582g, 0.0f, 0.0f, 6);
                return w2a1Var;
            case 10:
                v5j v5jVar5 = (v5j) obj;
                rbz.m75198p(null, "parent", v5jVar5);
                AbstractC1895gf.m44546o(v5jVar5.f237515e, v5jVar5.f237513c.f279580e, 0.0f, 0.0f, 6);
                return w2a1Var;
            case 11:
                return ((oyb0) obj).f171719b;
            case 12:
                return ((iyb0) obj).f106925b;
            case 13:
                return ((qwb0) obj).mo30124d();
            case 14:
                return ((iyb0) obj).f106926c;
            case 15:
                return rfg1.f198648a;
            case 16:
                return ((oyb0) obj).f171720c;
            case 17:
                return ((oyb0) obj).f171721d;
            case 18:
                jpz0.m53990d((mpz0) obj);
                return w2a1Var;
            case 19:
                jpz0.m53989c((mpz0) obj);
                return w2a1Var;
            case 20:
                gzb0 gzb0Var = (gzb0) obj;
                return new hzb0(gzb0Var.f85881d, gzb0Var.f85882e, "");
            case 21:
                return pp91.m70529j(new pqm0("parcelable", (Parcelable) obj));
            case 22:
                return pp91.m70529j(new pqm0("ManageBlockedContentModel", (r2c0) obj));
            case 23:
                return pp91.m70529j(new pqm0("ManageBlockedContentModel", (r2c0) obj));
            case 24:
                jpz0.m53989c((mpz0) obj);
                return w2a1Var;
            case 25:
                return new ijg0((slg0) obj);
            case 26:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), ((ijg0) obj).f102808a, st91.f213865b, System.currentTimeMillis());
            case 27:
                return pp91.m70529j(new pqm0("ManagedAccountAllowlistingRequestsModel", (b4c0) obj));
            case 28:
                return umg1.m83452t(((v5c0) obj).f237391a);
            default:
                a8c0 a8c0Var = (a8c0) obj;
                return eng1.m39506p(a8c0Var.f13249a, a8c0Var.f13250b);
        }
    }
}
