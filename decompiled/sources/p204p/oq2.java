package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oq2 implements pq2 {

    /* JADX INFO: renamed from: a */
    public final long f168055a;

    public oq2(long j) {
        this.f168055a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m67581a() {
        return this.f168055a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq2) && this.f168055a == ((oq2) obj).f168055a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168055a);
    }
}
