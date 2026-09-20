package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x5x0 extends y5x0 {

    /* JADX INFO: renamed from: a */
    public final int f258536a;

    /* JADX INFO: renamed from: b */
    public final Throwable f258537b;

    public x5x0(int i, Throwable th) {
        this.f258536a = i;
        this.f258537b = th;
    }

    @Override // p204p.y5x0
    /* JADX INFO: renamed from: b */
    public final int mo69173b() {
        return this.f258536a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5x0)) {
            return false;
        }
        x5x0 x5x0Var = (x5x0) obj;
        return this.f258536a == x5x0Var.f258536a && wj50.m88271j(this.f258537b, x5x0Var.f258537b);
    }

    public final int hashCode() {
        return this.f258537b.hashCode() + (edb.m38547C(this.f258536a) * 31);
    }
}
