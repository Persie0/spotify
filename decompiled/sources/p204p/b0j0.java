package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b0j0 {

    /* JADX INFO: renamed from: a */
    public final String f21931a;

    /* JADX INFO: renamed from: b */
    public final String f21932b;

    /* JADX INFO: renamed from: c */
    public final String f21933c;

    /* JADX INFO: renamed from: d */
    public final String f21934d;

    public b0j0(String str, String str2, String str3, String str4) {
        this.f21931a = str;
        this.f21932b = str2;
        this.f21933c = str3;
        this.f21934d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0j0)) {
            return false;
        }
        b0j0 b0j0Var = (b0j0) obj;
        return wj50.m88271j(this.f21931a, b0j0Var.f21931a) && wj50.m88271j(this.f21932b, b0j0Var.f21932b) && wj50.m88271j(this.f21933c, b0j0Var.f21933c) && wj50.m88271j(this.f21934d, b0j0Var.f21934d);
    }

    public final int hashCode() {
        String str = this.f21931a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21932b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21933c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21934d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
