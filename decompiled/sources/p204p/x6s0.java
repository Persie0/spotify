package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x6s0 implements y6s0 {

    /* JADX INFO: renamed from: a */
    public final boolean f258745a;

    /* JADX INFO: renamed from: b */
    public final long f258746b;

    public x6s0(boolean z, long j) {
        this.f258745a = z;
        this.f258746b = j;
    }

    @Override // p204p.y6s0
    /* JADX INFO: renamed from: e */
    public final long mo87306e() {
        return this.f258746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6s0)) {
            return false;
        }
        x6s0 x6s0Var = (x6s0) obj;
        return this.f258745a == x6s0Var.f258745a && this.f258746b == x6s0Var.f258746b;
    }

    @Override // p204p.y6s0
    /* JADX INFO: renamed from: f */
    public final boolean mo87307f() {
        return this.f258745a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f258746b) + (Boolean.hashCode(this.f258745a) * 31);
    }
}
