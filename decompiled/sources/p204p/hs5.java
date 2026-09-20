package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hs5 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f94607a;

    /* JADX INFO: renamed from: b */
    public final long f94608b;

    public hs5(AbstractC2524w8 abstractC2524w8, long j) {
        this.f94607a = abstractC2524w8;
        this.f94608b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs5)) {
            return false;
        }
        hs5 hs5Var = (hs5) obj;
        if (!this.f94607a.equals(hs5Var.f94607a)) {
            return false;
        }
        long j = hs5Var.f94608b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f94608b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f94607a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f94608b) + iHashCode;
    }
}
