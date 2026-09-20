package p204p;

import android.os.Bundle;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes6.dex */
public final class mo01 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final mo01 f145510L0;

    /* JADX INFO: renamed from: M0 */
    public static final mo01 f145511M0;

    /* JADX INFO: renamed from: N0 */
    public static final mo01 f145512N0;

    /* JADX INFO: renamed from: O0 */
    public static final mo01 f145513O0;

    /* JADX INFO: renamed from: P0 */
    public static final mo01 f145514P0;

    /* JADX INFO: renamed from: Q0 */
    public static final mo01 f145515Q0;

    /* JADX INFO: renamed from: R0 */
    public static final mo01 f145516R0;

    /* JADX INFO: renamed from: S0 */
    public static final mo01 f145517S0;

    /* JADX INFO: renamed from: T0 */
    public static final mo01 f145518T0;

    /* JADX INFO: renamed from: U0 */
    public static final mo01 f145519U0;

    /* JADX INFO: renamed from: V0 */
    public static final mo01 f145520V0;

    /* JADX INFO: renamed from: W0 */
    public static final mo01 f145521W0;

    /* JADX INFO: renamed from: X */
    public static final mo01 f145522X;

    /* JADX INFO: renamed from: X0 */
    public static final mo01 f145523X0;

    /* JADX INFO: renamed from: Y */
    public static final mo01 f145524Y;

    /* JADX INFO: renamed from: Y0 */
    public static final mo01 f145525Y0;

    /* JADX INFO: renamed from: Z */
    public static final mo01 f145526Z;

    /* JADX INFO: renamed from: Z0 */
    public static final mo01 f145527Z0;

    /* JADX INFO: renamed from: a1 */
    public static final mo01 f145528a1;

    /* JADX INFO: renamed from: b */
    public static final mo01 f145529b;

    /* JADX INFO: renamed from: b1 */
    public static final mo01 f145530b1;

    /* JADX INFO: renamed from: c */
    public static final mo01 f145531c;

    /* JADX INFO: renamed from: c1 */
    public static final mo01 f145532c1;

    /* JADX INFO: renamed from: d */
    public static final mo01 f145533d;

    /* JADX INFO: renamed from: e */
    public static final mo01 f145534e;

    /* JADX INFO: renamed from: f */
    public static final mo01 f145535f;

    /* JADX INFO: renamed from: g */
    public static final mo01 f145536g;

    /* JADX INFO: renamed from: h */
    public static final mo01 f145537h;

    /* JADX INFO: renamed from: i */
    public static final mo01 f145538i;

    /* JADX INFO: renamed from: t */
    public static final mo01 f145539t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145540a;

    static {
        int i = 1;
        f145529b = new mo01(i, 0);
        f145531c = new mo01(i, 1);
        f145533d = new mo01(i, 2);
        f145534e = new mo01(i, 3);
        f145535f = new mo01(i, 4);
        f145536g = new mo01(i, 5);
        f145537h = new mo01(i, 6);
        f145538i = new mo01(i, 7);
        f145539t = new mo01(i, 8);
        f145522X = new mo01(i, 9);
        f145524Y = new mo01(i, 10);
        f145526Z = new mo01(i, 11);
        f145510L0 = new mo01(i, 12);
        f145511M0 = new mo01(i, 13);
        f145512N0 = new mo01(i, 14);
        f145513O0 = new mo01(i, 15);
        f145514P0 = new mo01(i, 16);
        f145515Q0 = new mo01(i, 17);
        f145516R0 = new mo01(i, 18);
        f145517S0 = new mo01(i, 19);
        f145518T0 = new mo01(i, 20);
        f145519U0 = new mo01(i, 21);
        f145520V0 = new mo01(i, 22);
        f145521W0 = new mo01(i, 23);
        f145523X0 = new mo01(i, 24);
        f145525Y0 = new mo01(i, 25);
        f145527Z0 = new mo01(i, 26);
        f145528a1 = new mo01(i, 27);
        f145530b1 = new mo01(i, 28);
        f145532c1 = new mo01(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo01(int i, int i2) {
        super(i);
        this.f145540a = i2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f145540a) {
            case 0:
                return Boolean.valueOf((obj instanceof v140) || (obj instanceof w2a1));
            case 1:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 2:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m53990d(mpz0Var);
                jpz0.m54011y(mpz0Var, "destination.title");
                return w2a1.f247311a;
            case 3:
                return new pq01(true);
            case 4:
                return (pq01) obj;
            case 5:
                return (lq01) obj;
            case 6:
                return new wq01((sq01) obj, new ybv(null, -1));
            case 7:
                return (y511) obj;
            case 8:
                return Boolean.valueOf(obj instanceof y511);
            case 9:
                if (obj != null) {
                    return (y511) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.sharetrait.ShareTrait");
            case 10:
                return s571.m77251j("spotify:", (String) obj, ":*");
            case 11:
                return (hz80) obj;
            case 12:
                ybv ybvVar = ((ty80) obj).f224877f;
                return new fs01(new dr01(ybvVar.f271256a, ybvVar.f271257b), ybvVar.f271271p, ybvVar.f271272q);
            case 13:
                return Boolean.valueOf(obj instanceof hz80);
            case 14:
                if (obj != null) {
                    return (hz80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
            case 15:
                return w2a1.f247311a;
            case 16:
                r9h0 r9h0Var = (r9h0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), r9h0Var.f197062a, r9h0Var.f197063b.f186597c.f249179b.f280780a, System.currentTimeMillis());
            case 17:
                return ((rkg0) obj).m75726e();
            case 18:
                return ((pla1) obj).f178682b;
            case 19:
                return gug1.m45778t((gu01) obj);
            case 20:
                return ((rkg0) obj).m75726e();
            case 21:
                return new ni01(0);
            case 22:
                return ((sr01) obj).f213201a.f201918a.f136946a;
            case 23:
                return ((sr01) obj).f213201a.f201919b.m91911g();
            case 24:
                ((fdx0) obj).m41385g(1);
                return w2a1.f247311a;
            case 25:
                tgj tgjVar = (tgj) obj;
                DrawScope.m275e0(tgjVar, n6f.f150862b, (Size.m264e(tgjVar.mo295n()) * 0.5f) + (Size.m264e(tgjVar.mo295n()) * 0.07f), 0L, 0.0f, null, 60);
                tgjVar.mo50174s1();
                return w2a1.f247311a;
            case 26:
                return ((l3b) obj).m57996b(f145525Y0);
            case 27:
                return ((rkg0) obj).m75726e();
            case 28:
                return pp91.m70529j(new pqm0("share.sheet.state", (qz01) obj));
            default:
                return (qz01) zn91.m96523K((Bundle) obj, "share.sheet.state", qz01.class);
        }
    }
}
