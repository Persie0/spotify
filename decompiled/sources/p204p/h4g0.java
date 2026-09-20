package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final p68 f87529a;

    /* JADX INFO: renamed from: b */
    public final p68 f87530b;

    /* JADX INFO: renamed from: c */
    public final int f87531c;

    public h4g0(p68 p68Var, p68 p68Var2, int i) {
        this.f87529a = p68Var;
        this.f87530b = p68Var2;
        this.f87531c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4g0)) {
            return false;
        }
        h4g0 h4g0Var = (h4g0) obj;
        return wj50.m88271j(this.f87529a, h4g0Var.f87529a) && wj50.m88271j(this.f87530b, h4g0Var.f87530b) && this.f87531c == h4g0Var.f87531c;
    }

    public final int hashCode() {
        p68 p68Var = this.f87529a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f87530b;
        return Integer.hashCode(this.f87531c) + ((iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0)) * 31);
    }
}
