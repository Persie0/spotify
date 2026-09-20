package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uw60 {

    /* JADX INFO: renamed from: a */
    public final boolean f234580a;

    /* JADX INFO: renamed from: b */
    public final nk2 f234581b;

    /* JADX INFO: renamed from: c */
    public final String f234582c;

    /* JADX INFO: renamed from: d */
    public final String f234583d;

    /* JADX INFO: renamed from: e */
    public final int f234584e;

    /* JADX INFO: renamed from: f */
    public final String f234585f;

    /* JADX INFO: renamed from: g */
    public final String f234586g;

    /* JADX INFO: renamed from: h */
    public final String f234587h;

    /* JADX INFO: renamed from: i */
    public final String f234588i;

    public uw60(boolean z, nk2 nk2Var, String str, String str2, int i, String str3, String str4, String str5, int i2) {
        nk2Var = (i2 & 2) != 0 ? nk2.HOME_DJ : nk2Var;
        str2 = (i2 & 8) != 0 ? null : str2;
        i = (i2 & 16) != 0 ? 1 : i;
        str3 = (i2 & 32) != 0 ? null : str3;
        str4 = (i2 & 64) != 0 ? null : str4;
        String str6 = (i2 & 256) == 0 ? "create" : null;
        this.f234580a = z;
        this.f234581b = nk2Var;
        this.f234582c = str;
        this.f234583d = str2;
        this.f234584e = i;
        this.f234585f = str3;
        this.f234586g = str4;
        this.f234587h = str5;
        this.f234588i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw60)) {
            return false;
        }
        uw60 uw60Var = (uw60) obj;
        return this.f234580a == uw60Var.f234580a && this.f234581b == uw60Var.f234581b && this.f234582c.equals(uw60Var.f234582c) && wj50.m88271j(this.f234583d, uw60Var.f234583d) && this.f234584e == uw60Var.f234584e && wj50.m88271j(this.f234585f, uw60Var.f234585f) && wj50.m88271j(this.f234586g, uw60Var.f234586g) && wj50.m88271j(this.f234587h, uw60Var.f234587h) && wj50.m88271j(this.f234588i, uw60Var.f234588i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f234581b.hashCode() + (Boolean.hashCode(this.f234580a) * 31)) * 31, 31, this.f234582c);
        String str = this.f234583d;
        int iM40938f = f710.m40938f(this.f234584e, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f234585f;
        int iHashCode = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f234586g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f234587h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f234588i;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }
}
