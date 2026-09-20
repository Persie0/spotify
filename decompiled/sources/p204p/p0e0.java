package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p0e0 {

    /* JADX INFO: renamed from: a */
    public final r1y f172661a;

    /* JADX INFO: renamed from: b */
    public final x0e0 f172662b;

    public p0e0(r1y r1yVar, x0e0 x0e0Var) {
        this.f172661a = r1yVar;
        this.f172662b = x0e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0e0)) {
            return false;
        }
        p0e0 p0e0Var = (p0e0) obj;
        return wj50.m88271j(this.f172661a, p0e0Var.f172661a) && wj50.m88271j(this.f172662b, p0e0Var.f172662b);
    }

    public final int hashCode() {
        return this.f172662b.hashCode() + (this.f172661a.hashCode() * 31);
    }
}
