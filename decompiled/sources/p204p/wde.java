package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wde {

    /* JADX INFO: renamed from: a */
    public final float f250267a;

    /* JADX INFO: renamed from: b */
    public final float f250268b;

    public wde(float f, float f2) {
        this.f250267a = f;
        this.f250268b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wde)) {
            return false;
        }
        wde wdeVar = (wde) obj;
        return ybs.m93301b(this.f250267a, wdeVar.f250267a) && ybs.m93301b(this.f250268b, wdeVar.f250268b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f250268b) + (Float.hashCode(this.f250267a) * 31);
    }
}
