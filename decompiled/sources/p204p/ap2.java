package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ap2 {

    /* JADX INFO: renamed from: a */
    public final Integer f17804a;

    /* JADX INFO: renamed from: b */
    public final String f17805b;

    /* JADX INFO: renamed from: c */
    public final String f17806c;

    /* JADX INFO: renamed from: d */
    public final int f17807d;

    /* JADX INFO: renamed from: e */
    public final String f17808e;

    /* JADX INFO: renamed from: f */
    public final String f17809f;

    /* JADX INFO: renamed from: g */
    public final String f17810g;

    /* JADX INFO: renamed from: h */
    public final String f17811h;

    /* JADX INFO: renamed from: i */
    public final String f17812i;

    /* JADX INFO: renamed from: j */
    public final String f17813j;

    /* JADX INFO: renamed from: k */
    public final String f17814k;

    /* JADX INFO: renamed from: l */
    public final String f17815l;

    public ap2(Integer num, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f17804a = num;
        this.f17805b = str;
        this.f17806c = str2;
        this.f17807d = i;
        this.f17808e = str3;
        this.f17809f = str4;
        this.f17810g = str5;
        this.f17811h = str6;
        this.f17812i = str7;
        this.f17813j = str8;
        this.f17814k = str9;
        this.f17815l = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap2)) {
            return false;
        }
        ap2 ap2Var = (ap2) obj;
        return wj50.m88271j(this.f17804a, ap2Var.f17804a) && wj50.m88271j(this.f17805b, ap2Var.f17805b) && this.f17806c.equals(ap2Var.f17806c) && this.f17807d == ap2Var.f17807d && wj50.m88271j(this.f17808e, ap2Var.f17808e) && wj50.m88271j(this.f17809f, ap2Var.f17809f) && this.f17810g.equals(ap2Var.f17810g) && wj50.m88271j(this.f17811h, ap2Var.f17811h) && wj50.m88271j(this.f17812i, ap2Var.f17812i) && wj50.m88271j(this.f17813j, ap2Var.f17813j) && wj50.m88271j(this.f17814k, ap2Var.f17814k) && wj50.m88271j(this.f17815l, ap2Var.f17815l);
    }

    public final int hashCode() {
        Integer num = this.f17804a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f17805b;
        int iM40938f = f710.m40938f(this.f17807d, s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17806c), 31);
        String str2 = this.f17808e;
        int iHashCode2 = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17809f;
        int iM77243b = s571.m77243b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f17810g);
        String str4 = this.f17811h;
        int iHashCode3 = (iM77243b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17812i;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17813j;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17814k;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f17815l;
        return iHashCode6 + (str8 != null ? str8.hashCode() : 0);
    }
}
