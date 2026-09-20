package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iu41 extends ms41 {

    /* JADX INFO: renamed from: c */
    public final String f105860c;

    /* JADX INFO: renamed from: d */
    public final int f105861d;

    /* JADX INFO: renamed from: e */
    public final String f105862e;

    /* JADX INFO: renamed from: f */
    public final boolean f105863f;

    public iu41(String str, int i, String str2, boolean z) {
        super(z, str);
        this.f105860c = str;
        this.f105861d = i;
        this.f105862e = str2;
        this.f105863f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu41)) {
            return false;
        }
        iu41 iu41Var = (iu41) obj;
        return wj50.m88271j(this.f105860c, iu41Var.f105860c) && this.f105861d == iu41Var.f105861d && wj50.m88271j(this.f105862e, iu41Var.f105862e) && this.f105863f == iu41Var.f105863f;
    }

    public final int hashCode() {
        String str = this.f105860c;
        return Boolean.hashCode(this.f105863f) + s571.m77243b(f710.m40938f(this.f105861d, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f105862e);
    }
}
