package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class x5j0 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f258459a;

    /* JADX INFO: renamed from: b */
    public final String f258460b;

    /* JADX INFO: renamed from: c */
    public final String f258461c;

    /* JADX INFO: renamed from: d */
    public final String f258462d;

    public x5j0(String str, String str2, String str3, String str4) {
        this.f258459a = str;
        this.f258460b = str2;
        this.f258461c = str3;
        this.f258462d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5j0)) {
            return false;
        }
        x5j0 x5j0Var = (x5j0) obj;
        return wj50.m88271j(this.f258459a, x5j0Var.f258459a) && wj50.m88271j(this.f258460b, x5j0Var.f258460b) && wj50.m88271j(this.f258461c, x5j0Var.f258461c) && wj50.m88271j(this.f258462d, x5j0Var.f258462d);
    }

    public final int hashCode() {
        return this.f258462d.hashCode() + s571.m77243b(s571.m77243b(this.f258459a.hashCode() * 31, 31, this.f258460b), 31, this.f258461c);
    }
}
