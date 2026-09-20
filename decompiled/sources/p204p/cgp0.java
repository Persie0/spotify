package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cgp0 {

    /* JADX INFO: renamed from: a */
    public final String f37760a;

    /* JADX INFO: renamed from: b */
    public final String f37761b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f37762c;

    /* JADX INFO: renamed from: d */
    public final String f37763d;

    /* JADX INFO: renamed from: e */
    public final String f37764e;

    /* JADX INFO: renamed from: f */
    public final String f37765f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f37766g;

    /* JADX INFO: renamed from: h */
    public final String f37767h;

    /* JADX INFO: renamed from: i */
    public final String f37768i;

    /* JADX INFO: renamed from: j */
    public final String f37769j;

    /* JADX INFO: renamed from: k */
    public final int f37770k;

    /* JADX INFO: renamed from: l */
    public final List f37771l;

    /* JADX INFO: renamed from: m */
    public final boolean f37772m;

    /* JADX INFO: renamed from: n */
    public final Integer f37773n;

    /* JADX INFO: renamed from: o */
    public final String f37774o;

    /* JADX INFO: renamed from: p */
    public final boolean f37775p;

    public cgp0(String str, String str2, CharSequence charSequence, String str3, String str4, String str5, rcm0 rcm0Var, String str6, String str7, String str8, int i, List list, boolean z, Integer num, String str9, boolean z2) {
        this.f37760a = str;
        this.f37761b = str2;
        this.f37762c = charSequence;
        this.f37763d = str3;
        this.f37764e = str4;
        this.f37765f = str5;
        this.f37766g = rcm0Var;
        this.f37767h = str6;
        this.f37768i = str7;
        this.f37769j = str8;
        this.f37770k = i;
        this.f37771l = list;
        this.f37772m = z;
        this.f37773n = num;
        this.f37774o = str9;
        this.f37775p = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgp0)) {
            return false;
        }
        cgp0 cgp0Var = (cgp0) obj;
        return wj50.m88271j(this.f37760a, cgp0Var.f37760a) && wj50.m88271j(this.f37761b, cgp0Var.f37761b) && wj50.m88271j(this.f37762c, cgp0Var.f37762c) && wj50.m88271j(this.f37763d, cgp0Var.f37763d) && wj50.m88271j(this.f37764e, cgp0Var.f37764e) && wj50.m88271j(this.f37765f, cgp0Var.f37765f) && wj50.m88271j(this.f37766g, cgp0Var.f37766g) && wj50.m88271j(this.f37767h, cgp0Var.f37767h) && wj50.m88271j(this.f37768i, cgp0Var.f37768i) && wj50.m88271j(this.f37769j, cgp0Var.f37769j) && this.f37770k == cgp0Var.f37770k && wj50.m88271j(this.f37771l, cgp0Var.f37771l) && this.f37772m == cgp0Var.f37772m && wj50.m88271j(this.f37773n, cgp0Var.f37773n) && wj50.m88271j(this.f37774o, cgp0Var.f37774o) && this.f37775p == cgp0Var.f37775p;
    }

    public final int hashCode() {
        int iM93483m = yds.m93483m(this.f37766g, s571.m77243b(s571.m77243b(s571.m77243b((this.f37762c.hashCode() + s571.m77243b(this.f37760a.hashCode() * 31, 31, this.f37761b)) * 31, 31, this.f37763d), 31, this.f37764e), 31, this.f37765f), 31);
        String str = this.f37767h;
        int iHashCode = (iM93483m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37768i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37769j;
        int iM77245d = s571.m77245d(s571.m77244c(mt60.m62800g(this.f37770k, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f37771l), 31, this.f37772m);
        Integer num = this.f37773n;
        int iHashCode3 = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f37774o;
        return Boolean.hashCode(this.f37775p) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
