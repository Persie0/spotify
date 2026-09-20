package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mcj0 {

    /* JADX INFO: renamed from: a */
    public final int f142171a;

    /* JADX INFO: renamed from: b */
    public final pke0 f142172b;

    public mcj0(int i, pke0 pke0Var) {
        this.f142171a = i;
        this.f142172b = pke0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m61464a() {
        return this.f142171a;
    }

    /* JADX INFO: renamed from: b */
    public final pke0 m61465b() {
        return this.f142172b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcj0)) {
            return false;
        }
        mcj0 mcj0Var = (mcj0) obj;
        return this.f142171a == mcj0Var.f142171a && this.f142172b.equals(mcj0Var.f142172b);
    }

    public final int hashCode() {
        return this.f142172b.hashCode() + (Integer.hashCode(this.f142171a) * 31);
    }
}
