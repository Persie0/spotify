package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final mk00 f28819a;

    /* JADX INFO: renamed from: b */
    public final mk00 f28820b;

    public bnf0(mk00 mk00Var, mk00 mk00Var2) {
        this.f28819a = mk00Var;
        this.f28820b = mk00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnf0)) {
            return false;
        }
        bnf0 bnf0Var = (bnf0) obj;
        return wj50.m88271j(this.f28819a, bnf0Var.f28819a) && wj50.m88271j(this.f28820b, bnf0Var.f28820b);
    }

    public final int hashCode() {
        mk00 mk00Var = this.f28819a;
        int iHashCode = (mk00Var == null ? 0 : mk00Var.hashCode()) * 31;
        mk00 mk00Var2 = this.f28820b;
        return iHashCode + (mk00Var2 != null ? mk00Var2.hashCode() : 0);
    }

    public final String toString() {
        mk00 mk00Var = this.f28819a;
        String strM62062g = mk00Var != null ? mk00Var.m62062g() : null;
        mk00 mk00Var2 = this.f28820b;
        return dq60.m36615o("OnApplyCustomFxCurves(out=", strM62062g, ", in=", mk00Var2 != null ? mk00Var2.m62062g() : null, ")");
    }
}
