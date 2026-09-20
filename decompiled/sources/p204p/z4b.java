package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z4b {

    /* JADX INFO: renamed from: a */
    public final String f279186a;

    /* JADX INFO: renamed from: b */
    public final String f279187b;

    /* JADX INFO: renamed from: c */
    public final String f279188c;

    /* JADX INFO: renamed from: d */
    public final String f279189d;

    public z4b(String str, String str2, String str3, String str4) {
        this.f279186a = str;
        this.f279187b = str2;
        this.f279188c = str3;
        this.f279189d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4b)) {
            return false;
        }
        z4b z4bVar = (z4b) obj;
        return wj50.m88271j(this.f279186a, z4bVar.f279186a) && wj50.m88271j(this.f279187b, z4bVar.f279187b) && wj50.m88271j(this.f279188c, z4bVar.f279188c) && wj50.m88271j(this.f279189d, z4bVar.f279189d);
    }

    public final int hashCode() {
        String str = this.f279186a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f279187b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f279188c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f279189d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
