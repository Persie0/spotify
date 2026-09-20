package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qq40 {

    /* JADX INFO: renamed from: a */
    public final int f191478a;

    /* JADX INFO: renamed from: b */
    public final int f191479b;

    /* JADX INFO: renamed from: c */
    public final int f191480c;

    /* JADX INFO: renamed from: d */
    public final int f191481d;

    public qq40(int i, int i2, int i3, int i4) {
        this.f191478a = i;
        this.f191479b = i2;
        this.f191480c = i3;
        this.f191481d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq40)) {
            return false;
        }
        qq40 qq40Var = (qq40) obj;
        return this.f191478a == qq40Var.f191478a && this.f191479b == qq40Var.f191479b && this.f191480c == qq40Var.f191480c && this.f191481d == qq40Var.f191481d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191481d) + mt60.m62800g(this.f191480c, mt60.m62800g(this.f191479b, Integer.hashCode(this.f191478a) * 31, 31), 31);
    }
}
