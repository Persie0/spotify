package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wcc1 implements xcc1 {

    /* JADX INFO: renamed from: a */
    public final long f250017a;

    public wcc1(long j) {
        this.f250017a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcc1) && this.f250017a == ((wcc1) obj).f250017a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f250017a);
    }
}
