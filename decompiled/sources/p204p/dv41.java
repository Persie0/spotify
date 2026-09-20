package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dv41 {

    /* JADX INFO: renamed from: a */
    public final vco f53360a;

    /* JADX INFO: renamed from: b */
    public final o5a0 f53361b;

    /* JADX INFO: renamed from: c */
    public final Boolean f53362c;

    /* JADX INFO: renamed from: d */
    public final el8 f53363d;

    /* JADX INFO: renamed from: e */
    public final rs50 f53364e;

    public dv41(vco vcoVar, o5a0 o5a0Var, Boolean bool, el8 el8Var, rs50 rs50Var) {
        this.f53360a = vcoVar;
        this.f53361b = o5a0Var;
        this.f53362c = bool;
        this.f53363d = el8Var;
        this.f53364e = rs50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv41)) {
            return false;
        }
        dv41 dv41Var = (dv41) obj;
        return wj50.m88271j(this.f53360a, dv41Var.f53360a) && wj50.m88271j(this.f53361b, dv41Var.f53361b) && wj50.m88271j(this.f53362c, dv41Var.f53362c) && wj50.m88271j(this.f53363d, dv41Var.f53363d) && wj50.m88271j(this.f53364e, dv41Var.f53364e);
    }

    public final int hashCode() {
        int iHashCode = (this.f53361b.hashCode() + (this.f53360a.hashCode() * 31)) * 31;
        Boolean bool = this.f53362c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        el8 el8Var = this.f53363d;
        return this.f53364e.hashCode() + ((iHashCode2 + (el8Var != null ? el8Var.hashCode() : 0)) * 31);
    }
}
