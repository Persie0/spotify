package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wfd1 {

    /* JADX INFO: renamed from: a */
    public final String f250803a;

    /* JADX INFO: renamed from: b */
    public final String f250804b;

    /* JADX INFO: renamed from: c */
    public final String f250805c;

    /* JADX INFO: renamed from: d */
    public final String f250806d;

    /* JADX INFO: renamed from: e */
    public final String f250807e;

    /* JADX INFO: renamed from: f */
    public final boolean f250808f;

    /* JADX INFO: renamed from: g */
    public final boolean f250809g;

    /* JADX INFO: renamed from: h */
    public final Float f250810h;

    /* JADX INFO: renamed from: i */
    public final vsb1 f250811i;

    /* JADX INFO: renamed from: j */
    public final String f250812j;

    /* JADX INFO: renamed from: k */
    public final String f250813k;

    /* JADX INFO: renamed from: l */
    public final String f250814l;

    /* JADX INFO: renamed from: m */
    public final String f250815m;

    public wfd1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, Float f, vsb1 vsb1Var, String str6, String str7, String str8, String str9) {
        this.f250803a = str;
        this.f250804b = str2;
        this.f250805c = str3;
        this.f250806d = str4;
        this.f250807e = str5;
        this.f250808f = z;
        this.f250809g = z2;
        this.f250810h = f;
        this.f250811i = vsb1Var;
        this.f250812j = str6;
        this.f250813k = str7;
        this.f250814l = str8;
        this.f250815m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfd1)) {
            return false;
        }
        wfd1 wfd1Var = (wfd1) obj;
        return wj50.m88271j(this.f250803a, wfd1Var.f250803a) && wj50.m88271j(this.f250804b, wfd1Var.f250804b) && wj50.m88271j(this.f250805c, wfd1Var.f250805c) && wj50.m88271j(this.f250806d, wfd1Var.f250806d) && wj50.m88271j(this.f250807e, wfd1Var.f250807e) && this.f250808f == wfd1Var.f250808f && this.f250809g == wfd1Var.f250809g && wj50.m88271j(this.f250810h, wfd1Var.f250810h) && wj50.m88271j(this.f250811i, wfd1Var.f250811i) && wj50.m88271j(this.f250812j, wfd1Var.f250812j) && wj50.m88271j(this.f250813k, wfd1Var.f250813k) && wj50.m88271j(this.f250814l, wfd1Var.f250814l) && wj50.m88271j(this.f250815m, wfd1Var.f250815m);
    }

    public final int hashCode() {
        int iHashCode = this.f250803a.hashCode() * 31;
        String str = this.f250804b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250805c;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f250806d), 31, this.f250807e), 31, this.f250808f), 31, this.f250809g), 31, false);
        Float f = this.f250810h;
        int iHashCode3 = (iM77245d + (f == null ? 0 : f.hashCode())) * 31;
        vsb1 vsb1Var = this.f250811i;
        return this.f250815m.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((((iHashCode3 + (vsb1Var != null ? vsb1Var.hashCode() : 0)) * 31) + 1545820101) * 31, 31, true), 31, this.f250812j), 31, this.f250813k), 31, this.f250814l);
    }
}
