package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p1i {

    /* JADX INFO: renamed from: a */
    public final String f173085a;

    /* JADX INFO: renamed from: b */
    public final String f173086b;

    /* JADX INFO: renamed from: c */
    public final int f173087c;

    /* JADX INFO: renamed from: d */
    public final rrt f173088d;

    /* JADX INFO: renamed from: e */
    public final boolean f173089e;

    /* JADX INFO: renamed from: f */
    public final int f173090f;

    public p1i(String str, String str2, int i, rrt rrtVar, int i2) {
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 4) != 0 ? 1 : i;
        rrtVar = (i2 & 8) != 0 ? ort.f168650a : rrtVar;
        boolean z = (i2 & 16) != 0;
        int i3 = (i2 & 32) == 0 ? 2 : 1;
        this.f173085a = str;
        this.f173086b = str2;
        this.f173087c = i;
        this.f173088d = rrtVar;
        this.f173089e = z;
        this.f173090f = i3;
    }

    /* JADX INFO: renamed from: a */
    public final String m68813a() {
        return this.f173085a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1i)) {
            return false;
        }
        p1i p1iVar = (p1i) obj;
        return wj50.m88271j(this.f173085a, p1iVar.f173085a) && wj50.m88271j(this.f173086b, p1iVar.f173086b) && this.f173087c == p1iVar.f173087c && wj50.m88271j(this.f173088d, p1iVar.f173088d) && this.f173089e == p1iVar.f173089e && this.f173090f == p1iVar.f173090f;
    }

    public final int hashCode() {
        int iHashCode = this.f173085a.hashCode() * 31;
        String str = this.f173086b;
        return edb.m38547C(this.f173090f) + s571.m77245d((this.f173088d.hashCode() + f710.m40938f(this.f173087c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f173089e);
    }
}
