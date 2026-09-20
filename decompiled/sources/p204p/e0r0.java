package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e0r0 {

    /* JADX INFO: renamed from: a */
    public final c631 f55024a;

    /* JADX INFO: renamed from: b */
    public final d0r0 f55025b;

    public e0r0(c631 c631Var, d0r0 d0r0Var) {
        this.f55024a = c631Var;
        this.f55025b = d0r0Var;
    }

    /* JADX INFO: renamed from: a */
    public final c631 m37499a() {
        return this.f55024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0r0)) {
            return false;
        }
        e0r0 e0r0Var = (e0r0) obj;
        return wj50.m88271j(this.f55024a, e0r0Var.f55024a) && wj50.m88271j(this.f55025b, e0r0Var.f55025b);
    }

    public final int hashCode() {
        return this.f55025b.hashCode() + (this.f55024a.hashCode() * 31);
    }
}
