package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x0w0 {

    /* JADX INFO: renamed from: a */
    public final long f257005a;

    public x0w0(long j) {
        this.f257005a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0w0) && this.f257005a == ((x0w0) obj).f257005a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257005a);
    }
}
