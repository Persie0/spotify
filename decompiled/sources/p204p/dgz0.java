package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dgz0 {

    /* JADX INFO: renamed from: a */
    public final int f48924a;

    /* JADX INFO: renamed from: b */
    public final int f48925b;

    /* JADX INFO: renamed from: c */
    public final int f48926c;

    /* JADX INFO: renamed from: d */
    public final int f48927d;

    public dgz0(int i, int i2, int i3, int i4) {
        this.f48924a = i;
        this.f48925b = i2;
        this.f48926c = i3;
        this.f48927d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgz0)) {
            return false;
        }
        dgz0 dgz0Var = (dgz0) obj;
        return this.f48924a == dgz0Var.f48924a && this.f48925b == dgz0Var.f48925b && this.f48926c == dgz0Var.f48926c && this.f48927d == dgz0Var.f48927d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48927d) + mt60.m62800g(this.f48926c, mt60.m62800g(this.f48925b, Integer.hashCode(this.f48924a) * 31, 31), 31);
    }
}
