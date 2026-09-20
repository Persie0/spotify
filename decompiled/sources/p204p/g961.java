package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class g961 implements k961 {

    /* JADX INFO: renamed from: a */
    public final ta61 f77681a;

    /* JADX INFO: renamed from: b */
    public final ta61 f77682b;

    /* JADX INFO: renamed from: c */
    public final fa61 f77683c;

    public g961(ta61 ta61Var, ta61 ta61Var2, fa61 fa61Var) {
        this.f77681a = ta61Var;
        this.f77682b = ta61Var2;
        this.f77683c = fa61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g961)) {
            return false;
        }
        g961 g961Var = (g961) obj;
        return wj50.m88271j(this.f77681a, g961Var.f77681a) && wj50.m88271j(this.f77682b, g961Var.f77682b) && wj50.m88271j(this.f77683c, g961Var.f77683c);
    }

    public final int hashCode() {
        return this.f77683c.hashCode() + ((this.f77682b.hashCode() + (this.f77681a.hashCode() * 31)) * 31);
    }
}
