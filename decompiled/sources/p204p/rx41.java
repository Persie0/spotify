package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rx41 {

    /* JADX INFO: renamed from: a */
    public final boolean f203492a;

    /* JADX INFO: renamed from: b */
    public final q290 f203493b;

    public rx41(boolean z, q290 q290Var) {
        this.f203492a = z;
        this.f203493b = q290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx41)) {
            return false;
        }
        rx41 rx41Var = (rx41) obj;
        return this.f203492a == rx41Var.f203492a && wj50.m88271j(this.f203493b, rx41Var.f203493b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f203492a) * 31;
        q290 q290Var = this.f203493b;
        return iHashCode + (q290Var == null ? 0 : q290Var.hashCode());
    }
}
