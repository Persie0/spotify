package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d27 {

    /* JADX INFO: renamed from: a */
    public final qho f44488a;

    /* JADX INFO: renamed from: b */
    public final cg21 f44489b;

    public d27(qho qhoVar, cg21 cg21Var) {
        this.f44488a = qhoVar;
        this.f44489b = cg21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d27)) {
            return false;
        }
        d27 d27Var = (d27) obj;
        return wj50.m88271j(this.f44488a, d27Var.f44488a) && wj50.m88271j(this.f44489b, d27Var.f44489b);
    }

    public final int hashCode() {
        int iHashCode = this.f44488a.hashCode() * 31;
        cg21 cg21Var = this.f44489b;
        return iHashCode + (cg21Var == null ? 0 : cg21Var.hashCode());
    }
}
