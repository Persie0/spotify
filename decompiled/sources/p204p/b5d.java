package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b5d {

    /* JADX INFO: renamed from: a */
    public final String f23561a;

    /* JADX INFO: renamed from: b */
    public final String f23562b;

    /* JADX INFO: renamed from: c */
    public final int f23563c;

    /* JADX INFO: renamed from: d */
    public final int f23564d;

    /* JADX INFO: renamed from: e */
    public final long f23565e;

    public b5d(String str, String str2, int i, int i2, long j) {
        this.f23561a = str;
        this.f23562b = str2;
        this.f23563c = i;
        this.f23564d = i2;
        this.f23565e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5d)) {
            return false;
        }
        b5d b5dVar = (b5d) obj;
        return wj50.m88271j(this.f23561a, b5dVar.f23561a) && wj50.m88271j(this.f23562b, b5dVar.f23562b) && this.f23563c == b5dVar.f23563c && this.f23564d == b5dVar.f23564d && this.f23565e == b5dVar.f23565e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23565e) + f710.m40938f(this.f23564d, f710.m40938f(this.f23563c, s571.m77243b(this.f23561a.hashCode() * 31, 31, this.f23562b), 31), 31);
    }
}
