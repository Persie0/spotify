package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hdi0 {

    /* JADX INFO: renamed from: a */
    public final fdi0 f90147a;

    /* JADX INFO: renamed from: b */
    public final w8b f90148b;

    public hdi0(w8b w8bVar, fdi0 fdi0Var) {
        this.f90147a = fdi0Var;
        this.f90148b = w8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdi0)) {
            return false;
        }
        hdi0 hdi0Var = (hdi0) obj;
        return this.f90147a == hdi0Var.f90147a && wj50.m88271j(this.f90148b, hdi0Var.f90148b);
    }

    public final int hashCode() {
        int iHashCode = this.f90147a.hashCode() * 31;
        w8b w8bVar = this.f90148b;
        return iHashCode + (w8bVar == null ? 0 : w8bVar.hashCode());
    }
}
