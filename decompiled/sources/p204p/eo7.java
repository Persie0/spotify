package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eo7 {

    /* JADX INFO: renamed from: a */
    public final String f61331a;

    /* JADX INFO: renamed from: b */
    public final String f61332b;

    /* JADX INFO: renamed from: c */
    public final String f61333c;

    /* JADX INFO: renamed from: d */
    public final String f61334d;

    /* JADX INFO: renamed from: e */
    public final String f61335e;

    /* JADX INFO: renamed from: f */
    public final is9 f61336f;

    /* JADX INFO: renamed from: g */
    public final String f61337g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f61338h;

    /* JADX INFO: renamed from: i */
    public final int f61339i;

    public eo7(String str, String str2, String str3, String str4, String str5, is9 is9Var, String str6, rcm0 rcm0Var, int i) {
        this.f61331a = str;
        this.f61332b = str2;
        this.f61333c = str3;
        this.f61334d = str4;
        this.f61335e = str5;
        this.f61336f = is9Var;
        this.f61337g = str6;
        this.f61338h = rcm0Var;
        this.f61339i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo7)) {
            return false;
        }
        eo7 eo7Var = (eo7) obj;
        return wj50.m88271j(this.f61331a, eo7Var.f61331a) && wj50.m88271j(this.f61332b, eo7Var.f61332b) && wj50.m88271j(this.f61333c, eo7Var.f61333c) && wj50.m88271j(this.f61334d, eo7Var.f61334d) && wj50.m88271j(this.f61335e, eo7Var.f61335e) && this.f61336f.equals(eo7Var.f61336f) && wj50.m88271j(this.f61337g, eo7Var.f61337g) && this.f61338h.equals(eo7Var.f61338h) && this.f61339i == eo7Var.f61339i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f61331a.hashCode() * 31, 31, this.f61332b);
        String str = this.f61333c;
        return Integer.hashCode(this.f61339i) + yds.m93483m(this.f61338h, s571.m77243b((this.f61336f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61334d), 31, this.f61335e), 31, false)) * 31, 31, this.f61337g), 31);
    }
}
