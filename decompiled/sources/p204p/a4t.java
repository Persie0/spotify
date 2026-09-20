package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a4t extends izg1 {

    /* JADX INFO: renamed from: b */
    public final String f12306b;

    /* JADX INFO: renamed from: c */
    public final String f12307c;

    /* JADX INFO: renamed from: d */
    public final String f12308d;

    /* JADX INFO: renamed from: e */
    public final Integer f12309e;

    /* JADX INFO: renamed from: f */
    public final String f12310f;

    /* JADX INFO: renamed from: g */
    public final String f12311g;

    /* JADX INFO: renamed from: h */
    public final Boolean f12312h;

    public a4t(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.f12306b = str;
        this.f12307c = str2;
        this.f12308d = str3;
        this.f12309e = num;
        this.f12310f = str4;
        this.f12311g = str5;
        this.f12312h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4t)) {
            return false;
        }
        a4t a4tVar = (a4t) obj;
        return wj50.m88271j(this.f12306b, a4tVar.f12306b) && wj50.m88271j(this.f12307c, a4tVar.f12307c) && wj50.m88271j(this.f12308d, a4tVar.f12308d) && wj50.m88271j(this.f12309e, a4tVar.f12309e) && wj50.m88271j(this.f12310f, a4tVar.f12310f) && wj50.m88271j(this.f12311g, a4tVar.f12311g) && wj50.m88271j(this.f12312h, a4tVar.f12312h);
    }

    public final int hashCode() {
        String str = this.f12306b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12307c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12308d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f12309e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f12310f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f12311g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f12312h;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }
}
