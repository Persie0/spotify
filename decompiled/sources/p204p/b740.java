package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b740 {

    /* JADX INFO: renamed from: a */
    public final int f24158a;

    /* JADX INFO: renamed from: b */
    public final int f24159b;

    /* JADX INFO: renamed from: c */
    public final int f24160c;

    public b740(int i, int i2, int i3) {
        this.f24158a = i;
        this.f24159b = i2;
        this.f24160c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b740)) {
            return false;
        }
        b740 b740Var = (b740) obj;
        return this.f24158a == b740Var.f24158a && this.f24159b == b740Var.f24159b && this.f24160c == b740Var.f24160c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24160c) + mt60.m62800g(this.f24159b, Integer.hashCode(this.f24158a) * 31, 31);
    }
}
