package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p5y extends fmk0 {

    /* JADX INFO: renamed from: d */
    public static final gmk0 f174252d;

    /* JADX INFO: renamed from: b */
    public float f174253b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f174254c = 0.0f;

    static {
        gmk0 gmk0VarM45273a = gmk0.m45273a(256, new p5y());
        f174252d = gmk0VarM45273a;
        gmk0VarM45273a.f81420f = 0.5f;
    }

    @Override // p204p.fmk0
    /* JADX INFO: renamed from: a */
    public final fmk0 mo36712a() {
        return new p5y();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p5y) {
            p5y p5yVar = (p5y) obj;
            if (this.f174253b == p5yVar.f174253b && this.f174254c == p5yVar.f174254c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f174253b) ^ Float.floatToIntBits(this.f174254c);
    }

    public final String toString() {
        return this.f174253b + "x" + this.f174254c;
    }
}
