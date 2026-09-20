package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class svc1 implements uvc1 {

    /* JADX INFO: renamed from: a */
    public final long f214381a;

    public svc1(long j) {
        this.f214381a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svc1) && this.f214381a == ((svc1) obj).f214381a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214381a);
    }
}
