package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class er50 {

    /* JADX INFO: renamed from: a */
    public final yqx0 f62022a;

    /* JADX INFO: renamed from: b */
    public final r4t0 f62023b;

    /* JADX INFO: renamed from: c */
    public final boolean f62024c;

    public er50(yqx0 yqx0Var, r4t0 r4t0Var, boolean z) {
        this.f62022a = yqx0Var;
        this.f62023b = r4t0Var;
        this.f62024c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er50)) {
            return false;
        }
        er50 er50Var = (er50) obj;
        return wj50.m88271j(this.f62022a, er50Var.f62022a) && this.f62023b == er50Var.f62023b && this.f62024c == er50Var.f62024c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62024c) + ((this.f62023b.hashCode() + (this.f62022a.hashCode() * 31)) * 31);
    }
}
