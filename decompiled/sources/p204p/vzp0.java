package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vzp0 {

    /* JADX INFO: renamed from: a */
    public final String f246506a;

    /* JADX INFO: renamed from: b */
    public final String f246507b;

    /* JADX INFO: renamed from: c */
    public final String f246508c;

    /* JADX INFO: renamed from: d */
    public final String f246509d;

    /* JADX INFO: renamed from: e */
    public final String f246510e;

    /* JADX INFO: renamed from: f */
    public final String f246511f;

    /* JADX INFO: renamed from: g */
    public final int f246512g;

    /* JADX INFO: renamed from: h */
    public final String f246513h;

    /* JADX INFO: renamed from: i */
    public final rcm0 f246514i;

    /* JADX INFO: renamed from: j */
    public final int f246515j;

    /* JADX INFO: renamed from: k */
    public final int f246516k;

    /* JADX INFO: renamed from: l */
    public final boolean f246517l;

    /* JADX INFO: renamed from: m */
    public final boolean f246518m;

    /* JADX INFO: renamed from: n */
    public final boolean f246519n;

    /* JADX INFO: renamed from: o */
    public final String f246520o;

    /* JADX INFO: renamed from: p */
    public final String f246521p;

    /* JADX INFO: renamed from: q */
    public final String f246522q;

    /* JADX INFO: renamed from: r */
    public final String f246523r;

    /* JADX INFO: renamed from: s */
    public final String f246524s;

    /* JADX INFO: renamed from: t */
    public final osc f246525t;

    public vzp0(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, rcm0 rcm0Var, int i2, int i3, boolean z, boolean z2, boolean z3, String str8, String str9, String str10, String str11, String str12, osc oscVar) {
        this.f246506a = str;
        this.f246507b = str2;
        this.f246508c = str3;
        this.f246509d = str4;
        this.f246510e = str5;
        this.f246511f = str6;
        this.f246512g = i;
        this.f246513h = str7;
        this.f246514i = rcm0Var;
        this.f246515j = i2;
        this.f246516k = i3;
        this.f246517l = z;
        this.f246518m = z2;
        this.f246519n = z3;
        this.f246520o = str8;
        this.f246521p = str9;
        this.f246522q = str10;
        this.f246523r = str11;
        this.f246524s = str12;
        this.f246525t = oscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzp0)) {
            return false;
        }
        vzp0 vzp0Var = (vzp0) obj;
        return wj50.m88271j(this.f246506a, vzp0Var.f246506a) && wj50.m88271j(this.f246507b, vzp0Var.f246507b) && wj50.m88271j(this.f246508c, vzp0Var.f246508c) && wj50.m88271j(this.f246509d, vzp0Var.f246509d) && wj50.m88271j(this.f246510e, vzp0Var.f246510e) && wj50.m88271j(this.f246511f, vzp0Var.f246511f) && this.f246512g == vzp0Var.f246512g && wj50.m88271j(this.f246513h, vzp0Var.f246513h) && this.f246514i.equals(vzp0Var.f246514i) && this.f246515j == vzp0Var.f246515j && this.f246516k == vzp0Var.f246516k && this.f246517l == vzp0Var.f246517l && this.f246518m == vzp0Var.f246518m && this.f246519n == vzp0Var.f246519n && wj50.m88271j(this.f246520o, vzp0Var.f246520o) && this.f246521p.equals(vzp0Var.f246521p) && this.f246522q.equals(vzp0Var.f246522q) && this.f246523r.equals(vzp0Var.f246523r) && wj50.m88271j(this.f246524s, vzp0Var.f246524s) && this.f246525t == vzp0Var.f246525t;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f246516k, f710.m40938f(this.f246515j, yds.m93483m(this.f246514i, s571.m77243b(f710.m40938f(this.f246512g, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f246506a.hashCode() * 31, 31, this.f246507b), 31, this.f246508c), 31, this.f246509d), 31, this.f246510e), 31, this.f246511f), 31), 31, this.f246513h), 31), 31), 31), 31, this.f246517l), 31, this.f246518m), 31, this.f246519n);
        String str = this.f246520o;
        return this.f246525t.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f246521p), 31, this.f246522q), 31, this.f246523r), 31, this.f246524s);
    }
}
