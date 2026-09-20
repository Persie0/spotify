package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class neq extends peq implements Comparable {

    /* JADX INFO: renamed from: L0 */
    public final boolean f153050L0;

    /* JADX INFO: renamed from: X */
    public final int f153051X;

    /* JADX INFO: renamed from: Y */
    public final int f153052Y;

    /* JADX INFO: renamed from: Z */
    public final int f153053Z;

    /* JADX INFO: renamed from: e */
    public final int f153054e;

    /* JADX INFO: renamed from: f */
    public final boolean f153055f;

    /* JADX INFO: renamed from: g */
    public final boolean f153056g;

    /* JADX INFO: renamed from: h */
    public final boolean f153057h;

    /* JADX INFO: renamed from: i */
    public final int f153058i;

    /* JADX INFO: renamed from: t */
    public final int f153059t;

    public neq(int i, kf81 kf81Var, int i2, meq meqVar, int i3, String str, String str2) {
        int iM75410j;
        super(i, kf81Var, i2);
        int i4 = 0;
        this.f153055f = o09.m65985u(i3, false);
        int i5 = this.f176833d.f195376e;
        int i6 = meqVar.f52234C;
        pf40 pf40Var = meqVar.f52265y;
        int i7 = i5 & (~i6);
        this.f153056g = (i7 & 1) != 0;
        this.f153057h = (i7 & 2) != 0;
        pf40 pf40VarM69794t = str2 != null ? pf40.m69794t(str2) : pf40Var.isEmpty() ? pf40.m69794t("") : pf40Var;
        int i8 = 0;
        while (true) {
            if (i8 >= pf40VarM69794t.size()) {
                iM75410j = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM75410j = req.m75410j(this.f176833d, (String) pf40VarM69794t.get(i8), meqVar.f52235D);
                if (iM75410j > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f153058i = i8;
        this.f153059t = iM75410j;
        int i9 = str2 != null ? 1088 : meqVar.f52232A;
        int i10 = this.f176833d.f195377f;
        tvl0 tvl0Var = req.f198406l;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f153051X = iBitCount;
        r300 r300Var = this.f176833d;
        this.f153050L0 = (1088 & r300Var.f195377f) != 0;
        int iM75404d = req.m75404d(r300Var, meqVar.f52266z);
        this.f153052Y = iM75404d;
        int iM75410j2 = req.m75410j(this.f176833d, str, req.m75411k(str) == null);
        this.f153053Z = iM75410j2;
        boolean z = iM75410j > 0 || (pf40Var.isEmpty() && iBitCount > 0) || ((pf40Var.isEmpty() && iM75404d != Integer.MAX_VALUE) || this.f153056g || ((this.f153057h && iM75410j2 > 0) || meqVar.f52264x));
        if (o09.m65985u(i3, meqVar.f142818B0) && z) {
            i4 = 1;
        }
        this.f153054e = i4;
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: a */
    public final int mo50397a() {
        return this.f153054e;
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo50398b(peq peqVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(neq neqVar) {
        ytf ytfVarMo88921d = ytf.f276111a.mo88921d(this.f153055f, neqVar.f153055f);
        Integer numValueOf = Integer.valueOf(this.f153058i);
        Integer numValueOf2 = Integer.valueOf(neqVar.f153058i);
        Comparator comparator = hdx0.f90253a;
        ytf ytfVarMo88920c = ytfVarMo88921d.mo88920c(numValueOf, numValueOf2, comparator);
        int i = neqVar.f153059t;
        int i2 = this.f153059t;
        ytf ytfVarMo88918a = ytfVarMo88920c.mo88918a(i2, i);
        int i3 = neqVar.f153051X;
        int i4 = this.f153051X;
        ytf ytfVarMo88921d2 = ytfVarMo88918a.mo88918a(i4, i3).mo88920c(Integer.valueOf(this.f153052Y), Integer.valueOf(neqVar.f153052Y), comparator).mo88921d(this.f153056g, neqVar.f153056g);
        Boolean boolValueOf = Boolean.valueOf(this.f153057h);
        Boolean boolValueOf2 = Boolean.valueOf(neqVar.f153057h);
        if (i2 == 0) {
            comparator = nxi0.f159490a;
        }
        ytf ytfVarMo88918a2 = ytfVarMo88921d2.mo88920c(boolValueOf, boolValueOf2, comparator).mo88918a(this.f153053Z, neqVar.f153053Z);
        if (i4 == 0) {
            ytfVarMo88918a2 = ytfVarMo88918a2.mo88922e(this.f153050L0, neqVar.f153050L0);
        }
        return ytfVarMo88918a2.mo88923f();
    }
}
