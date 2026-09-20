package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dpa0 implements fpa0 {

    /* JADX INFO: renamed from: a */
    public final String f51242a;

    /* JADX INFO: renamed from: b */
    public final String f51243b;

    /* JADX INFO: renamed from: c */
    public final String f51244c;

    /* JADX INFO: renamed from: d */
    public final String f51245d;

    /* JADX INFO: renamed from: e */
    public final String f51246e;

    /* JADX INFO: renamed from: f */
    public final String f51247f;

    /* JADX INFO: renamed from: g */
    public final String f51248g;

    /* JADX INFO: renamed from: h */
    public final String f51249h;

    public dpa0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f51242a = str;
        this.f51243b = str2;
        this.f51244c = str3;
        this.f51245d = str4;
        this.f51246e = str5;
        this.f51247f = str6;
        this.f51248g = str7;
        this.f51249h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpa0)) {
            return false;
        }
        dpa0 dpa0Var = (dpa0) obj;
        return wj50.m88271j(this.f51242a, dpa0Var.f51242a) && wj50.m88271j(this.f51243b, dpa0Var.f51243b) && wj50.m88271j(this.f51244c, dpa0Var.f51244c) && wj50.m88271j(this.f51245d, dpa0Var.f51245d) && wj50.m88271j(this.f51246e, dpa0Var.f51246e) && wj50.m88271j(this.f51247f, dpa0Var.f51247f) && wj50.m88271j(this.f51248g, dpa0Var.f51248g) && wj50.m88271j(this.f51249h, dpa0Var.f51249h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f51242a.hashCode() * 31, 31, this.f51243b), 31, this.f51244c);
        String str = this.f51245d;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f51246e), 31, this.f51247f);
        String str2 = this.f51248g;
        int iHashCode = (iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51249h;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
