package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p4w0 {

    /* JADX INFO: renamed from: a */
    public final String f174016a;

    /* JADX INFO: renamed from: b */
    public final String f174017b;

    /* JADX INFO: renamed from: c */
    public final String f174018c;

    /* JADX INFO: renamed from: d */
    public final String f174019d;

    /* JADX INFO: renamed from: e */
    public final boolean f174020e;

    public p4w0(String str, String str2, String str3, String str4, boolean z) {
        this.f174016a = str;
        this.f174017b = str2;
        this.f174018c = str3;
        this.f174019d = str4;
        this.f174020e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4w0)) {
            return false;
        }
        p4w0 p4w0Var = (p4w0) obj;
        return wj50.m88271j(this.f174016a, p4w0Var.f174016a) && wj50.m88271j(this.f174017b, p4w0Var.f174017b) && wj50.m88271j(this.f174018c, p4w0Var.f174018c) && wj50.m88271j(this.f174019d, p4w0Var.f174019d) && this.f174020e == p4w0Var.f174020e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f174016a.hashCode() * 31, 31, this.f174017b), 31, this.f174018c);
        String str = this.f174019d;
        return Boolean.hashCode(this.f174020e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
