package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fv50 {

    /* JADX INFO: renamed from: a */
    public final float f73678a;

    /* JADX INFO: renamed from: b */
    public final float f73679b;

    public fv50(float f, float f2) {
        this.f73678a = f;
        this.f73679b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv50)) {
            return false;
        }
        fv50 fv50Var = (fv50) obj;
        return ybs.m93301b(this.f73678a, fv50Var.f73678a) && ybs.m93301b(this.f73679b, fv50Var.f73679b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f73679b) + (Float.hashCode(this.f73678a) * 31);
    }
}
