package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vil0 {

    /* JADX INFO: renamed from: a */
    public final String f241739a;

    /* JADX INFO: renamed from: b */
    public final String f241740b;

    /* JADX INFO: renamed from: c */
    public final String f241741c;

    /* JADX INFO: renamed from: d */
    public final String f241742d;

    /* JADX INFO: renamed from: e */
    public final boolean f241743e;

    public vil0(String str, String str2, String str3, String str4, boolean z) {
        this.f241739a = str;
        this.f241740b = str2;
        this.f241741c = str3;
        this.f241742d = str4;
        this.f241743e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vil0)) {
            return false;
        }
        vil0 vil0Var = (vil0) obj;
        return wj50.m88271j(this.f241739a, vil0Var.f241739a) && wj50.m88271j(this.f241740b, vil0Var.f241740b) && wj50.m88271j(this.f241741c, vil0Var.f241741c) && wj50.m88271j(this.f241742d, vil0Var.f241742d) && this.f241743e == vil0Var.f241743e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(f710.m40938f(2, s571.m77245d(s571.m77243b(this.f241739a.hashCode() * 31, 31, this.f241740b), 31, false), 31), 31, this.f241741c);
        String str = this.f241742d;
        return Boolean.hashCode(this.f241743e) + ((iM77243b + (str != null ? str.hashCode() : 0)) * 31);
    }
}
