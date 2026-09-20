package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y041 {

    /* JADX INFO: renamed from: a */
    public final int f267893a;

    /* JADX INFO: renamed from: b */
    public final int f267894b;

    /* JADX INFO: renamed from: c */
    public final int f267895c;

    /* JADX INFO: renamed from: d */
    public final int f267896d;

    public y041(int i, int i2, int i3, int i4) {
        this.f267893a = i;
        this.f267894b = i2;
        this.f267895c = i3;
        this.f267896d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y041)) {
            return false;
        }
        y041 y041Var = (y041) obj;
        return this.f267893a == y041Var.f267893a && this.f267894b == y041Var.f267894b && this.f267895c == y041Var.f267895c && this.f267896d == y041Var.f267896d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267896d) + mt60.m62800g(this.f267895c, mt60.m62800g(this.f267894b, Integer.hashCode(this.f267893a) * 31, 31), 31);
    }
}
