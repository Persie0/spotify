package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tq7 {

    /* JADX INFO: renamed from: i */
    public static final tq7 f222739i = new tq7(null, 6, null, false, false, false, false, false);

    /* JADX INFO: renamed from: a */
    public final vq7 f222740a;

    /* JADX INFO: renamed from: b */
    public final int f222741b;

    /* JADX INFO: renamed from: c */
    public final String f222742c;

    /* JADX INFO: renamed from: d */
    public final boolean f222743d;

    /* JADX INFO: renamed from: e */
    public final boolean f222744e;

    /* JADX INFO: renamed from: f */
    public final boolean f222745f;

    /* JADX INFO: renamed from: g */
    public final boolean f222746g;

    /* JADX INFO: renamed from: h */
    public final boolean f222747h;

    public tq7(vq7 vq7Var, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f222740a = vq7Var;
        this.f222741b = i;
        this.f222742c = str;
        this.f222743d = z;
        this.f222744e = z2;
        this.f222745f = z3;
        this.f222746g = z4;
        this.f222747h = z5;
    }

    /* JADX INFO: renamed from: a */
    public final sq7 m81302a() {
        sq7 sq7Var = new sq7();
        sq7Var.f213025a = this.f222740a;
        sq7Var.f213026b = this.f222741b;
        sq7Var.f213027c = this.f222742c;
        sq7Var.f213028d = this.f222743d;
        sq7Var.f213029e = this.f222744e;
        sq7Var.f213030f = this.f222745f;
        sq7Var.f213031g = this.f222746g;
        sq7Var.f213032h = this.f222747h;
        return sq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq7)) {
            return false;
        }
        tq7 tq7Var = (tq7) obj;
        return wj50.m88271j(this.f222740a, tq7Var.f222740a) && this.f222741b == tq7Var.f222741b && wj50.m88271j(this.f222742c, tq7Var.f222742c) && this.f222743d == tq7Var.f222743d && this.f222744e == tq7Var.f222744e && this.f222745f == tq7Var.f222745f && this.f222746g == tq7Var.f222746g && this.f222747h == tq7Var.f222747h;
    }

    public final int hashCode() {
        vq7 vq7Var = this.f222740a;
        int iM40938f = f710.m40938f(this.f222741b, (vq7Var == null ? 0 : vq7Var.hashCode()) * 31, 31);
        String str = this.f222742c;
        return Boolean.hashCode(this.f222747h) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM40938f + (str != null ? str.hashCode() : 0)) * 31, 31, this.f222743d), 31, this.f222744e), 31, this.f222745f), 31, this.f222746g);
    }
}
