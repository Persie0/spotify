package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tpc0 {

    /* JADX INFO: renamed from: a */
    public final String f222490a;

    /* JADX INFO: renamed from: b */
    public final String f222491b;

    /* JADX INFO: renamed from: c */
    public final String f222492c;

    /* JADX INFO: renamed from: d */
    public final String f222493d;

    /* JADX INFO: renamed from: e */
    public final String f222494e;

    /* JADX INFO: renamed from: f */
    public final String f222495f;

    /* JADX INFO: renamed from: g */
    public final String f222496g;

    /* JADX INFO: renamed from: h */
    public final String f222497h;

    /* JADX INFO: renamed from: i */
    public final String f222498i;

    /* JADX INFO: renamed from: j */
    public final String f222499j;

    /* JADX INFO: renamed from: k */
    public final String f222500k;

    /* JADX INFO: renamed from: l */
    public final gqc0 f222501l;

    /* JADX INFO: renamed from: m */
    public final String f222502m;

    /* JADX INFO: renamed from: n */
    public final zk1 f222503n;

    /* JADX INFO: renamed from: o */
    public final boolean f222504o;

    /* JADX INFO: renamed from: p */
    public final boolean f222505p;

    public tpc0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, gqc0 gqc0Var, String str12, zk1 zk1Var, boolean z, boolean z2) {
        this.f222490a = str;
        this.f222491b = str2;
        this.f222492c = str3;
        this.f222493d = str4;
        this.f222494e = str5;
        this.f222495f = str6;
        this.f222496g = str7;
        this.f222497h = str8;
        this.f222498i = str9;
        this.f222499j = str10;
        this.f222500k = str11;
        this.f222501l = gqc0Var;
        this.f222502m = str12;
        this.f222503n = zk1Var;
        this.f222504o = z;
        this.f222505p = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpc0)) {
            return false;
        }
        tpc0 tpc0Var = (tpc0) obj;
        return wj50.m88271j(this.f222490a, tpc0Var.f222490a) && wj50.m88271j(this.f222491b, tpc0Var.f222491b) && wj50.m88271j(this.f222492c, tpc0Var.f222492c) && wj50.m88271j(this.f222493d, tpc0Var.f222493d) && wj50.m88271j(this.f222494e, tpc0Var.f222494e) && wj50.m88271j(this.f222495f, tpc0Var.f222495f) && wj50.m88271j(this.f222496g, tpc0Var.f222496g) && wj50.m88271j(this.f222497h, tpc0Var.f222497h) && wj50.m88271j(this.f222498i, tpc0Var.f222498i) && wj50.m88271j(this.f222499j, tpc0Var.f222499j) && wj50.m88271j(this.f222500k, tpc0Var.f222500k) && this.f222501l == tpc0Var.f222501l && wj50.m88271j(this.f222502m, tpc0Var.f222502m) && this.f222503n.equals(tpc0Var.f222503n) && this.f222504o == tpc0Var.f222504o && this.f222505p == tpc0Var.f222505p;
    }

    public final int hashCode() {
        int iHashCode = this.f222490a.hashCode() * 31;
        String str = this.f222491b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f222492c), 31, this.f222493d), 31, this.f222494e), 31, this.f222495f), 31, this.f222496g);
        String str2 = this.f222497h;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f222498i), 31, this.f222499j);
        String str3 = this.f222500k;
        int iHashCode2 = (iM77243b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gqc0 gqc0Var = this.f222501l;
        int iHashCode3 = (iHashCode2 + (gqc0Var == null ? 0 : gqc0Var.hashCode())) * 31;
        String str4 = this.f222502m;
        return Boolean.hashCode(this.f222505p) + s571.m77245d((this.f222503n.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31, 31, this.f222504o);
    }
}
