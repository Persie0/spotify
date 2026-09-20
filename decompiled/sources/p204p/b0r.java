package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b0r implements k0r {

    /* JADX INFO: renamed from: a */
    public final String f22084a;

    /* JADX INFO: renamed from: b */
    public final String f22085b;

    /* JADX INFO: renamed from: c */
    public final String f22086c;

    public b0r(String str, String str2, String str3) {
        this.f22084a = str;
        this.f22085b = str2;
        this.f22086c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0r)) {
            return false;
        }
        b0r b0rVar = (b0r) obj;
        return wj50.m88271j(this.f22084a, b0rVar.f22084a) && wj50.m88271j(this.f22085b, b0rVar.f22085b) && wj50.m88271j(this.f22086c, b0rVar.f22086c);
    }

    public final int hashCode() {
        String str = this.f22084a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f22085b);
        String str2 = this.f22086c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
