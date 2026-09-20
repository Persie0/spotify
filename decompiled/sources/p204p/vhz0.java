package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vhz0 implements zhz0 {

    /* JADX INFO: renamed from: a */
    public final long f241570a;

    public vhz0(long j) {
        this.f241570a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhz0) && this.f241570a == ((vhz0) obj).f241570a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f241570a);
    }
}
