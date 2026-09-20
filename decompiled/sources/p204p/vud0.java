package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vud0 implements wud0 {

    /* JADX INFO: renamed from: a */
    public final long f244928a;

    /* JADX INFO: renamed from: b */
    public final long f244929b;

    public vud0(long j, long j2) {
        this.f244928a = j;
        this.f244929b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vud0)) {
            return false;
        }
        vud0 vud0Var = (vud0) obj;
        return this.f244928a == vud0Var.f244928a && this.f244929b == vud0Var.f244929b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f244929b) + (Long.hashCode(this.f244928a) * 31);
    }
}
