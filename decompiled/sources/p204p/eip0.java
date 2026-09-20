package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eip0 {

    /* JADX INFO: renamed from: a */
    public final String f59994a;

    /* JADX INFO: renamed from: b */
    public final String f59995b;

    /* JADX INFO: renamed from: c */
    public final String f59996c;

    public eip0(String str, String str2, String str3) {
        this.f59994a = str;
        this.f59995b = str2;
        this.f59996c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eip0)) {
            return false;
        }
        eip0 eip0Var = (eip0) obj;
        return wj50.m88271j(this.f59994a, eip0Var.f59994a) && wj50.m88271j(this.f59995b, eip0Var.f59995b) && wj50.m88271j(this.f59996c, eip0Var.f59996c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f59994a.hashCode() * 31, 31, this.f59995b);
        String str = this.f59996c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
