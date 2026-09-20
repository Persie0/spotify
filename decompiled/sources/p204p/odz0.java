package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class odz0 implements qdz0 {

    /* JADX INFO: renamed from: a */
    public final long f164290a;

    public odz0(long j) {
        this.f164290a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odz0) && this.f164290a == ((odz0) obj).f164290a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f164290a);
    }
}
