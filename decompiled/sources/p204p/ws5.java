package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ws5 {

    /* JADX INFO: renamed from: a */
    public final String f254507a;

    /* JADX INFO: renamed from: b */
    public final String f254508b;

    /* JADX INFO: renamed from: c */
    public final String f254509c;

    /* JADX INFO: renamed from: d */
    public final String f254510d;

    /* JADX INFO: renamed from: e */
    public final String f254511e;

    /* JADX INFO: renamed from: f */
    public final boolean f254512f;

    /* JADX INFO: renamed from: g */
    public final boolean f254513g;

    /* JADX INFO: renamed from: h */
    public final boolean f254514h;

    /* JADX INFO: renamed from: i */
    public final is9 f254515i;

    /* JADX INFO: renamed from: j */
    public final String f254516j;

    /* JADX INFO: renamed from: k */
    public final rcm0 f254517k;

    /* JADX INFO: renamed from: l */
    public final int f254518l;

    /* JADX INFO: renamed from: m */
    public final ps5 f254519m;

    /* JADX INFO: renamed from: n */
    public final qs5 f254520n;

    /* JADX INFO: renamed from: o */
    public final Integer f254521o;

    /* JADX INFO: renamed from: p */
    public final String f254522p;

    public ws5(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, is9 is9Var, String str6, rcm0 rcm0Var, int i, ps5 ps5Var, qs5 qs5Var, Integer num, String str7) {
        this.f254507a = str;
        this.f254508b = str2;
        this.f254509c = str3;
        this.f254510d = str4;
        this.f254511e = str5;
        this.f254512f = z;
        this.f254513g = z2;
        this.f254514h = z3;
        this.f254515i = is9Var;
        this.f254516j = str6;
        this.f254517k = rcm0Var;
        this.f254518l = i;
        this.f254519m = ps5Var;
        this.f254520n = qs5Var;
        this.f254521o = num;
        this.f254522p = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5)) {
            return false;
        }
        ws5 ws5Var = (ws5) obj;
        return wj50.m88271j(this.f254507a, ws5Var.f254507a) && wj50.m88271j(this.f254508b, ws5Var.f254508b) && wj50.m88271j(this.f254509c, ws5Var.f254509c) && wj50.m88271j(this.f254510d, ws5Var.f254510d) && wj50.m88271j(this.f254511e, ws5Var.f254511e) && this.f254512f == ws5Var.f254512f && this.f254513g == ws5Var.f254513g && this.f254514h == ws5Var.f254514h && wj50.m88271j(this.f254515i, ws5Var.f254515i) && wj50.m88271j(this.f254516j, ws5Var.f254516j) && wj50.m88271j(this.f254517k, ws5Var.f254517k) && this.f254518l == ws5Var.f254518l && wj50.m88271j(this.f254519m, ws5Var.f254519m) && wj50.m88271j(this.f254520n, ws5Var.f254520n) && wj50.m88271j(this.f254521o, ws5Var.f254521o) && wj50.m88271j(this.f254522p, ws5Var.f254522p);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f254507a.hashCode() * 31, 31, this.f254508b);
        String str = this.f254509c;
        int iM62800g = mt60.m62800g(this.f254518l, yds.m93483m(this.f254517k, s571.m77243b((this.f254515i.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f254510d), 31, this.f254511e), 31, this.f254512f), 31, this.f254513g), 31, this.f254514h)) * 31, 31, this.f254516j), 31), 31);
        ps5 ps5Var = this.f254519m;
        int iHashCode = (iM62800g + (ps5Var == null ? 0 : ps5Var.hashCode())) * 31;
        qs5 qs5Var = this.f254520n;
        int iHashCode2 = (iHashCode + (qs5Var == null ? 0 : qs5Var.hashCode())) * 31;
        Integer num = this.f254521o;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f254522p;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
