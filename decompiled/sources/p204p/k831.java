package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k831 {

    /* JADX INFO: renamed from: a */
    public final g631 f120243a;

    /* JADX INFO: renamed from: b */
    public final n631 f120244b;

    public k831(g631 g631Var, n631 n631Var) {
        this.f120243a = g631Var;
        this.f120244b = n631Var;
    }

    /* JADX INFO: renamed from: a */
    public final n631 m55725a() {
        return this.f120244b;
    }

    /* JADX INFO: renamed from: b */
    public final g631 m55726b() {
        return this.f120243a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k831)) {
            return false;
        }
        k831 k831Var = (k831) obj;
        return wj50.m88271j(this.f120243a, k831Var.f120243a) && wj50.m88271j(this.f120244b, k831Var.f120244b);
    }

    public final int hashCode() {
        return this.f120244b.f150676a.hashCode() + (this.f120243a.hashCode() * 31);
    }
}
