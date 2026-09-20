package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x8d {

    /* JADX INFO: renamed from: a */
    public final String f259124a;

    /* JADX INFO: renamed from: b */
    public final String f259125b;

    /* JADX INFO: renamed from: c */
    public final int f259126c;

    /* JADX INFO: renamed from: d */
    public final int f259127d;

    /* JADX INFO: renamed from: e */
    public final long f259128e;

    public x8d(String str, String str2, int i, int i2, long j) {
        this.f259124a = str;
        this.f259125b = str2;
        this.f259126c = i;
        this.f259127d = i2;
        this.f259128e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8d)) {
            return false;
        }
        x8d x8dVar = (x8d) obj;
        return this.f259124a.equals(x8dVar.f259124a) && this.f259125b.equals(x8dVar.f259125b) && this.f259126c == x8dVar.f259126c && this.f259127d == x8dVar.f259127d && this.f259128e == x8dVar.f259128e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f259128e) + f710.m40938f(this.f259127d, f710.m40938f(this.f259126c, s571.m77243b(this.f259124a.hashCode() * 31, 31, this.f259125b), 31), 31);
    }
}
