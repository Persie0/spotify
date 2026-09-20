package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zmf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final p68 f284270a;

    /* JADX INFO: renamed from: b */
    public final p68 f284271b;

    public zmf0(p68 p68Var, p68 p68Var2) {
        this.f284270a = p68Var;
        this.f284271b = p68Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmf0)) {
            return false;
        }
        zmf0 zmf0Var = (zmf0) obj;
        return wj50.m88271j(this.f284270a, zmf0Var.f284270a) && wj50.m88271j(this.f284271b, zmf0Var.f284271b);
    }

    public final int hashCode() {
        p68 p68Var = this.f284270a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f284271b;
        return iHashCode + (p68Var2 != null ? p68Var2.hashCode() : 0);
    }

    public final String toString() {
        p68 p68Var = this.f284270a;
        String strM69190c = p68Var != null ? p68Var.m69190c() : null;
        p68 p68Var2 = this.f284271b;
        return dq60.m36615o("OnApplyCustomEqCurves(out=", strM69190c, ", in=", p68Var2 != null ? p68Var2.m69190c() : null, ")");
    }
}
