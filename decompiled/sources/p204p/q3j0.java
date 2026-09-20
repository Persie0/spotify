package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q3j0 {

    /* JADX INFO: renamed from: a */
    public final int f184891a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f184892b;

    /* JADX INFO: renamed from: c */
    public final qf40 f184893c;

    public q3j0(int i, j4m0 j4m0Var, qf40 qf40Var) {
        this.f184891a = i;
        this.f184892b = j4m0Var;
        this.f184893c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3j0)) {
            return false;
        }
        q3j0 q3j0Var = (q3j0) obj;
        return this.f184891a == q3j0Var.f184891a && this.f184892b.equals(q3j0Var.f184892b) && wj50.m88271j(this.f184893c, q3j0Var.f184893c);
    }

    public final int hashCode() {
        return this.f184893c.hashCode() + ((this.f184892b.hashCode() + (edb.m38547C(this.f184891a) * 31)) * 31);
    }
}
