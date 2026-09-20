package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f77238a;

    /* JADX INFO: renamed from: b */
    public final d850 f77239b;

    public g7b1(String str, d850 d850Var) {
        this.f77238a = str;
        this.f77239b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7b1)) {
            return false;
        }
        g7b1 g7b1Var = (g7b1) obj;
        return wj50.m88271j(this.f77238a, g7b1Var.f77238a) && wj50.m88271j(this.f77239b, g7b1Var.f77239b);
    }

    public final int hashCode() {
        int iHashCode = this.f77238a.hashCode() * 31;
        d850 d850Var = this.f77239b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
