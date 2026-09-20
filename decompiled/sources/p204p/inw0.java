package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class inw0 {

    /* JADX INFO: renamed from: a */
    public final int f104067a;

    /* JADX INFO: renamed from: b */
    public final qf40 f104068b;

    public inw0(int i, qf40 qf40Var) {
        this.f104067a = i;
        this.f104068b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inw0)) {
            return false;
        }
        inw0 inw0Var = (inw0) obj;
        return this.f104067a == inw0Var.f104067a && wj50.m88271j(this.f104068b, inw0Var.f104068b);
    }

    public final int hashCode() {
        return this.f104068b.hashCode() + (Integer.hashCode(this.f104067a) * 31);
    }
}
