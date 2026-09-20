package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n1g0 {

    /* JADX INFO: renamed from: a */
    public final qu80 f149417a;

    /* JADX INFO: renamed from: b */
    public final boolean f149418b;

    public n1g0(qu80 qu80Var, boolean z) {
        this.f149417a = qu80Var;
        this.f149418b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1g0)) {
            return false;
        }
        n1g0 n1g0Var = (n1g0) obj;
        return wj50.m88271j(this.f149417a, n1g0Var.f149417a) && this.f149418b == n1g0Var.f149418b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149418b) + (this.f149417a.hashCode() * 31);
    }
}
