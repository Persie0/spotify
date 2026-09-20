package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k3z {

    /* JADX INFO: renamed from: a */
    public final qf40 f119027a;

    /* JADX INFO: renamed from: b */
    public final qf40 f119028b;

    public k3z(qf40 qf40Var, qf40 qf40Var2) {
        this.f119027a = qf40Var;
        this.f119028b = qf40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3z)) {
            return false;
        }
        k3z k3zVar = (k3z) obj;
        return wj50.m88271j(this.f119027a, k3zVar.f119027a) && wj50.m88271j(this.f119028b, k3zVar.f119028b);
    }

    public final int hashCode() {
        return this.f119028b.hashCode() + (this.f119027a.hashCode() * 31);
    }
}
