package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hul0 extends zag1 {

    /* JADX INFO: renamed from: c */
    public final int f95419c;

    /* JADX INFO: renamed from: d */
    public final int f95420d;

    /* JADX INFO: renamed from: e */
    public final boolean f95421e;

    /* JADX INFO: renamed from: f */
    public final boolean f95422f;

    /* JADX INFO: renamed from: g */
    public final boolean f95423g;

    /* JADX INFO: renamed from: h */
    public final int f95424h;

    public hul0(int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        this.f95419c = i;
        this.f95420d = i2;
        this.f95421e = z;
        this.f95422f = z2;
        this.f95423g = z3;
        this.f95424h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hul0)) {
            return false;
        }
        hul0 hul0Var = (hul0) obj;
        if (this.f95419c != hul0Var.f95419c || this.f95420d != hul0Var.f95420d || this.f95421e != hul0Var.f95421e || this.f95422f != hul0Var.f95422f || this.f95423g != hul0Var.f95423g || this.f95424h != hul0Var.f95424h) {
            return false;
        }
        Object obj2 = ytl0.f276167c;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ytl0.f276167c.hashCode() + mt60.m62800g(this.f95424h, s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f95420d, Integer.hashCode(this.f95419c) * 31, 31), 31, this.f95421e), 31, this.f95422f), 31, this.f95423g), 31);
    }
}
