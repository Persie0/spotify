package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f77800a;

    /* JADX INFO: renamed from: b */
    public final d850 f77801b;

    public g9i(String str, d850 d850Var) {
        this.f77800a = str;
        this.f77801b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9i)) {
            return false;
        }
        g9i g9iVar = (g9i) obj;
        return wj50.m88271j(this.f77800a, g9iVar.f77800a) && wj50.m88271j(this.f77801b, g9iVar.f77801b);
    }

    public final int hashCode() {
        int iHashCode = this.f77800a.hashCode() * 31;
        d850 d850Var = this.f77801b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
