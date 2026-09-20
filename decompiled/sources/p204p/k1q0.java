package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k1q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f118413a;

    /* JADX INFO: renamed from: b */
    public int f118414b = 0;

    public k1q0(boolean z) {
        this.f118413a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1q0)) {
            return false;
        }
        k1q0 k1q0Var = (k1q0) obj;
        return this.f118413a == k1q0Var.f118413a && this.f118414b == k1q0Var.f118414b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118414b) + (Boolean.hashCode(this.f118413a) * 31);
    }
}
