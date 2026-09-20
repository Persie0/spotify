package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n26 {

    /* JADX INFO: renamed from: a */
    public final String f149646a;

    /* JADX INFO: renamed from: b */
    public final String f149647b;

    /* JADX INFO: renamed from: c */
    public final String f149648c;

    /* JADX INFO: renamed from: d */
    public final boolean f149649d;

    public n26(String str, String str2, String str3, boolean z) {
        this.f149646a = str;
        this.f149647b = str2;
        this.f149648c = str3;
        this.f149649d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n26)) {
            return false;
        }
        n26 n26Var = (n26) obj;
        return wj50.m88271j(this.f149646a, n26Var.f149646a) && wj50.m88271j(this.f149647b, n26Var.f149647b) && wj50.m88271j(this.f149648c, n26Var.f149648c) && this.f149649d == n26Var.f149649d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149646a.hashCode() * 31, 31, this.f149647b);
        String str = this.f149648c;
        return Boolean.hashCode(this.f149649d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
