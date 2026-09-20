package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nit {

    /* JADX INFO: renamed from: a */
    public final String f154343a;

    /* JADX INFO: renamed from: b */
    public final String f154344b;

    /* JADX INFO: renamed from: c */
    public final d850 f154345c;

    public nit(String str, String str2, d850 d850Var) {
        this.f154343a = str;
        this.f154344b = str2;
        this.f154345c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nit)) {
            return false;
        }
        nit nitVar = (nit) obj;
        return wj50.m88271j(this.f154343a, nitVar.f154343a) && wj50.m88271j(this.f154344b, nitVar.f154344b) && wj50.m88271j(this.f154345c, nitVar.f154345c);
    }

    public final int hashCode() {
        int iHashCode = this.f154343a.hashCode() * 31;
        String str = this.f154344b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d850 d850Var = this.f154345c;
        return iHashCode2 + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
