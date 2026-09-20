package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final p68 f108696a;

    /* JADX INFO: renamed from: b */
    public final p68 f108697b;

    /* JADX INFO: renamed from: c */
    public final int f108698c;

    public j4g0(p68 p68Var, p68 p68Var2, int i) {
        this.f108696a = p68Var;
        this.f108697b = p68Var2;
        this.f108698c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4g0)) {
            return false;
        }
        j4g0 j4g0Var = (j4g0) obj;
        return wj50.m88271j(this.f108696a, j4g0Var.f108696a) && wj50.m88271j(this.f108697b, j4g0Var.f108697b) && this.f108698c == j4g0Var.f108698c;
    }

    public final int hashCode() {
        p68 p68Var = this.f108696a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f108697b;
        return Integer.hashCode(this.f108698c) + ((iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0)) * 31);
    }
}
