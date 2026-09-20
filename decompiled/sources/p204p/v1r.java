package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v1r {

    /* JADX INFO: renamed from: a */
    public final ub21 f236441a;

    /* JADX INFO: renamed from: b */
    public final v140 f236442b;

    public v1r(ub21 ub21Var, v140 v140Var) {
        this.f236441a = ub21Var;
        this.f236442b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1r)) {
            return false;
        }
        v1r v1rVar = (v1r) obj;
        return wj50.m88271j(this.f236441a, v1rVar.f236441a) && wj50.m88271j(this.f236442b, v1rVar.f236442b);
    }

    public final int hashCode() {
        int iHashCode = this.f236441a.hashCode() * 31;
        v140 v140Var = this.f236442b;
        return iHashCode + (v140Var == null ? 0 : v140Var.hashCode());
    }
}
