package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bsf0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f30306a;

    /* JADX INFO: renamed from: b */
    public final String f30307b;

    /* JADX INFO: renamed from: c */
    public final String f30308c;

    public bsf0(String str, String str2, hz80 hz80Var) {
        this.f30306a = hz80Var;
        this.f30307b = str;
        this.f30308c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsf0)) {
            return false;
        }
        bsf0 bsf0Var = (bsf0) obj;
        return wj50.m88271j(this.f30306a, bsf0Var.f30306a) && wj50.m88271j(this.f30307b, bsf0Var.f30307b) && wj50.m88271j(this.f30308c, bsf0Var.f30308c);
    }

    public final int hashCode() {
        int iHashCode = this.f30306a.hashCode() * 31;
        String str = this.f30307b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30308c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
