package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class szr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final p0s0 f215640a;

    /* JADX INFO: renamed from: b */
    public final d850 f215641b;

    public szr0(p0s0 p0s0Var, d850 d850Var) {
        this.f215640a = p0s0Var;
        this.f215641b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szr0)) {
            return false;
        }
        szr0 szr0Var = (szr0) obj;
        return wj50.m88271j(this.f215640a, szr0Var.f215640a) && wj50.m88271j(this.f215641b, szr0Var.f215641b);
    }

    public final int hashCode() {
        int iHashCode = this.f215640a.hashCode() * 31;
        d850 d850Var = this.f215641b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
