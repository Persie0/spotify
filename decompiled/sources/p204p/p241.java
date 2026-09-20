package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p241 {

    /* JADX INFO: renamed from: a */
    public final int f173241a;

    /* JADX INFO: renamed from: b */
    public final int f173242b;

    /* JADX INFO: renamed from: c */
    public final int f173243c;

    /* JADX INFO: renamed from: d */
    public final int f173244d;

    public p241(int i, int i2, int i3, int i4) {
        this.f173241a = i;
        this.f173242b = i2;
        this.f173243c = i3;
        this.f173244d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p241)) {
            return false;
        }
        p241 p241Var = (p241) obj;
        return this.f173241a == p241Var.f173241a && this.f173242b == p241Var.f173242b && this.f173243c == p241Var.f173243c && this.f173244d == p241Var.f173244d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173244d) + mt60.m62800g(this.f173243c, mt60.m62800g(this.f173242b, Integer.hashCode(this.f173241a) * 31, 31), 31);
    }
}
