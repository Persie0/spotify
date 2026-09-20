package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fz10 {

    /* JADX INFO: renamed from: a */
    public final float f74885a;

    /* JADX INFO: renamed from: b */
    public final int f74886b;

    /* JADX INFO: renamed from: c */
    public final int f74887c;

    /* JADX INFO: renamed from: d */
    public final boolean f74888d;

    public fz10(float f, int i, int i2, boolean z) {
        this.f74885a = f;
        this.f74886b = i;
        this.f74887c = i2;
        this.f74888d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz10)) {
            return false;
        }
        fz10 fz10Var = (fz10) obj;
        return ybs.m93301b(this.f74885a, fz10Var.f74885a) && this.f74886b == fz10Var.f74886b && this.f74887c == fz10Var.f74887c && this.f74888d == fz10Var.f74888d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74888d) + mt60.m62800g(this.f74887c, mt60.m62800g(this.f74886b, Float.hashCode(this.f74885a) * 31, 31), 31);
    }
}
