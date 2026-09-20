package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vtq extends wtq {

    /* JADX INFO: renamed from: a */
    public final boolean f244750a;

    /* JADX INFO: renamed from: b */
    public final noa1 f244751b;

    public vtq(boolean z, noa1 noa1Var) {
        this.f244750a = z;
        this.f244751b = noa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtq)) {
            return false;
        }
        vtq vtqVar = (vtq) obj;
        return this.f244750a == vtqVar.f244750a && wj50.m88271j(this.f244751b, vtqVar.f244751b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f244750a) * 31;
        noa1 noa1Var = this.f244751b;
        return iHashCode + (noa1Var == null ? 0 : noa1Var.hashCode());
    }
}
