package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class npb1 {

    /* JADX INFO: renamed from: a */
    public final String f156909a;

    /* JADX INFO: renamed from: b */
    public final boolean f156910b;

    /* JADX INFO: renamed from: c */
    public final String f156911c;

    /* JADX INFO: renamed from: d */
    public final String f156912d;

    /* JADX INFO: renamed from: e */
    public final String f156913e;

    /* JADX INFO: renamed from: f */
    public final String f156914f;

    /* JADX INFO: renamed from: g */
    public final long f156915g;

    /* JADX INFO: renamed from: h */
    public final long f156916h;

    /* JADX INFO: renamed from: i */
    public final ppb1 f156917i;

    /* JADX INFO: renamed from: j */
    public final String f156918j;

    /* JADX INFO: renamed from: k */
    public final int f156919k;

    /* JADX INFO: renamed from: l */
    public final psj f156920l;

    /* JADX INFO: renamed from: m */
    public final boolean f156921m;

    /* JADX INFO: renamed from: n */
    public final String f156922n;

    /* JADX INFO: renamed from: o */
    public final int f156923o;

    /* JADX INFO: renamed from: p */
    public final boolean f156924p;

    /* JADX INFO: renamed from: q */
    public final String f156925q;

    /* JADX INFO: renamed from: r */
    public final int f156926r;

    /* JADX INFO: renamed from: s */
    public final boolean f156927s;

    public npb1(String str, boolean z, String str2, String str3, String str4, String str5, long j, long j2, ppb1 ppb1Var, String str6, int i, psj psjVar, boolean z2, String str7, int i2, boolean z3, String str8, int i3, boolean z4) {
        this.f156909a = str;
        this.f156910b = z;
        this.f156911c = str2;
        this.f156912d = str3;
        this.f156913e = str4;
        this.f156914f = str5;
        this.f156915g = j;
        this.f156916h = j2;
        this.f156917i = ppb1Var;
        this.f156918j = str6;
        this.f156919k = i;
        this.f156920l = psjVar;
        this.f156921m = z2;
        this.f156922n = str7;
        this.f156923o = i2;
        this.f156924p = z3;
        this.f156925q = str8;
        this.f156926r = i3;
        this.f156927s = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npb1)) {
            return false;
        }
        npb1 npb1Var = (npb1) obj;
        return wj50.m88271j(this.f156909a, npb1Var.f156909a) && this.f156910b == npb1Var.f156910b && wj50.m88271j(this.f156911c, npb1Var.f156911c) && wj50.m88271j(this.f156912d, npb1Var.f156912d) && wj50.m88271j(this.f156913e, npb1Var.f156913e) && wj50.m88271j(this.f156914f, npb1Var.f156914f) && this.f156915g == npb1Var.f156915g && this.f156916h == npb1Var.f156916h && wj50.m88271j(this.f156917i, npb1Var.f156917i) && wj50.m88271j(this.f156918j, npb1Var.f156918j) && this.f156919k == npb1Var.f156919k && this.f156920l == npb1Var.f156920l && this.f156921m == npb1Var.f156921m && wj50.m88271j(this.f156922n, npb1Var.f156922n) && this.f156923o == npb1Var.f156923o && this.f156924p == npb1Var.f156924p && wj50.m88271j(this.f156925q, npb1Var.f156925q) && this.f156926r == npb1Var.f156926r && this.f156927s == npb1Var.f156927s;
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d(this.f156909a.hashCode() * 31, 31, this.f156910b), 31, this.f156911c), 31, this.f156912d), 31, this.f156913e), 31, this.f156914f), this.f156915g, 31), this.f156916h, 31);
        ppb1 ppb1Var = this.f156917i;
        int iM77245d = s571.m77245d((this.f156920l.hashCode() + f710.m40938f(this.f156919k, s571.m77243b((iM36605e + (ppb1Var == null ? 0 : ppb1Var.hashCode())) * 31, 31, this.f156918j), 31)) * 31, 31, this.f156921m);
        String str = this.f156922n;
        return Boolean.hashCode(this.f156927s) + f710.m40938f(this.f156926r, s571.m77243b(s571.m77245d(f710.m40938f(this.f156923o, (iM77245d + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f156924p), 31, this.f156925q), 31);
    }
}
