package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vm5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final s7j0 f242705a;

    /* JADX INFO: renamed from: b */
    public final String f242706b;

    public vm5(s7j0 s7j0Var, String str) {
        this.f242705a = s7j0Var;
        this.f242706b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm5)) {
            return false;
        }
        vm5 vm5Var = (vm5) obj;
        return wj50.m88271j(this.f242705a, vm5Var.f242705a) && wj50.m88271j(this.f242706b, vm5Var.f242706b);
    }

    public final int hashCode() {
        s7j0 s7j0Var = this.f242705a;
        int iHashCode = (s7j0Var == null ? 0 : s7j0Var.hashCode()) * 31;
        String str = this.f242706b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
