package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f75709a;

    /* JADX INFO: renamed from: b */
    public final String f75710b;

    /* JADX INFO: renamed from: c */
    public final int f75711c;

    /* JADX INFO: renamed from: d */
    public final String f75712d;

    public g1s0(String str, String str2, int i, String str3) {
        this.f75709a = str;
        this.f75710b = str2;
        this.f75711c = i;
        this.f75712d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1s0)) {
            return false;
        }
        g1s0 g1s0Var = (g1s0) obj;
        return wj50.m88271j(this.f75709a, g1s0Var.f75709a) && wj50.m88271j(this.f75710b, g1s0Var.f75710b) && this.f75711c == g1s0Var.f75711c && wj50.m88271j(this.f75712d, g1s0Var.f75712d);
    }

    public final int hashCode() {
        String str = this.f75709a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75710b;
        int iM40938f = f710.m40938f(this.f75711c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f75712d;
        return iM40938f + (str3 != null ? str3.hashCode() : 0);
    }
}
