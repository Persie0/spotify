package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r1k {

    /* JADX INFO: renamed from: a */
    public final String f194872a;

    /* JADX INFO: renamed from: b */
    public final String f194873b;

    /* JADX INFO: renamed from: c */
    public final boolean f194874c;

    /* JADX INFO: renamed from: d */
    public final int f194875d;

    /* JADX INFO: renamed from: e */
    public final boolean f194876e;

    /* JADX INFO: renamed from: f */
    public final boolean f194877f;

    public r1k(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.f194872a = str;
        this.f194873b = str2;
        this.f194874c = z;
        this.f194875d = i;
        this.f194876e = z2;
        this.f194877f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1k)) {
            return false;
        }
        r1k r1kVar = (r1k) obj;
        return wj50.m88271j(this.f194872a, r1kVar.f194872a) && wj50.m88271j(this.f194873b, r1kVar.f194873b) && this.f194874c == r1kVar.f194874c && this.f194875d == r1kVar.f194875d && this.f194876e == r1kVar.f194876e && this.f194877f == r1kVar.f194877f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194877f) + s571.m77245d(mt60.m62800g(this.f194875d, s571.m77245d(s571.m77243b(this.f194872a.hashCode() * 31, 31, this.f194873b), 31, this.f194874c), 31), 31, this.f194876e);
    }
}
