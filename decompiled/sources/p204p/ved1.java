package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ved1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f240703a;

    /* JADX INFO: renamed from: b */
    public final String f240704b;

    /* JADX INFO: renamed from: c */
    public final ted1 f240705c;

    /* JADX INFO: renamed from: d */
    public final ued1 f240706d;

    /* JADX INFO: renamed from: e */
    public final ted1 f240707e;

    /* JADX INFO: renamed from: f */
    public final Double f240708f;

    /* JADX INFO: renamed from: g */
    public final String f240709g;

    /* JADX INFO: renamed from: h */
    public final ted1 f240710h;

    /* JADX INFO: renamed from: i */
    public final sed1 f240711i;

    /* JADX INFO: renamed from: j */
    public final String f240712j;

    public ved1(String str, String str2, ted1 ted1Var, ued1 ued1Var, ted1 ted1Var2, Double d, String str3, ted1 ted1Var3, sed1 sed1Var, String str4) {
        this.f240703a = str;
        this.f240704b = str2;
        this.f240705c = ted1Var;
        this.f240706d = ued1Var;
        this.f240707e = ted1Var2;
        this.f240708f = d;
        this.f240709g = str3;
        this.f240710h = ted1Var3;
        this.f240711i = sed1Var;
        this.f240712j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ved1)) {
            return false;
        }
        ved1 ved1Var = (ved1) obj;
        return wj50.m88271j(this.f240703a, ved1Var.f240703a) && wj50.m88271j(this.f240704b, ved1Var.f240704b) && wj50.m88271j(this.f240705c, ved1Var.f240705c) && wj50.m88271j(this.f240706d, ved1Var.f240706d) && wj50.m88271j(this.f240707e, ved1Var.f240707e) && wj50.m88271j(this.f240708f, ved1Var.f240708f) && wj50.m88271j(this.f240709g, ved1Var.f240709g) && wj50.m88271j(this.f240710h, ved1Var.f240710h) && wj50.m88271j(this.f240711i, ved1Var.f240711i) && wj50.m88271j(this.f240712j, ved1Var.f240712j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f240703a.hashCode() * 31, 31, this.f240704b);
        ted1 ted1Var = this.f240705c;
        int iHashCode = (iM77243b + (ted1Var == null ? 0 : ted1Var.hashCode())) * 31;
        ued1 ued1Var = this.f240706d;
        int iHashCode2 = (iHashCode + (ued1Var == null ? 0 : ued1Var.hashCode())) * 31;
        ted1 ted1Var2 = this.f240707e;
        int iHashCode3 = (iHashCode2 + (ted1Var2 == null ? 0 : ted1Var2.hashCode())) * 31;
        Double d = this.f240708f;
        int iM77243b2 = s571.m77243b((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31, this.f240709g);
        ted1 ted1Var3 = this.f240710h;
        int iHashCode4 = (iM77243b2 + (ted1Var3 == null ? 0 : ted1Var3.hashCode())) * 31;
        sed1 sed1Var = this.f240711i;
        return this.f240712j.hashCode() + ((iHashCode4 + (sed1Var != null ? sed1Var.hashCode() : 0)) * 31);
    }
}
