package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x1k {

    /* JADX INFO: renamed from: a */
    public final er50 f257217a;

    /* JADX INFO: renamed from: b */
    public final int f257218b;

    /* JADX INFO: renamed from: c */
    public final String f257219c;

    public x1k(er50 er50Var, int i, String str) {
        this.f257217a = er50Var;
        this.f257218b = i;
        this.f257219c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1k)) {
            return false;
        }
        x1k x1kVar = (x1k) obj;
        return wj50.m88271j(this.f257217a, x1kVar.f257217a) && this.f257218b == x1kVar.f257218b && wj50.m88271j(this.f257219c, x1kVar.f257219c);
    }

    public final int hashCode() {
        return this.f257219c.hashCode() + mt60.m62800g(this.f257218b, this.f257217a.hashCode() * 31, 31);
    }
}
