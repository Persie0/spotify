package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xwp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f266731a;

    /* JADX INFO: renamed from: b */
    public final boolean f266732b;

    /* JADX INFO: renamed from: c */
    public final String f266733c;

    public xwp0(String str, boolean z, boolean z2) {
        this.f266731a = z;
        this.f266732b = z2;
        this.f266733c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwp0)) {
            return false;
        }
        xwp0 xwp0Var = (xwp0) obj;
        return this.f266731a == xwp0Var.f266731a && this.f266732b == xwp0Var.f266732b && wj50.m88271j(this.f266733c, xwp0Var.f266733c);
    }

    public final int hashCode() {
        return this.f266733c.hashCode() + s571.m77245d(Boolean.hashCode(this.f266731a) * 31, 31, this.f266732b);
    }
}
