package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bm41 {

    /* JADX INFO: renamed from: a */
    public final hz80 f28376a;

    /* JADX INFO: renamed from: b */
    public final uu41 f28377b;

    public bm41(hz80 hz80Var, uu41 uu41Var) {
        this.f28376a = hz80Var;
        this.f28377b = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm41)) {
            return false;
        }
        bm41 bm41Var = (bm41) obj;
        return wj50.m88271j(this.f28376a, bm41Var.f28376a) && wj50.m88271j(this.f28377b, bm41Var.f28377b);
    }

    public final int hashCode() {
        int iHashCode = this.f28376a.hashCode() * 31;
        uu41 uu41Var = this.f28377b;
        return iHashCode + (uu41Var == null ? 0 : uu41Var.hashCode());
    }
}
