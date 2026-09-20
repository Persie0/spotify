package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sdd {

    /* JADX INFO: renamed from: a */
    public final xcl0 f207984a;

    /* JADX INFO: renamed from: b */
    public final boolean f207985b;

    /* JADX INFO: renamed from: c */
    public final boolean f207986c;

    /* JADX INFO: renamed from: d */
    public final boolean f207987d;

    /* JADX INFO: renamed from: e */
    public final boolean f207988e;

    /* JADX INFO: renamed from: f */
    public final int f207989f;

    /* JADX INFO: renamed from: g */
    public final qf40 f207990g;

    /* JADX INFO: renamed from: h */
    public final boolean f207991h;

    /* JADX INFO: renamed from: i */
    public final String f207992i;

    /* JADX INFO: renamed from: j */
    public final String f207993j;

    /* JADX INFO: renamed from: k */
    public final rv01 f207994k;

    public sdd(xcl0 xcl0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, qf40 qf40Var, boolean z5, String str, String str2, rv01 rv01Var) {
        this.f207984a = xcl0Var;
        this.f207985b = z;
        this.f207986c = z2;
        this.f207987d = z3;
        this.f207988e = z4;
        this.f207989f = i;
        this.f207990g = qf40Var;
        this.f207991h = z5;
        this.f207992i = str;
        this.f207993j = str2;
        this.f207994k = rv01Var;
    }

    /* JADX INFO: renamed from: a */
    public static sdd m77831a(sdd sddVar, xcl0 xcl0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, qf40 qf40Var, boolean z5, String str, String str2, rv01 rv01Var, int i2) {
        if ((i2 & 1) != 0) {
            xcl0Var = sddVar.f207984a;
        }
        xcl0 xcl0Var2 = xcl0Var;
        if ((i2 & 2) != 0) {
            z = sddVar.f207985b;
        }
        boolean z6 = z;
        if ((i2 & 4) != 0) {
            z2 = sddVar.f207986c;
        }
        boolean z7 = z2;
        boolean z8 = (i2 & 8) != 0 ? sddVar.f207987d : z3;
        boolean z9 = (i2 & 16) != 0 ? sddVar.f207988e : z4;
        int i3 = (i2 & 32) != 0 ? sddVar.f207989f : i;
        qf40 qf40Var2 = (i2 & 64) != 0 ? sddVar.f207990g : qf40Var;
        boolean z10 = (i2 & 128) != 0 ? sddVar.f207991h : z5;
        String str3 = (i2 & 256) != 0 ? sddVar.f207992i : str;
        String str4 = (i2 & 512) != 0 ? sddVar.f207993j : str2;
        rv01 rv01Var2 = (i2 & 1024) != 0 ? sddVar.f207994k : rv01Var;
        sddVar.getClass();
        return new sdd(xcl0Var2, z6, z7, z8, z9, i3, qf40Var2, z10, str3, str4, rv01Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdd)) {
            return false;
        }
        sdd sddVar = (sdd) obj;
        return wj50.m88271j(this.f207984a, sddVar.f207984a) && this.f207985b == sddVar.f207985b && this.f207986c == sddVar.f207986c && this.f207987d == sddVar.f207987d && this.f207988e == sddVar.f207988e && this.f207989f == sddVar.f207989f && wj50.m88271j(this.f207990g, sddVar.f207990g) && this.f207991h == sddVar.f207991h && wj50.m88271j(this.f207992i, sddVar.f207992i) && wj50.m88271j(this.f207993j, sddVar.f207993j) && wj50.m88271j(this.f207994k, sddVar.f207994k);
    }

    public final int hashCode() {
        xcl0 xcl0Var = this.f207984a;
        int iM77245d = s571.m77245d(fr0.m42461e(this.f207990g, f710.m40938f(this.f207989f, s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((xcl0Var == null ? 0 : xcl0Var.hashCode()) * 31, 31, this.f207985b), 31, this.f207986c), 31, this.f207987d), 31, this.f207988e), 31), 31), 31, this.f207991h);
        String str = this.f207992i;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f207993j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        rv01 rv01Var = this.f207994k;
        return iHashCode2 + (rv01Var != null ? rv01Var.hashCode() : 0);
    }
}
