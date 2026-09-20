package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xx50 {

    /* JADX INFO: renamed from: a */
    public final String f266863a;

    /* JADX INFO: renamed from: b */
    public final String f266864b;

    /* JADX INFO: renamed from: c */
    public final int f266865c;

    /* JADX INFO: renamed from: d */
    public final int f266866d;

    /* JADX INFO: renamed from: e */
    public final boolean f266867e;

    /* JADX INFO: renamed from: f */
    public final vx50 f266868f;

    /* JADX INFO: renamed from: g */
    public final vx50 f266869g;

    public xx50(String str, String str2, int i, int i2, boolean z, vx50 vx50Var) {
        this.f266863a = str;
        this.f266864b = str2;
        this.f266865c = i;
        this.f266866d = i2;
        this.f266867e = z;
        this.f266868f = vx50Var;
        this.f266869g = vx50Var;
    }

    /* JADX INFO: renamed from: a */
    public final vx50 m92325a() {
        return this.f266869g;
    }

    /* JADX INFO: renamed from: b */
    public final String m92326b() {
        return this.f266864b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx50)) {
            return false;
        }
        xx50 xx50Var = (xx50) obj;
        return wj50.m88271j(this.f266863a, xx50Var.f266863a) && wj50.m88271j(this.f266864b, xx50Var.f266864b) && this.f266865c == xx50Var.f266865c && this.f266866d == xx50Var.f266866d && this.f266867e == xx50Var.f266867e && this.f266868f.equals(xx50Var.f266868f);
    }

    public final int hashCode() {
        return this.f266868f.hashCode() + s571.m77245d(f710.m40938f(this.f266866d, f710.m40938f(this.f266865c, s571.m77243b(this.f266863a.hashCode() * 31, 31, this.f266864b), 31), 31), 31, this.f266867e);
    }
}
