package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l16 {

    /* JADX INFO: renamed from: a */
    public final String f128631a;

    /* JADX INFO: renamed from: b */
    public final String f128632b;

    /* JADX INFO: renamed from: c */
    public final String f128633c;

    /* JADX INFO: renamed from: d */
    public final String f128634d;

    /* JADX INFO: renamed from: e */
    public final String f128635e;

    /* JADX INFO: renamed from: f */
    public final int f128636f;

    /* JADX INFO: renamed from: g */
    public final String f128637g;

    /* JADX INFO: renamed from: h */
    public final String f128638h;

    /* JADX INFO: renamed from: i */
    public final boolean f128639i;

    public l16(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, boolean z, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 32) != 0 ? -1 : i;
        str6 = (i2 & 64) != 0 ? null : str6;
        this.f128631a = str;
        this.f128632b = str2;
        this.f128633c = str3;
        this.f128634d = str4;
        this.f128635e = str5;
        this.f128636f = i;
        this.f128637g = str6;
        this.f128638h = str7;
        this.f128639i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l16)) {
            return false;
        }
        l16 l16Var = (l16) obj;
        return wj50.m88271j(this.f128631a, l16Var.f128631a) && wj50.m88271j(this.f128632b, l16Var.f128632b) && wj50.m88271j(this.f128633c, l16Var.f128633c) && wj50.m88271j(this.f128634d, l16Var.f128634d) && wj50.m88271j(this.f128635e, l16Var.f128635e) && this.f128636f == l16Var.f128636f && wj50.m88271j(this.f128637g, l16Var.f128637g) && wj50.m88271j(this.f128638h, l16Var.f128638h) && this.f128639i == l16Var.f128639i;
    }

    public final int hashCode() {
        String str = this.f128631a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f128632b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128633c;
        int iM62800g = mt60.m62800g(this.f128636f, s571.m77243b(s571.m77243b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f128634d), 31, this.f128635e), 31);
        String str4 = this.f128637g;
        int iHashCode3 = (iM62800g + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f128638h;
        return Boolean.hashCode(this.f128639i) + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
