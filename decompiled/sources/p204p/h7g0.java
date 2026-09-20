package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final lb81 f88451a;

    /* JADX INFO: renamed from: b */
    public final p68 f88452b;

    /* JADX INFO: renamed from: c */
    public final z8m f88453c;

    /* JADX INFO: renamed from: d */
    public final c9m f88454d;

    public h7g0(lb81 lb81Var, p68 p68Var, z8m z8mVar, c9m c9mVar) {
        this.f88451a = lb81Var;
        this.f88452b = p68Var;
        this.f88453c = z8mVar;
        this.f88454d = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7g0)) {
            return false;
        }
        h7g0 h7g0Var = (h7g0) obj;
        return this.f88451a == h7g0Var.f88451a && wj50.m88271j(this.f88452b, h7g0Var.f88452b) && this.f88453c == h7g0Var.f88453c && this.f88454d == h7g0Var.f88454d;
    }

    public final int hashCode() {
        return this.f88454d.hashCode() + ((this.f88453c.hashCode() + ikc0.m50935g(this.f88452b, this.f88451a.hashCode() * 31, 31)) * 31);
    }
}
