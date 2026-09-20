package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jb81 {

    /* JADX INFO: renamed from: a */
    public final String f110691a;

    /* JADX INFO: renamed from: b */
    public final String f110692b;

    /* JADX INFO: renamed from: c */
    public final String f110693c;

    /* JADX INFO: renamed from: d */
    public final String f110694d;

    /* JADX INFO: renamed from: e */
    public final String f110695e;

    /* JADX INFO: renamed from: f */
    public final String f110696f;

    /* JADX INFO: renamed from: g */
    public final int f110697g;

    /* JADX INFO: renamed from: h */
    public final boolean f110698h;

    /* JADX INFO: renamed from: i */
    public final boolean f110699i;

    /* JADX INFO: renamed from: j */
    public final boolean f110700j;

    /* JADX INFO: renamed from: k */
    public final xf40 f110701k;

    public jb81(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, xf40 xf40Var) {
        this.f110691a = str;
        this.f110692b = str2;
        this.f110693c = str3;
        this.f110694d = str4;
        this.f110695e = str5;
        this.f110696f = str6;
        this.f110697g = i;
        this.f110698h = z;
        this.f110699i = z2;
        this.f110700j = z3;
        this.f110701k = xf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb81)) {
            return false;
        }
        jb81 jb81Var = (jb81) obj;
        return wj50.m88271j(this.f110691a, jb81Var.f110691a) && this.f110692b.equals(jb81Var.f110692b) && this.f110693c.equals(jb81Var.f110693c) && this.f110694d.equals(jb81Var.f110694d) && wj50.m88271j(this.f110695e, jb81Var.f110695e) && wj50.m88271j(this.f110696f, jb81Var.f110696f) && this.f110697g == jb81Var.f110697g && this.f110698h == jb81Var.f110698h && this.f110699i == jb81Var.f110699i && this.f110700j == jb81Var.f110700j && this.f110701k.equals(jb81Var.f110701k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f110691a.hashCode() * 31, 31, this.f110692b), 31, this.f110693c), 31, this.f110694d);
        String str = this.f110695e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110696f;
        return this.f110701k.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f110697g, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f110698h), 31, this.f110699i), 31, this.f110700j);
    }
}
