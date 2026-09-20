package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lx2 implements mx2 {

    /* JADX INFO: renamed from: a */
    public final long f137700a;

    public lx2(long j) {
        this.f137700a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lx2) && this.f137700a == ((lx2) obj).f137700a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f137700a);
    }
}
