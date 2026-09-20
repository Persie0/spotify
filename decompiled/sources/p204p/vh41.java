package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vh41 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f241408a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f241409b;

    /* JADX INFO: renamed from: c */
    public final o4x f241410c;

    /* JADX INFO: renamed from: d */
    public final int f241411d;

    public vh41(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, int i) {
        this.f241408a = otd0Var;
        this.f241409b = ibp0Var;
        this.f241410c = o4xVar;
        this.f241411d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m85505a() {
        return this.f241411d;
    }

    /* JADX INFO: renamed from: b */
    public final o4x m85506b() {
        return this.f241410c;
    }

    /* JADX INFO: renamed from: c */
    public final otd0 m85507c() {
        return this.f241408a;
    }

    /* JADX INFO: renamed from: d */
    public final ibp0 m85508d() {
        return this.f241409b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh41)) {
            return false;
        }
        vh41 vh41Var = (vh41) obj;
        return wj50.m88271j(this.f241408a, vh41Var.f241408a) && wj50.m88271j(this.f241409b, vh41Var.f241409b) && wj50.m88271j(this.f241410c, vh41Var.f241410c) && this.f241411d == vh41Var.f241411d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f241411d) + ((this.f241410c.hashCode() + ((this.f241409b.hashCode() + (this.f241408a.hashCode() * 31)) * 31)) * 31);
    }
}
