package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vsl0 extends ktl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f244460a;

    /* JADX INFO: renamed from: b */
    public final String f244461b;

    public vsl0(zo20 zo20Var, String str) {
        this.f244460a = zo20Var;
        this.f244461b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsl0)) {
            return false;
        }
        vsl0 vsl0Var = (vsl0) obj;
        return wj50.m88271j(this.f244460a, vsl0Var.f244460a) && wj50.m88271j(this.f244461b, vsl0Var.f244461b);
    }

    public final int hashCode() {
        return this.f244461b.hashCode() + (this.f244460a.hashCode() * 31);
    }
}
