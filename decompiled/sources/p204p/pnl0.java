package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pnl0 {

    /* JADX INFO: renamed from: a */
    public final long f179433a;

    /* JADX INFO: renamed from: b */
    public final boolean f179434b;

    public pnl0(long j, boolean z) {
        this.f179433a = j;
        this.f179434b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnl0)) {
            return false;
        }
        pnl0 pnl0Var = (pnl0) obj;
        return this.f179433a == pnl0Var.f179433a && this.f179434b == pnl0Var.f179434b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179434b) + (Long.hashCode(this.f179433a) * 31);
    }
}
