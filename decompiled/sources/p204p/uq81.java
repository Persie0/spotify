package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uq81 extends wq81 {

    /* JADX INFO: renamed from: a */
    public final long f232946a;

    public uq81(long j) {
        this.f232946a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq81) && this.f232946a == ((uq81) obj).f232946a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f232946a);
    }
}
