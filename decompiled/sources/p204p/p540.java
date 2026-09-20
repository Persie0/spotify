package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p540 {

    /* JADX INFO: renamed from: a */
    public final int f174064a;

    /* JADX INFO: renamed from: b */
    public final String f174065b;

    /* JADX INFO: renamed from: c */
    public final int f174066c;

    /* JADX INFO: renamed from: d */
    public final String f174067d;

    /* JADX INFO: renamed from: e */
    public final String f174068e;

    /* JADX INFO: renamed from: f */
    public final String f174069f;

    /* JADX INFO: renamed from: g */
    public final String f174070g;

    /* JADX INFO: renamed from: h */
    public final Double f174071h;

    /* JADX INFO: renamed from: i */
    public final boolean f174072i;

    /* JADX INFO: renamed from: j */
    public final String f174073j;

    public p540(int i, String str, int i2, String str2, String str3, String str4, String str5, Double d, boolean z, String str6) {
        this.f174064a = i;
        this.f174065b = str;
        this.f174066c = i2;
        this.f174067d = str2;
        this.f174068e = str3;
        this.f174069f = str4;
        this.f174070g = str5;
        this.f174071h = d;
        this.f174072i = z;
        this.f174073j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p540)) {
            return false;
        }
        p540 p540Var = (p540) obj;
        return this.f174064a == p540Var.f174064a && wj50.m88271j(this.f174065b, p540Var.f174065b) && this.f174066c == p540Var.f174066c && wj50.m88271j(this.f174067d, p540Var.f174067d) && wj50.m88271j(this.f174068e, p540Var.f174068e) && wj50.m88271j(this.f174069f, p540Var.f174069f) && wj50.m88271j(this.f174070g, p540Var.f174070g) && wj50.m88271j(this.f174071h, p540Var.f174071h) && this.f174072i == p540Var.f174072i && wj50.m88271j(this.f174073j, p540Var.f174073j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f174066c, s571.m77243b(Integer.hashCode(this.f174064a) * 31, 31, this.f174065b), 31), 31, this.f174067d), 31, this.f174068e);
        String str = this.f174069f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f174070g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f174071h;
        int iM77245d = s571.m77245d((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.f174072i);
        String str3 = this.f174073j;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
