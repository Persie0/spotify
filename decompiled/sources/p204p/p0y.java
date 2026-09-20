package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p0y {

    /* JADX INFO: renamed from: a */
    public final String f172828a;

    /* JADX INFO: renamed from: b */
    public final String f172829b;

    /* JADX INFO: renamed from: c */
    public final String f172830c;

    /* JADX INFO: renamed from: d */
    public final boolean f172831d;

    /* JADX INFO: renamed from: e */
    public final boolean f172832e;

    /* JADX INFO: renamed from: f */
    public final String f172833f;

    public p0y(String str, int i, String str2, String str3, boolean z, String str4) {
        boolean z2 = (i & 16) != 0;
        str4 = (i & 32) != 0 ? null : str4;
        this.f172828a = str;
        this.f172829b = str2;
        this.f172830c = str3;
        this.f172831d = z;
        this.f172832e = z2;
        this.f172833f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0y)) {
            return false;
        }
        p0y p0yVar = (p0y) obj;
        return wj50.m88271j(this.f172828a, p0yVar.f172828a) && wj50.m88271j(this.f172829b, p0yVar.f172829b) && wj50.m88271j(this.f172830c, p0yVar.f172830c) && this.f172831d == p0yVar.f172831d && this.f172832e == p0yVar.f172832e && wj50.m88271j(this.f172833f, p0yVar.f172833f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f172828a.hashCode() * 31, 31, this.f172829b);
        String str = this.f172830c;
        int iM77245d = s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f172831d), 31, this.f172832e);
        String str2 = this.f172833f;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
