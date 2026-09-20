package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class juu0 {

    /* JADX INFO: renamed from: a */
    public final int f116174a;

    /* JADX INFO: renamed from: b */
    public final int f116175b;

    /* JADX INFO: renamed from: c */
    public final int f116176c;

    /* JADX INFO: renamed from: d */
    public final int f116177d;

    public juu0(int i, int i2, int i3, int i4) {
        this.f116174a = i;
        this.f116175b = i2;
        this.f116176c = i3;
        this.f116177d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static juu0 m54347a(juu0 juu0Var, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = juu0Var.f116174a;
        }
        if ((i4 & 2) != 0) {
            i2 = juu0Var.f116175b;
        }
        if ((i4 & 4) != 0) {
            i3 = juu0Var.f116176c;
        }
        int i5 = (i4 & 8) != 0 ? juu0Var.f116177d : 2;
        juu0Var.getClass();
        return new juu0(i, i2, i3, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juu0)) {
            return false;
        }
        juu0 juu0Var = (juu0) obj;
        return this.f116174a == juu0Var.f116174a && this.f116175b == juu0Var.f116175b && this.f116176c == juu0Var.f116176c && this.f116177d == juu0Var.f116177d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116177d) + mt60.m62800g(this.f116176c, mt60.m62800g(this.f116175b, Integer.hashCode(this.f116174a) * 31, 31), 31);
    }
}
