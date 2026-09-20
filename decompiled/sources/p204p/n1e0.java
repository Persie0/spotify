package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n1e0 {

    /* JADX INFO: renamed from: a */
    public final e4e0 f149401a;

    /* JADX INFO: renamed from: b */
    public final n3e0 f149402b;

    public n1e0(e4e0 e4e0Var, n3e0 n3e0Var) {
        this.f149401a = e4e0Var;
        this.f149402b = n3e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1e0)) {
            return false;
        }
        n1e0 n1e0Var = (n1e0) obj;
        return wj50.m88271j(this.f149401a, n1e0Var.f149401a) && wj50.m88271j(this.f149402b, n1e0Var.f149402b);
    }

    public final int hashCode() {
        int iHashCode = this.f149401a.hashCode() * 31;
        n3e0 n3e0Var = this.f149402b;
        return iHashCode + (n3e0Var == null ? 0 : n3e0Var.hashCode());
    }
}
