package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xw6 {

    /* JADX INFO: renamed from: a */
    public final long f266597a;

    public xw6(long j) {
        this.f266597a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw6) && this.f266597a == ((xw6) obj).f266597a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f266597a) + (Long.hashCode(0L) * 31);
    }
}
