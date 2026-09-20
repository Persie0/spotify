package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ixc implements lxc {

    /* JADX INFO: renamed from: a */
    public final String f106652a;

    /* JADX INFO: renamed from: b */
    public final j741 f106653b;

    public ixc(String str, j741 j741Var) {
        this.f106652a = str;
        this.f106653b = j741Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixc)) {
            return false;
        }
        ixc ixcVar = (ixc) obj;
        return wj50.m88271j(this.f106652a, ixcVar.f106652a) && wj50.m88271j(this.f106653b, ixcVar.f106653b);
    }

    public final int hashCode() {
        int iHashCode = this.f106652a.hashCode() * 31;
        j741 j741Var = this.f106653b;
        return iHashCode + (j741Var == null ? 0 : j741Var.hashCode());
    }
}
