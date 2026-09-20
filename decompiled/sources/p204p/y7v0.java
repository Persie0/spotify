package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y7v0 implements z7v0 {

    /* JADX INFO: renamed from: a */
    public final long f270139a;

    public y7v0(long j) {
        this.f270139a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m93015a() {
        return this.f270139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7v0) && this.f270139a == ((y7v0) obj).f270139a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f270139a);
    }
}
