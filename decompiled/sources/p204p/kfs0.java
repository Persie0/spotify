package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final long f122221a;

    /* JADX INFO: renamed from: b */
    public final boolean f122222b;

    public kfs0(long j, boolean z) {
        this.f122221a = j;
        this.f122222b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfs0)) {
            return false;
        }
        kfs0 kfs0Var = (kfs0) obj;
        return this.f122221a == kfs0Var.f122221a && this.f122222b == kfs0Var.f122222b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122222b) + (Long.hashCode(this.f122221a) * 31);
    }
}
