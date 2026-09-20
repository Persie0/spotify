package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j0e0 {

    /* JADX INFO: renamed from: a */
    public final uem0 f107434a;

    /* JADX INFO: renamed from: b */
    public final boolean f107435b;

    /* JADX INFO: renamed from: c */
    public final boolean f107436c;

    /* JADX INFO: renamed from: d */
    public final boolean f107437d;

    public j0e0(uem0 uem0Var, boolean z, boolean z2, boolean z3, int i) {
        z2 = (i & 8) != 0 ? false : z2;
        this.f107434a = uem0Var;
        this.f107435b = z;
        this.f107436c = z2;
        this.f107437d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0e0)) {
            return false;
        }
        j0e0 j0e0Var = (j0e0) obj;
        return this.f107434a.equals(j0e0Var.f107434a) && this.f107435b == j0e0Var.f107435b && this.f107436c == j0e0Var.f107436c && this.f107437d == j0e0Var.f107437d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107437d) + s571.m77245d(s571.m77245d(s571.m77245d(Integer.hashCode(this.f107434a.f229562a) * 31, 31, false), 31, this.f107435b), 31, this.f107436c);
    }
}
