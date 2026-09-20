package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ljo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final long f134112a;

    /* JADX INFO: renamed from: b */
    public final d850 f134113b;

    public ljo0(long j, d850 d850Var) {
        this.f134112a = j;
        this.f134113b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljo0)) {
            return false;
        }
        ljo0 ljo0Var = (ljo0) obj;
        return this.f134112a == ljo0Var.f134112a && wj50.m88271j(this.f134113b, ljo0Var.f134113b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f134112a) * 31;
        d850 d850Var = this.f134113b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
