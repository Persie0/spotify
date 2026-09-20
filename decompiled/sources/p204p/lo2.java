package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lo2 {

    /* JADX INFO: renamed from: a */
    public final String f135279a;

    /* JADX INFO: renamed from: b */
    public final String f135280b;

    /* JADX INFO: renamed from: c */
    public final int f135281c;

    /* JADX INFO: renamed from: d */
    public final boolean f135282d;

    public lo2(String str, int i, String str2, boolean z) {
        this.f135279a = str;
        this.f135280b = str2;
        this.f135281c = i;
        this.f135282d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo2)) {
            return false;
        }
        lo2 lo2Var = (lo2) obj;
        return this.f135279a.equals(lo2Var.f135279a) && this.f135280b.equals(lo2Var.f135280b) && this.f135281c == lo2Var.f135281c && this.f135282d == lo2Var.f135282d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135282d) + f710.m40938f(this.f135281c, s571.m77243b(this.f135279a.hashCode() * 31, 31, this.f135280b), 31);
    }
}
