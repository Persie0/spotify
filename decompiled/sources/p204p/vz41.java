package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vz41 implements xz41 {

    /* JADX INFO: renamed from: a */
    public final tz41 f246388a;

    /* JADX INFO: renamed from: b */
    public final String f246389b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f246390c;

    /* JADX INFO: renamed from: d */
    public final String f246391d;

    /* JADX INFO: renamed from: e */
    public final duf f246392e;

    /* JADX INFO: renamed from: f */
    public final String f246393f;

    /* JADX INFO: renamed from: g */
    public final int f246394g;

    public vz41(tz41 tz41Var, String str, fuz0 fuz0Var, String str2, duf dufVar, String str3, int i) {
        this.f246388a = tz41Var;
        this.f246389b = str;
        this.f246390c = fuz0Var;
        this.f246391d = str2;
        this.f246392e = dufVar;
        this.f246393f = str3;
        this.f246394g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz41)) {
            return false;
        }
        vz41 vz41Var = (vz41) obj;
        return this.f246388a == vz41Var.f246388a && wj50.m88271j(this.f246389b, vz41Var.f246389b) && this.f246390c.equals(vz41Var.f246390c) && wj50.m88271j(this.f246391d, vz41Var.f246391d) && this.f246392e.equals(vz41Var.f246392e) && wj50.m88271j(this.f246393f, vz41Var.f246393f) && this.f246394g == vz41Var.f246394g;
    }

    public final int hashCode() {
        int iM80647e = tfe.m80647e(s571.m77243b(this.f246388a.hashCode() * 31, 31, this.f246389b), this.f246390c.f73606a, 31);
        String str = this.f246391d;
        return edb.m38547C(this.f246394g) + s571.m77243b((this.f246392e.hashCode() + ((iM80647e + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f246393f);
    }
}
