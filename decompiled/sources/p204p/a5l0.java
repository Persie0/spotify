package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a5l0 {

    /* JADX INFO: renamed from: a */
    public final int f12551a;

    /* JADX INFO: renamed from: b */
    public final int f12552b;

    /* JADX INFO: renamed from: c */
    public final int f12553c;

    /* JADX INFO: renamed from: d */
    public final long f12554d;

    /* JADX INFO: renamed from: e */
    public final long f12555e;

    /* JADX INFO: renamed from: f */
    public final long f12556f;

    /* JADX INFO: renamed from: g */
    public final long f12557g;

    /* JADX INFO: renamed from: h */
    public final long f12558h;

    /* JADX INFO: renamed from: i */
    public final boolean f12559i;

    public a5l0(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.f12551a = i;
        this.f12552b = i2;
        this.f12553c = i3;
        this.f12554d = j;
        this.f12555e = j2;
        this.f12556f = j3;
        this.f12557g = j4;
        this.f12558h = j5;
        this.f12559i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5l0)) {
            return false;
        }
        a5l0 a5l0Var = (a5l0) obj;
        return this.f12551a == a5l0Var.f12551a && this.f12552b == a5l0Var.f12552b && this.f12553c == a5l0Var.f12553c && this.f12554d == a5l0Var.f12554d && this.f12555e == a5l0Var.f12555e && this.f12556f == a5l0Var.f12556f && this.f12557g == a5l0Var.f12557g && this.f12558h == a5l0Var.f12558h && this.f12559i == a5l0Var.f12559i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12559i) + dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(mt60.m62800g(this.f12553c, mt60.m62800g(this.f12552b, Integer.hashCode(this.f12551a) * 31, 31), 31), this.f12554d, 31), this.f12555e, 31), this.f12556f, 31), this.f12557g, 31), this.f12558h, 31);
    }
}
