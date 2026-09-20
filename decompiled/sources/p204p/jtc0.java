package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final long f115816a;

    public jtc0(long j) {
        this.f115816a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtc0) && this.f115816a == ((jtc0) obj).f115816a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f115816a);
    }
}
