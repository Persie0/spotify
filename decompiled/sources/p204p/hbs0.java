package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hbs0 {

    /* JADX INFO: renamed from: a */
    public final String f89584a;

    /* JADX INFO: renamed from: b */
    public final String f89585b;

    /* JADX INFO: renamed from: c */
    public final String f89586c;

    /* JADX INFO: renamed from: d */
    public final String f89587d;

    /* JADX INFO: renamed from: e */
    public final String f89588e;

    /* JADX INFO: renamed from: f */
    public final String f89589f;

    /* JADX INFO: renamed from: g */
    public final String f89590g;

    /* JADX INFO: renamed from: h */
    public final String f89591h;

    /* JADX INFO: renamed from: i */
    public final Long f89592i;

    /* JADX INFO: renamed from: j */
    public final String f89593j;

    /* JADX INFO: renamed from: k */
    public final String f89594k;

    /* JADX INFO: renamed from: l */
    public final List f89595l;

    /* JADX INFO: renamed from: m */
    public final String f89596m;

    /* JADX INFO: renamed from: n */
    public final String f89597n;

    /* JADX INFO: renamed from: o */
    public final boolean f89598o;

    /* JADX INFO: renamed from: p */
    public final boolean f89599p;

    /* JADX INFO: renamed from: q */
    public final boolean f89600q;

    /* JADX INFO: renamed from: r */
    public final String f89601r;

    /* JADX INFO: renamed from: s */
    public final un20 f89602s;

    /* JADX INFO: renamed from: t */
    public final boolean f89603t;

    /* JADX INFO: renamed from: u */
    public final boolean f89604u;

    public hbs0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, String str9, String str10, List list, String str11, String str12, boolean z, boolean z2, boolean z3, String str13, un20 un20Var, boolean z4, boolean z5) {
        this.f89584a = str;
        this.f89585b = str2;
        this.f89586c = str3;
        this.f89587d = str4;
        this.f89588e = str5;
        this.f89589f = str6;
        this.f89590g = str7;
        this.f89591h = str8;
        this.f89592i = l;
        this.f89593j = str9;
        this.f89594k = str10;
        this.f89595l = list;
        this.f89596m = str11;
        this.f89597n = str12;
        this.f89598o = z;
        this.f89599p = z2;
        this.f89600q = z3;
        this.f89601r = str13;
        this.f89602s = un20Var;
        this.f89603t = z4;
        this.f89604u = z5;
    }

    /* JADX INFO: renamed from: a */
    public final String m47056a() {
        return this.f89586c;
    }

    /* JADX INFO: renamed from: b */
    public final String m47057b() {
        return this.f89587d;
    }

    /* JADX INFO: renamed from: c */
    public final String m47058c() {
        String str;
        String str2 = this.f89585b;
        return (str2.length() <= 0 || (str = this.f89591h) == null) ? str2 : klh.m56834f(str2, " • ", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbs0)) {
            return false;
        }
        hbs0 hbs0Var = (hbs0) obj;
        return wj50.m88271j(this.f89584a, hbs0Var.f89584a) && wj50.m88271j(this.f89585b, hbs0Var.f89585b) && wj50.m88271j(this.f89586c, hbs0Var.f89586c) && wj50.m88271j(this.f89587d, hbs0Var.f89587d) && wj50.m88271j(this.f89588e, hbs0Var.f89588e) && wj50.m88271j(this.f89589f, hbs0Var.f89589f) && wj50.m88271j(this.f89590g, hbs0Var.f89590g) && wj50.m88271j(this.f89591h, hbs0Var.f89591h) && wj50.m88271j(this.f89592i, hbs0Var.f89592i) && wj50.m88271j(this.f89593j, hbs0Var.f89593j) && wj50.m88271j(this.f89594k, hbs0Var.f89594k) && wj50.m88271j(this.f89595l, hbs0Var.f89595l) && wj50.m88271j(this.f89596m, hbs0Var.f89596m) && wj50.m88271j(this.f89597n, hbs0Var.f89597n) && this.f89598o == hbs0Var.f89598o && this.f89599p == hbs0Var.f89599p && this.f89600q == hbs0Var.f89600q && wj50.m88271j(this.f89601r, hbs0Var.f89601r) && wj50.m88271j(this.f89602s, hbs0Var.f89602s) && this.f89603t == hbs0Var.f89603t && this.f89604u == hbs0Var.f89604u;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f89584a.hashCode() * 31, 31, this.f89585b), 31, this.f89586c), 31, this.f89587d), 31, this.f89588e), 31, this.f89589f);
        String str = this.f89590g;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89591h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f89592i;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f89593j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89594k;
        int iM77244c = s571.m77244c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f89595l);
        String str5 = this.f89596m;
        int iHashCode5 = (iM77244c + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f89597n;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f89598o), 31, this.f89599p), 31, this.f89600q);
        String str7 = this.f89601r;
        int iHashCode6 = (iM77245d + (str7 == null ? 0 : str7.hashCode())) * 31;
        un20 un20Var = this.f89602s;
        return Boolean.hashCode(this.f89604u) + s571.m77245d((iHashCode6 + (un20Var != null ? un20Var.hashCode() : 0)) * 31, 31, this.f89603t);
    }
}
