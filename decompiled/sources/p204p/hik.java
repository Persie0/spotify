package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hik implements iik {

    /* JADX INFO: renamed from: a */
    public final long f91828a;

    public hik(long j) {
        this.f91828a = j;
    }

    @Override // p204p.iik
    /* JADX INFO: renamed from: a */
    public final long mo44811a() {
        return this.f91828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hik) && this.f91828a == ((hik) obj).f91828a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91828a);
    }
}
