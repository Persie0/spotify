package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oqr0 {

    /* JADX INFO: renamed from: a */
    public final long f168374a;

    public oqr0(long j) {
        this.f168374a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqr0) && this.f168374a == ((oqr0) obj).f168374a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168374a);
    }
}
