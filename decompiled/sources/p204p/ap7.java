package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ap7 implements bp7 {

    /* JADX INFO: renamed from: a */
    public final long f17846a;

    public ap7(long j) {
        this.f17846a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap7) && this.f17846a == ((ap7) obj).f17846a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17846a);
    }
}
