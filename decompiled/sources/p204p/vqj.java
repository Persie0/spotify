package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final qf40 f243955a;

    public vqj(qf40 qf40Var) {
        this.f243955a = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqj) && wj50.m88271j(this.f243955a, ((vqj) obj).f243955a);
    }

    public final int hashCode() {
        return this.f243955a.hashCode();
    }
}
