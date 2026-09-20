package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zw51 implements bx51 {

    /* JADX INFO: renamed from: a */
    public final String f286926a;

    /* JADX INFO: renamed from: b */
    public final int f286927b;

    /* JADX INFO: renamed from: c */
    public final String f286928c;

    public zw51(String str, int i, String str2) {
        this.f286926a = str;
        this.f286927b = i;
        this.f286928c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw51)) {
            return false;
        }
        zw51 zw51Var = (zw51) obj;
        return wj50.m88271j(this.f286926a, zw51Var.f286926a) && this.f286927b == zw51Var.f286927b && wj50.m88271j(this.f286928c, zw51Var.f286928c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f286927b, this.f286926a.hashCode() * 31, 31);
        String str = this.f286928c;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
