package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f13016a;

    /* JADX INFO: renamed from: b */
    public final d850 f13017b;

    public a7b1(String str, d850 d850Var) {
        this.f13016a = str;
        this.f13017b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7b1)) {
            return false;
        }
        a7b1 a7b1Var = (a7b1) obj;
        return wj50.m88271j(this.f13016a, a7b1Var.f13016a) && wj50.m88271j(this.f13017b, a7b1Var.f13017b);
    }

    public final int hashCode() {
        int iHashCode = this.f13016a.hashCode() * 31;
        d850 d850Var = this.f13017b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
