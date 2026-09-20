package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final long f276642a;

    /* JADX INFO: renamed from: b */
    public final boolean f276643b;

    public yvc0(long j, boolean z) {
        this.f276642a = j;
        this.f276643b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvc0)) {
            return false;
        }
        yvc0 yvc0Var = (yvc0) obj;
        return this.f276642a == yvc0Var.f276642a && this.f276643b == yvc0Var.f276643b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276643b) + (Long.hashCode(this.f276642a) * 31);
    }
}
