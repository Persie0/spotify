package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aw20 {

    /* JADX INFO: renamed from: a */
    public final long f20354a;

    /* JADX INFO: renamed from: b */
    public final b450 f20355b;

    public aw20(long j, b450 b450Var) {
        this.f20354a = j;
        this.f20355b = b450Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw20)) {
            return false;
        }
        aw20 aw20Var = (aw20) obj;
        long j = aw20Var.f20354a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f20354a, j) && this.f20355b.equals(aw20Var.f20355b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return this.f20355b.hashCode() + (Long.hashCode(this.f20354a) * 31);
    }
}
