package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xgb1 {

    /* JADX INFO: renamed from: a */
    public final String f261270a;

    /* JADX INFO: renamed from: b */
    public final un20 f261271b;

    /* JADX INFO: renamed from: c */
    public final String f261272c;

    /* JADX INFO: renamed from: d */
    public final String f261273d;

    /* JADX INFO: renamed from: e */
    public final String f261274e;

    /* JADX INFO: renamed from: f */
    public final String f261275f;

    /* JADX INFO: renamed from: g */
    public final String f261276g;

    /* JADX INFO: renamed from: h */
    public final String f261277h;

    /* JADX INFO: renamed from: i */
    public final String f261278i;

    /* JADX INFO: renamed from: j */
    public final tgb1 f261279j;

    /* JADX INFO: renamed from: k */
    public final tgb1 f261280k;

    /* JADX INFO: renamed from: l */
    public final k7i0 f261281l;

    /* JADX INFO: renamed from: m */
    public final boolean f261282m;

    /* JADX INFO: renamed from: n */
    public final String f261283n;

    /* JADX INFO: renamed from: o */
    public final String f261284o;

    /* JADX INFO: renamed from: p */
    public final String f261285p;

    public xgb1(String str, un20 un20Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, tgb1 tgb1Var, tgb1 tgb1Var2, k7i0 k7i0Var, boolean z, String str9, String str10, String str11) {
        this.f261270a = str;
        this.f261271b = un20Var;
        this.f261272c = str2;
        this.f261273d = str3;
        this.f261274e = str4;
        this.f261275f = str5;
        this.f261276g = str6;
        this.f261277h = str7;
        this.f261278i = str8;
        this.f261279j = tgb1Var;
        this.f261280k = tgb1Var2;
        this.f261281l = k7i0Var;
        this.f261282m = z;
        this.f261283n = str9;
        this.f261284o = str10;
        this.f261285p = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgb1)) {
            return false;
        }
        xgb1 xgb1Var = (xgb1) obj;
        return wj50.m88271j(this.f261270a, xgb1Var.f261270a) && wj50.m88271j(this.f261271b, xgb1Var.f261271b) && wj50.m88271j(this.f261272c, xgb1Var.f261272c) && wj50.m88271j(this.f261273d, xgb1Var.f261273d) && wj50.m88271j(this.f261274e, xgb1Var.f261274e) && wj50.m88271j(this.f261275f, xgb1Var.f261275f) && wj50.m88271j(this.f261276g, xgb1Var.f261276g) && wj50.m88271j(this.f261277h, xgb1Var.f261277h) && wj50.m88271j(this.f261278i, xgb1Var.f261278i) && wj50.m88271j(this.f261279j, xgb1Var.f261279j) && wj50.m88271j(this.f261280k, xgb1Var.f261280k) && wj50.m88271j(this.f261281l, xgb1Var.f261281l) && this.f261282m == xgb1Var.f261282m && wj50.m88271j(this.f261283n, xgb1Var.f261283n) && wj50.m88271j(this.f261284o, xgb1Var.f261284o) && wj50.m88271j(this.f261285p, xgb1Var.f261285p);
    }

    public final int hashCode() {
        int iHashCode = this.f261270a.hashCode() * 31;
        un20 un20Var = this.f261271b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f261272c), 31, this.f261273d), 31, this.f261274e), 31, this.f261275f), 31, this.f261276g), 31, this.f261277h);
        String str = this.f261278i;
        int iHashCode2 = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        tgb1 tgb1Var = this.f261279j;
        int iHashCode3 = (iHashCode2 + (tgb1Var == null ? 0 : tgb1Var.hashCode())) * 31;
        tgb1 tgb1Var2 = this.f261280k;
        int iM77243b2 = s571.m77243b(s571.m77245d((this.f261281l.hashCode() + ((iHashCode3 + (tgb1Var2 == null ? 0 : tgb1Var2.hashCode())) * 31)) * 31, 31, this.f261282m), 31, this.f261283n);
        String str2 = this.f261284o;
        return this.f261285p.hashCode() + ((iM77243b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
