package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kle0 {

    /* JADX INFO: renamed from: a */
    public final String f123879a;

    /* JADX INFO: renamed from: b */
    public final String f123880b;

    /* JADX INFO: renamed from: c */
    public final boolean f123881c;

    /* JADX INFO: renamed from: d */
    public final int f123882d;

    /* JADX INFO: renamed from: e */
    public final String f123883e;

    public kle0(int i, String str, String str2, boolean z, String str3) {
        this.f123879a = str;
        this.f123880b = str2;
        this.f123881c = z;
        this.f123882d = i;
        this.f123883e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kle0)) {
            return false;
        }
        kle0 kle0Var = (kle0) obj;
        return wj50.m88271j(this.f123879a, kle0Var.f123879a) && wj50.m88271j(this.f123880b, kle0Var.f123880b) && this.f123881c == kle0Var.f123881c && this.f123882d == kle0Var.f123882d && wj50.m88271j(this.f123883e, kle0Var.f123883e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f123882d, s571.m77245d(s571.m77243b(this.f123879a.hashCode() * 31, 31, this.f123880b), 31, this.f123881c), 31);
        String str = this.f123883e;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
