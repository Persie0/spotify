package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pq01 {

    /* JADX INFO: renamed from: a */
    public final boolean f180149a;

    public pq01(boolean z) {
        this.f180149a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq01) && this.f180149a == ((pq01) obj).f180149a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180149a);
    }
}
