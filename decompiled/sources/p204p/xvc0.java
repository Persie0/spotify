package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final long f266357a;

    public xvc0(long j) {
        this.f266357a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvc0) && this.f266357a == ((xvc0) obj).f266357a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f266357a);
    }
}
