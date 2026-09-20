package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cf81 {

    /* JADX INFO: renamed from: a */
    public final String f37295a;

    /* JADX INFO: renamed from: b */
    public final String f37296b;

    /* JADX INFO: renamed from: c */
    public final String f37297c;

    /* JADX INFO: renamed from: d */
    public final int f37298d;

    public cf81(String str, String str2, int i, String str3) {
        this.f37295a = str;
        this.f37296b = str2;
        this.f37297c = str3;
        this.f37298d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf81)) {
            return false;
        }
        cf81 cf81Var = (cf81) obj;
        return wj50.m88271j(this.f37295a, cf81Var.f37295a) && wj50.m88271j(this.f37296b, cf81Var.f37296b) && wj50.m88271j(this.f37297c, cf81Var.f37297c) && this.f37298d == cf81Var.f37298d;
    }

    public final int hashCode() {
        int iHashCode = this.f37295a.hashCode() * 31;
        String str = this.f37296b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37297c;
        return Integer.hashCode(this.f37298d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
