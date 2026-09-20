package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d3i {

    /* JADX INFO: renamed from: a */
    public final long f44887a;

    public d3i(long j) {
        this.f44887a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3i) && this.f44887a == ((d3i) obj).f44887a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44887a);
    }
}
