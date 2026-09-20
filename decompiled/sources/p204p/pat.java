package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pat {

    /* JADX INFO: renamed from: a */
    public final String f175609a;

    /* JADX INFO: renamed from: b */
    public final String f175610b;

    /* JADX INFO: renamed from: c */
    public final String f175611c;

    /* JADX INFO: renamed from: d */
    public final String f175612d;

    public pat(String str, String str2, String str3, String str4) {
        this.f175609a = str;
        this.f175610b = str2;
        this.f175611c = str3;
        this.f175612d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pat)) {
            return false;
        }
        pat patVar = (pat) obj;
        return wj50.m88271j(this.f175609a, patVar.f175609a) && wj50.m88271j(this.f175610b, patVar.f175610b) && wj50.m88271j(this.f175611c, patVar.f175611c) && wj50.m88271j(this.f175612d, patVar.f175612d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f175609a.hashCode() * 31, 31, this.f175610b);
        String str = this.f175611c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f175612d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
