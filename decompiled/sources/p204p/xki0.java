package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xki0 extends bli0 {

    /* JADX INFO: renamed from: a */
    public final icr0 f262381a;

    /* JADX INFO: renamed from: b */
    public final gcr0 f262382b;

    public xki0(icr0 icr0Var, gcr0 gcr0Var) {
        this.f262381a = icr0Var;
        this.f262382b = gcr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xki0)) {
            return false;
        }
        xki0 xki0Var = (xki0) obj;
        return wj50.m88271j(this.f262381a, xki0Var.f262381a) && wj50.m88271j(this.f262382b, xki0Var.f262382b);
    }

    public final int hashCode() {
        int iHashCode = this.f262381a.hashCode() * 31;
        gcr0 gcr0Var = this.f262382b;
        return iHashCode + (gcr0Var == null ? 0 : gcr0Var.hashCode());
    }
}
