package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s1m {

    /* JADX INFO: renamed from: a */
    public final String f204740a;

    /* JADX INFO: renamed from: b */
    public final String f204741b;

    /* JADX INFO: renamed from: c */
    public final String f204742c;

    /* JADX INFO: renamed from: d */
    public final String f204743d;

    /* JADX INFO: renamed from: e */
    public final p1m f204744e;

    /* JADX INFO: renamed from: f */
    public final boolean f204745f;

    public s1m(String str, String str2, String str3, String str4, p1m p1mVar, boolean z) {
        this.f204740a = str;
        this.f204741b = str2;
        this.f204742c = str3;
        this.f204743d = str4;
        this.f204744e = p1mVar;
        this.f204745f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1m)) {
            return false;
        }
        s1m s1mVar = (s1m) obj;
        return wj50.m88271j(this.f204740a, s1mVar.f204740a) && wj50.m88271j(this.f204741b, s1mVar.f204741b) && wj50.m88271j(this.f204742c, s1mVar.f204742c) && wj50.m88271j(this.f204743d, s1mVar.f204743d) && wj50.m88271j(this.f204744e, s1mVar.f204744e) && this.f204745f == s1mVar.f204745f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f204740a.hashCode() * 31, 31, this.f204741b), 31, this.f204742c), 31, this.f204743d);
        p1m p1mVar = this.f204744e;
        return Boolean.hashCode(this.f204745f) + ((iM77243b + (p1mVar == null ? 0 : p1mVar.hashCode())) * 31);
    }
}
