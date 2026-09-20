package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eg81 {

    /* JADX INFO: renamed from: a */
    public final String f59245a;

    /* JADX INFO: renamed from: b */
    public final String f59246b;

    /* JADX INFO: renamed from: c */
    public final String f59247c;

    /* JADX INFO: renamed from: d */
    public final boolean f59248d;

    /* JADX INFO: renamed from: e */
    public final boolean f59249e;

    /* JADX INFO: renamed from: f */
    public final osj f59250f;

    /* JADX INFO: renamed from: g */
    public final boolean f59251g;

    /* JADX INFO: renamed from: h */
    public final bz31 f59252h;

    /* JADX INFO: renamed from: i */
    public final boolean f59253i;

    /* JADX INFO: renamed from: j */
    public final String f59254j;

    /* JADX INFO: renamed from: k */
    public final String f59255k;

    public eg81(String str, String str2, String str3, boolean z, boolean z2, osj osjVar, boolean z3, bz31 bz31Var, boolean z4, String str4, String str5) {
        this.f59245a = str;
        this.f59246b = str2;
        this.f59247c = str3;
        this.f59248d = z;
        this.f59249e = z2;
        this.f59250f = osjVar;
        this.f59251g = z3;
        this.f59252h = bz31Var;
        this.f59253i = z4;
        this.f59254j = str4;
        this.f59255k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg81)) {
            return false;
        }
        eg81 eg81Var = (eg81) obj;
        return wj50.m88271j(this.f59245a, eg81Var.f59245a) && wj50.m88271j(this.f59246b, eg81Var.f59246b) && wj50.m88271j(this.f59247c, eg81Var.f59247c) && this.f59248d == eg81Var.f59248d && this.f59249e == eg81Var.f59249e && this.f59250f == eg81Var.f59250f && this.f59251g == eg81Var.f59251g && wj50.m88271j(this.f59252h, eg81Var.f59252h) && this.f59253i == eg81Var.f59253i && wj50.m88271j(this.f59254j, eg81Var.f59254j) && wj50.m88271j(this.f59255k, eg81Var.f59255k);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f59252h.hashCode() + s571.m77245d((this.f59250f.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f59245a.hashCode() * 31, 31, this.f59246b), 31, this.f59247c), 31, this.f59248d), 31, this.f59249e)) * 31, 31, this.f59251g)) * 31, 31, this.f59253i), 31, false);
        String str = this.f59254j;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59255k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
