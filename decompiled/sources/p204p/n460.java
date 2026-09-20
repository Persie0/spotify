package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n460 {

    /* JADX INFO: renamed from: a */
    public final m460 f150220a;

    /* JADX INFO: renamed from: b */
    public final f460 f150221b;

    public n460(m460 m460Var, f460 f460Var) {
        this.f150220a = m460Var;
        this.f150221b = f460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n460)) {
            return false;
        }
        n460 n460Var = (n460) obj;
        return wj50.m88271j(this.f150220a, n460Var.f150220a) && wj50.m88271j(this.f150221b, n460Var.f150221b);
    }

    public final int hashCode() {
        int iHashCode = this.f150220a.hashCode() * 31;
        f460 f460Var = this.f150221b;
        return iHashCode + (f460Var == null ? 0 : f460Var.hashCode());
    }
}
