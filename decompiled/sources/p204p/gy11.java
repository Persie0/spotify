package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gy11 {

    /* JADX INFO: renamed from: a */
    public final float f85405a;

    /* JADX INFO: renamed from: b */
    public final int f85406b;

    /* JADX INFO: renamed from: c */
    public final int f85407c;

    public gy11(int i, int i2, float f) {
        this.f85405a = f;
        this.f85406b = i;
        this.f85407c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy11)) {
            return false;
        }
        gy11 gy11Var = (gy11) obj;
        return Float.compare(this.f85405a, gy11Var.f85405a) == 0 && this.f85406b == gy11Var.f85406b && this.f85407c == gy11Var.f85407c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85407c) + mt60.m62800g(this.f85406b, Float.hashCode(this.f85405a) * 31, 31);
    }
}
