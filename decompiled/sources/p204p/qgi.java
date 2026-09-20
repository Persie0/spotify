package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qgi {

    /* JADX INFO: renamed from: a */
    public final String f188473a;

    /* JADX INFO: renamed from: b */
    public final String f188474b;

    /* JADX INFO: renamed from: c */
    public final String f188475c;

    /* JADX INFO: renamed from: d */
    public final String f188476d;

    /* JADX INFO: renamed from: e */
    public final String f188477e;

    public qgi(String str, String str2, String str3, String str4, String str5) {
        this.f188473a = str;
        this.f188474b = str2;
        this.f188475c = str3;
        this.f188476d = str4;
        this.f188477e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgi)) {
            return false;
        }
        qgi qgiVar = (qgi) obj;
        return wj50.m88271j(this.f188473a, qgiVar.f188473a) && wj50.m88271j(this.f188474b, qgiVar.f188474b) && wj50.m88271j(this.f188475c, qgiVar.f188475c) && wj50.m88271j(this.f188476d, qgiVar.f188476d) && wj50.m88271j(this.f188477e, qgiVar.f188477e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f188473a.hashCode() * 31, 31, this.f188474b), 31, this.f188475c);
        String str = this.f188476d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f188477e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
