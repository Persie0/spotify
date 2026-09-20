package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g4g0 implements q4g0 {

    /* JADX INFO: renamed from: a */
    public final p68 f76414a;

    /* JADX INFO: renamed from: b */
    public final p68 f76415b;

    /* JADX INFO: renamed from: c */
    public final int f76416c;

    public g4g0(p68 p68Var, p68 p68Var2, int i) {
        this.f76414a = p68Var;
        this.f76415b = p68Var2;
        this.f76416c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4g0)) {
            return false;
        }
        g4g0 g4g0Var = (g4g0) obj;
        return wj50.m88271j(this.f76414a, g4g0Var.f76414a) && wj50.m88271j(this.f76415b, g4g0Var.f76415b) && this.f76416c == g4g0Var.f76416c;
    }

    public final int hashCode() {
        p68 p68Var = this.f76414a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f76415b;
        return Integer.hashCode(this.f76416c) + ((iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0)) * 31);
    }
}
