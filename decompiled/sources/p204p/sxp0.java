package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class sxp0 {

    /* JADX INFO: renamed from: A */
    public final wg61 f214956A;

    /* JADX INFO: renamed from: B */
    public final wg61 f214957B;

    /* JADX INFO: renamed from: C */
    public final wg61 f214958C;

    /* JADX INFO: renamed from: a */
    public final luk f214959a;

    /* JADX INFO: renamed from: b */
    public final lqi0 f214960b;

    /* JADX INFO: renamed from: c */
    public final sdo f214961c;

    /* JADX INFO: renamed from: d */
    public final boolean f214962d;

    /* JADX INFO: renamed from: e */
    public final kmx f214963e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f214964f;

    /* JADX INFO: renamed from: g */
    public final luu0 f214965g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f214966h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f214967i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f214968j;

    /* JADX INFO: renamed from: k */
    public final int f214969k;

    /* JADX INFO: renamed from: l */
    public final int f214970l;

    /* JADX INFO: renamed from: m */
    public final boolean f214971m;

    /* JADX INFO: renamed from: n */
    public LinkedHashMap f214972n;

    /* JADX INFO: renamed from: o */
    public LinkedHashMap f214973o;

    /* JADX INFO: renamed from: p */
    public LinkedHashMap f214974p;

    /* JADX INFO: renamed from: q */
    public LinkedHashMap f214975q;

    /* JADX INFO: renamed from: r */
    public LinkedHashMap f214976r;

    /* JADX INFO: renamed from: s */
    public final wg61 f214977s;

    /* JADX INFO: renamed from: t */
    public final wg61 f214978t;

    /* JADX INFO: renamed from: u */
    public final wg61 f214979u;

    /* JADX INFO: renamed from: v */
    public final wg61 f214980v;

    /* JADX INFO: renamed from: w */
    public final wg61 f214981w;

    /* JADX INFO: renamed from: x */
    public final wg61 f214982x;

    /* JADX INFO: renamed from: y */
    public final wg61 f214983y;

    /* JADX INFO: renamed from: z */
    public final wg61 f214984z;

    public sxp0(opn opnVar, luk lukVar, ye4 ye4Var, lqi0 lqi0Var, sdo sdoVar, boolean z, kmx kmxVar, ArrayList arrayList, luu0 luu0Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f214959a = lukVar;
        this.f214960b = lqi0Var;
        this.f214961c = sdoVar;
        this.f214962d = z;
        this.f214963e = kmxVar;
        this.f214964f = arrayList;
        this.f214965g = luu0Var;
        this.f214966h = arrayList2;
        this.f214967i = arrayList3;
        this.f214968j = arrayList4;
        int iM93524b = ye4Var.m93524b();
        this.f214969k = iM93524b;
        this.f214970l = (int) (((double) iM93524b) * 0.4d);
        this.f214971m = ye4Var.m93523a();
        this.f214977s = new wg61(new zwp0(this, 3));
        this.f214978t = new wg61(new zwp0(this, 0));
        this.f214979u = new wg61(new zwp0(this, 1));
        this.f214980v = new wg61(new zwp0(opnVar, this));
        this.f214981w = new wg61(new zwp0(this, 7));
        this.f214982x = new wg61(new zwp0(this, 5));
        this.f214983y = new wg61(new zwp0(this, 10));
        this.f214984z = new wg61(new zwp0(this, 8));
        this.f214956A = new wg61(new zwp0(this, 9));
        this.f214957B = new wg61(new zwp0(this, 6));
        this.f214958C = new wg61(new zwp0(this, 4));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m79663a(sxp0 sxp0Var, mu21 mu21Var) {
        el11 el11VarMo24875c = mu21Var.mo24875c();
        qho qhoVarMo25866b = ((ago) sxp0Var.f214961c.f208051e).mo25866b(el11VarMo24875c.mo27669a().mo28634a(w2a1.f247311a));
        return (qhoVarMo25866b instanceof oho) && el11VarMo24875c.mo27680m(((oho) qhoVarMo25866b).f165512a);
    }

    /* JADX INFO: renamed from: b */
    public static final fiz m79664b(sxp0 sxp0Var, String str, c6z0 c6z0Var) {
        fbk fbkVar = null;
        if (sxp0Var.f214971m && (c6z0Var instanceof mu21)) {
            return nxf1.m65828g(new yyj0(sxp0Var, (mu21) c6z0Var, fbkVar, 21));
        }
        LinkedHashMap linkedHashMap = sxp0Var.f214976r;
        if (linkedHashMap == null) {
            wj50.m88260d0("allSectionElementsAndCompanions");
            throw null;
        }
        Object obj = linkedHashMap.get(str);
        wj50.m88279p(obj);
        return ((uxt) obj).f235037a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX INFO: renamed from: c */
    public final String m79665c(vco vcoVar) {
        if (this.f214962d) {
            return m79666d(z8g1.m95598r(vcoVar));
        }
        for (Object obj : this.f214964f) {
            if (((ivt) ((dyp0) obj).f54428b).mo39928d(vcoVar)) {
                if (obj != null) {
                    return ((dyp0) obj).f54427a;
                }
                throw new IllegalArgumentException("There is no row that can handle, this is impossible.");
            }
        }
        obj = null;
        if (obj != null) {
            return ((dyp0) obj).f54427a;
        }
        throw new IllegalArgumentException("There is no row that can handle, this is impossible.");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX INFO: renamed from: d */
    public final String m79666d(km51 km51Var) {
        for (Object obj : this.f214964f) {
            fl11 fl11VarMo39927c = ((ivt) ((dyp0) obj).f54428b).mo39927c();
            qho qhoVarMo25866b = ((ago) this.f214961c.f208051e).mo25866b(fl11VarMo39927c.mo25659a().mo28634a(km51Var));
            if ((qhoVarMo25866b instanceof oho) && fl11VarMo39927c.mo25662d(km51Var, ((oho) qhoVarMo25866b).f165512a)) {
                if (obj != null) {
                    return ((dyp0) obj).f54427a;
                }
                throw new IllegalArgumentException("There is no row that can handle, this is impossible.");
            }
        }
        obj = null;
        if (obj != null) {
            return ((dyp0) obj).f54427a;
        }
        throw new IllegalArgumentException("There is no row that can handle, this is impossible.");
    }

    /* JADX INFO: renamed from: e */
    public final String m79667e(vco vcoVar, xq00 xq00Var) {
        Object obj = t6x0.f217647t;
        xq00Var.m91771i0(-700200824);
        if (!this.f214962d) {
            xq00Var.m91771i0(973491040);
            boolean zM91766g = xq00Var.m91766g(vcoVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = m79665c(vcoVar);
                xq00Var.m91793t0(objM91750T);
            }
            String str = (String) objM91750T;
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
            return str;
        }
        xq00Var.m91771i0(973546778);
        xq00Var.m91788r(false);
        boolean zM91766g2 = xq00Var.m91766g(vcoVar);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91766g2 || objM91750T2 == obj) {
            objM91750T2 = z8g1.m95598r(vcoVar);
            xq00Var.m91793t0(objM91750T2);
        }
        km51 km51Var = (km51) objM91750T2;
        boolean zM91766g3 = xq00Var.m91766g(km51Var);
        Object objM91750T3 = xq00Var.m91750T();
        if (zM91766g3 || objM91750T3 == obj) {
            objM91750T3 = sam.m77645B(m79666d(km51Var));
            xq00Var.m91793t0(objM91750T3);
        }
        kqi0 kqi0Var = (kqi0) objM91750T3;
        boolean zM91770i = xq00Var.m91770i(this) | xq00Var.m91770i(km51Var) | xq00Var.m91766g(kqi0Var);
        Object objM91750T4 = xq00Var.m91750T();
        if (zM91770i || objM91750T4 == obj) {
            Object uyf0Var = new uyf0(this, km51Var, kqi0Var, (fbk) null, 12);
            xq00Var.m91793t0(uyf0Var);
            objM91750T4 = uyf0Var;
        }
        hz40.m49237i(km51Var, (th00) objM91750T4, xq00Var);
        String str2 = (String) kqi0Var.getValue();
        xq00Var.m91788r(false);
        return str2;
    }
}
