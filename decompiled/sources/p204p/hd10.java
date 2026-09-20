package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hd10 extends jd10 {

    /* JADX INFO: renamed from: a */
    public final String f89961a;

    /* JADX INFO: renamed from: b */
    public final String f89962b;

    /* JADX INFO: renamed from: c */
    public final boolean f89963c;

    /* JADX INFO: renamed from: d */
    public final String f89964d;

    /* JADX INFO: renamed from: e */
    public final int f89965e;

    /* JADX INFO: renamed from: f */
    public final int f89966f;

    /* JADX INFO: renamed from: g */
    public final String f89967g;

    public hd10(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this.f89961a = str;
        this.f89962b = str2;
        this.f89963c = z;
        this.f89964d = str3;
        this.f89965e = i;
        this.f89966f = i2;
        this.f89967g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd10)) {
            return false;
        }
        hd10 hd10Var = (hd10) obj;
        return wj50.m88271j(this.f89961a, hd10Var.f89961a) && wj50.m88271j(this.f89962b, hd10Var.f89962b) && this.f89963c == hd10Var.f89963c && wj50.m88271j(this.f89964d, hd10Var.f89964d) && this.f89965e == hd10Var.f89965e && this.f89966f == hd10Var.f89966f && wj50.m88271j(this.f89967g, hd10Var.f89967g);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f89966f, mt60.m62800g(this.f89965e, s571.m77243b(s571.m77245d(s571.m77243b(this.f89961a.hashCode() * 31, 31, this.f89962b), 31, this.f89963c), 31, this.f89964d), 31), 31);
        String str = this.f89967g;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
