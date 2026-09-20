package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kn1 implements mn1 {

    /* JADX INFO: renamed from: a */
    public final String f124256a;

    /* JADX INFO: renamed from: b */
    public final d850 f124257b;

    public kn1(String str, d850 d850Var) {
        this.f124256a = str;
        this.f124257b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn1)) {
            return false;
        }
        kn1 kn1Var = (kn1) obj;
        return wj50.m88271j(this.f124256a, kn1Var.f124256a) && wj50.m88271j(this.f124257b, kn1Var.f124257b);
    }

    public final int hashCode() {
        String str = this.f124256a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d850 d850Var = this.f124257b;
        return iHashCode + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
