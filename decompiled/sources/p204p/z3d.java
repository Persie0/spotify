package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z3d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f278868a;

    /* JADX INFO: renamed from: b */
    public final z650 f278869b;

    public z3d(String str, z650 z650Var) {
        this.f278868a = str;
        this.f278869b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3d)) {
            return false;
        }
        z3d z3dVar = (z3d) obj;
        return wj50.m88271j(this.f278868a, z3dVar.f278868a) && wj50.m88271j(this.f278869b, z3dVar.f278869b);
    }

    public final int hashCode() {
        int iHashCode = this.f278868a.hashCode() * 31;
        z650 z650Var = this.f278869b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
