package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e4d {

    /* JADX INFO: renamed from: a */
    public final String f56051a;

    /* JADX INFO: renamed from: b */
    public final String f56052b;

    /* JADX INFO: renamed from: c */
    public final int f56053c;

    /* JADX INFO: renamed from: d */
    public final int f56054d;

    /* JADX INFO: renamed from: e */
    public final long f56055e;

    public e4d(String str, String str2, int i, int i2, long j) {
        this.f56051a = str;
        this.f56052b = str2;
        this.f56053c = i;
        this.f56054d = i2;
        this.f56055e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4d)) {
            return false;
        }
        e4d e4dVar = (e4d) obj;
        return this.f56051a.equals(e4dVar.f56051a) && this.f56052b.equals(e4dVar.f56052b) && this.f56053c == e4dVar.f56053c && this.f56054d == e4dVar.f56054d && this.f56055e == e4dVar.f56055e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56055e) + f710.m40938f(this.f56054d, f710.m40938f(this.f56053c, s571.m77243b(this.f56051a.hashCode() * 31, 31, this.f56052b), 31), 31);
    }
}
