package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class xvq0 {

    /* JADX INFO: renamed from: a */
    public final String f266451a;

    /* JADX INFO: renamed from: b */
    public final String f266452b;

    /* JADX INFO: renamed from: c */
    public final boolean f266453c;

    /* JADX INFO: renamed from: d */
    public final String f266454d;

    /* JADX INFO: renamed from: e */
    public final String f266455e;

    /* JADX INFO: renamed from: f */
    public final boolean f266456f;

    /* JADX INFO: renamed from: g */
    public final List f266457g;

    /* JADX INFO: renamed from: h */
    public final long f266458h;

    /* JADX INFO: renamed from: i */
    public final String f266459i;

    /* JADX INFO: renamed from: j */
    public final boolean f266460j;

    /* JADX INFO: renamed from: k */
    public final boolean f266461k;

    /* JADX INFO: renamed from: l */
    public final String f266462l;

    /* JADX INFO: renamed from: m */
    public final List f266463m;

    /* JADX INFO: renamed from: n */
    public final boolean f266464n;

    public xvq0(String str, String str2, boolean z, String str3, String str4, boolean z2, List list, long j, String str5, boolean z3, boolean z4, String str6, List list2, boolean z5) {
        this.f266451a = str;
        this.f266452b = str2;
        this.f266453c = z;
        this.f266454d = str3;
        this.f266455e = str4;
        this.f266456f = z2;
        this.f266457g = list;
        this.f266458h = j;
        this.f266459i = str5;
        this.f266460j = z3;
        this.f266461k = z4;
        this.f266462l = str6;
        this.f266463m = list2;
        this.f266464n = z5;
    }

    /* JADX INFO: renamed from: a */
    public static xvq0 m92251a(xvq0 xvq0Var, boolean z, boolean z2, int i) {
        String str = xvq0Var.f266451a;
        String str2 = xvq0Var.f266452b;
        boolean z3 = (i & 4) != 0 ? xvq0Var.f266453c : z;
        String str3 = xvq0Var.f266454d;
        boolean z4 = z3;
        String str4 = xvq0Var.f266455e;
        boolean z5 = xvq0Var.f266456f;
        List list = xvq0Var.f266457g;
        long j = xvq0Var.f266458h;
        String str5 = xvq0Var.f266459i;
        boolean z6 = (i & 512) != 0 ? xvq0Var.f266460j : z2;
        boolean z7 = (i & 1024) != 0 ? xvq0Var.f266461k : false;
        String str6 = xvq0Var.f266462l;
        List list2 = xvq0Var.f266463m;
        boolean z8 = xvq0Var.f266464n;
        xvq0Var.getClass();
        return new xvq0(str, str2, z4, str3, str4, z5, list, j, str5, z6, z7, str6, list2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvq0)) {
            return false;
        }
        xvq0 xvq0Var = (xvq0) obj;
        return wj50.m88271j(this.f266451a, xvq0Var.f266451a) && wj50.m88271j(this.f266452b, xvq0Var.f266452b) && this.f266453c == xvq0Var.f266453c && wj50.m88271j(this.f266454d, xvq0Var.f266454d) && wj50.m88271j(this.f266455e, xvq0Var.f266455e) && this.f266456f == xvq0Var.f266456f && wj50.m88271j(this.f266457g, xvq0Var.f266457g) && this.f266458h == xvq0Var.f266458h && wj50.m88271j(this.f266459i, xvq0Var.f266459i) && this.f266460j == xvq0Var.f266460j && this.f266461k == xvq0Var.f266461k && wj50.m88271j(this.f266462l, xvq0Var.f266462l) && wj50.m88271j(this.f266463m, xvq0Var.f266463m) && this.f266464n == xvq0Var.f266464n;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(this.f266451a.hashCode() * 31, 31, this.f266452b), 31, this.f266453c), 31, this.f266454d), 31, this.f266455e), 31, this.f266456f);
        List list = this.f266457g;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77243b(dq60.m36605e((iM77245d + (list == null ? 0 : list.hashCode())) * 31, this.f266458h, 31), 31, this.f266459i), 31, this.f266460j), 31, this.f266461k);
        String str = this.f266462l;
        return Boolean.hashCode(this.f266464n) + s571.m77244c((iM77245d2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f266463m);
    }
}
