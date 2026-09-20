package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xbm {

    /* JADX INFO: renamed from: a */
    public final String f259943a;

    /* JADX INFO: renamed from: b */
    public final String f259944b;

    /* JADX INFO: renamed from: c */
    public final String f259945c;

    /* JADX INFO: renamed from: d */
    public final String f259946d;

    /* JADX INFO: renamed from: e */
    public final boolean f259947e;

    public xbm(String str, String str2, String str3, String str4, boolean z) {
        this.f259943a = str;
        this.f259944b = str2;
        this.f259945c = str3;
        this.f259946d = str4;
        this.f259947e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbm)) {
            return false;
        }
        xbm xbmVar = (xbm) obj;
        return wj50.m88271j(this.f259943a, xbmVar.f259943a) && wj50.m88271j(this.f259944b, xbmVar.f259944b) && wj50.m88271j(this.f259945c, xbmVar.f259945c) && wj50.m88271j(this.f259946d, xbmVar.f259946d) && this.f259947e == xbmVar.f259947e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259947e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f259943a.hashCode() * 31, 31, this.f259944b), 31, this.f259945c), 31, this.f259946d);
    }
}
