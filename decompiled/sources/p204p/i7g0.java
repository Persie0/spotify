package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f99555a;

    /* JADX INFO: renamed from: b */
    public final p68 f99556b;

    /* JADX INFO: renamed from: c */
    public final z8m f99557c;

    /* JADX INFO: renamed from: d */
    public final c9m f99558d;

    public i7g0(lb81 lb81Var, p68 p68Var, z8m z8mVar, c9m c9mVar) {
        this.f99555a = lb81Var;
        this.f99556b = p68Var;
        this.f99557c = z8mVar;
        this.f99558d = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7g0)) {
            return false;
        }
        i7g0 i7g0Var = (i7g0) obj;
        return this.f99555a == i7g0Var.f99555a && wj50.m88271j(this.f99556b, i7g0Var.f99556b) && this.f99557c == i7g0Var.f99557c && this.f99558d == i7g0Var.f99558d;
    }

    public final int hashCode() {
        return this.f99558d.hashCode() + ((this.f99557c.hashCode() + ikc0.m50935g(this.f99556b, this.f99555a.hashCode() * 31, 31)) * 31);
    }
}
