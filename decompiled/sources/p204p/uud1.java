package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uud1 {

    /* JADX INFO: renamed from: a */
    public final String f234163a;

    /* JADX INFO: renamed from: b */
    public final String f234164b;

    /* JADX INFO: renamed from: c */
    public final String f234165c;

    /* JADX INFO: renamed from: d */
    public final xfr f234166d;

    public uud1(String str, String str2, String str3, xfr xfrVar) {
        this.f234163a = str;
        this.f234164b = str2;
        this.f234165c = str3;
        this.f234166d = xfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uud1)) {
            return false;
        }
        uud1 uud1Var = (uud1) obj;
        return wj50.m88271j(this.f234163a, uud1Var.f234163a) && wj50.m88271j(this.f234164b, uud1Var.f234164b) && wj50.m88271j(this.f234165c, uud1Var.f234165c) && this.f234166d == uud1Var.f234166d;
    }

    public final int hashCode() {
        return this.f234166d.hashCode() + s571.m77243b(s571.m77243b(this.f234163a.hashCode() * 31, 31, this.f234164b), 31, this.f234165c);
    }
}
