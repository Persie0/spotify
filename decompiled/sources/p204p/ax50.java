package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ax50 {

    /* JADX INFO: renamed from: a */
    public final int f20768a;

    /* JADX INFO: renamed from: b */
    public final yw50 f20769b;

    public ax50(int i, yw50 yw50Var) {
        this.f20768a = i;
        this.f20769b = yw50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax50)) {
            return false;
        }
        ax50 ax50Var = (ax50) obj;
        return this.f20768a == ax50Var.f20768a && this.f20769b.equals(ax50Var.f20769b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20769b.f276867a) + (edb.m38547C(this.f20768a) * 31);
    }
}
