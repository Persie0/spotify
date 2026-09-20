package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wg40 {

    /* JADX INFO: renamed from: a */
    public final String f250970a;

    /* JADX INFO: renamed from: b */
    public final int f250971b;

    /* JADX INFO: renamed from: c */
    public final double f250972c;

    /* JADX INFO: renamed from: d */
    public final String f250973d;

    /* JADX INFO: renamed from: e */
    public final String f250974e;

    /* JADX INFO: renamed from: f */
    public final String f250975f;

    /* JADX INFO: renamed from: g */
    public final String f250976g;

    /* JADX INFO: renamed from: h */
    public final Integer f250977h;

    /* JADX INFO: renamed from: i */
    public final String f250978i;

    /* JADX INFO: renamed from: j */
    public final String f250979j;

    /* JADX INFO: renamed from: k */
    public final String f250980k;

    /* JADX INFO: renamed from: l */
    public final String f250981l;

    /* JADX INFO: renamed from: m */
    public final String f250982m;

    /* JADX INFO: renamed from: n */
    public final String f250983n;

    public wg40(String str, int i, double d, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f250970a = str;
        this.f250971b = i;
        this.f250972c = d;
        this.f250973d = str2;
        this.f250974e = str3;
        this.f250975f = str4;
        this.f250976g = str5;
        this.f250977h = num;
        this.f250978i = str6;
        this.f250979j = str7;
        this.f250980k = str8;
        this.f250981l = str9;
        this.f250982m = str10;
        this.f250983n = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg40)) {
            return false;
        }
        wg40 wg40Var = (wg40) obj;
        return wj50.m88271j(this.f250970a, wg40Var.f250970a) && this.f250971b == wg40Var.f250971b && Double.compare(this.f250972c, wg40Var.f250972c) == 0 && wj50.m88271j(this.f250973d, wg40Var.f250973d) && wj50.m88271j(this.f250974e, wg40Var.f250974e) && wj50.m88271j(this.f250975f, wg40Var.f250975f) && wj50.m88271j(this.f250976g, wg40Var.f250976g) && wj50.m88271j(this.f250977h, wg40Var.f250977h) && wj50.m88271j(this.f250978i, wg40Var.f250978i) && wj50.m88271j(this.f250979j, wg40Var.f250979j) && wj50.m88271j(this.f250980k, wg40Var.f250980k) && wj50.m88271j(this.f250981l, wg40Var.f250981l) && wj50.m88271j(this.f250982m, wg40Var.f250982m) && wj50.m88271j(this.f250983n, wg40Var.f250983n);
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f250972c, f710.m40938f(this.f250971b, this.f250970a.hashCode() * 31, 31), 31);
        String str = this.f250973d;
        int iHashCode = (iM91399h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250974e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f250975f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f250976g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f250977h;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f250978i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f250979j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f250980k;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f250981l;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f250982m;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f250983n;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }
}
