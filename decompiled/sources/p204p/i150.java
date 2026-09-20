package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i150 {

    /* JADX INFO: renamed from: a */
    public final String f97392a;

    /* JADX INFO: renamed from: b */
    public final String f97393b;

    /* JADX INFO: renamed from: c */
    public final String f97394c;

    /* JADX INFO: renamed from: d */
    public final int f97395d;

    /* JADX INFO: renamed from: e */
    public final int f97396e;

    /* JADX INFO: renamed from: f */
    public final rcm0 f97397f;

    /* JADX INFO: renamed from: g */
    public final int f97398g;

    /* JADX INFO: renamed from: h */
    public final String f97399h;

    /* JADX INFO: renamed from: i */
    public final String f97400i;

    /* JADX INFO: renamed from: j */
    public final String f97401j;

    /* JADX INFO: renamed from: k */
    public final String f97402k;

    /* JADX INFO: renamed from: l */
    public final boolean f97403l;

    /* JADX INFO: renamed from: m */
    public final String f97404m;

    public i150(String str, String str2, String str3, int i, int i2, rcm0 rcm0Var, int i3, String str4, String str5, String str6, String str7, boolean z, String str8) {
        this.f97392a = str;
        this.f97393b = str2;
        this.f97394c = str3;
        this.f97395d = i;
        this.f97396e = i2;
        this.f97397f = rcm0Var;
        this.f97398g = i3;
        this.f97399h = str4;
        this.f97400i = str5;
        this.f97401j = str6;
        this.f97402k = str7;
        this.f97403l = z;
        this.f97404m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i150)) {
            return false;
        }
        i150 i150Var = (i150) obj;
        return wj50.m88271j(this.f97392a, i150Var.f97392a) && wj50.m88271j(this.f97393b, i150Var.f97393b) && wj50.m88271j(this.f97394c, i150Var.f97394c) && this.f97395d == i150Var.f97395d && this.f97396e == i150Var.f97396e && wj50.m88271j(this.f97397f, i150Var.f97397f) && this.f97398g == i150Var.f97398g && wj50.m88271j(this.f97399h, i150Var.f97399h) && wj50.m88271j(this.f97400i, i150Var.f97400i) && wj50.m88271j(this.f97401j, i150Var.f97401j) && wj50.m88271j(this.f97402k, i150Var.f97402k) && this.f97403l == i150Var.f97403l && wj50.m88271j(this.f97404m, i150Var.f97404m);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f97398g, yds.m93483m(this.f97397f, f710.m40938f(this.f97396e, f710.m40938f(this.f97395d, s571.m77243b(s571.m77243b(this.f97392a.hashCode() * 31, 31, this.f97393b), 31, this.f97394c), 31), 31), 31), 31), 31, this.f97399h), 31, this.f97400i), 31, this.f97401j);
        String str = this.f97402k;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f97403l);
        String str2 = this.f97404m;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
