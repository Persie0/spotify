package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vt91 {

    /* JADX INFO: renamed from: a */
    public final String f244581a;

    /* JADX INFO: renamed from: b */
    public final kbm0 f244582b;

    /* JADX INFO: renamed from: c */
    public final String f244583c;

    /* JADX INFO: renamed from: d */
    public final String f244584d;

    /* JADX INFO: renamed from: e */
    public final String f244585e;

    /* JADX INFO: renamed from: f */
    public final String f244586f;

    /* JADX INFO: renamed from: g */
    public final String f244587g;

    /* JADX INFO: renamed from: h */
    public final String f244588h;

    /* JADX INFO: renamed from: i */
    public final Integer f244589i;

    public vt91(String str, kbm0 kbm0Var, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.f244581a = str;
        this.f244582b = kbm0Var;
        this.f244583c = str2;
        this.f244584d = str3;
        this.f244585e = str4;
        this.f244586f = str5;
        this.f244587g = str6;
        this.f244588h = str7;
        this.f244589i = num;
    }

    /* JADX INFO: renamed from: a */
    public static vt91 m86373a(vt91 vt91Var, kbm0 kbm0Var, String str, String str2, int i) {
        String str3 = vt91Var.f244581a;
        if ((i & 4) != 0) {
            str = vt91Var.f244583c;
        }
        return new vt91(str3, kbm0Var, str, vt91Var.f244584d, str2, vt91Var.f244586f, vt91Var.f244587g, vt91Var.f244588h, vt91Var.f244589i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt91)) {
            return false;
        }
        vt91 vt91Var = (vt91) obj;
        return wj50.m88271j(this.f244581a, vt91Var.f244581a) && wj50.m88271j(this.f244582b, vt91Var.f244582b) && wj50.m88271j(this.f244583c, vt91Var.f244583c) && wj50.m88271j(this.f244584d, vt91Var.f244584d) && wj50.m88271j(this.f244585e, vt91Var.f244585e) && wj50.m88271j(this.f244586f, vt91Var.f244586f) && wj50.m88271j(this.f244587g, vt91Var.f244587g) && wj50.m88271j(this.f244588h, vt91Var.f244588h) && wj50.m88271j(this.f244589i, vt91Var.f244589i);
    }

    public final int hashCode() {
        int iHashCode = this.f244581a.hashCode() * 31;
        kbm0 kbm0Var = this.f244582b;
        int iHashCode2 = (iHashCode + (kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode())) * 31;
        String str = this.f244583c;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f244584d), 31, this.f244585e), 31, this.f244586f), 31, this.f244587g), 31, this.f244588h);
        Integer num = this.f244589i;
        return iM77243b + (num != null ? num.hashCode() : 0);
    }
}
