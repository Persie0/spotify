package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cuu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42220a;

    /* JADX INFO: renamed from: b */
    public final rru0 f42221b;

    /* JADX INFO: renamed from: c */
    public final osu0 f42222c;

    /* JADX INFO: renamed from: d */
    public final int f42223d;

    public cuu0(boolean z, rru0 rru0Var, osu0 osu0Var, int i) {
        this.f42220a = z;
        this.f42221b = rru0Var;
        this.f42222c = osu0Var;
        this.f42223d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuu0)) {
            return false;
        }
        cuu0 cuu0Var = (cuu0) obj;
        return this.f42220a == cuu0Var.f42220a && this.f42221b == cuu0Var.f42221b && this.f42222c == cuu0Var.f42222c && this.f42223d == cuu0Var.f42223d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42223d) + ((this.f42222c.hashCode() + ((this.f42221b.hashCode() + (Boolean.hashCode(this.f42220a) * 31)) * 31)) * 31);
    }
}
