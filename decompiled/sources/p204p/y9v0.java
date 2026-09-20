package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y9v0 {

    /* JADX INFO: renamed from: a */
    public final String f270660a;

    /* JADX INFO: renamed from: b */
    public final String f270661b;

    /* JADX INFO: renamed from: c */
    public final String f270662c;

    /* JADX INFO: renamed from: d */
    public final String f270663d;

    /* JADX INFO: renamed from: e */
    public final int f270664e;

    /* JADX INFO: renamed from: f */
    public final String f270665f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f270666g;

    /* JADX INFO: renamed from: h */
    public final int f270667h;

    /* JADX INFO: renamed from: i */
    public final String f270668i;

    /* JADX INFO: renamed from: j */
    public final int f270669j;

    /* JADX INFO: renamed from: k */
    public final boolean f270670k;

    public y9v0(String str, String str2, String str3, String str4, int i, String str5, rcm0 rcm0Var, int i2, String str6, int i3, boolean z) {
        this.f270660a = str;
        this.f270661b = str2;
        this.f270662c = str3;
        this.f270663d = str4;
        this.f270664e = i;
        this.f270665f = str5;
        this.f270666g = rcm0Var;
        this.f270667h = i2;
        this.f270668i = str6;
        this.f270669j = i3;
        this.f270670k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9v0)) {
            return false;
        }
        y9v0 y9v0Var = (y9v0) obj;
        return wj50.m88271j(this.f270660a, y9v0Var.f270660a) && wj50.m88271j(this.f270661b, y9v0Var.f270661b) && wj50.m88271j(this.f270662c, y9v0Var.f270662c) && wj50.m88271j(this.f270663d, y9v0Var.f270663d) && this.f270664e == y9v0Var.f270664e && wj50.m88271j(this.f270665f, y9v0Var.f270665f) && this.f270666g.equals(y9v0Var.f270666g) && this.f270667h == y9v0Var.f270667h && wj50.m88271j(this.f270668i, y9v0Var.f270668i) && this.f270669j == y9v0Var.f270669j && this.f270670k == y9v0Var.f270670k;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f270660a.hashCode() * 31, 31, this.f270661b), 31, this.f270662c), 31, this.f270663d);
        int i = this.f270664e;
        return Boolean.hashCode(this.f270670k) + mt60.m62800g(this.f270669j, s571.m77243b(mt60.m62800g(this.f270667h, yds.m93483m(this.f270666g, s571.m77243b((iM77243b + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f270665f), 31), 31), 31, this.f270668i), 31);
    }
}
