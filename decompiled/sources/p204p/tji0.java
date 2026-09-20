package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tji0 {

    /* JADX INFO: renamed from: a */
    public final String f220917a;

    /* JADX INFO: renamed from: b */
    public final String f220918b;

    /* JADX INFO: renamed from: c */
    public final String f220919c;

    /* JADX INFO: renamed from: d */
    public final String f220920d;

    /* JADX INFO: renamed from: e */
    public final rji0 f220921e;

    /* JADX INFO: renamed from: f */
    public final gji0 f220922f;

    /* JADX INFO: renamed from: g */
    public final String f220923g;

    /* JADX INFO: renamed from: h */
    public final int f220924h;

    /* JADX INFO: renamed from: i */
    public final String f220925i;

    /* JADX INFO: renamed from: j */
    public final int f220926j;

    public tji0(String str, String str2, String str3, String str4, rji0 rji0Var, gji0 gji0Var, String str5, int i, String str6, int i2) {
        this.f220917a = str;
        this.f220918b = str2;
        this.f220919c = str3;
        this.f220920d = str4;
        this.f220921e = rji0Var;
        this.f220922f = gji0Var;
        this.f220923g = str5;
        this.f220924h = i;
        this.f220925i = str6;
        this.f220926j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tji0)) {
            return false;
        }
        tji0 tji0Var = (tji0) obj;
        return wj50.m88271j(this.f220917a, tji0Var.f220917a) && wj50.m88271j(this.f220918b, tji0Var.f220918b) && wj50.m88271j(this.f220919c, tji0Var.f220919c) && wj50.m88271j(this.f220920d, tji0Var.f220920d) && this.f220921e.equals(tji0Var.f220921e) && this.f220922f.equals(tji0Var.f220922f) && wj50.m88271j(this.f220923g, tji0Var.f220923g) && this.f220924h == tji0Var.f220924h && wj50.m88271j(this.f220925i, tji0Var.f220925i) && this.f220926j == tji0Var.f220926j;
    }

    public final int hashCode() {
        int iHashCode = (this.f220922f.hashCode() + ((this.f220921e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f220917a.hashCode() * 31, 31, this.f220918b), 31, this.f220919c), 31, this.f220920d)) * 31)) * 31;
        String str = this.f220923g;
        int iM40938f = f710.m40938f(this.f220924h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f220925i;
        int iHashCode2 = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.f220926j;
        return iHashCode2 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
