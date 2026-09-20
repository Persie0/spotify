package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q031 extends t031 {

    /* JADX INFO: renamed from: a */
    public final d850 f183898a;

    public q031(d850 d850Var) {
        this.f183898a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q031) && wj50.m88271j(this.f183898a, ((q031) obj).f183898a);
    }

    public final int hashCode() {
        d850 d850Var = this.f183898a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
