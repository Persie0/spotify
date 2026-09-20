package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fzd1 {

    /* JADX INFO: renamed from: a */
    public final String f74980a;

    /* JADX INFO: renamed from: b */
    public final String f74981b;

    /* JADX INFO: renamed from: c */
    public final String f74982c;

    /* JADX INFO: renamed from: d */
    public final String f74983d;

    /* JADX INFO: renamed from: e */
    public final boolean f74984e;

    /* JADX INFO: renamed from: f */
    public final String f74985f;

    /* JADX INFO: renamed from: g */
    public final String f74986g;

    /* JADX INFO: renamed from: h */
    public final boolean f74987h;

    /* JADX INFO: renamed from: i */
    public final String f74988i;

    public fzd1(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.f74980a = str;
        this.f74981b = str2;
        this.f74982c = str3;
        this.f74983d = str4;
        this.f74984e = z;
        this.f74985f = str5;
        this.f74986g = str6;
        this.f74987h = z2;
        this.f74988i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzd1)) {
            return false;
        }
        fzd1 fzd1Var = (fzd1) obj;
        return wj50.m88271j(this.f74980a, fzd1Var.f74980a) && wj50.m88271j(this.f74981b, fzd1Var.f74981b) && wj50.m88271j(this.f74982c, fzd1Var.f74982c) && wj50.m88271j(this.f74983d, fzd1Var.f74983d) && this.f74984e == fzd1Var.f74984e && wj50.m88271j(this.f74985f, fzd1Var.f74985f) && wj50.m88271j(this.f74986g, fzd1Var.f74986g) && this.f74987h == fzd1Var.f74987h && wj50.m88271j(this.f74988i, fzd1Var.f74988i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f74980a.hashCode() * 31, 31, this.f74981b), 31, this.f74982c), 31, this.f74983d), 31, this.f74984e);
        String str = this.f74985f;
        int iM77245d2 = s571.m77245d(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f74986g), 31, this.f74987h);
        String str2 = this.f74988i;
        return iM77245d2 + (str2 != null ? str2.hashCode() : 0);
    }
}
