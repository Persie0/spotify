package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n1c1 {

    /* JADX INFO: renamed from: a */
    public final long f149392a;

    /* JADX INFO: renamed from: b */
    public final int f149393b;

    public n1c1(int i, long j) {
        this.f149392a = j;
        this.f149393b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1c1)) {
            return false;
        }
        n1c1 n1c1Var = (n1c1) obj;
        return this.f149392a == n1c1Var.f149392a && this.f149393b == n1c1Var.f149393b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f149393b) + (Long.hashCode(this.f149392a) * 31);
    }
}
