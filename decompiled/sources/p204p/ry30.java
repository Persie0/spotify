package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ry30 {

    /* JADX INFO: renamed from: a */
    public final int f203807a;

    /* JADX INFO: renamed from: b */
    public final py30 f203808b;

    public ry30(int i, py30 py30Var) {
        this.f203807a = i;
        this.f203808b = py30Var;
    }

    /* JADX INFO: renamed from: a */
    public final py30 m76689a() {
        return this.f203808b;
    }

    /* JADX INFO: renamed from: b */
    public final int m76690b() {
        return this.f203807a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry30)) {
            return false;
        }
        ry30 ry30Var = (ry30) obj;
        return this.f203807a == ry30Var.f203807a && wj50.m88271j(this.f203808b, ry30Var.f203808b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f203807a) * 31;
        py30 py30Var = this.f203808b;
        return Boolean.hashCode(false) + ((iHashCode + (py30Var == null ? 0 : py30Var.hashCode())) * 31);
    }

    public ry30(int i) {
        this(i, new py30());
    }
}
