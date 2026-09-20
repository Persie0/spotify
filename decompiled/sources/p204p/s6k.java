package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s6k {

    /* JADX INFO: renamed from: a */
    public final String f206136a;

    /* JADX INFO: renamed from: b */
    public final String f206137b;

    /* JADX INFO: renamed from: c */
    public final String f206138c;

    /* JADX INFO: renamed from: d */
    public final long f206139d;

    public s6k(long j, String str, String str2, String str3) {
        this.f206136a = str;
        this.f206137b = str2;
        this.f206138c = str3;
        this.f206139d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6k)) {
            return false;
        }
        s6k s6kVar = (s6k) obj;
        if (!wj50.m88271j(this.f206136a, s6kVar.f206136a) || !wj50.m88271j(this.f206137b, s6kVar.f206137b) || !wj50.m88271j(this.f206138c, s6kVar.f206138c)) {
            return false;
        }
        long j = s6kVar.f206139d;
        int i = n6f.f150872l;
        return as91.m27074b(this.f206139d, j);
    }

    public final int hashCode() {
        int iHashCode = this.f206136a.hashCode() * 31;
        String str = this.f206137b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f206138c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f206139d) + iHashCode3;
    }
}
