package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nba0 {

    /* JADX INFO: renamed from: a */
    public final String f152225a;

    /* JADX INFO: renamed from: b */
    public final String f152226b;

    /* JADX INFO: renamed from: c */
    public final String f152227c;

    /* JADX INFO: renamed from: d */
    public final xfr f152228d;

    /* JADX INFO: renamed from: e */
    public final String f152229e;

    /* JADX INFO: renamed from: f */
    public final String f152230f;

    /* JADX INFO: renamed from: g */
    public final boolean f152231g;

    /* JADX INFO: renamed from: h */
    public final String f152232h;

    /* JADX INFO: renamed from: i */
    public final Long f152233i;

    public nba0(String str, String str2, String str3, xfr xfrVar, String str4, String str5, boolean z, String str6, Long l) {
        this.f152225a = str;
        this.f152226b = str2;
        this.f152227c = str3;
        this.f152228d = xfrVar;
        this.f152229e = str4;
        this.f152230f = str5;
        this.f152231g = z;
        this.f152232h = str6;
        this.f152233i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba0)) {
            return false;
        }
        nba0 nba0Var = (nba0) obj;
        return wj50.m88271j(this.f152225a, nba0Var.f152225a) && wj50.m88271j(this.f152226b, nba0Var.f152226b) && wj50.m88271j(this.f152227c, nba0Var.f152227c) && this.f152228d == nba0Var.f152228d && wj50.m88271j(this.f152229e, nba0Var.f152229e) && wj50.m88271j(this.f152230f, nba0Var.f152230f) && this.f152231g == nba0Var.f152231g && wj50.m88271j(this.f152232h, nba0Var.f152232h) && wj50.m88271j(this.f152233i, nba0Var.f152233i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((this.f152228d.hashCode() + s571.m77243b(s571.m77243b(this.f152225a.hashCode() * 31, 31, this.f152226b), 31, this.f152227c)) * 31, 31, this.f152229e), 31, this.f152230f), 31, this.f152231g), 31, true), 31, this.f152232h);
        Long l = this.f152233i;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }
}
