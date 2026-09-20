package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gkp0 {

    /* JADX INFO: renamed from: a */
    public final String f80883a;

    /* JADX INFO: renamed from: b */
    public final boolean f80884b;

    /* JADX INFO: renamed from: c */
    public final boolean f80885c;

    /* JADX INFO: renamed from: d */
    public final boolean f80886d;

    /* JADX INFO: renamed from: e */
    public final String f80887e;

    /* JADX INFO: renamed from: f */
    public final String f80888f;

    /* JADX INFO: renamed from: g */
    public final String f80889g;

    /* JADX INFO: renamed from: h */
    public final boolean f80890h;

    /* JADX INFO: renamed from: i */
    public final ikp0 f80891i;

    /* JADX INFO: renamed from: j */
    public final boolean f80892j;

    public gkp0(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, ikp0 ikp0Var, boolean z5) {
        this.f80883a = str;
        this.f80884b = z;
        this.f80885c = z2;
        this.f80886d = z3;
        this.f80887e = str2;
        this.f80888f = str3;
        this.f80889g = str4;
        this.f80890h = z4;
        this.f80891i = ikp0Var;
        this.f80892j = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkp0)) {
            return false;
        }
        gkp0 gkp0Var = (gkp0) obj;
        return wj50.m88271j(this.f80883a, gkp0Var.f80883a) && this.f80884b == gkp0Var.f80884b && this.f80885c == gkp0Var.f80885c && this.f80886d == gkp0Var.f80886d && wj50.m88271j(this.f80887e, gkp0Var.f80887e) && wj50.m88271j(this.f80888f, gkp0Var.f80888f) && wj50.m88271j(this.f80889g, gkp0Var.f80889g) && this.f80890h == gkp0Var.f80890h && wj50.m88271j(this.f80891i, gkp0Var.f80891i) && this.f80892j == gkp0Var.f80892j;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(this.f80883a.hashCode() * 31, 31, this.f80884b), 31, this.f80885c), 31, this.f80886d);
        String str = this.f80887e;
        return Boolean.hashCode(this.f80892j) + ((this.f80891i.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f80888f), 31, this.f80889g), 31, this.f80890h)) * 31);
    }
}
