package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ul41 {

    /* JADX INFO: renamed from: a */
    public final hz80 f231432a;

    /* JADX INFO: renamed from: b */
    public final uu41 f231433b;

    public ul41(hz80 hz80Var, uu41 uu41Var) {
        this.f231432a = hz80Var;
        this.f231433b = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul41)) {
            return false;
        }
        ul41 ul41Var = (ul41) obj;
        return wj50.m88271j(this.f231432a, ul41Var.f231432a) && wj50.m88271j(this.f231433b, ul41Var.f231433b);
    }

    public final int hashCode() {
        int iHashCode = this.f231432a.hashCode() * 31;
        uu41 uu41Var = this.f231433b;
        return iHashCode + (uu41Var == null ? 0 : uu41Var.hashCode());
    }
}
