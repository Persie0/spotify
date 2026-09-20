package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g5s0 {

    /* JADX INFO: renamed from: a */
    public final int f76763a;

    /* JADX INFO: renamed from: b */
    public final int f76764b;

    /* JADX INFO: renamed from: c */
    public final long f76765c;

    public g5s0(int i, long j, int i2) {
        this.f76763a = i;
        this.f76764b = i2;
        this.f76765c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5s0)) {
            return false;
        }
        g5s0 g5s0Var = (g5s0) obj;
        return this.f76763a == g5s0Var.f76763a && this.f76764b == g5s0Var.f76764b && this.f76765c == g5s0Var.f76765c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76765c) + f710.m40938f(this.f76764b, Integer.hashCode(this.f76763a) * 31, 31);
    }
}
