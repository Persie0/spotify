package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kn20 {

    /* JADX INFO: renamed from: a */
    public final int f124282a;

    /* JADX INFO: renamed from: b */
    public final int f124283b;

    /* JADX INFO: renamed from: c */
    public final int f124284c;

    /* JADX INFO: renamed from: d */
    public final boolean f124285d;

    public kn20(int i, int i2, int i3, boolean z) {
        this.f124282a = i;
        this.f124283b = i2;
        this.f124284c = i3;
        this.f124285d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn20)) {
            return false;
        }
        kn20 kn20Var = (kn20) obj;
        return this.f124282a == kn20Var.f124282a && this.f124283b == kn20Var.f124283b && this.f124284c == kn20Var.f124284c && this.f124285d == kn20Var.f124285d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124285d) + mt60.m62800g(this.f124284c, mt60.m62800g(this.f124283b, Integer.hashCode(this.f124282a) * 31, 31), 31);
    }
}
