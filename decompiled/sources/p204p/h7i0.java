package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h7i0 {

    /* JADX INFO: renamed from: a */
    public final long f88466a;

    public h7i0(long j) {
        this.f88466a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7i0) && this.f88466a == ((h7i0) obj).f88466a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.f88466a) * 31);
    }
}
