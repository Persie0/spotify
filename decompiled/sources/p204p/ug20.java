package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ug20 {

    /* JADX INFO: renamed from: a */
    public final a7f0 f229953a;

    /* JADX INFO: renamed from: b */
    public final a7f0 f229954b;

    public ug20(a7f0 a7f0Var, a7f0 a7f0Var2) {
        this.f229953a = a7f0Var;
        this.f229954b = a7f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug20)) {
            return false;
        }
        ug20 ug20Var = (ug20) obj;
        return wj50.m88271j(this.f229953a, ug20Var.f229953a) && wj50.m88271j(this.f229954b, ug20Var.f229954b);
    }

    public final int hashCode() {
        a7f0 a7f0Var = this.f229953a;
        int iHashCode = (a7f0Var == null ? 0 : a7f0Var.hashCode()) * 31;
        a7f0 a7f0Var2 = this.f229954b;
        return iHashCode + (a7f0Var2 != null ? a7f0Var2.hashCode() : 0);
    }
}
