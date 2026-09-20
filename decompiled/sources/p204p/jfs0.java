package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final long f111964a;

    /* JADX INFO: renamed from: b */
    public final boolean f111965b;

    public jfs0(long j, boolean z) {
        this.f111964a = j;
        this.f111965b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfs0)) {
            return false;
        }
        jfs0 jfs0Var = (jfs0) obj;
        return this.f111964a == jfs0Var.f111964a && this.f111965b == jfs0Var.f111965b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111965b) + (Long.hashCode(this.f111964a) * 31);
    }
}
