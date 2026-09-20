package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h2n0 implements i2n0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f87034a;

    /* JADX INFO: renamed from: b */
    public final int f87035b;

    public h2n0(int i, qf40 qf40Var) {
        this.f87034a = qf40Var;
        this.f87035b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2n0)) {
            return false;
        }
        h2n0 h2n0Var = (h2n0) obj;
        return wj50.m88271j(this.f87034a, h2n0Var.f87034a) && this.f87035b == h2n0Var.f87035b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f87035b) + (this.f87034a.hashCode() * 31);
    }
}
