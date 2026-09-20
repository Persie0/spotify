package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class azs0 {

    /* JADX INFO: renamed from: a */
    public final ak11 f21675a;

    /* JADX INFO: renamed from: b */
    public final boolean f21676b;

    /* JADX INFO: renamed from: c */
    public final int f21677c;

    /* JADX INFO: renamed from: d */
    public final qf11 f21678d;

    public azs0(ak11 ak11Var, boolean z, int i, qf11 qf11Var) {
        this.f21675a = ak11Var;
        this.f21676b = z;
        this.f21677c = i;
        this.f21678d = qf11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azs0)) {
            return false;
        }
        azs0 azs0Var = (azs0) obj;
        return this.f21675a.equals(azs0Var.f21675a) && this.f21676b == azs0Var.f21676b && this.f21677c == azs0Var.f21677c && this.f21678d.equals(azs0Var.f21678d);
    }

    public final int hashCode() {
        return this.f21678d.hashCode() + mt60.m62800g(this.f21677c, s571.m77245d(this.f21675a.hashCode() * 31, 31, this.f21676b), 31);
    }
}
