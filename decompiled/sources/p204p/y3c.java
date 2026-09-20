package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y3c {

    /* JADX INFO: renamed from: a */
    public final String f268800a;

    /* JADX INFO: renamed from: b */
    public final String f268801b;

    /* JADX INFO: renamed from: c */
    public final String f268802c;

    /* JADX INFO: renamed from: d */
    public final String f268803d;

    /* JADX INFO: renamed from: e */
    public final String f268804e;

    /* JADX INFO: renamed from: f */
    public final String f268805f;

    /* JADX INFO: renamed from: g */
    public final boolean f268806g;

    public y3c(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f268800a = str;
        this.f268801b = str2;
        this.f268802c = str3;
        this.f268803d = str4;
        this.f268804e = str5;
        this.f268805f = str6;
        this.f268806g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3c)) {
            return false;
        }
        y3c y3cVar = (y3c) obj;
        return wj50.m88271j(this.f268800a, y3cVar.f268800a) && wj50.m88271j(this.f268801b, y3cVar.f268801b) && wj50.m88271j(this.f268802c, y3cVar.f268802c) && wj50.m88271j(this.f268803d, y3cVar.f268803d) && wj50.m88271j(this.f268804e, y3cVar.f268804e) && wj50.m88271j(this.f268805f, y3cVar.f268805f) && this.f268806g == y3cVar.f268806g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268806g) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f268800a.hashCode() * 31, 31, this.f268801b), 31, this.f268802c), 31, this.f268803d), 31, this.f268804e), 31, this.f268805f);
    }
}
