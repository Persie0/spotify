package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pqr0 {

    /* JADX INFO: renamed from: a */
    public final String f180406a;

    /* JADX INFO: renamed from: b */
    public final String f180407b;

    /* JADX INFO: renamed from: c */
    public final String f180408c;

    /* JADX INFO: renamed from: d */
    public final String f180409d;

    /* JADX INFO: renamed from: e */
    public final String f180410e;

    /* JADX INFO: renamed from: f */
    public final boolean f180411f;

    /* JADX INFO: renamed from: g */
    public final String f180412g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f180413h;

    /* JADX INFO: renamed from: i */
    public final int f180414i;

    public pqr0(String str, String str2, String str3, String str4, String str5, boolean z, String str6, rcm0 rcm0Var, int i) {
        this.f180406a = str;
        this.f180407b = str2;
        this.f180408c = str3;
        this.f180409d = str4;
        this.f180410e = str5;
        this.f180411f = z;
        this.f180412g = str6;
        this.f180413h = rcm0Var;
        this.f180414i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqr0)) {
            return false;
        }
        pqr0 pqr0Var = (pqr0) obj;
        return wj50.m88271j(this.f180406a, pqr0Var.f180406a) && wj50.m88271j(this.f180407b, pqr0Var.f180407b) && wj50.m88271j(this.f180408c, pqr0Var.f180408c) && wj50.m88271j(this.f180409d, pqr0Var.f180409d) && wj50.m88271j(this.f180410e, pqr0Var.f180410e) && this.f180411f == pqr0Var.f180411f && wj50.m88271j(this.f180412g, pqr0Var.f180412g) && wj50.m88271j(this.f180413h, pqr0Var.f180413h) && this.f180414i == pqr0Var.f180414i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180414i) + yds.m93483m(this.f180413h, s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f180406a.hashCode() * 31, 31, this.f180407b), 31, this.f180408c), 31, this.f180409d), 31, this.f180410e), 31, this.f180411f), 31, this.f180412g), 31);
    }
}
