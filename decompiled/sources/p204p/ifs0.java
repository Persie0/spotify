package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ifs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final long f101825a;

    public ifs0(long j) {
        this.f101825a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifs0) && this.f101825a == ((ifs0) obj).f101825a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101825a);
    }
}
