package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lxw0 {

    /* JADX INFO: renamed from: a */
    public final kxw0 f137899a;

    /* JADX INFO: renamed from: b */
    public final String f137900b;

    /* JADX INFO: renamed from: c */
    public final String f137901c;

    /* JADX INFO: renamed from: d */
    public final String f137902d;

    /* JADX INFO: renamed from: e */
    public final String f137903e;

    /* JADX INFO: renamed from: f */
    public final String f137904f;

    /* JADX INFO: renamed from: g */
    public final String f137905g;

    /* JADX INFO: renamed from: h */
    public final int f137906h;

    /* JADX INFO: renamed from: i */
    public final int f137907i;

    public lxw0(kxw0 kxw0Var, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.f137899a = kxw0Var;
        this.f137900b = str;
        this.f137901c = str2;
        this.f137902d = str3;
        this.f137903e = str4;
        this.f137904f = str5;
        this.f137905g = str6;
        this.f137906h = i;
        this.f137907i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxw0)) {
            return false;
        }
        lxw0 lxw0Var = (lxw0) obj;
        return wj50.m88271j(this.f137899a, lxw0Var.f137899a) && wj50.m88271j(this.f137900b, lxw0Var.f137900b) && wj50.m88271j(this.f137901c, lxw0Var.f137901c) && wj50.m88271j(this.f137902d, lxw0Var.f137902d) && wj50.m88271j(this.f137903e, lxw0Var.f137903e) && wj50.m88271j(this.f137904f, lxw0Var.f137904f) && wj50.m88271j(this.f137905g, lxw0Var.f137905g) && this.f137906h == lxw0Var.f137906h && this.f137907i == lxw0Var.f137907i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f137899a.hashCode() * 31, 31, this.f137900b), 31, this.f137901c), 31, this.f137902d), 31, this.f137903e), 31, this.f137904f);
        String str = this.f137905g;
        return Integer.hashCode(this.f137907i) + mt60.m62800g(this.f137906h, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
