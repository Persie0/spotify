package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n231 {

    /* JADX INFO: renamed from: a */
    public final String f149617a;

    /* JADX INFO: renamed from: b */
    public final String f149618b;

    /* JADX INFO: renamed from: c */
    public final long f149619c;

    /* JADX INFO: renamed from: d */
    public final boolean f149620d;

    /* JADX INFO: renamed from: e */
    public final long f149621e;

    public n231(long j, long j2, String str, String str2, boolean z) {
        this.f149617a = str;
        this.f149618b = str2;
        this.f149619c = j;
        this.f149620d = z;
        this.f149621e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n231)) {
            return false;
        }
        n231 n231Var = (n231) obj;
        return wj50.m88271j(this.f149617a, n231Var.f149617a) && wj50.m88271j(this.f149618b, n231Var.f149618b) && this.f149619c == n231Var.f149619c && this.f149620d == n231Var.f149620d && this.f149621e == n231Var.f149621e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f149621e) + s571.m77245d(dq60.m36605e(s571.m77243b(this.f149617a.hashCode() * 31, 31, this.f149618b), this.f149619c, 31), 31, this.f149620d);
    }
}
