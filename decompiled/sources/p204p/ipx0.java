package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ipx0 {

    /* JADX INFO: renamed from: a */
    public final String f104579a;

    /* JADX INFO: renamed from: b */
    public final bv41 f104580b;

    /* JADX INFO: renamed from: c */
    public final eoz0 f104581c;

    public ipx0(String str, bv41 bv41Var, eoz0 eoz0Var) {
        this.f104579a = str;
        this.f104580b = bv41Var;
        this.f104581c = eoz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipx0)) {
            return false;
        }
        ipx0 ipx0Var = (ipx0) obj;
        return wj50.m88271j(this.f104579a, ipx0Var.f104579a) && this.f104580b == ipx0Var.f104580b && wj50.m88271j(this.f104581c, ipx0Var.f104581c);
    }

    public final int hashCode() {
        String str = this.f104579a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        bv41 bv41Var = this.f104580b;
        int iHashCode2 = (iHashCode + (bv41Var == null ? 0 : bv41Var.hashCode())) * 31;
        eoz0 eoz0Var = this.f104581c;
        return iHashCode2 + (eoz0Var != null ? Boolean.hashCode(eoz0Var.f61519a) : 0);
    }
}
