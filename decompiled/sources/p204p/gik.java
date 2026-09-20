package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gik implements iik {

    /* JADX INFO: renamed from: a */
    public final long f80199a;

    public gik(long j) {
        this.f80199a = j;
    }

    @Override // p204p.iik
    /* JADX INFO: renamed from: a */
    public final long mo44811a() {
        return this.f80199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gik) && this.f80199a == ((gik) obj).f80199a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f80199a);
    }
}
