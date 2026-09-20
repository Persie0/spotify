package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dpx0 {

    /* JADX INFO: renamed from: a */
    public final int f51760a;

    /* JADX INFO: renamed from: b */
    public final qf40 f51761b;

    public dpx0(int i, qf40 qf40Var) {
        this.f51760a = i;
        this.f51761b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpx0)) {
            return false;
        }
        dpx0 dpx0Var = (dpx0) obj;
        return this.f51760a == dpx0Var.f51760a && wj50.m88271j(this.f51761b, dpx0Var.f51761b);
    }

    public final int hashCode() {
        return this.f51761b.hashCode() + (Integer.hashCode(this.f51760a) * 31);
    }
}
