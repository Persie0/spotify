package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xl41 {

    /* JADX INFO: renamed from: a */
    public final hz80 f263032a;

    /* JADX INFO: renamed from: b */
    public final uu41 f263033b;

    public xl41(hz80 hz80Var, uu41 uu41Var) {
        this.f263032a = hz80Var;
        this.f263033b = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl41)) {
            return false;
        }
        xl41 xl41Var = (xl41) obj;
        return wj50.m88271j(this.f263032a, xl41Var.f263032a) && wj50.m88271j(this.f263033b, xl41Var.f263033b);
    }

    public final int hashCode() {
        int iHashCode = this.f263032a.hashCode() * 31;
        uu41 uu41Var = this.f263033b;
        return iHashCode + (uu41Var == null ? 0 : uu41Var.hashCode());
    }
}
