package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z951 {

    /* JADX INFO: renamed from: a */
    public final String f280667a;

    /* JADX INFO: renamed from: b */
    public final String f280668b;

    /* JADX INFO: renamed from: c */
    public final ae50 f280669c;

    public z951(String str, String str2, ae50 ae50Var) {
        this.f280667a = str;
        this.f280668b = str2;
        this.f280669c = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z951)) {
            return false;
        }
        z951 z951Var = (z951) obj;
        return this.f280667a.equals(z951Var.f280667a) && wj50.m88271j(this.f280668b, z951Var.f280668b) && this.f280669c.equals(z951Var.f280669c);
    }

    public final int hashCode() {
        int iHashCode = this.f280667a.hashCode() * 31;
        String str = this.f280668b;
        return this.f280669c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
