package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class duc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f53030a;

    /* JADX INFO: renamed from: b */
    public final qf40 f53031b;

    /* JADX INFO: renamed from: c */
    public final String f53032c;

    /* JADX INFO: renamed from: d */
    public final d850 f53033d;

    /* JADX INFO: renamed from: e */
    public final boolean f53034e;

    public duc0(String str, qf40 qf40Var, String str2, d850 d850Var, boolean z) {
        this.f53030a = str;
        this.f53031b = qf40Var;
        this.f53032c = str2;
        this.f53033d = d850Var;
        this.f53034e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duc0)) {
            return false;
        }
        duc0 duc0Var = (duc0) obj;
        return wj50.m88271j(this.f53030a, duc0Var.f53030a) && wj50.m88271j(this.f53031b, duc0Var.f53031b) && wj50.m88271j(this.f53032c, duc0Var.f53032c) && wj50.m88271j(this.f53033d, duc0Var.f53033d) && this.f53034e == duc0Var.f53034e;
    }

    public final int hashCode() {
        int iM42461e = fr0.m42461e(this.f53031b, this.f53030a.hashCode() * 31, 31);
        String str = this.f53032c;
        int iHashCode = (iM42461e + (str == null ? 0 : str.hashCode())) * 31;
        d850 d850Var = this.f53033d;
        return Boolean.hashCode(this.f53034e) + ((iHashCode + (d850Var != null ? d850Var.hashCode() : 0)) * 31);
    }
}
