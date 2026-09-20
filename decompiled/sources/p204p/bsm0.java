package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bsm0 {

    /* JADX INFO: renamed from: a */
    public final float f30356a;

    /* JADX INFO: renamed from: b */
    public final long f30357b;

    public bsm0() {
        this(n6f.f150870j, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsm0)) {
            return false;
        }
        bsm0 bsm0Var = (bsm0) obj;
        if (!ybs.m93301b(this.f30356a, bsm0Var.f30356a)) {
            return false;
        }
        long j = bsm0Var.f30357b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f30357b, j);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f30356a) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f30357b) + iHashCode;
    }

    public bsm0(long j, float f) {
        this.f30356a = f;
        this.f30357b = j;
    }
}
