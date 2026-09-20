package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fi30 {

    /* JADX INFO: renamed from: a */
    public final xh30 f69764a;

    /* JADX INFO: renamed from: b */
    public final qf40 f69765b;

    public fi30(xh30 xh30Var, qf40 qf40Var) {
        this.f69764a = xh30Var;
        this.f69765b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi30)) {
            return false;
        }
        fi30 fi30Var = (fi30) obj;
        return wj50.m88271j(this.f69764a, fi30Var.f69764a) && wj50.m88271j(this.f69765b, fi30Var.f69765b);
    }

    public final int hashCode() {
        return this.f69765b.hashCode() + (this.f69764a.hashCode() * 31);
    }
}
