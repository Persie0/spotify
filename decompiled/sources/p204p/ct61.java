package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ct61 {

    /* JADX INFO: renamed from: a */
    public final String f41789a;

    /* JADX INFO: renamed from: b */
    public final int f41790b;

    /* JADX INFO: renamed from: c */
    public final int f41791c;

    /* JADX INFO: renamed from: d */
    public final String f41792d;

    /* JADX INFO: renamed from: e */
    public final String f41793e;

    /* JADX INFO: renamed from: f */
    public final String f41794f;

    /* JADX INFO: renamed from: g */
    public final String f41795g;

    /* JADX INFO: renamed from: h */
    public final String f41796h;

    /* JADX INFO: renamed from: i */
    public final boolean f41797i;

    /* JADX INFO: renamed from: j */
    public final Long f41798j;

    /* JADX INFO: renamed from: k */
    public final Long f41799k;

    /* JADX INFO: renamed from: l */
    public final Long f41800l;

    /* JADX INFO: renamed from: m */
    public final Double f41801m;

    /* JADX INFO: renamed from: n */
    public final Long f41802n;

    /* JADX INFO: renamed from: o */
    public final boolean f41803o;

    public ct61(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, Long l, Long l2, Long l3, Double d, Long l4, boolean z2) {
        this.f41789a = str;
        this.f41790b = i;
        this.f41791c = i2;
        this.f41792d = str2;
        this.f41793e = str3;
        this.f41794f = str4;
        this.f41795g = str5;
        this.f41796h = str6;
        this.f41797i = z;
        this.f41798j = l;
        this.f41799k = l2;
        this.f41800l = l3;
        this.f41801m = d;
        this.f41802n = l4;
        this.f41803o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct61)) {
            return false;
        }
        ct61 ct61Var = (ct61) obj;
        return this.f41789a.equals(ct61Var.f41789a) && this.f41790b == ct61Var.f41790b && this.f41791c == ct61Var.f41791c && this.f41792d.equals(ct61Var.f41792d) && this.f41793e.equals(ct61Var.f41793e) && wj50.m88271j(this.f41794f, ct61Var.f41794f) && wj50.m88271j(this.f41795g, ct61Var.f41795g) && wj50.m88271j(this.f41796h, ct61Var.f41796h) && this.f41797i == ct61Var.f41797i && wj50.m88271j(this.f41798j, ct61Var.f41798j) && wj50.m88271j(this.f41799k, ct61Var.f41799k) && wj50.m88271j(this.f41800l, ct61Var.f41800l) && wj50.m88271j(this.f41801m, ct61Var.f41801m) && wj50.m88271j(this.f41802n, ct61Var.f41802n) && this.f41803o == ct61Var.f41803o;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(f710.m40938f(this.f41791c, f710.m40938f(this.f41790b, this.f41789a.hashCode() * 31, 31), 31), 31, this.f41792d), 31, this.f41793e), 31, this.f41794f);
        String str = this.f41795g;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41796h;
        int iM77245d = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f41797i);
        Long l = this.f41798j;
        int iHashCode2 = (iM77245d + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f41799k;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f41800l;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.f41801m;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Long l4 = this.f41802n;
        return Boolean.hashCode(this.f41803o) + ((iHashCode5 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
