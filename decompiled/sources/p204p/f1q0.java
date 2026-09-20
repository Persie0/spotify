package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f1q0 {

    /* JADX INFO: renamed from: a */
    public final String f64946a;

    /* JADX INFO: renamed from: b */
    public final String f64947b;

    /* JADX INFO: renamed from: c */
    public final boolean f64948c;

    /* JADX INFO: renamed from: d */
    public final int f64949d;

    /* JADX INFO: renamed from: e */
    public final boolean f64950e;

    /* JADX INFO: renamed from: f */
    public final boolean f64951f;

    public f1q0(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.f64946a = str;
        this.f64947b = str2;
        this.f64948c = z;
        this.f64949d = i;
        this.f64950e = z2;
        this.f64951f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1q0)) {
            return false;
        }
        f1q0 f1q0Var = (f1q0) obj;
        return wj50.m88271j(this.f64946a, f1q0Var.f64946a) && wj50.m88271j(this.f64947b, f1q0Var.f64947b) && this.f64948c == f1q0Var.f64948c && this.f64949d == f1q0Var.f64949d && this.f64950e == f1q0Var.f64950e && this.f64951f == f1q0Var.f64951f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64951f) + s571.m77245d(mt60.m62800g(this.f64949d, s571.m77245d(s571.m77243b(this.f64946a.hashCode() * 31, 961, this.f64947b), 31, this.f64948c), 31), 31, this.f64950e);
    }
}
