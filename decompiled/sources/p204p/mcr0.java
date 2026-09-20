package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mcr0 implements qcr0 {

    /* JADX INFO: renamed from: a */
    public final long f142237a;

    /* JADX INFO: renamed from: b */
    public final long f142238b;

    public mcr0(long j, long j2) {
        this.f142237a = j;
        this.f142238b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcr0)) {
            return false;
        }
        mcr0 mcr0Var = (mcr0) obj;
        return this.f142237a == mcr0Var.f142237a && this.f142238b == mcr0Var.f142238b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f142238b) + (Long.hashCode(this.f142237a) * 31);
    }
}
