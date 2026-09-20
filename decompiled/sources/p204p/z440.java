package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z440 {

    /* JADX INFO: renamed from: a */
    public final int f279118a;

    /* JADX INFO: renamed from: b */
    public final String f279119b;

    /* JADX INFO: renamed from: c */
    public final String f279120c;

    /* JADX INFO: renamed from: d */
    public final String f279121d;

    /* JADX INFO: renamed from: e */
    public final String f279122e;

    /* JADX INFO: renamed from: f */
    public final String f279123f;

    /* JADX INFO: renamed from: g */
    public final Double f279124g;

    /* JADX INFO: renamed from: h */
    public final String f279125h;

    public z440(int i, String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.f279118a = i;
        this.f279119b = str;
        this.f279120c = str2;
        this.f279121d = str3;
        this.f279122e = str4;
        this.f279123f = str5;
        this.f279124g = d;
        this.f279125h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z440)) {
            return false;
        }
        z440 z440Var = (z440) obj;
        return this.f279118a == z440Var.f279118a && wj50.m88271j(this.f279119b, z440Var.f279119b) && wj50.m88271j(this.f279120c, z440Var.f279120c) && wj50.m88271j(this.f279121d, z440Var.f279121d) && wj50.m88271j(this.f279122e, z440Var.f279122e) && wj50.m88271j(this.f279123f, z440Var.f279123f) && wj50.m88271j(this.f279124g, z440Var.f279124g) && wj50.m88271j(this.f279125h, z440Var.f279125h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f279118a) * 31, 31, this.f279119b), 31, this.f279120c), 31, this.f279121d);
        String str = this.f279122e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279123f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f279124g;
        int iM77245d = s571.m77245d((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, true);
        String str3 = this.f279125h;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
