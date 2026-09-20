package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g1e0 {

    /* JADX INFO: renamed from: a */
    public final int f75603a;

    /* JADX INFO: renamed from: b */
    public final boolean f75604b;

    public g1e0(int i, boolean z) {
        this.f75603a = i;
        this.f75604b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1e0)) {
            return false;
        }
        g1e0 g1e0Var = (g1e0) obj;
        return this.f75603a == g1e0Var.f75603a && this.f75604b == g1e0Var.f75604b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75604b) + (Integer.hashCode(this.f75603a) * 31);
    }
}
