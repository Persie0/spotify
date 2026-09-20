package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f109591a;

    /* JADX INFO: renamed from: b */
    public final p68 f109592b;

    /* JADX INFO: renamed from: c */
    public final z8m f109593c;

    /* JADX INFO: renamed from: d */
    public final c9m f109594d;

    public j7g0(lb81 lb81Var, p68 p68Var, z8m z8mVar, c9m c9mVar) {
        this.f109591a = lb81Var;
        this.f109592b = p68Var;
        this.f109593c = z8mVar;
        this.f109594d = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7g0)) {
            return false;
        }
        j7g0 j7g0Var = (j7g0) obj;
        return this.f109591a == j7g0Var.f109591a && wj50.m88271j(this.f109592b, j7g0Var.f109592b) && this.f109593c == j7g0Var.f109593c && this.f109594d == j7g0Var.f109594d;
    }

    public final int hashCode() {
        return this.f109594d.hashCode() + ((this.f109593c.hashCode() + ikc0.m50935g(this.f109592b, this.f109591a.hashCode() * 31, 31)) * 31);
    }
}
