package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wm90 {

    /* JADX INFO: renamed from: a */
    public final long f252760a;

    /* JADX INFO: renamed from: b */
    public final long f252761b;

    public wm90(long j, long j2) {
        this.f252760a = j;
        this.f252761b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm90)) {
            return false;
        }
        wm90 wm90Var = (wm90) obj;
        return this.f252760a == wm90Var.f252760a && this.f252761b == wm90Var.f252761b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f252761b) + (Long.hashCode(this.f252760a) * 31);
    }
}
