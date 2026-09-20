package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f89 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: L0 */
    public static final f89 f66885L0;

    /* JADX INFO: renamed from: M0 */
    public static final f89 f66886M0;

    /* JADX INFO: renamed from: N0 */
    public static final f89 f66887N0;

    /* JADX INFO: renamed from: O0 */
    public static final f89 f66888O0;

    /* JADX INFO: renamed from: P0 */
    public static final f89 f66889P0;

    /* JADX INFO: renamed from: Q0 */
    public static final f89 f66890Q0;

    /* JADX INFO: renamed from: R0 */
    public static final f89 f66891R0;

    /* JADX INFO: renamed from: S0 */
    public static final f89 f66892S0;

    /* JADX INFO: renamed from: T0 */
    public static final f89 f66893T0;

    /* JADX INFO: renamed from: U0 */
    public static final f89 f66894U0;

    /* JADX INFO: renamed from: V0 */
    public static final f89 f66895V0;

    /* JADX INFO: renamed from: W0 */
    public static final f89 f66896W0;

    /* JADX INFO: renamed from: X */
    public static final f89 f66897X;

    /* JADX INFO: renamed from: X0 */
    public static final f89 f66898X0;

    /* JADX INFO: renamed from: Y */
    public static final f89 f66899Y;

    /* JADX INFO: renamed from: Y0 */
    public static final f89 f66900Y0;

    /* JADX INFO: renamed from: Z */
    public static final f89 f66901Z;

    /* JADX INFO: renamed from: Z0 */
    public static final f89 f66902Z0;

    /* JADX INFO: renamed from: a1 */
    public static final f89 f66903a1;

    /* JADX INFO: renamed from: b */
    public static final f89 f66904b;

    /* JADX INFO: renamed from: b1 */
    public static final f89 f66905b1;

    /* JADX INFO: renamed from: c */
    public static final f89 f66906c;

    /* JADX INFO: renamed from: c1 */
    public static final f89 f66907c1;

    /* JADX INFO: renamed from: d */
    public static final f89 f66908d;

    /* JADX INFO: renamed from: e */
    public static final f89 f66909e;

    /* JADX INFO: renamed from: f */
    public static final f89 f66910f;

    /* JADX INFO: renamed from: g */
    public static final f89 f66911g;

    /* JADX INFO: renamed from: h */
    public static final f89 f66912h;

    /* JADX INFO: renamed from: i */
    public static final f89 f66913i;

    /* JADX INFO: renamed from: t */
    public static final f89 f66914t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66915a;

    static {
        int i = 1;
        f66904b = new f89(i, 0);
        f66906c = new f89(i, 1);
        f66908d = new f89(i, 2);
        f66909e = new f89(i, 3);
        f66910f = new f89(i, 4);
        f66911g = new f89(i, 5);
        f66912h = new f89(i, 6);
        f66913i = new f89(i, 7);
        f66914t = new f89(i, 8);
        f66897X = new f89(i, 9);
        f66899Y = new f89(i, 10);
        f66901Z = new f89(i, 11);
        f66885L0 = new f89(i, 12);
        f66886M0 = new f89(i, 13);
        f66887N0 = new f89(i, 14);
        f66888O0 = new f89(i, 15);
        f66889P0 = new f89(i, 16);
        f66890Q0 = new f89(i, 17);
        f66891R0 = new f89(i, 18);
        f66892S0 = new f89(i, 19);
        f66893T0 = new f89(i, 20);
        f66894U0 = new f89(i, 21);
        f66895V0 = new f89(i, 22);
        f66896W0 = new f89(i, 23);
        f66898X0 = new f89(i, 24);
        f66900Y0 = new f89(i, 25);
        f66902Z0 = new f89(i, 26);
        f66903a1 = new f89(i, 27);
        f66905b1 = new f89(i, 28);
        f66907c1 = new f89(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f89(int i, int i2) {
        super(i);
        this.f66915a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.f66915a) {
            case 0:
                v6w0 v6w0Var = (v6w0) obj;
                return new t4s(v6w0Var.f237979a, v6w0Var.f237980b, 4);
            case 1:
                v6w0 v6w0Var2 = (v6w0) obj;
                return new tq01(18, v6w0Var2.f237979a, (String) null, v6w0Var2.f237980b, "episode-row-quick-action");
            case 2:
                return Long.valueOf(((Number) obj).longValue() + 30000);
            case 3:
                double dDoubleValue = ((Number) obj).doubleValue();
                double d = 0.0d;
                if (dDoubleValue > 0.0d) {
                    double dM63435l = n0e1.m63435l(dDoubleValue, 0.0d, 1.0d);
                    double d2 = qb9.f187041a;
                    d = d2 + ((1.0d - d2) * dM63435l);
                }
                return Double.valueOf(d);
            case 4:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), ((l2h0) obj).f129011a, st91.f213865b, System.currentTimeMillis());
            case 5:
                return ((pj9) obj).f178209a;
            case 6:
                return ((pj9) obj).f178209a;
            case 7:
                if (!(obj instanceof v140) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 9:
                if (!(obj instanceof erc1) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 11:
                return ((xj9) obj).f262071a;
            case 12:
                return ((xj9) obj).f262072b;
            case 13:
                return ((xj9) obj).f262071a;
            case 14:
                return ((xj9) obj).f262072b;
            case 15:
                if (!(obj instanceof v140) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 17:
                if (!(obj instanceof v140) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (v140) obj;
            case 19:
                if (!(obj instanceof erc1) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 21:
                if (!(obj instanceof erc1) && !(obj instanceof w2a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof w2a1) {
                    return null;
                }
                return (erc1) obj;
            case 23:
                return (hz80) obj;
            case 24:
                return Boolean.valueOf(obj instanceof hz80);
            case 25:
                if (obj != null) {
                    return (hz80) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
            case 26:
                return new nl9(((ty80) obj).f224877f.f271256a);
            case 27:
                km51 km51Var = (km51) obj;
                if (km51Var instanceof im51) {
                    Set set = dd41.f47702f;
                    im51 im51Var = (im51) km51Var;
                    z = r46.m74726U(im51Var.f103597c).f47709c == gn80.TRACK && wj50.m88271j(im51Var.f103603i.get("blend.show_recs_icon"), "true");
                }
                return Boolean.valueOf(z);
            case 28:
                return new tl9(((sl9) obj).f210323b, false);
            default:
                return gn9.f82660a;
        }
    }
}
