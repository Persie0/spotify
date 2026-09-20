package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k0v0 implements m0v0 {

    /* JADX INFO: renamed from: a */
    public final long f118151a;

    public k0v0(long j) {
        this.f118151a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0v0) && this.f118151a == ((k0v0) obj).f118151a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f118151a);
    }
}
