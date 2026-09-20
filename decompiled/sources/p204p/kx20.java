package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kx20 {

    /* JADX INFO: renamed from: a */
    public final String f127313a;

    /* JADX INFO: renamed from: b */
    public final String f127314b;

    /* JADX INFO: renamed from: c */
    public final String f127315c;

    /* JADX INFO: renamed from: d */
    public final String f127316d;

    /* JADX INFO: renamed from: e */
    public final String f127317e;

    /* JADX INFO: renamed from: f */
    public final String f127318f;

    /* JADX INFO: renamed from: g */
    public final ix20 f127319g;

    public kx20(String str, String str2, String str3, String str4, String str5, String str6, ix20 ix20Var) {
        this.f127313a = str;
        this.f127314b = str2;
        this.f127315c = str3;
        this.f127316d = str4;
        this.f127317e = str5;
        this.f127318f = str6;
        this.f127319g = ix20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx20)) {
            return false;
        }
        kx20 kx20Var = (kx20) obj;
        return wj50.m88271j(this.f127313a, kx20Var.f127313a) && wj50.m88271j(this.f127314b, kx20Var.f127314b) && wj50.m88271j(this.f127315c, kx20Var.f127315c) && wj50.m88271j(this.f127316d, kx20Var.f127316d) && wj50.m88271j(this.f127317e, kx20Var.f127317e) && wj50.m88271j(this.f127318f, kx20Var.f127318f) && wj50.m88271j(this.f127319g, kx20Var.f127319g);
    }

    public final int hashCode() {
        String str = this.f127313a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f127314b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f127315c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f127316d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f127317e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f127318f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ix20 ix20Var = this.f127319g;
        return iHashCode6 + (ix20Var != null ? ix20Var.hashCode() : 0);
    }
}
