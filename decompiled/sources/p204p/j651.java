package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j651 {

    /* JADX INFO: renamed from: a */
    public final float f109224a;

    /* JADX INFO: renamed from: b */
    public final int f109225b;

    /* JADX INFO: renamed from: c */
    public final int f109226c;

    /* JADX INFO: renamed from: d */
    public final int f109227d;

    /* JADX INFO: renamed from: e */
    public final int f109228e;

    public j651(int i, int i2, float f) {
        this.f109224a = f;
        this.f109225b = i;
        this.f109226c = i2;
        i = i <= 0 ? i2 : i;
        this.f109227d = i;
        this.f109228e = i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j651)) {
            return false;
        }
        j651 j651Var = (j651) obj;
        return Float.compare(this.f109224a, j651Var.f109224a) == 0 && this.f109225b == j651Var.f109225b && this.f109226c == j651Var.f109226c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109226c) + mt60.m62800g(this.f109225b, Float.hashCode(this.f109224a) * 31, 31);
    }
}
