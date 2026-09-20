package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f265956a;

    /* JADX INFO: renamed from: b */
    public final String f265957b;

    /* JADX INFO: renamed from: c */
    public final j0z0 f265958c;

    /* JADX INFO: renamed from: d */
    public final d850 f265959d;

    public xty0(String str, String str2, j0z0 j0z0Var, d850 d850Var) {
        this.f265956a = str;
        this.f265957b = str2;
        this.f265958c = j0z0Var;
        this.f265959d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xty0)) {
            return false;
        }
        xty0 xty0Var = (xty0) obj;
        return wj50.m88271j(this.f265956a, xty0Var.f265956a) && wj50.m88271j(this.f265957b, xty0Var.f265957b) && wj50.m88271j(this.f265958c, xty0Var.f265958c) && wj50.m88271j(this.f265959d, xty0Var.f265959d);
    }

    public final int hashCode() {
        int iHashCode = (this.f265958c.hashCode() + s571.m77243b(this.f265956a.hashCode() * 31, 31, this.f265957b)) * 31;
        d850 d850Var = this.f265959d;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }

    public /* synthetic */ xty0(String str, String str2, j0z0 j0z0Var) {
        this(str, str2, j0z0Var, null);
    }
}
