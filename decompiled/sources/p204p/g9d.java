package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g9d implements lad {

    /* JADX INFO: renamed from: a */
    public final z650 f77731a;

    /* JADX INFO: renamed from: b */
    public final int f77732b;

    public g9d(int i, z650 z650Var) {
        this.f77731a = z650Var;
        this.f77732b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9d)) {
            return false;
        }
        g9d g9dVar = (g9d) obj;
        return wj50.m88271j(this.f77731a, g9dVar.f77731a) && this.f77732b == g9dVar.f77732b;
    }

    public final int hashCode() {
        z650 z650Var = this.f77731a;
        int iHashCode = (z650Var == null ? 0 : z650Var.f279709a.hashCode()) * 31;
        int i = this.f77732b;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
