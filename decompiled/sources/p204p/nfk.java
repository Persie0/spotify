package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nfk implements pfk {

    /* JADX INFO: renamed from: a */
    public final String f153391a;

    /* JADX INFO: renamed from: b */
    public final String f153392b;

    /* JADX INFO: renamed from: c */
    public final String f153393c;

    public nfk(String str, String str2, String str3) {
        this.f153391a = str;
        this.f153392b = str2;
        this.f153393c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfk)) {
            return false;
        }
        nfk nfkVar = (nfk) obj;
        return wj50.m88271j(this.f153391a, nfkVar.f153391a) && wj50.m88271j(this.f153392b, nfkVar.f153392b) && wj50.m88271j(this.f153393c, nfkVar.f153393c);
    }

    public final int hashCode() {
        int iHashCode = this.f153391a.hashCode() * 31;
        String str = this.f153392b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153393c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
