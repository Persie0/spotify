package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i5s0 {

    /* JADX INFO: renamed from: a */
    public final h5s0 f99017a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f99018b;

    public i5s0(h5s0 h5s0Var, y6s0 y6s0Var) {
        this.f99017a = h5s0Var;
        this.f99018b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5s0)) {
            return false;
        }
        i5s0 i5s0Var = (i5s0) obj;
        return wj50.m88271j(this.f99017a, i5s0Var.f99017a) && wj50.m88271j(this.f99018b, i5s0Var.f99018b);
    }

    public final int hashCode() {
        return this.f99018b.hashCode() + (this.f99017a.hashCode() * 31);
    }
}
