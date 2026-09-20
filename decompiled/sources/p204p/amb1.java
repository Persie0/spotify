package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class amb1 {

    /* JADX INFO: renamed from: a */
    public final String f17082a;

    /* JADX INFO: renamed from: b */
    public final ylb1 f17083b;

    /* JADX INFO: renamed from: c */
    public final zlb1 f17084c;

    /* JADX INFO: renamed from: d */
    public final hc80 f17085d;

    public amb1(String str, ylb1 ylb1Var, zlb1 zlb1Var, hc80 hc80Var) {
        this.f17082a = str;
        this.f17083b = ylb1Var;
        this.f17084c = zlb1Var;
        this.f17085d = hc80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amb1)) {
            return false;
        }
        amb1 amb1Var = (amb1) obj;
        return wj50.m88271j(this.f17082a, amb1Var.f17082a) && wj50.m88271j(this.f17083b, amb1Var.f17083b) && wj50.m88271j(this.f17084c, amb1Var.f17084c) && wj50.m88271j(this.f17085d, amb1Var.f17085d);
    }

    public final int hashCode() {
        return this.f17085d.hashCode() + ((this.f17084c.hashCode() + ((this.f17083b.hashCode() + (this.f17082a.hashCode() * 31)) * 31)) * 31);
    }
}
