package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w1n0 {

    /* JADX INFO: renamed from: a */
    public final String f247144a;

    /* JADX INFO: renamed from: b */
    public final String f247145b;

    /* JADX INFO: renamed from: c */
    public final String f247146c;

    /* JADX INFO: renamed from: d */
    public final String f247147d;

    /* JADX INFO: renamed from: e */
    public final boolean f247148e;

    /* JADX INFO: renamed from: f */
    public final boolean f247149f;

    /* JADX INFO: renamed from: g */
    public final boolean f247150g;

    /* JADX INFO: renamed from: h */
    public final int f247151h;

    /* JADX INFO: renamed from: i */
    public final boolean f247152i;

    /* JADX INFO: renamed from: j */
    public final int f247153j;

    public w1n0(int i, int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f247144a = str;
        this.f247145b = str2;
        this.f247146c = str3;
        this.f247147d = str4;
        this.f247148e = z;
        this.f247149f = z2;
        this.f247150g = z3;
        this.f247151h = i;
        this.f247152i = z4;
        this.f247153j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1n0)) {
            return false;
        }
        w1n0 w1n0Var = (w1n0) obj;
        return wj50.m88271j(this.f247144a, w1n0Var.f247144a) && wj50.m88271j(this.f247145b, w1n0Var.f247145b) && wj50.m88271j(this.f247146c, w1n0Var.f247146c) && wj50.m88271j(this.f247147d, w1n0Var.f247147d) && this.f247148e == w1n0Var.f247148e && this.f247149f == w1n0Var.f247149f && this.f247150g == w1n0Var.f247150g && this.f247151h == w1n0Var.f247151h && this.f247152i == w1n0Var.f247152i && this.f247153j == w1n0Var.f247153j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f247144a.hashCode() * 31, 31, this.f247145b), 31, this.f247146c);
        String str = this.f247147d;
        return edb.m38547C(this.f247153j) + s571.m77245d(f710.m40938f(this.f247151h, s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f247148e), 31, this.f247149f), 31, this.f247150g), 31), 31, this.f247152i);
    }
}
