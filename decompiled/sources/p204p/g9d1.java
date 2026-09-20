package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g9d1 {

    /* JADX INFO: renamed from: a */
    public final String f77739a;

    /* JADX INFO: renamed from: b */
    public final String f77740b;

    /* JADX INFO: renamed from: c */
    public final String f77741c;

    /* JADX INFO: renamed from: d */
    public final String f77742d;

    /* JADX INFO: renamed from: e */
    public final String f77743e;

    /* JADX INFO: renamed from: f */
    public final boolean f77744f;

    /* JADX INFO: renamed from: g */
    public final boolean f77745g;

    /* JADX INFO: renamed from: h */
    public final Float f77746h;

    /* JADX INFO: renamed from: i */
    public final vsb1 f77747i;

    /* JADX INFO: renamed from: j */
    public final String f77748j;

    /* JADX INFO: renamed from: k */
    public final String f77749k;

    /* JADX INFO: renamed from: l */
    public final String f77750l;

    /* JADX INFO: renamed from: m */
    public final String f77751m;

    public g9d1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, Float f, vsb1 vsb1Var, String str6, String str7, String str8, String str9) {
        this.f77739a = str;
        this.f77740b = str2;
        this.f77741c = str3;
        this.f77742d = str4;
        this.f77743e = str5;
        this.f77744f = z;
        this.f77745g = z2;
        this.f77746h = f;
        this.f77747i = vsb1Var;
        this.f77748j = str6;
        this.f77749k = str7;
        this.f77750l = str8;
        this.f77751m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9d1)) {
            return false;
        }
        g9d1 g9d1Var = (g9d1) obj;
        return wj50.m88271j(this.f77739a, g9d1Var.f77739a) && wj50.m88271j(this.f77740b, g9d1Var.f77740b) && wj50.m88271j(this.f77741c, g9d1Var.f77741c) && wj50.m88271j(this.f77742d, g9d1Var.f77742d) && wj50.m88271j(this.f77743e, g9d1Var.f77743e) && this.f77744f == g9d1Var.f77744f && this.f77745g == g9d1Var.f77745g && wj50.m88271j(this.f77746h, g9d1Var.f77746h) && wj50.m88271j(this.f77747i, g9d1Var.f77747i) && wj50.m88271j(this.f77748j, g9d1Var.f77748j) && wj50.m88271j(this.f77749k, g9d1Var.f77749k) && wj50.m88271j(this.f77750l, g9d1Var.f77750l) && wj50.m88271j(this.f77751m, g9d1Var.f77751m);
    }

    public final int hashCode() {
        int iHashCode = this.f77739a.hashCode() * 31;
        String str = this.f77740b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77741c;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f77742d), 31, this.f77743e), 31, this.f77744f), 31, this.f77745g), 31, false);
        Float f = this.f77746h;
        int iHashCode3 = (iM77245d + (f == null ? 0 : f.hashCode())) * 31;
        vsb1 vsb1Var = this.f77747i;
        return this.f77751m.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((((iHashCode3 + (vsb1Var != null ? vsb1Var.hashCode() : 0)) * 31) + 1545820101) * 31, 31, true), 31, this.f77748j), 31, this.f77749k), 31, this.f77750l);
    }
}
