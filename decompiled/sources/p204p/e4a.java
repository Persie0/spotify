package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e4a implements g4a {

    /* JADX INFO: renamed from: a */
    public final String f56033a;

    /* JADX INFO: renamed from: b */
    public final String f56034b;

    /* JADX INFO: renamed from: c */
    public final String f56035c;

    /* JADX INFO: renamed from: d */
    public final int f56036d;

    /* JADX INFO: renamed from: e */
    public final g7f f56037e;

    /* JADX INFO: renamed from: f */
    public final String f56038f;

    public e4a(String str, String str2, String str3, int i, g7f g7fVar, String str4) {
        this.f56033a = str;
        this.f56034b = str2;
        this.f56035c = str3;
        this.f56036d = i;
        this.f56037e = g7fVar;
        this.f56038f = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m37765a() {
        return this.f56034b;
    }

    /* JADX INFO: renamed from: b */
    public final String m37766b() {
        return this.f56033a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4a)) {
            return false;
        }
        e4a e4aVar = (e4a) obj;
        return wj50.m88271j(this.f56033a, e4aVar.f56033a) && wj50.m88271j(this.f56034b, e4aVar.f56034b) && wj50.m88271j(this.f56035c, e4aVar.f56035c) && this.f56036d == e4aVar.f56036d && wj50.m88271j(this.f56037e, e4aVar.f56037e) && wj50.m88271j(this.f56038f, e4aVar.f56038f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f56033a.hashCode() * 31, 31, this.f56034b);
        String str = this.f56035c;
        int iM40938f = f710.m40938f(this.f56036d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        g7f g7fVar = this.f56037e;
        int iHashCode = (iM40938f + (g7fVar == null ? 0 : g7fVar.hashCode())) * 31;
        String str2 = this.f56038f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
