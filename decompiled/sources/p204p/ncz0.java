package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ncz0 {

    /* JADX INFO: renamed from: a */
    public final long f152617a;

    /* JADX INFO: renamed from: b */
    public final lxe f152618b;

    public ncz0(long j, lxe lxeVar) {
        this.f152617a = j;
        this.f152618b = lxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncz0)) {
            return false;
        }
        ncz0 ncz0Var = (ncz0) obj;
        return this.f152617a == ncz0Var.f152617a && this.f152618b.equals(ncz0Var.f152618b);
    }

    public final int hashCode() {
        return this.f152618b.hashCode() + (Long.hashCode(this.f152617a) * 31);
    }
}
