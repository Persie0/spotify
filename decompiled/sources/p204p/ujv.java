package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ujv extends xjv {

    /* JADX INFO: renamed from: a */
    public final long f231152a;

    /* JADX INFO: renamed from: b */
    public final float f231153b;

    public ujv(long j, float f) {
        this.f231152a = j;
        this.f231153b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujv)) {
            return false;
        }
        ujv ujvVar = (ujv) obj;
        return this.f231152a == ujvVar.f231152a && Float.compare(this.f231153b, ujvVar.f231153b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f231153b) + (Long.hashCode(this.f231152a) * 31);
    }
}
