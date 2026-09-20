package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class m9o0 {

    /* JADX INFO: renamed from: a */
    public final h9o0 f141349a;

    /* JADX INFO: renamed from: b */
    public final String f141350b;

    /* JADX INFO: renamed from: c */
    public final String f141351c;

    /* JADX INFO: renamed from: d */
    public final String f141352d;

    /* JADX INFO: renamed from: e */
    public final boolean f141353e;

    /* JADX INFO: renamed from: f */
    public final int f141354f;

    public m9o0(h9o0 h9o0Var, String str, String str2, String str3, boolean z, int i) {
        this.f141349a = h9o0Var;
        this.f141350b = str;
        this.f141351c = str2;
        this.f141352d = str3;
        this.f141353e = z;
        this.f141354f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9o0)) {
            return false;
        }
        m9o0 m9o0Var = (m9o0) obj;
        return wj50.m88271j(this.f141349a, m9o0Var.f141349a) && wj50.m88271j(this.f141350b, m9o0Var.f141350b) && wj50.m88271j(this.f141351c, m9o0Var.f141351c) && wj50.m88271j(this.f141352d, m9o0Var.f141352d) && this.f141353e == m9o0Var.f141353e && this.f141354f == m9o0Var.f141354f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f141349a.hashCode() * 31, 31, this.f141350b);
        String str = this.f141351c;
        return Integer.hashCode(this.f141354f) + s571.m77245d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f141352d), 31, this.f141353e);
    }
}
