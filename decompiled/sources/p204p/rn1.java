package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rn1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final x93 f200691a;

    /* JADX INFO: renamed from: b */
    public final String f200692b;

    /* JADX INFO: renamed from: c */
    public final d850 f200693c;

    public rn1(x93 x93Var, String str, d850 d850Var) {
        this.f200691a = x93Var;
        this.f200692b = str;
        this.f200693c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn1)) {
            return false;
        }
        rn1 rn1Var = (rn1) obj;
        return this.f200691a == rn1Var.f200691a && wj50.m88271j(this.f200692b, rn1Var.f200692b) && wj50.m88271j(this.f200693c, rn1Var.f200693c);
    }

    public final int hashCode() {
        int iHashCode = this.f200691a.hashCode() * 31;
        String str = this.f200692b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d850 d850Var = this.f200693c;
        return iHashCode2 + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
