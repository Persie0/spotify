package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u6r {

    /* JADX INFO: renamed from: a */
    public final String f227414a;

    /* JADX INFO: renamed from: b */
    public final String f227415b;

    /* JADX INFO: renamed from: c */
    public final xfr f227416c;

    /* JADX INFO: renamed from: d */
    public final boolean f227417d;

    /* JADX INFO: renamed from: e */
    public final String f227418e;

    public u6r(String str, String str2, xfr xfrVar, boolean z, String str3) {
        this.f227414a = str;
        this.f227415b = str2;
        this.f227416c = xfrVar;
        this.f227417d = z;
        this.f227418e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m82459a() {
        return this.f227414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6r)) {
            return false;
        }
        u6r u6rVar = (u6r) obj;
        return wj50.m88271j(this.f227414a, u6rVar.f227414a) && wj50.m88271j(this.f227415b, u6rVar.f227415b) && this.f227416c == u6rVar.f227416c && this.f227417d == u6rVar.f227417d && wj50.m88271j(this.f227418e, u6rVar.f227418e);
    }

    public final int hashCode() {
        return this.f227418e.hashCode() + s571.m77245d((this.f227416c.hashCode() + s571.m77243b(this.f227414a.hashCode() * 31, 31, this.f227415b)) * 31, 31, this.f227417d);
    }
}
