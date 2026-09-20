package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class d961 implements k961 {

    /* JADX INFO: renamed from: a */
    public final ta61 f46703a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1895gf f46704b;

    public d961(ta61 ta61Var, AbstractC1895gf abstractC1895gf) {
        this.f46703a = ta61Var;
        this.f46704b = abstractC1895gf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d961)) {
            return false;
        }
        d961 d961Var = (d961) obj;
        return wj50.m88271j(this.f46703a, d961Var.f46703a) && wj50.m88271j(this.f46704b, d961Var.f46704b);
    }

    public final int hashCode() {
        return this.f46704b.hashCode() + (this.f46703a.hashCode() * 31);
    }
}
