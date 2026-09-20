package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final Boolean f37547a;

    /* JADX INFO: renamed from: b */
    public final sc31 f37548b;

    public cg31(Boolean bool, sc31 sc31Var) {
        this.f37547a = bool;
        this.f37548b = sc31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg31)) {
            return false;
        }
        cg31 cg31Var = (cg31) obj;
        return wj50.m88271j(this.f37547a, cg31Var.f37547a) && wj50.m88271j(this.f37548b, cg31Var.f37548b);
    }

    public final int hashCode() {
        Boolean bool = this.f37547a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        sc31 sc31Var = this.f37548b;
        return iHashCode + (sc31Var != null ? sc31Var.hashCode() : 0);
    }
}
