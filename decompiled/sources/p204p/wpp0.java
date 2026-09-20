package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wpp0 {

    /* JADX INFO: renamed from: a */
    public final eoz0 f253805a;

    /* JADX INFO: renamed from: b */
    public final erc1 f253806b;

    public wpp0(eoz0 eoz0Var, erc1 erc1Var) {
        this.f253805a = eoz0Var;
        this.f253806b = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpp0)) {
            return false;
        }
        wpp0 wpp0Var = (wpp0) obj;
        return wj50.m88271j(this.f253805a, wpp0Var.f253805a) && wj50.m88271j(this.f253806b, wpp0Var.f253806b);
    }

    public final int hashCode() {
        eoz0 eoz0Var = this.f253805a;
        int iHashCode = (eoz0Var == null ? 0 : Boolean.hashCode(eoz0Var.f61519a)) * 31;
        erc1 erc1Var = this.f253806b;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
