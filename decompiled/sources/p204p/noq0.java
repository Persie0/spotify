package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class noq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f156780b;

    /* JADX INFO: renamed from: c */
    public final String f156781c;

    /* JADX INFO: renamed from: d */
    public final String f156782d;

    /* JADX INFO: renamed from: e */
    public final String f156783e;

    /* JADX INFO: renamed from: f */
    public final jsa0 f156784f;

    public noq0(String str, String str2, String str3, String str4, jsa0 jsa0Var) {
        super(2);
        this.f156780b = str;
        this.f156781c = str2;
        this.f156782d = str3;
        this.f156783e = str4;
        this.f156784f = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noq0)) {
            return false;
        }
        noq0 noq0Var = (noq0) obj;
        return wj50.m88271j(this.f156780b, noq0Var.f156780b) && wj50.m88271j(this.f156781c, noq0Var.f156781c) && wj50.m88271j(this.f156782d, noq0Var.f156782d) && wj50.m88271j(this.f156783e, noq0Var.f156783e) && wj50.m88271j(this.f156784f, noq0Var.f156784f);
    }

    public final int hashCode() {
        String str = this.f156780b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f156781c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156782d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f156783e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        jsa0 jsa0Var = this.f156784f;
        return iHashCode4 + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
