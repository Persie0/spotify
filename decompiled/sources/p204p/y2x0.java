package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y2x0 {

    /* JADX INFO: renamed from: a */
    public final dks f268687a;

    /* JADX INFO: renamed from: b */
    public final x2x0 f268688b;

    public y2x0(dks dksVar, x2x0 x2x0Var) {
        this.f268687a = dksVar;
        this.f268688b = x2x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2x0)) {
            return false;
        }
        y2x0 y2x0Var = (y2x0) obj;
        return wj50.m88271j(this.f268687a, y2x0Var.f268687a) && wj50.m88271j(this.f268688b, y2x0Var.f268688b);
    }

    public final int hashCode() {
        int iHashCode = this.f268687a.hashCode() * 31;
        x2x0 x2x0Var = this.f268688b;
        return iHashCode + (x2x0Var == null ? 0 : x2x0Var.hashCode());
    }
}
