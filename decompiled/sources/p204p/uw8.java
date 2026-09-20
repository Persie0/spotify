package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uw8 {

    /* JADX INFO: renamed from: a */
    public final float f234600a;

    /* JADX INFO: renamed from: b */
    public final long f234601b;

    public uw8(long j, float f) {
        this.f234600a = f;
        this.f234601b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw8)) {
            return false;
        }
        uw8 uw8Var = (uw8) obj;
        if (Float.compare(this.f234600a, uw8Var.f234600a) != 0) {
            return false;
        }
        long j = uw8Var.f234601b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f234601b, j);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f234600a) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f234601b) + iHashCode;
    }
}
