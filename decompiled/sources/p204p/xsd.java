package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xsd implements atd {

    /* JADX INFO: renamed from: a */
    public final String f265564a;

    /* JADX INFO: renamed from: b */
    public final d850 f265565b;

    public xsd(String str, d850 d850Var) {
        this.f265564a = str;
        this.f265565b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsd)) {
            return false;
        }
        xsd xsdVar = (xsd) obj;
        return wj50.m88271j(this.f265564a, xsdVar.f265564a) && wj50.m88271j(this.f265565b, xsdVar.f265565b);
    }

    public final int hashCode() {
        int iHashCode = this.f265564a.hashCode() * 31;
        d850 d850Var = this.f265565b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
