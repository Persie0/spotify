package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j4c0 extends j9e0 {

    /* JADX INFO: renamed from: a */
    public final String f108654a;

    /* JADX INFO: renamed from: b */
    public final String f108655b;

    /* JADX INFO: renamed from: c */
    public final int f108656c;

    /* JADX INFO: renamed from: d */
    public final String f108657d;

    /* JADX INFO: renamed from: e */
    public final String f108658e;

    /* JADX INFO: renamed from: f */
    public final String f108659f;

    /* JADX INFO: renamed from: g */
    public final String f108660g;

    /* JADX INFO: renamed from: h */
    public final int f108661h;

    /* JADX INFO: renamed from: i */
    public final boolean f108662i;

    /* JADX INFO: renamed from: j */
    public final Boolean f108663j;

    /* JADX INFO: renamed from: k */
    public final boolean f108664k;

    /* JADX INFO: renamed from: l */
    public final String f108665l;

    /* JADX INFO: renamed from: m */
    public final String f108666m;

    /* JADX INFO: renamed from: n */
    public final String f108667n;

    /* JADX INFO: renamed from: o */
    public final bs10 f108668o;

    /* JADX INFO: renamed from: p */
    public final boolean f108669p;

    public j4c0(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, boolean z, Boolean bool, boolean z2, String str7, String str8, String str9, bs10 bs10Var, boolean z3) {
        this.f108654a = str;
        this.f108655b = str2;
        this.f108656c = i;
        this.f108657d = str3;
        this.f108658e = str4;
        this.f108659f = str5;
        this.f108660g = str6;
        this.f108661h = i2;
        this.f108662i = z;
        this.f108663j = bool;
        this.f108664k = z2;
        this.f108665l = str7;
        this.f108666m = str8;
        this.f108667n = str9;
        this.f108668o = bs10Var;
        this.f108669p = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4c0)) {
            return false;
        }
        j4c0 j4c0Var = (j4c0) obj;
        return wj50.m88271j(this.f108654a, j4c0Var.f108654a) && wj50.m88271j(this.f108655b, j4c0Var.f108655b) && this.f108656c == j4c0Var.f108656c && wj50.m88271j(this.f108657d, j4c0Var.f108657d) && wj50.m88271j(this.f108658e, j4c0Var.f108658e) && wj50.m88271j(this.f108659f, j4c0Var.f108659f) && wj50.m88271j(this.f108660g, j4c0Var.f108660g) && this.f108661h == j4c0Var.f108661h && this.f108662i == j4c0Var.f108662i && wj50.m88271j(this.f108663j, j4c0Var.f108663j) && this.f108664k == j4c0Var.f108664k && wj50.m88271j(this.f108665l, j4c0Var.f108665l) && wj50.m88271j(this.f108666m, j4c0Var.f108666m) && wj50.m88271j(this.f108667n, j4c0Var.f108667n) && wj50.m88271j(this.f108668o, j4c0Var.f108668o) && this.f108669p == j4c0Var.f108669p;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f108661h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f108656c, s571.m77243b(this.f108654a.hashCode() * 31, 31, this.f108655b), 31), 31, this.f108657d), 31, this.f108658e), 31, this.f108659f), 31, this.f108660g), 31), 31, this.f108662i);
        Boolean bool = this.f108663j;
        return Boolean.hashCode(this.f108669p) + ((this.f108668o.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((iM77245d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f108664k), 31, this.f108665l), 31, this.f108666m), 31, this.f108667n)) * 31);
    }
}
