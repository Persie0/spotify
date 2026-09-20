package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ueu0 implements weu0 {

    /* JADX INFO: renamed from: a */
    public final long f229605a;

    public ueu0(long j) {
        this.f229605a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ueu0) && this.f229605a == ((ueu0) obj).f229605a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f229605a);
    }
}
