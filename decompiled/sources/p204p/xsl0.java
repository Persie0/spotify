package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xsl0 extends ktl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f265624a;

    /* JADX INFO: renamed from: b */
    public final fyj f265625b;

    /* JADX INFO: renamed from: c */
    public final String f265626c;

    public xsl0(zo20 zo20Var, fyj fyjVar, String str) {
        this.f265624a = zo20Var;
        this.f265625b = fyjVar;
        this.f265626c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsl0)) {
            return false;
        }
        xsl0 xsl0Var = (xsl0) obj;
        return wj50.m88271j(this.f265624a, xsl0Var.f265624a) && wj50.m88271j(this.f265625b, xsl0Var.f265625b) && wj50.m88271j(this.f265626c, xsl0Var.f265626c);
    }

    public final int hashCode() {
        return this.f265626c.hashCode() + ((this.f265625b.hashCode() + (this.f265624a.hashCode() * 31)) * 31);
    }
}
