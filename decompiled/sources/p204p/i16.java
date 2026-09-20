package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i16 {

    /* JADX INFO: renamed from: a */
    public final String f97408a;

    /* JADX INFO: renamed from: b */
    public final String f97409b;

    /* JADX INFO: renamed from: c */
    public final String f97410c;

    /* JADX INFO: renamed from: d */
    public final String f97411d;

    /* JADX INFO: renamed from: e */
    public final String f97412e;

    /* JADX INFO: renamed from: f */
    public final String f97413f;

    /* JADX INFO: renamed from: g */
    public final int f97414g;

    /* JADX INFO: renamed from: h */
    public final String f97415h;

    /* JADX INFO: renamed from: i */
    public final String f97416i;

    /* JADX INFO: renamed from: j */
    public final boolean f97417j;

    /* JADX INFO: renamed from: k */
    public final boolean f97418k;

    public i16(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, boolean z2, int i2) {
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        i = (i2 & 64) != 0 ? -1 : i;
        str7 = (i2 & 128) != 0 ? null : str7;
        this.f97408a = str;
        this.f97409b = str2;
        this.f97410c = str3;
        this.f97411d = str4;
        this.f97412e = str5;
        this.f97413f = str6;
        this.f97414g = i;
        this.f97415h = str7;
        this.f97416i = str8;
        this.f97417j = z;
        this.f97418k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i16)) {
            return false;
        }
        i16 i16Var = (i16) obj;
        return wj50.m88271j(this.f97408a, i16Var.f97408a) && wj50.m88271j(this.f97409b, i16Var.f97409b) && wj50.m88271j(this.f97410c, i16Var.f97410c) && wj50.m88271j(this.f97411d, i16Var.f97411d) && wj50.m88271j(this.f97412e, i16Var.f97412e) && wj50.m88271j(this.f97413f, i16Var.f97413f) && this.f97414g == i16Var.f97414g && wj50.m88271j(this.f97415h, i16Var.f97415h) && wj50.m88271j(this.f97416i, i16Var.f97416i) && this.f97417j == i16Var.f97417j && this.f97418k == i16Var.f97418k;
    }

    public final int hashCode() {
        String str = this.f97408a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97409b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97410c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97411d;
        int iM62800g = mt60.m62800g(this.f97414g, s571.m77243b(s571.m77243b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f97412e), 31, this.f97413f), 31);
        String str5 = this.f97415h;
        int iHashCode4 = (iM62800g + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f97416i;
        return Boolean.hashCode(this.f97418k) + s571.m77245d((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f97417j);
    }
}
