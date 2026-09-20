package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bqa1 {

    /* JADX INFO: renamed from: a */
    public final String f29763a;

    /* JADX INFO: renamed from: b */
    public final String f29764b;

    /* JADX INFO: renamed from: c */
    public final boolean f29765c;

    /* JADX INFO: renamed from: d */
    public final String f29766d;

    /* JADX INFO: renamed from: e */
    public final String f29767e;

    /* JADX INFO: renamed from: f */
    public final boolean f29768f;

    /* JADX INFO: renamed from: g */
    public final String f29769g;

    public bqa1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f29763a = str;
        this.f29764b = str2;
        this.f29765c = z;
        this.f29766d = str3;
        this.f29767e = str4;
        this.f29768f = z2;
        this.f29769g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqa1)) {
            return false;
        }
        bqa1 bqa1Var = (bqa1) obj;
        return wj50.m88271j(this.f29763a, bqa1Var.f29763a) && wj50.m88271j(this.f29764b, bqa1Var.f29764b) && this.f29765c == bqa1Var.f29765c && wj50.m88271j(this.f29766d, bqa1Var.f29766d) && wj50.m88271j(this.f29767e, bqa1Var.f29767e) && this.f29768f == bqa1Var.f29768f && wj50.m88271j(this.f29769g, bqa1Var.f29769g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f29763a.hashCode() * 31, 31, this.f29764b), 31, this.f29765c);
        String str = this.f29766d;
        int iM77245d2 = s571.m77245d(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f29767e), 31, this.f29768f);
        String str2 = this.f29769g;
        return iM77245d2 + (str2 != null ? str2.hashCode() : 0);
    }
}
