package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rbe1 {

    /* JADX INFO: renamed from: a */
    public final String f197570a;

    /* JADX INFO: renamed from: b */
    public final String f197571b;

    /* JADX INFO: renamed from: c */
    public final phx0 f197572c;

    /* JADX INFO: renamed from: d */
    public final phx0 f197573d;

    /* JADX INFO: renamed from: e */
    public final phx0 f197574e;

    /* JADX INFO: renamed from: f */
    public final phx0 f197575f;

    /* JADX INFO: renamed from: g */
    public final String f197576g;

    /* JADX INFO: renamed from: h */
    public final int f197577h;

    /* JADX INFO: renamed from: i */
    public final int f197578i;

    /* JADX INFO: renamed from: j */
    public final String f197579j;

    /* JADX INFO: renamed from: k */
    public final String f197580k;

    /* JADX INFO: renamed from: l */
    public final int f197581l;

    /* JADX INFO: renamed from: m */
    public final int f197582m;

    /* JADX INFO: renamed from: n */
    public final boolean f197583n;

    public rbe1(String str, String str2, phx0 phx0Var, phx0 phx0Var2, phx0 phx0Var3, phx0 phx0Var4, String str3, int i, int i2, String str4, String str5, int i3, int i4, boolean z) {
        this.f197570a = str;
        this.f197571b = str2;
        this.f197572c = phx0Var;
        this.f197573d = phx0Var2;
        this.f197574e = phx0Var3;
        this.f197575f = phx0Var4;
        this.f197576g = str3;
        this.f197577h = i;
        this.f197578i = i2;
        this.f197579j = str4;
        this.f197580k = str5;
        this.f197581l = i3;
        this.f197582m = i4;
        this.f197583n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbe1)) {
            return false;
        }
        rbe1 rbe1Var = (rbe1) obj;
        return wj50.m88271j(this.f197570a, rbe1Var.f197570a) && wj50.m88271j(this.f197571b, rbe1Var.f197571b) && wj50.m88271j(this.f197572c, rbe1Var.f197572c) && wj50.m88271j(this.f197573d, rbe1Var.f197573d) && wj50.m88271j(this.f197574e, rbe1Var.f197574e) && wj50.m88271j(this.f197575f, rbe1Var.f197575f) && wj50.m88271j(this.f197576g, rbe1Var.f197576g) && this.f197577h == rbe1Var.f197577h && this.f197578i == rbe1Var.f197578i && wj50.m88271j(this.f197579j, rbe1Var.f197579j) && wj50.m88271j(this.f197580k, rbe1Var.f197580k) && this.f197581l == rbe1Var.f197581l && this.f197582m == rbe1Var.f197582m && this.f197583n == rbe1Var.f197583n;
    }

    public final int hashCode() {
        int iHashCode = (this.f197575f.hashCode() + ((this.f197574e.hashCode() + ((this.f197573d.hashCode() + ((this.f197572c.hashCode() + s571.m77243b(this.f197570a.hashCode() * 31, 31, this.f197571b)) * 31)) * 31)) * 31)) * 31;
        String str = this.f197576g;
        return Boolean.hashCode(this.f197583n) + mt60.m62800g(this.f197582m, mt60.m62800g(this.f197581l, s571.m77243b(s571.m77243b(mt60.m62800g(this.f197578i, mt60.m62800g(this.f197577h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f197579j), 31, this.f197580k), 31), 31);
    }
}
