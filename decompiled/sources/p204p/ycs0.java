package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ycs0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f271556a;

    /* JADX INFO: renamed from: b */
    public final String f271557b;

    /* JADX INFO: renamed from: c */
    public final String f271558c;

    /* JADX INFO: renamed from: d */
    public final String f271559d;

    /* JADX INFO: renamed from: e */
    public final String f271560e;

    /* JADX INFO: renamed from: f */
    public final String f271561f;

    /* JADX INFO: renamed from: g */
    public final String f271562g;

    /* JADX INFO: renamed from: h */
    public final String f271563h;

    /* JADX INFO: renamed from: i */
    public final xcs0 f271564i;

    /* JADX INFO: renamed from: j */
    public final xcs0 f271565j;

    /* JADX INFO: renamed from: k */
    public final String f271566k;

    public ycs0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, xcs0 xcs0Var, xcs0 xcs0Var2, String str9) {
        this.f271556a = str;
        this.f271557b = str2;
        this.f271558c = str3;
        this.f271559d = str4;
        this.f271560e = str5;
        this.f271561f = str6;
        this.f271562g = str7;
        this.f271563h = str8;
        this.f271564i = xcs0Var;
        this.f271565j = xcs0Var2;
        this.f271566k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycs0)) {
            return false;
        }
        ycs0 ycs0Var = (ycs0) obj;
        return wj50.m88271j(this.f271556a, ycs0Var.f271556a) && wj50.m88271j(this.f271557b, ycs0Var.f271557b) && wj50.m88271j(this.f271558c, ycs0Var.f271558c) && wj50.m88271j(this.f271559d, ycs0Var.f271559d) && wj50.m88271j(this.f271560e, ycs0Var.f271560e) && wj50.m88271j(this.f271561f, ycs0Var.f271561f) && wj50.m88271j(this.f271562g, ycs0Var.f271562g) && wj50.m88271j(this.f271563h, ycs0Var.f271563h) && wj50.m88271j(this.f271564i, ycs0Var.f271564i) && wj50.m88271j(this.f271565j, ycs0Var.f271565j) && wj50.m88271j(this.f271566k, ycs0Var.f271566k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f271556a.hashCode() * 31, 31, this.f271557b), 31, this.f271558c), 31, this.f271559d), 31, this.f271560e);
        String str = this.f271561f;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f271562g);
        String str2 = this.f271563h;
        int iHashCode = (iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        xcs0 xcs0Var = this.f271564i;
        int iHashCode2 = (iHashCode + (xcs0Var == null ? 0 : xcs0Var.hashCode())) * 31;
        xcs0 xcs0Var2 = this.f271565j;
        int iHashCode3 = (iHashCode2 + (xcs0Var2 == null ? 0 : xcs0Var2.hashCode())) * 31;
        String str3 = this.f271566k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
