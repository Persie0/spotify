package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dm20 {

    /* JADX INFO: renamed from: a */
    public final float f50404a;

    /* JADX INFO: renamed from: b */
    public final int f50405b;

    public dm20(float f, int i) {
        this.f50404a = f;
        this.f50405b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm20)) {
            return false;
        }
        dm20 dm20Var = (dm20) obj;
        return Float.compare(this.f50404a, dm20Var.f50404a) == 0 && this.f50405b == dm20Var.f50405b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50405b) + (Float.hashCode(this.f50404a) * 31);
    }
}
