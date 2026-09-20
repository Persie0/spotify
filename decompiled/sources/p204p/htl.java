package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class htl {

    /* JADX INFO: renamed from: a */
    public final String f95080a;

    /* JADX INFO: renamed from: b */
    public final String f95081b;

    /* JADX INFO: renamed from: c */
    public final String f95082c;

    /* JADX INFO: renamed from: d */
    public final String f95083d;

    /* JADX INFO: renamed from: e */
    public final itl f95084e;

    /* JADX INFO: renamed from: f */
    public final gtl f95085f;

    public htl(String str, String str2, String str3, String str4, itl itlVar, gtl gtlVar) {
        this.f95080a = str;
        this.f95081b = str2;
        this.f95082c = str3;
        this.f95083d = str4;
        this.f95084e = itlVar;
        this.f95085f = gtlVar;
    }

    /* JADX INFO: renamed from: a */
    public static htl m48585a(htl htlVar) {
        return new htl(htlVar.f95080a, htlVar.f95081b, null, htlVar.f95083d, htlVar.f95084e, htlVar.f95085f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htl)) {
            return false;
        }
        htl htlVar = (htl) obj;
        return wj50.m88271j(this.f95080a, htlVar.f95080a) && wj50.m88271j(this.f95081b, htlVar.f95081b) && wj50.m88271j(this.f95082c, htlVar.f95082c) && wj50.m88271j(this.f95083d, htlVar.f95083d) && wj50.m88271j(this.f95084e, htlVar.f95084e) && wj50.m88271j(this.f95085f, htlVar.f95085f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f95080a.hashCode() * 31, 31, this.f95081b);
        int i = 0;
        String str = this.f95082c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95083d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        itl itlVar = this.f95084e;
        int iHashCode3 = (iHashCode2 + (itlVar == null ? 0 : itlVar.f105624a.hashCode())) * 31;
        gtl gtlVar = this.f95085f;
        if (gtlVar != null) {
            gtlVar.getClass();
            i = 306129761;
        }
        return iHashCode3 + i;
    }
}
