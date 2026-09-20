package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f159153a;

    /* JADX INFO: renamed from: b */
    public final String f159154b;

    /* JADX INFO: renamed from: c */
    public final String f159155c;

    /* JADX INFO: renamed from: d */
    public final dhb f159156d;

    public nwh(String str, String str2, String str3, dhb dhbVar) {
        this.f159153a = str;
        this.f159154b = str2;
        this.f159155c = str3;
        this.f159156d = dhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwh)) {
            return false;
        }
        nwh nwhVar = (nwh) obj;
        return wj50.m88271j(this.f159153a, nwhVar.f159153a) && wj50.m88271j(this.f159154b, nwhVar.f159154b) && wj50.m88271j(this.f159155c, nwhVar.f159155c) && wj50.m88271j(this.f159156d, nwhVar.f159156d);
    }

    public final int hashCode() {
        int iHashCode = this.f159153a.hashCode() * 31;
        String str = this.f159154b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f159155c;
        return this.f159156d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
