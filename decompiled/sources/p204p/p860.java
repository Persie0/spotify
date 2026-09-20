package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p860 {

    /* JADX INFO: renamed from: a */
    public final String f174881a;

    /* JADX INFO: renamed from: b */
    public final mec0 f174882b;

    /* JADX INFO: renamed from: c */
    public final k1b1 f174883c;

    /* JADX INFO: renamed from: d */
    public final String f174884d;

    /* JADX INFO: renamed from: e */
    public final String f174885e;

    /* JADX INFO: renamed from: f */
    public final String f174886f;

    public p860(String str, mec0 mec0Var, k1b1 k1b1Var, String str2, String str3, String str4) {
        this.f174881a = str;
        this.f174882b = mec0Var;
        this.f174883c = k1b1Var;
        this.f174884d = str2;
        this.f174885e = str3;
        this.f174886f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p860)) {
            return false;
        }
        p860 p860Var = (p860) obj;
        return wj50.m88271j(this.f174881a, p860Var.f174881a) && this.f174882b.equals(p860Var.f174882b) && this.f174883c.equals(p860Var.f174883c) && wj50.m88271j(this.f174884d, p860Var.f174884d) && wj50.m88271j(this.f174885e, p860Var.f174885e) && wj50.m88271j(this.f174886f, p860Var.f174886f);
    }

    public final int hashCode() {
        int iHashCode = (this.f174883c.hashCode() + fr0.m42462f(this.f174882b, this.f174881a.hashCode() * 31, 31)) * 31;
        String str = this.f174884d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f174885e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f174886f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
