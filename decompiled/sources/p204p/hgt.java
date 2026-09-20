package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hgt {

    /* JADX INFO: renamed from: a */
    public final String f91197a;

    /* JADX INFO: renamed from: b */
    public final String f91198b;

    /* JADX INFO: renamed from: c */
    public final String f91199c;

    /* JADX INFO: renamed from: d */
    public final jhy f91200d;

    public hgt(String str, String str2, String str3, jhy jhyVar) {
        this.f91197a = str;
        this.f91198b = str2;
        this.f91199c = str3;
        this.f91200d = jhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgt)) {
            return false;
        }
        hgt hgtVar = (hgt) obj;
        return wj50.m88271j(this.f91197a, hgtVar.f91197a) && wj50.m88271j(this.f91198b, hgtVar.f91198b) && wj50.m88271j(this.f91199c, hgtVar.f91199c) && wj50.m88271j(this.f91200d, hgtVar.f91200d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f91197a.hashCode() * 31, 31, this.f91198b);
        String str = this.f91199c;
        return this.f91200d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
