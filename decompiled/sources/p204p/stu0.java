package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class stu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213954a;

    /* JADX INFO: renamed from: b */
    public final int f213955b;

    /* JADX INFO: renamed from: c */
    public final int f213956c;

    public stu0(int i, int i2, boolean z) {
        this.f213954a = z;
        this.f213955b = i;
        this.f213956c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stu0)) {
            return false;
        }
        stu0 stu0Var = (stu0) obj;
        return this.f213954a == stu0Var.f213954a && this.f213955b == stu0Var.f213955b && this.f213956c == stu0Var.f213956c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213956c) + mt60.m62800g(this.f213955b, Boolean.hashCode(this.f213954a) * 31, 31);
    }
}
