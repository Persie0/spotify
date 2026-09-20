package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yz10 {

    /* JADX INFO: renamed from: a */
    public final int f277665a;

    /* JADX INFO: renamed from: b */
    public final int f277666b;

    /* JADX INFO: renamed from: c */
    public final int f277667c;

    /* JADX INFO: renamed from: d */
    public final int f277668d;

    /* JADX INFO: renamed from: e */
    public final int f277669e;

    /* JADX INFO: renamed from: f */
    public final int f277670f;

    public yz10(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f277665a = i;
        this.f277666b = i2;
        this.f277667c = i3;
        this.f277668d = i4;
        this.f277669e = i5;
        this.f277670f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz10)) {
            return false;
        }
        yz10 yz10Var = (yz10) obj;
        return this.f277665a == yz10Var.f277665a && this.f277666b == yz10Var.f277666b && this.f277667c == yz10Var.f277667c && this.f277668d == yz10Var.f277668d && this.f277669e == yz10Var.f277669e && this.f277670f == yz10Var.f277670f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f277670f) + mt60.m62800g(this.f277669e, mt60.m62800g(this.f277668d, mt60.m62800g(this.f277667c, mt60.m62800g(this.f277666b, Integer.hashCode(this.f277665a) * 31, 31), 31), 31), 31);
    }
}
