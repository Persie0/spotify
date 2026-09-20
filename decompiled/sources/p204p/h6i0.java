package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h6i0 {

    /* JADX INFO: renamed from: a */
    public final f6i0 f88101a;

    /* JADX INFO: renamed from: b */
    public final g6i0 f88102b;

    public h6i0(f6i0 f6i0Var, g6i0 g6i0Var) {
        this.f88101a = f6i0Var;
        this.f88102b = g6i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6i0)) {
            return false;
        }
        h6i0 h6i0Var = (h6i0) obj;
        return this.f88101a == h6i0Var.f88101a && this.f88102b == h6i0Var.f88102b;
    }

    public final int hashCode() {
        return this.f88102b.hashCode() + (this.f88101a.hashCode() * 31);
    }
}
