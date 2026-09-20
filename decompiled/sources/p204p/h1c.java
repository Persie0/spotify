package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h1c {

    /* JADX INFO: renamed from: a */
    public final int f86553a;

    /* JADX INFO: renamed from: b */
    public final int f86554b;

    /* JADX INFO: renamed from: c */
    public final String f86555c;

    /* JADX INFO: renamed from: d */
    public final wwu f86556d;

    /* JADX INFO: renamed from: e */
    public final String f86557e;

    /* JADX INFO: renamed from: f */
    public final String f86558f;

    /* JADX INFO: renamed from: g */
    public final String f86559g;

    /* JADX INFO: renamed from: h */
    public final boolean f86560h;

    public h1c(int i, int i2, String str, wwu wwuVar, String str2, String str3, String str4, boolean z) {
        this.f86553a = i;
        this.f86554b = i2;
        this.f86555c = str;
        this.f86556d = wwuVar;
        this.f86557e = str2;
        this.f86558f = str3;
        this.f86559g = str4;
        this.f86560h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1c)) {
            return false;
        }
        h1c h1cVar = (h1c) obj;
        return this.f86553a == h1cVar.f86553a && this.f86554b == h1cVar.f86554b && wj50.m88271j(this.f86555c, h1cVar.f86555c) && wj50.m88271j(this.f86556d, h1cVar.f86556d) && wj50.m88271j(this.f86557e, h1cVar.f86557e) && wj50.m88271j(this.f86558f, h1cVar.f86558f) && wj50.m88271j(this.f86559g, h1cVar.f86559g) && this.f86560h == h1cVar.f86560h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86560h) + s571.m77243b(s571.m77243b(s571.m77243b((this.f86556d.hashCode() + s571.m77243b(mt60.m62800g(this.f86554b, Integer.hashCode(this.f86553a) * 31, 31), 31, this.f86555c)) * 31, 31, this.f86557e), 31, this.f86558f), 31, this.f86559g);
    }
}
