package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class enl implements lnl {

    /* JADX INFO: renamed from: a */
    public final String f61173a;

    /* JADX INFO: renamed from: b */
    public final String f61174b;

    /* JADX INFO: renamed from: c */
    public final String f61175c;

    /* JADX INFO: renamed from: d */
    public final knl f61176d;

    /* JADX INFO: renamed from: e */
    public final String f61177e;

    /* JADX INFO: renamed from: f */
    public final String f61178f;

    /* JADX INFO: renamed from: g */
    public final String f61179g;

    public enl(String str, String str2, String str3, knl knlVar, String str4, String str5, String str6) {
        this.f61173a = str;
        this.f61174b = str2;
        this.f61175c = str3;
        this.f61176d = knlVar;
        this.f61177e = str4;
        this.f61178f = str5;
        this.f61179g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enl)) {
            return false;
        }
        enl enlVar = (enl) obj;
        return wj50.m88271j(this.f61173a, enlVar.f61173a) && wj50.m88271j(this.f61174b, enlVar.f61174b) && wj50.m88271j(this.f61175c, enlVar.f61175c) && wj50.m88271j(this.f61176d, enlVar.f61176d) && wj50.m88271j(this.f61177e, enlVar.f61177e) && wj50.m88271j(this.f61178f, enlVar.f61178f) && wj50.m88271j(this.f61179g, enlVar.f61179g);
    }

    public final int hashCode() {
        int iHashCode = (this.f61176d.hashCode() + s571.m77243b(s571.m77243b(this.f61173a.hashCode() * 31, 31, this.f61174b), 31, this.f61175c)) * 31;
        String str = this.f61177e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61178f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61179g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
