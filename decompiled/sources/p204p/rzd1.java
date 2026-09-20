package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rzd1 implements un20 {

    /* JADX INFO: renamed from: a */
    public final String f204133a;

    /* JADX INFO: renamed from: b */
    public final String f204134b;

    /* JADX INFO: renamed from: c */
    public final String f204135c;

    /* JADX INFO: renamed from: d */
    public final String f204136d;

    /* JADX INFO: renamed from: e */
    public final qzd1 f204137e;

    /* JADX INFO: renamed from: f */
    public final boolean f204138f;

    /* JADX INFO: renamed from: g */
    public final boolean f204139g;

    /* JADX INFO: renamed from: h */
    public final boolean f204140h;

    public rzd1(String str, String str2, String str3, String str4, qzd1 qzd1Var, boolean z, boolean z2, boolean z3) {
        this.f204133a = str;
        this.f204134b = str2;
        this.f204135c = str3;
        this.f204136d = str4;
        this.f204137e = qzd1Var;
        this.f204138f = z;
        this.f204139g = z2;
        this.f204140h = z3;
    }

    /* JADX INFO: renamed from: c */
    public static rzd1 m76782c(rzd1 rzd1Var, int i) {
        String str = rzd1Var.f204133a;
        String str2 = rzd1Var.f204134b;
        String str3 = rzd1Var.f204135c;
        String str4 = rzd1Var.f204136d;
        qzd1 qzd1Var = (i & 16) != 0 ? rzd1Var.f204137e : pzd1.f183681a;
        boolean z = rzd1Var.f204138f;
        boolean z2 = rzd1Var.f204139g;
        boolean z3 = (i & 128) != 0 ? rzd1Var.f204140h : true;
        rzd1Var.getClass();
        return new rzd1(str, str2, str3, str4, qzd1Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzd1)) {
            return false;
        }
        rzd1 rzd1Var = (rzd1) obj;
        return wj50.m88271j(this.f204133a, rzd1Var.f204133a) && wj50.m88271j(this.f204134b, rzd1Var.f204134b) && wj50.m88271j(this.f204135c, rzd1Var.f204135c) && wj50.m88271j(this.f204136d, rzd1Var.f204136d) && wj50.m88271j(this.f204137e, rzd1Var.f204137e) && this.f204138f == rzd1Var.f204138f && this.f204139g == rzd1Var.f204139g && this.f204140h == rzd1Var.f204140h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f204133a.hashCode() * 31, 31, this.f204134b);
        String str = this.f204135c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f204136d;
        return Boolean.hashCode(this.f204140h) + s571.m77245d(s571.m77245d((this.f204137e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f204138f), 31, this.f204139g);
    }

    public /* synthetic */ rzd1(String str, int i, String str2, String str3, boolean z, String str4) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, ozd1.f172252a, (i & 32) == 0, (i & 64) != 0 ? false : z, false);
    }
}
