package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x161 {

    /* JADX INFO: renamed from: a */
    public final mzn0 f257074a;

    /* JADX INFO: renamed from: b */
    public final d850 f257075b;

    public x161(mzn0 mzn0Var, d850 d850Var) {
        this.f257074a = mzn0Var;
        this.f257075b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x161)) {
            return false;
        }
        x161 x161Var = (x161) obj;
        return wj50.m88271j(this.f257074a, x161Var.f257074a) && wj50.m88271j(this.f257075b, x161Var.f257075b);
    }

    public final int hashCode() {
        int iHashCode = this.f257074a.hashCode() * 31;
        d850 d850Var = this.f257075b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
