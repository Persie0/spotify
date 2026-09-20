package p204p;

import android.text.SpannedString;

/* JADX INFO: loaded from: classes10.dex */
public final class q97 {

    /* JADX INFO: renamed from: a */
    public final String f186514a;

    /* JADX INFO: renamed from: b */
    public final String f186515b;

    /* JADX INFO: renamed from: c */
    public final String f186516c;

    /* JADX INFO: renamed from: d */
    public final SpannedString f186517d;

    /* JADX INFO: renamed from: e */
    public final String f186518e;

    /* JADX INFO: renamed from: f */
    public final String f186519f;

    /* JADX INFO: renamed from: g */
    public final String f186520g;

    /* JADX INFO: renamed from: h */
    public final int f186521h;

    /* JADX INFO: renamed from: i */
    public final boolean f186522i;

    /* JADX INFO: renamed from: j */
    public final String f186523j;

    /* JADX INFO: renamed from: k */
    public final rcm0 f186524k;

    /* JADX INFO: renamed from: l */
    public final String f186525l;

    /* JADX INFO: renamed from: m */
    public final boolean f186526m;

    /* JADX INFO: renamed from: n */
    public final int f186527n;

    /* JADX INFO: renamed from: o */
    public final boolean f186528o;

    /* JADX INFO: renamed from: p */
    public final Integer f186529p;

    /* JADX INFO: renamed from: q */
    public final String f186530q;

    public q97(String str, String str2, String str3, SpannedString spannedString, String str4, String str5, String str6, int i, boolean z, String str7, rcm0 rcm0Var, String str8, boolean z2, int i2, boolean z3, Integer num, String str9) {
        this.f186514a = str;
        this.f186515b = str2;
        this.f186516c = str3;
        this.f186517d = spannedString;
        this.f186518e = str4;
        this.f186519f = str5;
        this.f186520g = str6;
        this.f186521h = i;
        this.f186522i = z;
        this.f186523j = str7;
        this.f186524k = rcm0Var;
        this.f186525l = str8;
        this.f186526m = z2;
        this.f186527n = i2;
        this.f186528o = z3;
        this.f186529p = num;
        this.f186530q = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q97)) {
            return false;
        }
        q97 q97Var = (q97) obj;
        return wj50.m88271j(this.f186514a, q97Var.f186514a) && wj50.m88271j(this.f186515b, q97Var.f186515b) && wj50.m88271j(this.f186516c, q97Var.f186516c) && this.f186517d.equals(q97Var.f186517d) && wj50.m88271j(this.f186518e, q97Var.f186518e) && wj50.m88271j(this.f186519f, q97Var.f186519f) && wj50.m88271j(this.f186520g, q97Var.f186520g) && this.f186521h == q97Var.f186521h && this.f186522i == q97Var.f186522i && wj50.m88271j(this.f186523j, q97Var.f186523j) && this.f186524k.equals(q97Var.f186524k) && wj50.m88271j(this.f186525l, q97Var.f186525l) && this.f186526m == q97Var.f186526m && this.f186527n == q97Var.f186527n && this.f186528o == q97Var.f186528o && wj50.m88271j(this.f186529p, q97Var.f186529p) && wj50.m88271j(this.f186530q, q97Var.f186530q);
    }

    public final int hashCode() {
        int iM93483m = yds.m93483m(this.f186524k, s571.m77243b(s571.m77245d(f710.m40938f(this.f186521h, s571.m77243b(s571.m77243b(s571.m77243b((this.f186517d.hashCode() + s571.m77243b(s571.m77243b(this.f186514a.hashCode() * 31, 31, this.f186515b), 31, this.f186516c)) * 31, 31, this.f186518e), 31, this.f186519f), 31, this.f186520g), 31), 31, this.f186522i), 31, this.f186523j), 31);
        String str = this.f186525l;
        int iM77245d = s571.m77245d(mt60.m62800g(this.f186527n, s571.m77245d((iM93483m + (str == null ? 0 : str.hashCode())) * 31, 31, this.f186526m), 31), 31, this.f186528o);
        Integer num = this.f186529p;
        int iHashCode = (iM77245d + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f186530q;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
