package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a4r {

    /* JADX INFO: renamed from: a */
    public final String f12292a;

    /* JADX INFO: renamed from: b */
    public final String f12293b;

    /* JADX INFO: renamed from: c */
    public final String f12294c;

    /* JADX INFO: renamed from: d */
    public final String f12295d;

    /* JADX INFO: renamed from: e */
    public final String f12296e;

    public a4r(String str, String str2, String str3, String str4, String str5) {
        this.f12292a = str;
        this.f12293b = str2;
        this.f12294c = str3;
        this.f12295d = str4;
        this.f12296e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4r)) {
            return false;
        }
        a4r a4rVar = (a4r) obj;
        return wj50.m88271j(this.f12292a, a4rVar.f12292a) && wj50.m88271j(this.f12293b, a4rVar.f12293b) && wj50.m88271j(this.f12294c, a4rVar.f12294c) && wj50.m88271j(this.f12295d, a4rVar.f12295d) && wj50.m88271j(this.f12296e, a4rVar.f12296e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f12292a.hashCode() * 31, 31, this.f12293b);
        String str = this.f12294c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12295d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12296e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
