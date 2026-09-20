package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class spc0 {

    /* JADX INFO: renamed from: a */
    public final String f212800a;

    /* JADX INFO: renamed from: b */
    public final String f212801b;

    /* JADX INFO: renamed from: c */
    public final String f212802c;

    /* JADX INFO: renamed from: d */
    public final String f212803d;

    /* JADX INFO: renamed from: e */
    public final String f212804e;

    /* JADX INFO: renamed from: f */
    public final String f212805f;

    /* JADX INFO: renamed from: g */
    public final String f212806g;

    /* JADX INFO: renamed from: h */
    public final String f212807h;

    /* JADX INFO: renamed from: i */
    public final String f212808i;

    /* JADX INFO: renamed from: j */
    public final String f212809j;

    /* JADX INFO: renamed from: k */
    public final String f212810k;

    /* JADX INFO: renamed from: l */
    public final String f212811l;

    /* JADX INFO: renamed from: m */
    public final String f212812m;

    /* JADX INFO: renamed from: n */
    public final gqc0 f212813n;

    /* JADX INFO: renamed from: o */
    public final String f212814o;

    public spc0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, gqc0 gqc0Var, String str14) {
        this.f212800a = str;
        this.f212801b = str2;
        this.f212802c = str3;
        this.f212803d = str4;
        this.f212804e = str5;
        this.f212805f = str6;
        this.f212806g = str7;
        this.f212807h = str8;
        this.f212808i = str9;
        this.f212809j = str10;
        this.f212810k = str11;
        this.f212811l = str12;
        this.f212812m = str13;
        this.f212813n = gqc0Var;
        this.f212814o = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spc0)) {
            return false;
        }
        spc0 spc0Var = (spc0) obj;
        return wj50.m88271j(this.f212800a, spc0Var.f212800a) && wj50.m88271j(this.f212801b, spc0Var.f212801b) && wj50.m88271j(this.f212802c, spc0Var.f212802c) && wj50.m88271j(this.f212803d, spc0Var.f212803d) && wj50.m88271j(this.f212804e, spc0Var.f212804e) && wj50.m88271j(this.f212805f, spc0Var.f212805f) && wj50.m88271j(this.f212806g, spc0Var.f212806g) && wj50.m88271j(this.f212807h, spc0Var.f212807h) && wj50.m88271j(this.f212808i, spc0Var.f212808i) && wj50.m88271j(this.f212809j, spc0Var.f212809j) && wj50.m88271j(this.f212810k, spc0Var.f212810k) && wj50.m88271j(this.f212811l, spc0Var.f212811l) && wj50.m88271j(this.f212812m, spc0Var.f212812m) && this.f212813n == spc0Var.f212813n && wj50.m88271j(this.f212814o, spc0Var.f212814o);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f212800a.hashCode() * 31, 31, this.f212801b);
        String str = this.f212802c;
        int iM77243b2 = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f212803d), 31, this.f212804e), 31, this.f212805f), 31, this.f212806g), 31, this.f212807h);
        String str2 = this.f212808i;
        int iM77243b3 = s571.m77243b(s571.m77243b(s571.m77243b((iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f212809j), 31, this.f212810k), 31, this.f212811l);
        String str3 = this.f212812m;
        int iHashCode = (iM77243b3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gqc0 gqc0Var = this.f212813n;
        int iHashCode2 = (iHashCode + (gqc0Var == null ? 0 : gqc0Var.hashCode())) * 31;
        String str4 = this.f212814o;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
