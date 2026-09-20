package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f72303a;

    /* JADX INFO: renamed from: b */
    public final int f72304b;

    /* JADX INFO: renamed from: c */
    public final String f72305c;

    /* JADX INFO: renamed from: d */
    public final String f72306d;

    /* JADX INFO: renamed from: e */
    public final String f72307e;

    /* JADX INFO: renamed from: f */
    public final String f72308f;

    /* JADX INFO: renamed from: g */
    public final Double f72309g;

    public fqx0(int i, int i2, String str, String str2, String str3, String str4, Double d) {
        this.f72303a = i;
        this.f72304b = i2;
        this.f72305c = str;
        this.f72306d = str2;
        this.f72307e = str3;
        this.f72308f = str4;
        this.f72309g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqx0)) {
            return false;
        }
        fqx0 fqx0Var = (fqx0) obj;
        return this.f72303a == fqx0Var.f72303a && this.f72304b == fqx0Var.f72304b && wj50.m88271j(this.f72305c, fqx0Var.f72305c) && wj50.m88271j(this.f72306d, fqx0Var.f72306d) && wj50.m88271j(this.f72307e, fqx0Var.f72307e) && wj50.m88271j(this.f72308f, fqx0Var.f72308f) && wj50.m88271j(this.f72309g, fqx0Var.f72309g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f72304b, Integer.hashCode(this.f72303a) * 31, 31), 31, this.f72305c), 31, this.f72306d), 31, this.f72307e);
        String str = this.f72308f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f72309g;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f72303a;
    }
}
