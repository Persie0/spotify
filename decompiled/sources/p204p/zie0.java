package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zie0 {

    /* JADX INFO: renamed from: a */
    public final String f283141a;

    /* JADX INFO: renamed from: b */
    public final String f283142b;

    /* JADX INFO: renamed from: c */
    public final String f283143c;

    /* JADX INFO: renamed from: d */
    public final String f283144d;

    /* JADX INFO: renamed from: e */
    public final String f283145e;

    public zie0(String str, String str2, String str3, String str4, String str5) {
        this.f283141a = str;
        this.f283142b = str2;
        this.f283143c = str3;
        this.f283144d = str4;
        this.f283145e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie0)) {
            return false;
        }
        zie0 zie0Var = (zie0) obj;
        return wj50.m88271j(this.f283141a, zie0Var.f283141a) && wj50.m88271j(this.f283142b, zie0Var.f283142b) && wj50.m88271j(this.f283143c, zie0Var.f283143c) && wj50.m88271j(this.f283144d, zie0Var.f283144d) && wj50.m88271j(this.f283145e, zie0Var.f283145e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f283141a.hashCode() * 31, 31, this.f283142b), 31, this.f283143c);
        String str = this.f283144d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283145e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
