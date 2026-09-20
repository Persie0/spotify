package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class anf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final p68 f17433a;

    /* JADX INFO: renamed from: b */
    public final p68 f17434b;

    public anf0(p68 p68Var, p68 p68Var2) {
        this.f17433a = p68Var;
        this.f17434b = p68Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anf0)) {
            return false;
        }
        anf0 anf0Var = (anf0) obj;
        return wj50.m88271j(this.f17433a, anf0Var.f17433a) && wj50.m88271j(this.f17434b, anf0Var.f17434b);
    }

    public final int hashCode() {
        p68 p68Var = this.f17433a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f17434b;
        return iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0);
    }

    public final String toString() {
        p68 p68Var = this.f17433a;
        String strM69190c = p68Var != null ? p68Var.m69190c() : null;
        p68 p68Var2 = this.f17434b;
        return dq60.m36615o("OnApplyCustomFilterCurves(out=", strM69190c, ", in=", p68Var2 != null ? p68Var2.m69190c() : null, ")");
    }
}
