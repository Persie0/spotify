package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hqe0 implements jqe0 {

    /* JADX INFO: renamed from: a */
    public final long f94120a;

    public hqe0(long j) {
        this.f94120a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqe0) && this.f94120a == ((hqe0) obj).f94120a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f94120a);
    }
}
