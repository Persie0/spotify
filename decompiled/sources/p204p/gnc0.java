package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gnc0 {

    /* JADX INFO: renamed from: a */
    public final yzo0 f82684a;

    /* JADX INFO: renamed from: b */
    public final bnc0 f82685b;

    public gnc0(yzo0 yzo0Var, bnc0 bnc0Var) {
        this.f82684a = yzo0Var;
        this.f82685b = bnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnc0)) {
            return false;
        }
        gnc0 gnc0Var = (gnc0) obj;
        return wj50.m88271j(this.f82684a, gnc0Var.f82684a) && wj50.m88271j(this.f82685b, gnc0Var.f82685b);
    }

    public final int hashCode() {
        return this.f82685b.hashCode() + (this.f82684a.hashCode() * 31);
    }
}
