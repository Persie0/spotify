package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ul6 {

    /* JADX INFO: renamed from: a */
    public final String f231437a;

    /* JADX INFO: renamed from: b */
    public final String f231438b;

    /* JADX INFO: renamed from: c */
    public final int f231439c;

    /* JADX INFO: renamed from: d */
    public final String f231440d;

    /* JADX INFO: renamed from: e */
    public final qsj f231441e;

    /* JADX INFO: renamed from: f */
    public final int f231442f;

    public ul6(String str, String str2, int i, String str3, qsj qsjVar, int i2, int i3) {
        str3 = (i3 & 8) != 0 ? null : str3;
        qsjVar = (i3 & 16) != 0 ? null : qsjVar;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.f231437a = str;
        this.f231438b = str2;
        this.f231439c = i;
        this.f231440d = str3;
        this.f231441e = qsjVar;
        this.f231442f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul6)) {
            return false;
        }
        ul6 ul6Var = (ul6) obj;
        return wj50.m88271j(this.f231437a, ul6Var.f231437a) && wj50.m88271j(this.f231438b, ul6Var.f231438b) && this.f231439c == ul6Var.f231439c && wj50.m88271j(this.f231440d, ul6Var.f231440d) && this.f231441e == ul6Var.f231441e && this.f231442f == ul6Var.f231442f;
    }

    public final int hashCode() {
        int iHashCode = this.f231437a.hashCode() * 31;
        String str = this.f231438b;
        int iM40938f = f710.m40938f(this.f231439c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f231440d;
        int iHashCode2 = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        qsj qsjVar = this.f231441e;
        int iHashCode3 = (iHashCode2 + (qsjVar == null ? 0 : qsjVar.hashCode())) * 31;
        int i = this.f231442f;
        return iHashCode3 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
