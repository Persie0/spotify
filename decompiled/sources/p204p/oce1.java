package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oce1 implements pcd1 {

    /* JADX INFO: renamed from: a */
    public final String f163912a;

    /* JADX INFO: renamed from: b */
    public final String f163913b;

    /* JADX INFO: renamed from: c */
    public final int f163914c;

    /* JADX INFO: renamed from: d */
    public final String f163915d;

    /* JADX INFO: renamed from: e */
    public final String f163916e;

    /* JADX INFO: renamed from: f */
    public final String f163917f;

    /* JADX INFO: renamed from: g */
    public final String f163918g;

    /* JADX INFO: renamed from: h */
    public final ll20 f163919h;

    public oce1(String str, String str2, int i, String str3, String str4, String str5, String str6, ll20 ll20Var) {
        this.f163912a = str;
        this.f163913b = str2;
        this.f163914c = i;
        this.f163915d = str3;
        this.f163916e = str4;
        this.f163917f = str5;
        this.f163918g = str6;
        this.f163919h = ll20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oce1)) {
            return false;
        }
        oce1 oce1Var = (oce1) obj;
        return wj50.m88271j(this.f163912a, oce1Var.f163912a) && wj50.m88271j(this.f163913b, oce1Var.f163913b) && this.f163914c == oce1Var.f163914c && wj50.m88271j(this.f163915d, oce1Var.f163915d) && wj50.m88271j(this.f163916e, oce1Var.f163916e) && wj50.m88271j(this.f163917f, oce1Var.f163917f) && wj50.m88271j(this.f163918g, oce1Var.f163918g) && wj50.m88271j(this.f163919h, oce1Var.f163919h);
    }

    @Override // p204p.pcd1
    /* JADX INFO: renamed from: g */
    public final ll20 mo44315g() {
        return this.f163919h;
    }

    @Override // p204p.pcd1
    public final String getItemId() {
        return this.f163918g;
    }

    @Override // p204p.pcd1
    public final String getUri() {
        return this.f163917f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(f710.m40938f(this.f163914c, s571.m77243b(this.f163912a.hashCode() * 31, 31, this.f163913b), 31), 31, this.f163915d), 31, this.f163916e), 31, this.f163917f), 31, this.f163918g);
        ll20 ll20Var = this.f163919h;
        return iM77243b + (ll20Var == null ? 0 : ll20Var.hashCode());
    }
}
