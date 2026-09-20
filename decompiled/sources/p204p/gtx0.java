package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gtx0 {

    /* JADX INFO: renamed from: a */
    public final String f84303a;

    /* JADX INFO: renamed from: b */
    public final String f84304b;

    /* JADX INFO: renamed from: c */
    public final double f84305c;

    /* JADX INFO: renamed from: d */
    public final double f84306d;

    public gtx0(String str, String str2, double d, double d2) {
        this.f84303a = str;
        this.f84304b = str2;
        this.f84305c = d;
        this.f84306d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtx0)) {
            return false;
        }
        gtx0 gtx0Var = (gtx0) obj;
        return wj50.m88271j(this.f84303a, gtx0Var.f84303a) && wj50.m88271j(this.f84304b, gtx0Var.f84304b) && Double.compare(this.f84305c, gtx0Var.f84305c) == 0 && Double.compare(this.f84306d, gtx0Var.f84306d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f84306d) + xl81.m91399h(this.f84305c, s571.m77243b(this.f84303a.hashCode() * 31, 31, this.f84304b), 31);
    }
}
