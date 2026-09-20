package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class znv implements aov {

    /* JADX INFO: renamed from: a */
    public final String f284558a;

    /* JADX INFO: renamed from: b */
    public final String f284559b;

    /* JADX INFO: renamed from: c */
    public final String f284560c;

    /* JADX INFO: renamed from: d */
    public final String f284561d;

    /* JADX INFO: renamed from: e */
    public final boolean f284562e;

    /* JADX INFO: renamed from: f */
    public final boolean f284563f;

    /* JADX INFO: renamed from: g */
    public final ctj f284564g;

    /* JADX INFO: renamed from: h */
    public final pv00 f284565h;

    /* JADX INFO: renamed from: i */
    public final bso0 f284566i;

    /* JADX INFO: renamed from: j */
    public final unv f284567j;

    public znv(String str, String str2, String str3, String str4, boolean z, boolean z2, ctj ctjVar, pv00 pv00Var, bso0 bso0Var, unv unvVar) {
        this.f284558a = str;
        this.f284559b = str2;
        this.f284560c = str3;
        this.f284561d = str4;
        this.f284562e = z;
        this.f284563f = z2;
        this.f284564g = ctjVar;
        this.f284565h = pv00Var;
        this.f284566i = bso0Var;
        this.f284567j = unvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znv)) {
            return false;
        }
        znv znvVar = (znv) obj;
        return wj50.m88271j(this.f284558a, znvVar.f284558a) && wj50.m88271j(this.f284559b, znvVar.f284559b) && wj50.m88271j(this.f284560c, znvVar.f284560c) && wj50.m88271j(this.f284561d, znvVar.f284561d) && this.f284562e == znvVar.f284562e && this.f284563f == znvVar.f284563f && wj50.m88271j(this.f284564g, znvVar.f284564g) && wj50.m88271j(this.f284565h, znvVar.f284565h) && this.f284566i == znvVar.f284566i && wj50.m88271j(this.f284567j, znvVar.f284567j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f284558a.hashCode() * 31, 31, this.f284559b);
        String str = this.f284560c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f284561d;
        int iHashCode2 = (this.f284566i.hashCode() + ((this.f284565h.hashCode() + ((this.f284564g.hashCode() + s571.m77245d(s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f284562e), 31, this.f284563f)) * 31)) * 31)) * 31;
        unv unvVar = this.f284567j;
        return iHashCode2 + (unvVar != null ? unvVar.hashCode() : 0);
    }
}
