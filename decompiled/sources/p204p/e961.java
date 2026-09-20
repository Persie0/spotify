package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e961 implements k961 {

    /* JADX INFO: renamed from: a */
    public final ta61 f57375a;

    /* JADX INFO: renamed from: b */
    public final z961 f57376b;

    public e961(ta61 ta61Var, z961 z961Var) {
        this.f57375a = ta61Var;
        this.f57376b = z961Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e961)) {
            return false;
        }
        e961 e961Var = (e961) obj;
        return this.f57375a.equals(e961Var.f57375a) && this.f57376b.equals(e961Var.f57376b);
    }

    public final int hashCode() {
        return this.f57376b.hashCode() + (this.f57375a.hashCode() * 31);
    }
}
