package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f255747a;

    /* JADX INFO: renamed from: b */
    public final d850 f255748b;

    public wwc0(String str, d850 d850Var) {
        this.f255747a = str;
        this.f255748b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwc0)) {
            return false;
        }
        wwc0 wwc0Var = (wwc0) obj;
        return wj50.m88271j(this.f255747a, wwc0Var.f255747a) && wj50.m88271j(this.f255748b, wwc0Var.f255748b);
    }

    public final int hashCode() {
        int iHashCode = this.f255747a.hashCode() * 31;
        d850 d850Var = this.f255748b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
