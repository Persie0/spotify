package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m1b {

    /* JADX INFO: renamed from: a */
    public final String f138918a;

    /* JADX INFO: renamed from: b */
    public final String f138919b;

    /* JADX INFO: renamed from: c */
    public final String f138920c;

    public m1b(String str, String str2, String str3) {
        this.f138918a = str;
        this.f138919b = str2;
        this.f138920c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1b)) {
            return false;
        }
        m1b m1bVar = (m1b) obj;
        return wj50.m88271j(this.f138918a, m1bVar.f138918a) && wj50.m88271j(this.f138919b, m1bVar.f138919b) && wj50.m88271j(this.f138920c, m1bVar.f138920c);
    }

    public final int hashCode() {
        String str = this.f138918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f138919b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f138920c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
