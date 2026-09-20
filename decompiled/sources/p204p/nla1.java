package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nla1 {

    /* JADX INFO: renamed from: a */
    public final wi7 f155031a;

    /* JADX INFO: renamed from: b */
    public final String f155032b;

    /* JADX INFO: renamed from: c */
    public final String f155033c;

    /* JADX INFO: renamed from: d */
    public final String f155034d;

    /* JADX INFO: renamed from: e */
    public final Integer f155035e;

    public nla1(wi7 wi7Var, String str, String str2, String str3, Integer num) {
        this.f155031a = wi7Var;
        this.f155032b = str;
        this.f155033c = str2;
        this.f155034d = str3;
        this.f155035e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nla1)) {
            return false;
        }
        nla1 nla1Var = (nla1) obj;
        return wj50.m88271j(this.f155031a, nla1Var.f155031a) && wj50.m88271j(this.f155032b, nla1Var.f155032b) && wj50.m88271j(this.f155033c, nla1Var.f155033c) && wj50.m88271j(this.f155034d, nla1Var.f155034d) && wj50.m88271j(this.f155035e, nla1Var.f155035e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f155031a.hashCode() * 31, 31, this.f155032b);
        String str = this.f155033c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155034d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f155035e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
