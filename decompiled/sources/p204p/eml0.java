package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eml0 {

    /* JADX INFO: renamed from: a */
    public final String f60936a;

    /* JADX INFO: renamed from: b */
    public final String f60937b;

    /* JADX INFO: renamed from: c */
    public final String f60938c;

    /* JADX INFO: renamed from: d */
    public final boolean f60939d;

    public eml0(String str, String str2, String str3, boolean z) {
        this.f60936a = str;
        this.f60937b = str2;
        this.f60938c = str3;
        this.f60939d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eml0)) {
            return false;
        }
        eml0 eml0Var = (eml0) obj;
        return wj50.m88271j(this.f60936a, eml0Var.f60936a) && wj50.m88271j(this.f60937b, eml0Var.f60937b) && wj50.m88271j(this.f60938c, eml0Var.f60938c) && this.f60939d == eml0Var.f60939d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f60936a.hashCode() * 31, 31, this.f60937b);
        String str = this.f60938c;
        return Boolean.hashCode(this.f60939d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
