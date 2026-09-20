package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bcz0 implements dcz0 {

    /* JADX INFO: renamed from: a */
    public final long f25960a;

    public bcz0(long j) {
        this.f25960a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcz0) && this.f25960a == ((bcz0) obj).f25960a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25960a);
    }
}
