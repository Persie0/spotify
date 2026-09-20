package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g0w implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f75484a;

    /* JADX INFO: renamed from: b */
    public final boolean f75485b;

    /* JADX INFO: renamed from: c */
    public final String f75486c;

    /* JADX INFO: renamed from: d */
    public final int f75487d;

    /* JADX INFO: renamed from: e */
    public final boolean f75488e;

    public g0w(String str, int i, boolean z, boolean z2) {
        this.f75484a = z;
        this.f75485b = z2;
        this.f75486c = str;
        this.f75487d = i;
        this.f75488e = z && !z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0w)) {
            return false;
        }
        g0w g0wVar = (g0w) obj;
        return this.f75484a == g0wVar.f75484a && this.f75485b == g0wVar.f75485b && wj50.m88271j(this.f75486c, g0wVar.f75486c) && this.f75487d == g0wVar.f75487d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f75484a) * 31, 31, this.f75485b);
        String str = this.f75486c;
        return edb.m38547C(this.f75487d) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
