package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lz01 {

    /* JADX INFO: renamed from: a */
    public final ou31 f138190a;

    /* JADX INFO: renamed from: b */
    public final eo01 f138191b;

    public lz01(ou31 ou31Var, eo01 eo01Var) {
        this.f138190a = ou31Var;
        this.f138191b = eo01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz01)) {
            return false;
        }
        lz01 lz01Var = (lz01) obj;
        return wj50.m88271j(this.f138190a, lz01Var.f138190a) && wj50.m88271j(this.f138191b, lz01Var.f138191b);
    }

    public final int hashCode() {
        return this.f138191b.hashCode() + (this.f138190a.hashCode() * 31);
    }
}
