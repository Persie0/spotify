package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r30 {

    /* JADX INFO: renamed from: a */
    public final y6s0 f195307a;

    /* JADX INFO: renamed from: b */
    public final boolean f195308b;

    public r30(y6s0 y6s0Var, boolean z) {
        this.f195307a = y6s0Var;
        this.f195308b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return wj50.m88271j(this.f195307a, r30Var.f195307a) && this.f195308b == r30Var.f195308b;
    }

    public final int hashCode() {
        y6s0 y6s0Var = this.f195307a;
        return Boolean.hashCode(this.f195308b) + ((y6s0Var == null ? 0 : y6s0Var.hashCode()) * 31);
    }
}
