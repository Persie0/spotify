package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final p68 f40009a;

    /* JADX INFO: renamed from: b */
    public final p68 f40010b;

    public cnf0(p68 p68Var, p68 p68Var2) {
        this.f40009a = p68Var;
        this.f40010b = p68Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnf0)) {
            return false;
        }
        cnf0 cnf0Var = (cnf0) obj;
        return wj50.m88271j(this.f40009a, cnf0Var.f40009a) && wj50.m88271j(this.f40010b, cnf0Var.f40010b);
    }

    public final int hashCode() {
        p68 p68Var = this.f40009a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f40010b;
        return iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0);
    }

    public final String toString() {
        p68 p68Var = this.f40009a;
        String strM69190c = p68Var != null ? p68Var.m69190c() : null;
        p68 p68Var2 = this.f40010b;
        return dq60.m36615o("OnApplyCustomVolumeCurves(out=", strM69190c, ", in=", p68Var2 != null ? p68Var2.m69190c() : null, ")");
    }
}
