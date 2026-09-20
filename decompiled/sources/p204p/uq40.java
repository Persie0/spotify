package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class uq40 {

    /* JADX INFO: renamed from: a */
    public final int f232925a;

    /* JADX INFO: renamed from: b */
    public final int f232926b;

    /* JADX INFO: renamed from: c */
    public final int f232927c;

    /* JADX INFO: renamed from: d */
    public final int f232928d;

    public uq40(int i, int i2, int i3, int i4) {
        this.f232925a = i;
        this.f232926b = i2;
        this.f232927c = i3;
        this.f232928d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq40)) {
            return false;
        }
        uq40 uq40Var = (uq40) obj;
        return this.f232925a == uq40Var.f232925a && this.f232926b == uq40Var.f232926b && this.f232927c == uq40Var.f232927c && this.f232928d == uq40Var.f232928d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232928d) + mt60.m62800g(this.f232927c, mt60.m62800g(this.f232926b, Integer.hashCode(this.f232925a) * 31, 31), 31);
    }
}
