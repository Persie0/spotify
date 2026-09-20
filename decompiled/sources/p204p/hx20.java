package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hx20 {

    /* JADX INFO: renamed from: a */
    public final String f96118a;

    /* JADX INFO: renamed from: b */
    public final String f96119b;

    /* JADX INFO: renamed from: c */
    public final kx20 f96120c;

    public hx20(String str, String str2, kx20 kx20Var) {
        this.f96118a = str;
        this.f96119b = str2;
        this.f96120c = kx20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx20)) {
            return false;
        }
        hx20 hx20Var = (hx20) obj;
        return wj50.m88271j(this.f96118a, hx20Var.f96118a) && wj50.m88271j(this.f96119b, hx20Var.f96119b) && wj50.m88271j(this.f96120c, hx20Var.f96120c);
    }

    public final int hashCode() {
        return this.f96120c.hashCode() + s571.m77243b(this.f96118a.hashCode() * 31, 31, this.f96119b);
    }
}
