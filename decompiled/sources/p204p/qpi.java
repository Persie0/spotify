package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qpi {

    /* JADX INFO: renamed from: a */
    public final String f191320a;

    /* JADX INFO: renamed from: b */
    public final String f191321b;

    /* JADX INFO: renamed from: c */
    public final int f191322c;

    /* JADX INFO: renamed from: d */
    public final boolean f191323d;

    /* JADX INFO: renamed from: e */
    public final boolean f191324e;

    /* JADX INFO: renamed from: f */
    public final boolean f191325f;

    public qpi(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.f191320a = str;
        this.f191321b = str2;
        this.f191322c = i;
        this.f191323d = z;
        this.f191324e = z2;
        this.f191325f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpi)) {
            return false;
        }
        qpi qpiVar = (qpi) obj;
        return wj50.m88271j(this.f191320a, qpiVar.f191320a) && wj50.m88271j(this.f191321b, qpiVar.f191321b) && this.f191322c == qpiVar.f191322c && this.f191323d == qpiVar.f191323d && this.f191324e == qpiVar.f191324e && this.f191325f == qpiVar.f191325f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191325f) + s571.m77245d(s571.m77245d(f710.m40938f(this.f191322c, s571.m77243b(this.f191320a.hashCode() * 31, 31, this.f191321b), 31), 31, this.f191323d), 31, this.f191324e);
    }
}
