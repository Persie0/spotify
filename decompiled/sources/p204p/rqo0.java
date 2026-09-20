package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rqo0 {

    /* JADX INFO: renamed from: a */
    public final qqo0 f201857a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f201858b;

    public rqo0(qqo0 qqo0Var, y6s0 y6s0Var) {
        this.f201857a = qqo0Var;
        this.f201858b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqo0)) {
            return false;
        }
        rqo0 rqo0Var = (rqo0) obj;
        return wj50.m88271j(this.f201857a, rqo0Var.f201857a) && wj50.m88271j(this.f201858b, rqo0Var.f201858b);
    }

    public final int hashCode() {
        return this.f201858b.hashCode() + (this.f201857a.hashCode() * 31);
    }
}
