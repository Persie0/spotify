package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ems extends gms {

    /* JADX INFO: renamed from: a */
    public final long f60977a;

    /* JADX INFO: renamed from: b */
    public final long f60978b;

    public ems(long j, long j2) {
        this.f60977a = j;
        this.f60978b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ems)) {
            return false;
        }
        ems emsVar = (ems) obj;
        return this.f60977a == emsVar.f60977a && this.f60978b == emsVar.f60978b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f60978b) + (Long.hashCode(this.f60977a) * 31);
    }
}
