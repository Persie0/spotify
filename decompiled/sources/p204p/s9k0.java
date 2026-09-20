package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f206967a;

    /* JADX INFO: renamed from: b */
    public final int f206968b;

    /* JADX INFO: renamed from: c */
    public final int f206969c;

    /* JADX INFO: renamed from: d */
    public final int f206970d;

    public s9k0(int i, int i2, boolean z) {
        this.f206967a = z;
        this.f206968b = i;
        this.f206969c = i2;
        this.f206970d = i2 - i;
    }

    /* JADX INFO: renamed from: a */
    public final float m77586a(int i) {
        int i2 = this.f206970d;
        if (i2 > 0) {
            return n0e1.m63436m((i - this.f206968b) / i2, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9k0)) {
            return false;
        }
        s9k0 s9k0Var = (s9k0) obj;
        return this.f206967a == s9k0Var.f206967a && this.f206968b == s9k0Var.f206968b && this.f206969c == s9k0Var.f206969c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206969c) + mt60.m62800g(this.f206968b, Boolean.hashCode(this.f206967a) * 31, 31);
    }
}
