package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g33 {

    /* JADX INFO: renamed from: a */
    public final w33 f76080a;

    /* JADX INFO: renamed from: b */
    public final mna0 f76081b;

    public g33(w33 w33Var, mna0 mna0Var) {
        this.f76080a = w33Var;
        this.f76081b = mna0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g33)) {
            return false;
        }
        g33 g33Var = (g33) obj;
        return wj50.m88271j(this.f76080a, g33Var.f76080a) && wj50.m88271j(this.f76081b, g33Var.f76081b);
    }

    public final int hashCode() {
        int iHashCode = this.f76080a.hashCode() * 31;
        mna0 mna0Var = this.f76081b;
        return iHashCode + (mna0Var == null ? 0 : mna0Var.hashCode());
    }
}
