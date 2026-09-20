package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ry21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final o031 f203802a;

    /* JADX INFO: renamed from: b */
    public final long f203803b;

    public ry21(o031 o031Var, long j) {
        this.f203802a = o031Var;
        this.f203803b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry21)) {
            return false;
        }
        ry21 ry21Var = (ry21) obj;
        return wj50.m88271j(this.f203802a, ry21Var.f203802a) && this.f203803b == ry21Var.f203803b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f203803b) + (this.f203802a.hashCode() * 31);
    }
}
