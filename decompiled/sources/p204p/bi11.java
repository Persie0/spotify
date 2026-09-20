package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bi11 {

    /* JADX INFO: renamed from: a */
    public final di11 f27310a;

    /* JADX INFO: renamed from: b */
    public final er40 f27311b;

    public bi11(di11 di11Var, er40 er40Var) {
        this.f27310a = di11Var;
        this.f27311b = er40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi11)) {
            return false;
        }
        bi11 bi11Var = (bi11) obj;
        return this.f27310a == bi11Var.f27310a && wj50.m88271j(this.f27311b, bi11Var.f27311b);
    }

    public final int hashCode() {
        return this.f27311b.hashCode() + (this.f27310a.hashCode() * 31);
    }
}
