package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yd81 implements be81 {

    /* JADX INFO: renamed from: a */
    public final long f271720a;

    public yd81(long j) {
        this.f271720a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd81) && this.f271720a == ((yd81) obj).f271720a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f271720a);
    }
}
