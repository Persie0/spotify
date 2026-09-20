package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x6u0 implements z6u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f258751a;

    /* JADX INFO: renamed from: b */
    public final int f258752b;

    /* JADX INFO: renamed from: c */
    public final double f258753c;

    /* JADX INFO: renamed from: d */
    public final long f258754d;

    /* JADX INFO: renamed from: e */
    public final boolean f258755e;

    public x6u0(boolean z, int i, double d, long j, boolean z2) {
        this.f258751a = z;
        this.f258752b = i;
        this.f258753c = d;
        this.f258754d = j;
        this.f258755e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6u0)) {
            return false;
        }
        x6u0 x6u0Var = (x6u0) obj;
        return this.f258751a == x6u0Var.f258751a && this.f258752b == x6u0Var.f258752b && Double.compare(this.f258753c, x6u0Var.f258753c) == 0 && this.f258754d == x6u0Var.f258754d && this.f258755e == x6u0Var.f258755e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258755e) + dq60.m36605e(xl81.m91399h(this.f258753c, mt60.m62800g(this.f258752b, Boolean.hashCode(this.f258751a) * 31, 31), 31), this.f258754d, 31);
    }
}
