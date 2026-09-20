package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nq10 {

    /* JADX INFO: renamed from: a */
    public final long f157102a;

    /* JADX INFO: renamed from: b */
    public final float f157103b;

    public nq10(long j, float f) {
        this.f157102a = j;
        this.f157103b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq10)) {
            return false;
        }
        nq10 nq10Var = (nq10) obj;
        long j = nq10Var.f157102a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f157102a, j) && Float.compare(this.f157103b, nq10Var.f157103b) == 0;
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Float.hashCode(this.f157103b) + (Long.hashCode(this.f157102a) * 31);
    }
}
