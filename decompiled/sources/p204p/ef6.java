package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ef6 implements of6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1961i f58957a;

    /* JADX INFO: renamed from: b */
    public final d850 f58958b;

    public ef6(AbstractC1961i abstractC1961i, d850 d850Var) {
        this.f58957a = abstractC1961i;
        this.f58958b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef6)) {
            return false;
        }
        ef6 ef6Var = (ef6) obj;
        return wj50.m88271j(this.f58957a, ef6Var.f58957a) && wj50.m88271j(this.f58958b, ef6Var.f58958b);
    }

    public final int hashCode() {
        int iHashCode = this.f58957a.hashCode() * 31;
        d850 d850Var = this.f58958b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
