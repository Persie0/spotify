package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ahb0 extends bhb0 {

    /* JADX INFO: renamed from: b */
    public final int f15659b;

    /* JADX INFO: renamed from: c */
    public final xrn0 f15660c;

    public ahb0(int i, orn0 orn0Var) {
        super(i);
        this.f15659b = i;
        this.f15660c = orn0Var;
    }

    @Override // p204p.bhb0
    /* JADX INFO: renamed from: a */
    public final int mo25925a() {
        return this.f15659b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahb0)) {
            return false;
        }
        ahb0 ahb0Var = (ahb0) obj;
        return this.f15659b == ahb0Var.f15659b && wj50.m88271j(this.f15660c, ahb0Var.f15660c);
    }

    public final int hashCode() {
        return this.f15660c.hashCode() + (Integer.hashCode(this.f15659b) * 31);
    }
}
