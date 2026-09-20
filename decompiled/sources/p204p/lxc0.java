package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f137780a;

    /* JADX INFO: renamed from: b */
    public final boolean f137781b;

    public lxc0(qf40 qf40Var, boolean z) {
        this.f137780a = qf40Var;
        this.f137781b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxc0)) {
            return false;
        }
        lxc0 lxc0Var = (lxc0) obj;
        return wj50.m88271j(this.f137780a, lxc0Var.f137780a) && this.f137781b == lxc0Var.f137781b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137781b) + (this.f137780a.hashCode() * 31);
    }
}
