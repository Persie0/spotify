package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rv20 {

    /* JADX INFO: renamed from: a */
    public final String f202977a;

    /* JADX INFO: renamed from: b */
    public final String f202978b;

    /* JADX INFO: renamed from: c */
    public final int f202979c;

    /* JADX INFO: renamed from: d */
    public final String f202980d;

    /* JADX INFO: renamed from: e */
    public final String f202981e;

    /* JADX INFO: renamed from: f */
    public final String f202982f;

    /* JADX INFO: renamed from: g */
    public final String f202983g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f202984h;

    /* JADX INFO: renamed from: i */
    public final is9 f202985i;

    /* JADX INFO: renamed from: j */
    public final int f202986j;

    public rv20(String str, String str2, int i, String str3, String str4, String str5, String str6, rcm0 rcm0Var, is9 is9Var, int i2) {
        this.f202977a = str;
        this.f202978b = str2;
        this.f202979c = i;
        this.f202980d = str3;
        this.f202981e = str4;
        this.f202982f = str5;
        this.f202983g = str6;
        this.f202984h = rcm0Var;
        this.f202985i = is9Var;
        this.f202986j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv20)) {
            return false;
        }
        rv20 rv20Var = (rv20) obj;
        return wj50.m88271j(this.f202977a, rv20Var.f202977a) && wj50.m88271j(this.f202978b, rv20Var.f202978b) && this.f202979c == rv20Var.f202979c && wj50.m88271j(this.f202980d, rv20Var.f202980d) && wj50.m88271j(this.f202981e, rv20Var.f202981e) && wj50.m88271j(this.f202982f, rv20Var.f202982f) && wj50.m88271j(this.f202983g, rv20Var.f202983g) && this.f202984h.equals(rv20Var.f202984h) && this.f202985i.equals(rv20Var.f202985i) && this.f202986j == rv20Var.f202986j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f202979c, s571.m77243b(this.f202977a.hashCode() * 31, 31, this.f202978b), 31), 31, this.f202980d);
        String str = this.f202981e;
        return edb.m38547C(this.f202986j) + ((this.f202985i.hashCode() + yds.m93483m(this.f202984h, s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f202982f), 31, this.f202983g), 31)) * 31);
    }
}
