package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j1w implements k1w {

    /* JADX INFO: renamed from: a */
    public final long f107869a;

    public j1w(long j) {
        this.f107869a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1w) && this.f107869a == ((j1w) obj).f107869a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f107869a);
    }
}
