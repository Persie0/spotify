package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xz20 {

    /* JADX INFO: renamed from: a */
    public final long f267511a;

    /* JADX INFO: renamed from: b */
    public final llf0 f267512b;

    public xz20(long j, llf0 llf0Var) {
        this.f267511a = j;
        this.f267512b = llf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz20)) {
            return false;
        }
        xz20 xz20Var = (xz20) obj;
        return this.f267511a == xz20Var.f267511a && wj50.m88271j(this.f267512b, xz20Var.f267512b);
    }

    public final int hashCode() {
        return this.f267512b.hashCode() + (Long.hashCode(this.f267511a) * 31);
    }
}
