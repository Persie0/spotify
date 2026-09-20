package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m4p0 implements p4p0 {

    /* JADX INFO: renamed from: a */
    public final long f140002a;

    public m4p0(long j) {
        this.f140002a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4p0) && this.f140002a == ((m4p0) obj).f140002a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f140002a);
    }
}
