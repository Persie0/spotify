package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final long f255465a;

    /* JADX INFO: renamed from: b */
    public final boolean f255466b;

    public wvc0(long j, boolean z) {
        this.f255465a = j;
        this.f255466b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvc0)) {
            return false;
        }
        wvc0 wvc0Var = (wvc0) obj;
        return this.f255465a == wvc0Var.f255465a && this.f255466b == wvc0Var.f255466b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255466b) + (Long.hashCode(this.f255465a) * 31);
    }
}
