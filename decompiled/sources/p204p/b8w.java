package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b8w implements c8w {

    /* JADX INFO: renamed from: a */
    public final long f24673a;

    public b8w(long j) {
        this.f24673a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8w) && this.f24673a == ((b8w) obj).f24673a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24673a);
    }
}
