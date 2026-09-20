package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n741 {

    /* JADX INFO: renamed from: a */
    public final String f151078a;

    /* JADX INFO: renamed from: b */
    public final String f151079b;

    /* JADX INFO: renamed from: c */
    public final boolean f151080c;

    /* JADX INFO: renamed from: d */
    public final int f151081d;

    public n741(String str, String str2, boolean z, int i) {
        this.f151078a = str;
        this.f151079b = str2;
        this.f151080c = z;
        this.f151081d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n741)) {
            return false;
        }
        n741 n741Var = (n741) obj;
        return wj50.m88271j(this.f151078a, n741Var.f151078a) && wj50.m88271j(this.f151079b, n741Var.f151079b) && this.f151080c == n741Var.f151080c && this.f151081d == n741Var.f151081d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f151081d) + s571.m77245d(s571.m77243b(this.f151078a.hashCode() * 31, 31, this.f151079b), 31, this.f151080c);
    }
}
