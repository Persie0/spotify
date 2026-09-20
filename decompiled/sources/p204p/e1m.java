package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e1m {

    /* JADX INFO: renamed from: a */
    public final long f55215a;

    public e1m(long j) {
        this.f55215a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1m) && this.f55215a == ((e1m) obj).f55215a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55215a);
    }
}
