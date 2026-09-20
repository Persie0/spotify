package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bd8 {

    /* JADX INFO: renamed from: a */
    public final double f26042a;

    /* JADX INFO: renamed from: b */
    public final ad8 f26043b;

    /* JADX INFO: renamed from: c */
    public final int f26044c;

    public bd8(double d, ad8 ad8Var, int i) {
        this.f26042a = d;
        this.f26043b = ad8Var;
        this.f26044c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd8)) {
            return false;
        }
        bd8 bd8Var = (bd8) obj;
        return Double.compare(this.f26042a, bd8Var.f26042a) == 0 && this.f26043b == bd8Var.f26043b && this.f26044c == bd8Var.f26044c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26044c) + ((this.f26043b.hashCode() + (Double.hashCode(this.f26042a) * 31)) * 31);
    }
}
