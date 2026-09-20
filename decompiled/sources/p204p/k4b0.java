package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k4b0 {

    /* JADX INFO: renamed from: a */
    public final int f119171a;

    /* JADX INFO: renamed from: b */
    public final String f119172b;

    /* JADX INFO: renamed from: c */
    public final int f119173c;

    /* JADX INFO: renamed from: d */
    public final String f119174d;

    /* JADX INFO: renamed from: e */
    public final String f119175e;

    /* JADX INFO: renamed from: f */
    public final String f119176f;

    /* JADX INFO: renamed from: g */
    public final Double f119177g;

    /* JADX INFO: renamed from: h */
    public final boolean f119178h;

    public k4b0(int i, String str, int i2, String str2, String str3, String str4, Double d, boolean z, int i3) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.f119171a = i;
        this.f119172b = str;
        this.f119173c = i2;
        this.f119174d = str2;
        this.f119175e = str3;
        this.f119176f = str4;
        this.f119177g = d;
        this.f119178h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b0)) {
            return false;
        }
        k4b0 k4b0Var = (k4b0) obj;
        return this.f119171a == k4b0Var.f119171a && wj50.m88271j(this.f119172b, k4b0Var.f119172b) && this.f119173c == k4b0Var.f119173c && wj50.m88271j(this.f119174d, k4b0Var.f119174d) && wj50.m88271j(this.f119175e, k4b0Var.f119175e) && wj50.m88271j(this.f119176f, k4b0Var.f119176f) && wj50.m88271j(this.f119177g, k4b0Var.f119177g) && this.f119178h == k4b0Var.f119178h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f119173c, s571.m77243b(Integer.hashCode(this.f119171a) * 31, 31, this.f119172b), 31), 31, this.f119174d), 31, this.f119175e);
        String str = this.f119176f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f119177g;
        return Boolean.hashCode(true) + s571.m77245d((iHashCode + (d != null ? d.hashCode() : 0)) * 31, 31, this.f119178h);
    }
}
