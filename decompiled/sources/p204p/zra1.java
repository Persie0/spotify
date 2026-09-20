package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zra1 implements dsa1 {

    /* JADX INFO: renamed from: a */
    public final int f285599a;

    /* JADX INFO: renamed from: b */
    public final int f285600b;

    /* JADX INFO: renamed from: c */
    public final int f285601c;

    public zra1(int i, int i2, int i3) {
        this.f285599a = i;
        this.f285600b = i2;
        this.f285601c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zra1)) {
            return false;
        }
        zra1 zra1Var = (zra1) obj;
        return this.f285599a == zra1Var.f285599a && this.f285600b == zra1Var.f285600b && this.f285601c == zra1Var.f285601c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f285601c) + mt60.m62800g(this.f285600b, Integer.hashCode(this.f285599a) * 31, 31);
    }
}
