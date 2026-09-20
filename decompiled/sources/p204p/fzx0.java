package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fzx0 {

    /* JADX INFO: renamed from: a */
    public final int f75199a;

    /* JADX INFO: renamed from: b */
    public final int f75200b;

    /* JADX INFO: renamed from: c */
    public final int f75201c;

    /* JADX INFO: renamed from: d */
    public final int f75202d;

    public fzx0(int i, int i2, int i3, int i4) {
        this.f75199a = i;
        this.f75200b = i2;
        this.f75201c = i3;
        this.f75202d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzx0)) {
            return false;
        }
        fzx0 fzx0Var = (fzx0) obj;
        return this.f75199a == fzx0Var.f75199a && this.f75200b == fzx0Var.f75200b && this.f75201c == fzx0Var.f75201c && this.f75202d == fzx0Var.f75202d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75202d) + mt60.m62800g(this.f75201c, mt60.m62800g(this.f75200b, Integer.hashCode(this.f75199a) * 31, 31), 31);
    }
}
