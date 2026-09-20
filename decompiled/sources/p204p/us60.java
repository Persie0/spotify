package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class us60 {

    /* JADX INFO: renamed from: a */
    public final String f233535a;

    /* JADX INFO: renamed from: b */
    public final String f233536b;

    /* JADX INFO: renamed from: c */
    public final String f233537c;

    /* JADX INFO: renamed from: d */
    public final String f233538d;

    /* JADX INFO: renamed from: e */
    public final String f233539e;

    /* JADX INFO: renamed from: f */
    public final int f233540f;

    /* JADX INFO: renamed from: g */
    public final String f233541g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f233542h;

    /* JADX INFO: renamed from: i */
    public final int f233543i;

    /* JADX INFO: renamed from: j */
    public final int f233544j;

    public us60(String str, String str2, String str3, String str4, String str5, int i, String str6, rcm0 rcm0Var, int i2, int i3) {
        this.f233535a = str;
        this.f233536b = str2;
        this.f233537c = str3;
        this.f233538d = str4;
        this.f233539e = str5;
        this.f233540f = i;
        this.f233541g = str6;
        this.f233542h = rcm0Var;
        this.f233543i = i2;
        this.f233544j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us60)) {
            return false;
        }
        us60 us60Var = (us60) obj;
        return wj50.m88271j(this.f233535a, us60Var.f233535a) && wj50.m88271j(this.f233536b, us60Var.f233536b) && wj50.m88271j(this.f233537c, us60Var.f233537c) && wj50.m88271j(this.f233538d, us60Var.f233538d) && wj50.m88271j(this.f233539e, us60Var.f233539e) && this.f233540f == us60Var.f233540f && wj50.m88271j(this.f233541g, us60Var.f233541g) && this.f233542h.equals(us60Var.f233542h) && this.f233543i == us60Var.f233543i && this.f233544j == us60Var.f233544j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f233535a.hashCode() * 31, 31, this.f233536b);
        String str = this.f233537c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f233538d;
        return Integer.hashCode(this.f233544j) + f710.m40938f(this.f233543i, yds.m93483m(this.f233542h, s571.m77243b(f710.m40938f(this.f233540f, s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f233539e), 31), 31, this.f233541g), 31), 31);
    }
}
