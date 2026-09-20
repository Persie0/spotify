package p204p;

/* JADX INFO: renamed from: p.dx */
/* JADX INFO: loaded from: classes9.dex */
public final class C1793dx {

    /* JADX INFO: renamed from: a */
    public final int f53811a;

    /* JADX INFO: renamed from: b */
    public final boolean f53812b;

    public C1793dx(int i, boolean z) {
        this.f53811a = i;
        this.f53812b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1793dx)) {
            return false;
        }
        C1793dx c1793dx = (C1793dx) obj;
        return this.f53811a == c1793dx.f53811a && this.f53812b == c1793dx.f53812b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53812b) + (edb.m38547C(this.f53811a) * 31);
    }
}
