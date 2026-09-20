package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class slp0 {

    /* JADX INFO: renamed from: a */
    public final rlp0 f210457a;

    /* JADX INFO: renamed from: b */
    public final String f210458b;

    /* JADX INFO: renamed from: c */
    public final qla1 f210459c;

    /* JADX INFO: renamed from: d */
    public final String f210460d;

    /* JADX INFO: renamed from: e */
    public final String f210461e;

    /* JADX INFO: renamed from: f */
    public final String f210462f;

    public slp0(rlp0 rlp0Var, String str, qla1 qla1Var, String str2, String str3, String str4) {
        this.f210457a = rlp0Var;
        this.f210458b = str;
        this.f210459c = qla1Var;
        this.f210460d = str2;
        this.f210461e = str3;
        this.f210462f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slp0)) {
            return false;
        }
        slp0 slp0Var = (slp0) obj;
        return wj50.m88271j(this.f210457a, slp0Var.f210457a) && wj50.m88271j(this.f210458b, slp0Var.f210458b) && wj50.m88271j(this.f210459c, slp0Var.f210459c) && wj50.m88271j(this.f210460d, slp0Var.f210460d) && wj50.m88271j(this.f210461e, slp0Var.f210461e) && wj50.m88271j(this.f210462f, slp0Var.f210462f);
    }

    public final int hashCode() {
        rlp0 rlp0Var = this.f210457a;
        int iHashCode = (rlp0Var == null ? 0 : rlp0Var.hashCode()) * 31;
        String str = this.f210458b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        qla1 qla1Var = this.f210459c;
        int iHashCode3 = (iHashCode2 + (qla1Var == null ? 0 : qla1Var.hashCode())) * 31;
        String str2 = this.f210460d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f210461e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f210462f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
