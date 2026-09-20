package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uad1 {

    /* JADX INFO: renamed from: a */
    public final String f228464a;

    /* JADX INFO: renamed from: b */
    public final String f228465b;

    /* JADX INFO: renamed from: c */
    public final String f228466c;

    /* JADX INFO: renamed from: d */
    public final String f228467d;

    /* JADX INFO: renamed from: e */
    public final String f228468e;

    /* JADX INFO: renamed from: f */
    public final String f228469f;

    /* JADX INFO: renamed from: g */
    public final String f228470g;

    /* JADX INFO: renamed from: h */
    public final String f228471h;

    /* JADX INFO: renamed from: i */
    public final Integer f228472i;

    /* JADX INFO: renamed from: j */
    public final String f228473j;

    /* JADX INFO: renamed from: k */
    public final String f228474k;

    /* JADX INFO: renamed from: l */
    public final long f228475l;

    /* JADX INFO: renamed from: m */
    public final long f228476m;

    /* JADX INFO: renamed from: n */
    public final Float f228477n;

    /* JADX INFO: renamed from: o */
    public final boolean f228478o;

    public uad1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, long j, long j2, Float f, boolean z) {
        this.f228464a = str;
        this.f228465b = str2;
        this.f228466c = str3;
        this.f228467d = str4;
        this.f228468e = str5;
        this.f228469f = str6;
        this.f228470g = str7;
        this.f228471h = str8;
        this.f228472i = num;
        this.f228473j = str9;
        this.f228474k = str10;
        this.f228475l = j;
        this.f228476m = j2;
        this.f228477n = f;
        this.f228478o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uad1)) {
            return false;
        }
        uad1 uad1Var = (uad1) obj;
        return wj50.m88271j(this.f228464a, uad1Var.f228464a) && this.f228465b.equals(uad1Var.f228465b) && this.f228466c.equals(uad1Var.f228466c) && this.f228467d.equals(uad1Var.f228467d) && wj50.m88271j(this.f228468e, uad1Var.f228468e) && wj50.m88271j(this.f228469f, uad1Var.f228469f) && wj50.m88271j(this.f228470g, uad1Var.f228470g) && this.f228471h.equals(uad1Var.f228471h) && wj50.m88271j(this.f228472i, uad1Var.f228472i) && this.f228473j.equals(uad1Var.f228473j) && this.f228474k.equals(uad1Var.f228474k) && this.f228475l == uad1Var.f228475l && this.f228476m == uad1Var.f228476m && wj50.m88271j(this.f228477n, uad1Var.f228477n) && this.f228478o == uad1Var.f228478o;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f228464a.hashCode() * 31, 31, this.f228465b), 31, this.f228466c), 31, this.f228467d), 31, this.f228468e), 31, this.f228469f), 31, this.f228470g), 31, this.f228471h);
        Integer num = this.f228472i;
        int iM36605e = dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f228473j), 31, this.f228474k), this.f228475l, 31), this.f228476m, 31);
        Float f = this.f228477n;
        return Boolean.hashCode(this.f228478o) + ((iM36605e + (f != null ? f.hashCode() : 0)) * 31);
    }
}
