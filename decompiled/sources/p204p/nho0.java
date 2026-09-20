package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nho0 extends tho0 {

    /* JADX INFO: renamed from: a */
    public final boolean f154042a;

    /* JADX INFO: renamed from: b */
    public final d850 f154043b;

    public nho0(d850 d850Var, boolean z) {
        this.f154042a = z;
        this.f154043b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nho0)) {
            return false;
        }
        nho0 nho0Var = (nho0) obj;
        return this.f154042a == nho0Var.f154042a && wj50.m88271j(this.f154043b, nho0Var.f154043b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f154042a) * 31;
        d850 d850Var = this.f154043b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
