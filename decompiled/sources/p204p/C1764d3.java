package p204p;

/* JADX INFO: renamed from: p.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1764d3 {

    /* JADX INFO: renamed from: a */
    public final String f44700a;

    /* JADX INFO: renamed from: b */
    public final String f44701b;

    /* JADX INFO: renamed from: c */
    public final String f44702c;

    /* JADX INFO: renamed from: d */
    public final String f44703d;

    /* JADX INFO: renamed from: e */
    public final ci20 f44704e;

    public C1764d3(String str, String str2, String str3, String str4, ci20 ci20Var) {
        this.f44700a = str;
        this.f44701b = str2;
        this.f44702c = str3;
        this.f44703d = str4;
        this.f44704e = ci20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1764d3)) {
            return false;
        }
        C1764d3 c1764d3 = (C1764d3) obj;
        return wj50.m88271j(this.f44700a, c1764d3.f44700a) && wj50.m88271j(this.f44701b, c1764d3.f44701b) && wj50.m88271j(this.f44702c, c1764d3.f44702c) && wj50.m88271j(this.f44703d, c1764d3.f44703d) && wj50.m88271j(this.f44704e, c1764d3.f44704e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f44700a.hashCode() * 31, 31, this.f44701b), 31, this.f44702c);
        String str = this.f44703d;
        return this.f44704e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
