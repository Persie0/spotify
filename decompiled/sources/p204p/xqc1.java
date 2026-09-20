package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xqc1 {

    /* JADX INFO: renamed from: a */
    public final int f264959a;

    /* JADX INFO: renamed from: b */
    public final int f264960b;

    /* JADX INFO: renamed from: c */
    public final int f264961c;

    /* JADX INFO: renamed from: d */
    public final int f264962d;

    /* JADX INFO: renamed from: e */
    public final float f264963e;

    public xqc1(int i, int i2, int i3, int i4, float f) {
        this.f264959a = i;
        this.f264960b = i2;
        this.f264961c = i3;
        this.f264962d = i4;
        this.f264963e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc1)) {
            return false;
        }
        xqc1 xqc1Var = (xqc1) obj;
        return this.f264959a == xqc1Var.f264959a && this.f264960b == xqc1Var.f264960b && this.f264961c == xqc1Var.f264961c && this.f264962d == xqc1Var.f264962d && Float.compare(this.f264963e, xqc1Var.f264963e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f264963e) + mt60.m62800g(this.f264962d, mt60.m62800g(this.f264961c, mt60.m62800g(this.f264960b, Integer.hashCode(this.f264959a) * 31, 31), 31), 31);
    }
}
