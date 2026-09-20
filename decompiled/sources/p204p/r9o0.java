package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r9o0 {

    /* JADX INFO: renamed from: a */
    public final String f197095a;

    /* JADX INFO: renamed from: b */
    public final rhw0 f197096b;

    /* JADX INFO: renamed from: c */
    public final ll1 f197097c;

    public r9o0(String str, rhw0 rhw0Var, ll1 ll1Var) {
        this.f197095a = str;
        this.f197096b = rhw0Var;
        this.f197097c = ll1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9o0)) {
            return false;
        }
        r9o0 r9o0Var = (r9o0) obj;
        return wj50.m88271j(this.f197095a, r9o0Var.f197095a) && wj50.m88271j(this.f197096b, r9o0Var.f197096b) && wj50.m88271j(this.f197097c, r9o0Var.f197097c);
    }

    public final int hashCode() {
        int iHashCode = this.f197095a.hashCode() * 31;
        rhw0 rhw0Var = this.f197096b;
        int iHashCode2 = (iHashCode + (rhw0Var == null ? 0 : rhw0Var.hashCode())) * 31;
        ll1 ll1Var = this.f197097c;
        return iHashCode2 + (ll1Var != null ? edb.m38547C(ll1Var.f134509a) : 0);
    }
}
