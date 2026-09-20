package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ve81 {

    /* JADX INFO: renamed from: a */
    public final qf40 f240644a;

    /* JADX INFO: renamed from: b */
    public final qf40 f240645b;

    public ve81(qf40 qf40Var, qf40 qf40Var2) {
        this.f240644a = qf40Var;
        this.f240645b = qf40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve81)) {
            return false;
        }
        ve81 ve81Var = (ve81) obj;
        return wj50.m88271j(this.f240644a, ve81Var.f240644a) && wj50.m88271j(this.f240645b, ve81Var.f240645b);
    }

    public final int hashCode() {
        return this.f240645b.hashCode() + (this.f240644a.hashCode() * 31);
    }
}
