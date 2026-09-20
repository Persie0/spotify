package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sl70 {

    /* JADX INFO: renamed from: a */
    public final String f210312a;

    /* JADX INFO: renamed from: b */
    public final v140 f210313b;

    /* JADX INFO: renamed from: c */
    public final erc1 f210314c;

    public sl70(String str, v140 v140Var, erc1 erc1Var) {
        this.f210312a = str;
        this.f210313b = v140Var;
        this.f210314c = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl70)) {
            return false;
        }
        sl70 sl70Var = (sl70) obj;
        return wj50.m88271j(this.f210312a, sl70Var.f210312a) && wj50.m88271j(this.f210313b, sl70Var.f210313b) && wj50.m88271j(this.f210314c, sl70Var.f210314c);
    }

    public final int hashCode() {
        int iHashCode = this.f210312a.hashCode() * 31;
        v140 v140Var = this.f210313b;
        int iHashCode2 = (iHashCode + (v140Var == null ? 0 : v140Var.hashCode())) * 31;
        erc1 erc1Var = this.f210314c;
        return iHashCode2 + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
