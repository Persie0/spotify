package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hl5 {

    /* JADX INFO: renamed from: a */
    public final long f92617a;

    /* JADX INFO: renamed from: b */
    public final xub f92618b;

    public hl5(long j, xub xubVar) {
        this.f92617a = j;
        this.f92618b = xubVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl5)) {
            return false;
        }
        hl5 hl5Var = (hl5) obj;
        return this.f92617a == hl5Var.f92617a && wj50.m88271j(this.f92618b, hl5Var.f92618b);
    }

    public final int hashCode() {
        return this.f92618b.hashCode() + (Long.hashCode(this.f92617a) * 31);
    }
}
