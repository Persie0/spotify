package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class an5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final long f17308a;

    public an5(long j) {
        this.f17308a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an5) && this.f17308a == ((an5) obj).f17308a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17308a);
    }
}
