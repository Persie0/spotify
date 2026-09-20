package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ojt extends smt {

    /* JADX INFO: renamed from: a */
    public final String f166130a;

    /* JADX INFO: renamed from: b */
    public final d850 f166131b;

    public ojt(String str, d850 d850Var) {
        this.f166130a = str;
        this.f166131b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojt)) {
            return false;
        }
        ojt ojtVar = (ojt) obj;
        return wj50.m88271j(this.f166130a, ojtVar.f166130a) && wj50.m88271j(this.f166131b, ojtVar.f166131b);
    }

    public final int hashCode() {
        int iHashCode = this.f166130a.hashCode() * 31;
        d850 d850Var = this.f166131b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
