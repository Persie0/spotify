package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n4p0 implements p4p0 {

    /* JADX INFO: renamed from: a */
    public final long f150399a;

    public n4p0(long j) {
        this.f150399a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4p0) && this.f150399a == ((n4p0) obj).f150399a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f150399a);
    }
}
