package p204p;

/* JADX INFO: renamed from: p.uh */
/* JADX INFO: loaded from: classes.dex */
public final class C2457uh extends fmg1 {

    /* JADX INFO: renamed from: c */
    public final int f230299c;

    /* JADX INFO: renamed from: d */
    public final String f230300d;

    /* JADX INFO: renamed from: e */
    public final String f230301e;

    /* JADX INFO: renamed from: f */
    public final String f230302f;

    /* JADX INFO: renamed from: g */
    public final boolean f230303g;

    /* JADX INFO: renamed from: h */
    public final String f230304h;

    public /* synthetic */ C2457uh(int i, String str, String str2) {
        this(str, i, str2, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2457uh)) {
            return false;
        }
        C2457uh c2457uh = (C2457uh) obj;
        return this.f230299c == c2457uh.f230299c && wj50.m88271j(this.f230300d, c2457uh.f230300d) && wj50.m88271j(this.f230301e, c2457uh.f230301e) && wj50.m88271j(this.f230302f, c2457uh.f230302f) && this.f230303g == c2457uh.f230303g && wj50.m88271j(this.f230304h, c2457uh.f230304h);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f230299c) * 31;
        String str = this.f230300d;
        int iHashCode = (iM38547C + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f230301e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f230302f;
        int iM77245d = s571.m77245d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f230303g);
        String str4 = this.f230304h;
        return iM77245d + (str4 != null ? str4.hashCode() : 0);
    }

    public C2457uh(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f230299c = i;
        this.f230300d = str;
        this.f230301e = str2;
        this.f230302f = str3;
        this.f230303g = z;
        this.f230304h = str4;
    }
}
