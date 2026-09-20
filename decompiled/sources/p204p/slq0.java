package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class slq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f210464b;

    /* JADX INFO: renamed from: c */
    public final String f210465c;

    /* JADX INFO: renamed from: d */
    public final String f210466d;

    /* JADX INFO: renamed from: e */
    public final String f210467e;

    /* JADX INFO: renamed from: f */
    public final String f210468f;

    /* JADX INFO: renamed from: g */
    public final String f210469g;

    /* JADX INFO: renamed from: h */
    public final String f210470h;

    /* JADX INFO: renamed from: i */
    public final jsa0 f210471i;

    public slq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, jsa0 jsa0Var) {
        super(9);
        this.f210464b = str;
        this.f210465c = str2;
        this.f210466d = str3;
        this.f210467e = str4;
        this.f210468f = str5;
        this.f210469g = str6;
        this.f210470h = str7;
        this.f210471i = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slq0)) {
            return false;
        }
        slq0 slq0Var = (slq0) obj;
        return wj50.m88271j(this.f210464b, slq0Var.f210464b) && wj50.m88271j(this.f210465c, slq0Var.f210465c) && wj50.m88271j(this.f210466d, slq0Var.f210466d) && wj50.m88271j(this.f210467e, slq0Var.f210467e) && wj50.m88271j(this.f210468f, slq0Var.f210468f) && wj50.m88271j(this.f210469g, slq0Var.f210469g) && wj50.m88271j(this.f210470h, slq0Var.f210470h) && wj50.m88271j(this.f210471i, slq0Var.f210471i);
    }

    public final int hashCode() {
        String str = this.f210464b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f210465c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f210466d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f210467e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f210468f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f210469g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f210470h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        jsa0 jsa0Var = this.f210471i;
        return iHashCode7 + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
