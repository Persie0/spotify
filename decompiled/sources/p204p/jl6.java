package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jl6 {

    /* JADX INFO: renamed from: a */
    public final int f113491a;

    /* JADX INFO: renamed from: b */
    public final int f113492b;

    /* JADX INFO: renamed from: c */
    public final int f113493c;

    public jl6(int i, int i2, int i3) {
        this.f113491a = i;
        this.f113492b = i2;
        this.f113493c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl6)) {
            return false;
        }
        jl6 jl6Var = (jl6) obj;
        return this.f113491a == jl6Var.f113491a && this.f113492b == jl6Var.f113492b && this.f113493c == jl6Var.f113493c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f113493c) + mt60.m62800g(this.f113492b, Integer.hashCode(this.f113491a) * 31, 31);
    }
}
