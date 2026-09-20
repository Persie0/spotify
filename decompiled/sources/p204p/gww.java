package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gww implements u1x {

    /* JADX INFO: renamed from: a */
    public final ub41 f85121a;

    /* JADX INFO: renamed from: b */
    public final ub41 f85122b;

    public gww(ub41 ub41Var, ub41 ub41Var2) {
        this.f85121a = ub41Var;
        this.f85122b = ub41Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gww)) {
            return false;
        }
        gww gwwVar = (gww) obj;
        return wj50.m88271j(this.f85121a, gwwVar.f85121a) && wj50.m88271j(this.f85122b, gwwVar.f85122b);
    }

    public final int hashCode() {
        return this.f85122b.hashCode() + (this.f85121a.hashCode() * 31);
    }
}
