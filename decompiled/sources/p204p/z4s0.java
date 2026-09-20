package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z4s0 {

    /* JADX INFO: renamed from: a */
    public final y6s0 f279335a;

    /* JADX INFO: renamed from: b */
    public final daj f279336b;

    public z4s0(y6s0 y6s0Var, daj dajVar) {
        this.f279335a = y6s0Var;
        this.f279336b = dajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4s0)) {
            return false;
        }
        z4s0 z4s0Var = (z4s0) obj;
        return wj50.m88271j(this.f279335a, z4s0Var.f279335a) && wj50.m88271j(this.f279336b, z4s0Var.f279336b);
    }

    public final int hashCode() {
        y6s0 y6s0Var = this.f279335a;
        int iHashCode = (y6s0Var == null ? 0 : y6s0Var.hashCode()) * 31;
        daj dajVar = this.f279336b;
        return iHashCode + (dajVar != null ? dajVar.hashCode() : 0);
    }
}
