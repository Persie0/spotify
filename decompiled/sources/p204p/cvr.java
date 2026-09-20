package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cvr {

    /* JADX INFO: renamed from: a */
    public final boolean f42513a;

    /* JADX INFO: renamed from: b */
    public final boolean f42514b;

    /* JADX INFO: renamed from: c */
    public final boolean f42515c;

    /* JADX INFO: renamed from: d */
    public final boolean f42516d;

    /* JADX INFO: renamed from: e */
    public final boolean f42517e;

    /* JADX INFO: renamed from: f */
    public final boolean f42518f;

    /* JADX INFO: renamed from: g */
    public final String f42519g;

    /* JADX INFO: renamed from: h */
    public final boolean f42520h;

    /* JADX INFO: renamed from: i */
    public final fiz f42521i;

    public cvr(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, fiz fizVar) {
        this.f42513a = z;
        this.f42514b = z2;
        this.f42515c = z3;
        this.f42516d = z4;
        this.f42517e = z5;
        this.f42518f = z6;
        this.f42519g = str;
        this.f42520h = z7;
        this.f42521i = fizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvr)) {
            return false;
        }
        cvr cvrVar = (cvr) obj;
        return this.f42513a == cvrVar.f42513a && this.f42514b == cvrVar.f42514b && this.f42515c == cvrVar.f42515c && this.f42516d == cvrVar.f42516d && this.f42517e == cvrVar.f42517e && this.f42518f == cvrVar.f42518f && wj50.m88271j(this.f42519g, cvrVar.f42519g) && this.f42520h == cvrVar.f42520h && wj50.m88271j(this.f42521i, cvrVar.f42521i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f42513a) * 31, 31, this.f42514b), 31, this.f42515c), 31, this.f42516d), 31, this.f42517e), 31, this.f42518f);
        String str = this.f42519g;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f42520h);
        fiz fizVar = this.f42521i;
        return iM77245d2 + (fizVar != null ? fizVar.hashCode() : 0);
    }
}
