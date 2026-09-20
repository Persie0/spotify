package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o0a {

    /* JADX INFO: renamed from: a */
    public final String f160306a;

    /* JADX INFO: renamed from: b */
    public final String f160307b;

    /* JADX INFO: renamed from: c */
    public final String f160308c;

    /* JADX INFO: renamed from: d */
    public final String f160309d;

    /* JADX INFO: renamed from: e */
    public final String f160310e;

    /* JADX INFO: renamed from: f */
    public final boolean f160311f;

    /* JADX INFO: renamed from: g */
    public final String f160312g;

    /* JADX INFO: renamed from: h */
    public final String f160313h;

    /* JADX INFO: renamed from: i */
    public final boolean f160314i;

    /* JADX INFO: renamed from: j */
    public final String f160315j;

    public o0a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, boolean z2, String str8) {
        this.f160306a = str;
        this.f160307b = str2;
        this.f160308c = str3;
        this.f160309d = str4;
        this.f160310e = str5;
        this.f160311f = z;
        this.f160312g = str6;
        this.f160313h = str7;
        this.f160314i = z2;
        this.f160315j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0a)) {
            return false;
        }
        o0a o0aVar = (o0a) obj;
        return wj50.m88271j(this.f160306a, o0aVar.f160306a) && wj50.m88271j(this.f160307b, o0aVar.f160307b) && wj50.m88271j(this.f160308c, o0aVar.f160308c) && wj50.m88271j(this.f160309d, o0aVar.f160309d) && wj50.m88271j(this.f160310e, o0aVar.f160310e) && this.f160311f == o0aVar.f160311f && wj50.m88271j(this.f160312g, o0aVar.f160312g) && wj50.m88271j(this.f160313h, o0aVar.f160313h) && this.f160314i == o0aVar.f160314i && wj50.m88271j(this.f160315j, o0aVar.f160315j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f160306a.hashCode() * 31, 31, this.f160307b), 31, this.f160308c), 31, this.f160309d), 31, this.f160310e), 31, this.f160311f);
        String str = this.f160312g;
        int iM77245d2 = s571.m77245d(s571.m77243b((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160313h), 31, this.f160314i);
        String str2 = this.f160315j;
        return iM77245d2 + (str2 != null ? str2.hashCode() : 0);
    }
}
