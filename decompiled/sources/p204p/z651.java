package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z651 {

    /* JADX INFO: renamed from: a */
    public final xam f279710a;

    /* JADX INFO: renamed from: b */
    public final a751 f279711b;

    public z651(xam xamVar, a751 a751Var) {
        this.f279710a = xamVar;
        this.f279711b = a751Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z651)) {
            return false;
        }
        z651 z651Var = (z651) obj;
        return wj50.m88271j(this.f279710a, z651Var.f279710a) && wj50.m88271j(this.f279711b, z651Var.f279711b);
    }

    public final int hashCode() {
        int iHashCode = this.f279710a.hashCode() * 31;
        a751 a751Var = this.f279711b;
        return iHashCode + (a751Var == null ? 0 : a751Var.hashCode());
    }
}
