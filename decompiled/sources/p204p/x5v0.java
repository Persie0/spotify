package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x5v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final pxj f258528a;

    /* JADX INFO: renamed from: b */
    public final s4v0 f258529b;

    public x5v0(pxj pxjVar, s4v0 s4v0Var) {
        this.f258528a = pxjVar;
        this.f258529b = s4v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5v0)) {
            return false;
        }
        x5v0 x5v0Var = (x5v0) obj;
        return this.f258528a == x5v0Var.f258528a && this.f258529b == x5v0Var.f258529b;
    }

    public final int hashCode() {
        pxj pxjVar = this.f258528a;
        int iHashCode = (pxjVar == null ? 0 : pxjVar.hashCode()) * 31;
        s4v0 s4v0Var = this.f258529b;
        return iHashCode + (s4v0Var != null ? s4v0Var.hashCode() : 0);
    }
}
