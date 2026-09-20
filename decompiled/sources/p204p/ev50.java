package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ev50 {

    /* JADX INFO: renamed from: a */
    public final float f63142a;

    /* JADX INFO: renamed from: b */
    public final float f63143b;

    public ev50(float f, float f2) {
        this.f63142a = f;
        this.f63143b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev50)) {
            return false;
        }
        ev50 ev50Var = (ev50) obj;
        return ybs.m93301b(this.f63142a, ev50Var.f63142a) && ybs.m93301b(this.f63143b, ev50Var.f63143b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f63143b) + (Float.hashCode(this.f63142a) * 31);
    }
}
