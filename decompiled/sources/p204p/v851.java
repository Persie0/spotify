package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v851 {

    /* JADX INFO: renamed from: a */
    public final String f238396a;

    /* JADX INFO: renamed from: b */
    public final String f238397b;

    /* JADX INFO: renamed from: c */
    public final int f238398c;

    /* JADX INFO: renamed from: d */
    public final String f238399d;

    /* JADX INFO: renamed from: e */
    public final qf40 f238400e;

    /* JADX INFO: renamed from: f */
    public final boolean f238401f;

    /* JADX INFO: renamed from: g */
    public final boolean f238402g;

    /* JADX INFO: renamed from: h */
    public final boolean f238403h;

    /* JADX INFO: renamed from: i */
    public final String f238404i;

    /* JADX INFO: renamed from: j */
    public final String f238405j;

    /* JADX INFO: renamed from: k */
    public final String f238406k;

    /* JADX INFO: renamed from: l */
    public final qf40 f238407l;

    /* JADX INFO: renamed from: m */
    public final boolean f238408m;

    /* JADX INFO: renamed from: n */
    public final String f238409n;

    public v851(String str, String str2, int i, String str3, qf40 qf40Var, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, qf40 qf40Var2, boolean z4, String str7, int i2) {
        i = (i2 & 4) != 0 ? 7 : i;
        z2 = (i2 & 128) != 0 ? false : z2;
        boolean z5 = (i2 & 8192) == 0 ? z4 : false;
        String str8 = (i2 & 16384) != 0 ? "" : str7;
        this.f238396a = str;
        this.f238397b = str2;
        this.f238398c = i;
        this.f238399d = str3;
        this.f238400e = qf40Var;
        this.f238401f = z;
        this.f238402g = z2;
        this.f238403h = z3;
        this.f238404i = str4;
        this.f238405j = str5;
        this.f238406k = str6;
        this.f238407l = qf40Var2;
        this.f238408m = z5;
        this.f238409n = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v851)) {
            return false;
        }
        v851 v851Var = (v851) obj;
        return wj50.m88271j(this.f238396a, v851Var.f238396a) && wj50.m88271j(this.f238397b, v851Var.f238397b) && this.f238398c == v851Var.f238398c && wj50.m88271j(this.f238399d, v851Var.f238399d) && wj50.m88271j(this.f238400e, v851Var.f238400e) && this.f238401f == v851Var.f238401f && this.f238402g == v851Var.f238402g && this.f238403h == v851Var.f238403h && wj50.m88271j(this.f238404i, v851Var.f238404i) && wj50.m88271j(this.f238405j, v851Var.f238405j) && wj50.m88271j(this.f238406k, v851Var.f238406k) && wj50.m88271j(this.f238407l, v851Var.f238407l) && this.f238408m == v851Var.f238408m && wj50.m88271j(this.f238409n, v851Var.f238409n);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(fr0.m42461e(this.f238400e, s571.m77243b(f710.m40938f(this.f238398c, s571.m77243b(this.f238396a.hashCode() * 31, 31, this.f238397b), 31), 31, this.f238399d), 961), 31, this.f238401f), 31, this.f238402g), 31, this.f238403h), 31, this.f238404i);
        String str = this.f238405j;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f238406k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        qf40 qf40Var = this.f238407l;
        return this.f238409n.hashCode() + s571.m77245d((iHashCode2 + (qf40Var != null ? qf40Var.hashCode() : 0)) * 31, 31, this.f238408m);
    }
}
