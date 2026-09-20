package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lll {

    /* JADX INFO: renamed from: a */
    public final qla1 f134657a;

    /* JADX INFO: renamed from: b */
    public final String f134658b;

    /* JADX INFO: renamed from: c */
    public final qla1 f134659c;

    /* JADX INFO: renamed from: d */
    public final String f134660d;

    /* JADX INFO: renamed from: e */
    public final int f134661e;

    /* JADX INFO: renamed from: f */
    public final boolean f134662f;

    /* JADX INFO: renamed from: g */
    public final boolean f134663g;

    public lll(qla1 qla1Var, String str, qla1 qla1Var2, String str2, int i, boolean z, boolean z2) {
        this.f134657a = qla1Var;
        this.f134658b = str;
        this.f134659c = qla1Var2;
        this.f134660d = str2;
        this.f134661e = i;
        this.f134662f = z;
        this.f134663g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lll)) {
            return false;
        }
        lll lllVar = (lll) obj;
        return wj50.m88271j(this.f134657a, lllVar.f134657a) && wj50.m88271j(this.f134658b, lllVar.f134658b) && wj50.m88271j(this.f134659c, lllVar.f134659c) && wj50.m88271j(this.f134660d, lllVar.f134660d) && this.f134661e == lllVar.f134661e && this.f134662f == lllVar.f134662f && this.f134663g == lllVar.f134663g;
    }

    public final int hashCode() {
        qla1 qla1Var = this.f134657a;
        int iM77243b = s571.m77243b((qla1Var == null ? 0 : qla1Var.hashCode()) * 31, 31, this.f134658b);
        qla1 qla1Var2 = this.f134659c;
        int iHashCode = (iM77243b + (qla1Var2 == null ? 0 : qla1Var2.hashCode())) * 31;
        String str = this.f134660d;
        return Boolean.hashCode(this.f134663g) + s571.m77245d(f710.m40938f(this.f134661e, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f134662f);
    }
}
