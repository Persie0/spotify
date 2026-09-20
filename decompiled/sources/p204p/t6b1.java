package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t6b1 extends ahg1 {

    /* JADX INFO: renamed from: c */
    public final String f217529c;

    /* JADX INFO: renamed from: d */
    public final d850 f217530d;

    public t6b1(String str, d850 d850Var) {
        this.f217529c = str;
        this.f217530d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6b1)) {
            return false;
        }
        t6b1 t6b1Var = (t6b1) obj;
        return wj50.m88271j(this.f217529c, t6b1Var.f217529c) && wj50.m88271j(this.f217530d, t6b1Var.f217530d);
    }

    public final int hashCode() {
        int iHashCode = this.f217529c.hashCode() * 31;
        d850 d850Var = this.f217530d;
        return (iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
    }
}
