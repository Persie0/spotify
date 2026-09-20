package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lmo {

    /* JADX INFO: renamed from: a */
    public final long f134995a;

    public lmo(long j) {
        this.f134995a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmo) && this.f134995a == ((lmo) obj).f134995a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f134995a);
    }
}
