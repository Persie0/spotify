package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ys21 {

    /* JADX INFO: renamed from: a */
    public final boolean f275648a;

    /* JADX INFO: renamed from: b */
    public final zh20 f275649b;

    /* JADX INFO: renamed from: c */
    public final boolean f275650c;

    /* JADX INFO: renamed from: d */
    public final boolean f275651d;

    /* JADX INFO: renamed from: e */
    public final daq0 f275652e;

    /* JADX INFO: renamed from: f */
    public final boolean f275653f;

    /* JADX INFO: renamed from: g */
    public final boolean f275654g;

    /* JADX INFO: renamed from: h */
    public final boolean f275655h;

    /* JADX INFO: renamed from: i */
    public final o9c1 f275656i;

    /* JADX INFO: renamed from: j */
    public final qsj f275657j;

    /* JADX INFO: renamed from: k */
    public final cks f275658k;

    /* JADX INFO: renamed from: l */
    public final Long f275659l;

    /* JADX INFO: renamed from: m */
    public final boolean f275660m;

    /* JADX INFO: renamed from: n */
    public final boolean f275661n;

    /* JADX INFO: renamed from: o */
    public final boolean f275662o;

    /* JADX INFO: renamed from: p */
    public final String f275663p;

    /* JADX INFO: renamed from: q */
    public final boolean f275664q;

    /* JADX INFO: renamed from: r */
    public final String f275665r;

    public ys21(boolean z, zh20 zh20Var, boolean z2, boolean z3, daq0 daq0Var, boolean z4, boolean z5, boolean z6, o9c1 o9c1Var, qsj qsjVar, cks cksVar, Long l, boolean z7, boolean z8, boolean z9, String str, boolean z10, String str2) {
        this.f275648a = z;
        this.f275649b = zh20Var;
        this.f275650c = z2;
        this.f275651d = z3;
        this.f275652e = daq0Var;
        this.f275653f = z4;
        this.f275654g = z5;
        this.f275655h = z6;
        this.f275656i = o9c1Var;
        this.f275657j = qsjVar;
        this.f275658k = cksVar;
        this.f275659l = l;
        this.f275660m = z7;
        this.f275661n = z8;
        this.f275662o = z9;
        this.f275663p = str;
        this.f275664q = z10;
        this.f275665r = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys21)) {
            return false;
        }
        ys21 ys21Var = (ys21) obj;
        return this.f275648a == ys21Var.f275648a && wj50.m88271j(this.f275649b, ys21Var.f275649b) && this.f275650c == ys21Var.f275650c && this.f275651d == ys21Var.f275651d && wj50.m88271j(this.f275652e, ys21Var.f275652e) && this.f275653f == ys21Var.f275653f && this.f275654g == ys21Var.f275654g && this.f275655h == ys21Var.f275655h && wj50.m88271j(this.f275656i, ys21Var.f275656i) && this.f275657j == ys21Var.f275657j && wj50.m88271j(this.f275658k, ys21Var.f275658k) && wj50.m88271j(this.f275659l, ys21Var.f275659l) && this.f275660m == ys21Var.f275660m && this.f275661n == ys21Var.f275661n && this.f275662o == ys21Var.f275662o && wj50.m88271j(this.f275663p, ys21Var.f275663p) && this.f275664q == ys21Var.f275664q && wj50.m88271j(this.f275665r, ys21Var.f275665r);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f275648a) * 31;
        zh20 zh20Var = this.f275649b;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode + (zh20Var == null ? 0 : zh20Var.hashCode())) * 31, 31, this.f275650c), 31, this.f275651d);
        daq0 daq0Var = this.f275652e;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (daq0Var == null ? 0 : daq0Var.hashCode())) * 31, 31, this.f275653f), 31, this.f275654g), 31, this.f275655h), 31, false);
        o9c1 o9c1Var = this.f275656i;
        int iHashCode2 = (iM77245d2 + (o9c1Var == null ? 0 : o9c1Var.hashCode())) * 31;
        qsj qsjVar = this.f275657j;
        int iHashCode3 = (iHashCode2 + (qsjVar == null ? 0 : qsjVar.hashCode())) * 31;
        cks cksVar = this.f275658k;
        int iHashCode4 = (iHashCode3 + (cksVar == null ? 0 : Long.hashCode(cksVar.f39083a))) * 31;
        Long l = this.f275659l;
        int iM77245d3 = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f275660m), 31, this.f275661n), 31, this.f275662o);
        String str = this.f275663p;
        return this.f275665r.hashCode() + s571.m77245d((iM77245d3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f275664q);
    }
}
