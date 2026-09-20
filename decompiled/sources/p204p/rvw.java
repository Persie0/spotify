package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rvw implements s2x {

    /* JADX INFO: renamed from: a */
    public final int f203137a;

    /* JADX INFO: renamed from: b */
    public final cfv0 f203138b;

    public rvw(int i, cfv0 cfv0Var) {
        this.f203137a = i;
        this.f203138b = cfv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvw)) {
            return false;
        }
        rvw rvwVar = (rvw) obj;
        return this.f203137a == rvwVar.f203137a && wj50.m88271j(this.f203138b, rvwVar.f203138b);
    }

    public final int hashCode() {
        return this.f203138b.hashCode() + (Integer.hashCode(this.f203137a) * 31);
    }
}
