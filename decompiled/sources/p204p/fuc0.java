package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fuc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final long f73469a;

    public fuc0(long j) {
        this.f73469a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuc0) && this.f73469a == ((fuc0) obj).f73469a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73469a);
    }
}
