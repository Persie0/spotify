package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zt20 {

    /* JADX INFO: renamed from: a */
    public final df40 f286042a;

    /* JADX INFO: renamed from: b */
    public final ig40 f286043b;

    public zt20(ig40 ig40Var, orn0 orn0Var) {
        this.f286042a = ig40Var;
        this.f286043b = orn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt20)) {
            return false;
        }
        zt20 zt20Var = (zt20) obj;
        return wj50.m88271j(this.f286042a, zt20Var.f286042a) && wj50.m88271j(this.f286043b, zt20Var.f286043b);
    }

    public final int hashCode() {
        return this.f286043b.hashCode() + (this.f286042a.hashCode() * 31);
    }
}
