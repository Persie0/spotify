package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f151157a;

    /* JADX INFO: renamed from: b */
    public final p68 f151158b;

    /* JADX INFO: renamed from: c */
    public final z8m f151159c;

    /* JADX INFO: renamed from: d */
    public final c9m f151160d;

    public n7g0(lb81 lb81Var, p68 p68Var, z8m z8mVar, c9m c9mVar) {
        this.f151157a = lb81Var;
        this.f151158b = p68Var;
        this.f151159c = z8mVar;
        this.f151160d = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7g0)) {
            return false;
        }
        n7g0 n7g0Var = (n7g0) obj;
        return this.f151157a == n7g0Var.f151157a && wj50.m88271j(this.f151158b, n7g0Var.f151158b) && this.f151159c == n7g0Var.f151159c && this.f151160d == n7g0Var.f151160d;
    }

    public final int hashCode() {
        return this.f151160d.hashCode() + ((this.f151159c.hashCode() + ikc0.m50935g(this.f151158b, this.f151157a.hashCode() * 31, 31)) * 31);
    }
}
