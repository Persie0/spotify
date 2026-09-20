package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b86 implements d86 {

    /* JADX INFO: renamed from: a */
    public final g86 f24499a;

    /* JADX INFO: renamed from: b */
    public final int f24500b;

    public b86(g86 g86Var, int i) {
        this.f24499a = g86Var;
        this.f24500b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b86)) {
            return false;
        }
        b86 b86Var = (b86) obj;
        return wj50.m88271j(this.f24499a, b86Var.f24499a) && this.f24500b == b86Var.f24500b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24500b) + (this.f24499a.hashCode() * 31);
    }
}
