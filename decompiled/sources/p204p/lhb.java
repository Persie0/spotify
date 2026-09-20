package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lhb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f133459a;

    /* JADX INFO: renamed from: b */
    public final String f133460b;

    /* JADX INFO: renamed from: c */
    public final String f133461c;

    /* JADX INFO: renamed from: d */
    public final String f133462d;

    /* JADX INFO: renamed from: e */
    public final String f133463e;

    public lhb(String str, String str2, String str3, String str4, boolean z) {
        this.f133459a = z;
        this.f133460b = str;
        this.f133461c = str2;
        this.f133462d = str3;
        this.f133463e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhb)) {
            return false;
        }
        lhb lhbVar = (lhb) obj;
        return this.f133459a == lhbVar.f133459a && wj50.m88271j(this.f133460b, lhbVar.f133460b) && wj50.m88271j(this.f133461c, lhbVar.f133461c) && wj50.m88271j(this.f133462d, lhbVar.f133462d) && wj50.m88271j(this.f133463e, lhbVar.f133463e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f133459a) * 31;
        String str = this.f133460b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133461c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133462d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133463e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
