package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kul0 {

    /* JADX INFO: renamed from: a */
    public final boolean f126631a;

    /* JADX INFO: renamed from: b */
    public final boolean f126632b;

    /* JADX INFO: renamed from: c */
    public final boolean f126633c;

    /* JADX INFO: renamed from: d */
    public final boolean f126634d;

    /* JADX INFO: renamed from: e */
    public final boolean f126635e;

    /* JADX INFO: renamed from: f */
    public final String f126636f;

    /* JADX INFO: renamed from: g */
    public final String f126637g;

    /* JADX INFO: renamed from: h */
    public final String f126638h;

    /* JADX INFO: renamed from: i */
    public final String f126639i;

    /* JADX INFO: renamed from: j */
    public final String f126640j;

    public kul0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5) {
        this.f126631a = z;
        this.f126632b = z2;
        this.f126633c = z3;
        this.f126634d = z4;
        this.f126635e = z5;
        this.f126636f = str;
        this.f126637g = str2;
        this.f126638h = str3;
        this.f126639i = str4;
        this.f126640j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kul0)) {
            return false;
        }
        kul0 kul0Var = (kul0) obj;
        return this.f126631a == kul0Var.f126631a && this.f126632b == kul0Var.f126632b && this.f126633c == kul0Var.f126633c && this.f126634d == kul0Var.f126634d && this.f126635e == kul0Var.f126635e && wj50.m88271j(this.f126636f, kul0Var.f126636f) && wj50.m88271j(this.f126637g, kul0Var.f126637g) && wj50.m88271j(this.f126638h, kul0Var.f126638h) && wj50.m88271j(this.f126639i, kul0Var.f126639i) && wj50.m88271j(this.f126640j, kul0Var.f126640j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f126631a) * 31, 31, this.f126632b), 31, this.f126633c), 31, this.f126634d), 31, this.f126635e);
        String str = this.f126636f;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126637g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126638h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f126639i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f126640j;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
