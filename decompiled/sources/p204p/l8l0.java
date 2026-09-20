package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l8l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f130889a;

    /* JADX INFO: renamed from: b */
    public final int f130890b;

    /* JADX INFO: renamed from: c */
    public final int f130891c;

    public l8l0(int i, int i2, boolean z) {
        this.f130889a = z;
        this.f130890b = i;
        this.f130891c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8l0)) {
            return false;
        }
        l8l0 l8l0Var = (l8l0) obj;
        return this.f130889a == l8l0Var.f130889a && this.f130890b == l8l0Var.f130890b && this.f130891c == l8l0Var.f130891c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130891c) + mt60.m62800g(this.f130890b, Boolean.hashCode(this.f130889a) * 31, 31);
    }
}
