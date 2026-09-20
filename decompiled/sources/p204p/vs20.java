package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vs20 {

    /* JADX INFO: renamed from: a */
    public final int f244321a;

    /* JADX INFO: renamed from: b */
    public final int f244322b;

    /* JADX INFO: renamed from: c */
    public final int f244323c;

    /* JADX INFO: renamed from: d */
    public final int f244324d;

    public vs20(int i, int i2, int i3, int i4) {
        this.f244321a = i;
        this.f244322b = i2;
        this.f244323c = i3;
        this.f244324d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs20)) {
            return false;
        }
        vs20 vs20Var = (vs20) obj;
        return this.f244321a == vs20Var.f244321a && this.f244322b == vs20Var.f244322b && this.f244323c == vs20Var.f244323c && this.f244324d == vs20Var.f244324d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f244324d) + mt60.m62800g(this.f244323c, mt60.m62800g(this.f244322b, Integer.hashCode(this.f244321a) * 31, 31), 31);
    }
}
