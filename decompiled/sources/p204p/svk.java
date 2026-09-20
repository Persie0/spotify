package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class svk {

    /* JADX INFO: renamed from: a */
    public final long f214454a;

    public svk(long j) {
        this.f214454a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svk) && this.f214454a == ((svk) obj).f214454a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214454a);
    }
}
