package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z0n0 {

    /* JADX INFO: renamed from: a */
    public final qho f278143a;

    /* JADX INFO: renamed from: b */
    public final b1n0 f278144b;

    public z0n0(qho qhoVar, b1n0 b1n0Var) {
        this.f278143a = qhoVar;
        this.f278144b = b1n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0n0)) {
            return false;
        }
        z0n0 z0n0Var = (z0n0) obj;
        return wj50.m88271j(this.f278143a, z0n0Var.f278143a) && wj50.m88271j(this.f278144b, z0n0Var.f278144b);
    }

    public final int hashCode() {
        return this.f278144b.hashCode() + (this.f278143a.hashCode() * 31);
    }
}
