package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rzr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final p0s0 f204208a;

    /* JADX INFO: renamed from: b */
    public final d850 f204209b;

    public rzr0(p0s0 p0s0Var, d850 d850Var) {
        this.f204208a = p0s0Var;
        this.f204209b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzr0)) {
            return false;
        }
        rzr0 rzr0Var = (rzr0) obj;
        return wj50.m88271j(this.f204208a, rzr0Var.f204208a) && wj50.m88271j(this.f204209b, rzr0Var.f204209b);
    }

    public final int hashCode() {
        int iHashCode = this.f204208a.hashCode() * 31;
        d850 d850Var = this.f204209b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
