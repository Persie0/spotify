package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lh90 {

    /* JADX INFO: renamed from: a */
    public final String f133426a;

    /* JADX INFO: renamed from: b */
    public final int f133427b;

    /* JADX INFO: renamed from: c */
    public final String f133428c;

    /* JADX INFO: renamed from: d */
    public final String f133429d;

    /* JADX INFO: renamed from: e */
    public final String f133430e;

    /* JADX INFO: renamed from: f */
    public final boolean f133431f;

    /* JADX INFO: renamed from: g */
    public final boolean f133432g;

    /* JADX INFO: renamed from: h */
    public final boolean f133433h;

    public lh90(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f133426a = str;
        this.f133427b = i;
        this.f133428c = str2;
        this.f133429d = str3;
        this.f133430e = str4;
        this.f133431f = z;
        this.f133432g = z2;
        this.f133433h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh90)) {
            return false;
        }
        lh90 lh90Var = (lh90) obj;
        return wj50.m88271j(this.f133426a, lh90Var.f133426a) && this.f133427b == lh90Var.f133427b && wj50.m88271j(this.f133428c, lh90Var.f133428c) && wj50.m88271j(this.f133429d, lh90Var.f133429d) && wj50.m88271j(this.f133430e, lh90Var.f133430e) && this.f133431f == lh90Var.f133431f && this.f133432g == lh90Var.f133432g && this.f133433h == lh90Var.f133433h;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f133427b, this.f133426a.hashCode() * 31, 31);
        String str = this.f133428c;
        return Boolean.hashCode(this.f133433h) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iM40938f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f133429d), 31, this.f133430e), 31, this.f133431f), 31, this.f133432g);
    }
}
