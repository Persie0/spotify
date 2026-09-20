package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y5v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f269553a;

    /* JADX INFO: renamed from: b */
    public final d850 f269554b;

    public y5v0(String str, d850 d850Var) {
        this.f269553a = str;
        this.f269554b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5v0)) {
            return false;
        }
        y5v0 y5v0Var = (y5v0) obj;
        return wj50.m88271j(this.f269553a, y5v0Var.f269553a) && wj50.m88271j(this.f269554b, y5v0Var.f269554b);
    }

    public final int hashCode() {
        int iHashCode = this.f269553a.hashCode() * 31;
        d850 d850Var = this.f269554b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
