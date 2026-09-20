package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b9i extends nai {

    /* JADX INFO: renamed from: a */
    public final long f24942a;

    public b9i(long j) {
        this.f24942a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9i) && this.f24942a == ((b9i) obj).f24942a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24942a);
    }
}
