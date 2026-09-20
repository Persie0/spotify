package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x7v0 implements z7v0 {

    /* JADX INFO: renamed from: a */
    public final long f258996a;

    public x7v0(long j) {
        this.f258996a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m90175a() {
        return this.f258996a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7v0) && this.f258996a == ((x7v0) obj).f258996a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f258996a);
    }
}
