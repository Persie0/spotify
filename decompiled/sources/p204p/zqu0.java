package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zqu0 {

    /* JADX INFO: renamed from: a */
    public final int f285462a;

    /* JADX INFO: renamed from: b */
    public final int f285463b;

    /* JADX INFO: renamed from: c */
    public final int f285464c;

    /* JADX INFO: renamed from: d */
    public final boolean f285465d;

    public zqu0(int i, int i2, int i3, boolean z) {
        this.f285462a = i;
        this.f285463b = i2;
        this.f285464c = i3;
        this.f285465d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqu0)) {
            return false;
        }
        zqu0 zqu0Var = (zqu0) obj;
        return this.f285462a == zqu0Var.f285462a && this.f285463b == zqu0Var.f285463b && this.f285464c == zqu0Var.f285464c && this.f285465d == zqu0Var.f285465d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285465d) + mt60.m62800g(this.f285464c, mt60.m62800g(this.f285463b, Integer.hashCode(this.f285462a) * 31, 31), 31);
    }
}
