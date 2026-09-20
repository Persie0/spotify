package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b8z {

    /* JADX INFO: renamed from: a */
    public final String f24693a;

    /* JADX INFO: renamed from: b */
    public final String f24694b;

    /* JADX INFO: renamed from: c */
    public final String f24695c;

    /* JADX INFO: renamed from: d */
    public final String f24696d;

    public b8z(String str, String str2, String str3, String str4) {
        this.f24693a = str;
        this.f24694b = str2;
        this.f24695c = str3;
        this.f24696d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8z)) {
            return false;
        }
        b8z b8zVar = (b8z) obj;
        return wj50.m88271j(this.f24693a, b8zVar.f24693a) && wj50.m88271j(this.f24694b, b8zVar.f24694b) && wj50.m88271j(this.f24695c, b8zVar.f24695c) && wj50.m88271j(this.f24696d, b8zVar.f24696d);
    }

    public final int hashCode() {
        int iHashCode = this.f24693a.hashCode() * 31;
        String str = this.f24694b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24695c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24696d;
        return Boolean.hashCode(false) + ((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) - 637232924) * 31);
    }
}
