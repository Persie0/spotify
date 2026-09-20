package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bpp0 implements gpp0 {

    /* JADX INFO: renamed from: a */
    public final long f29561a;

    public bpp0(long j) {
        this.f29561a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpp0) && this.f29561a == ((bpp0) obj).f29561a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29561a);
    }
}
