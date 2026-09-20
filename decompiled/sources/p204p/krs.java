package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class krs {

    /* JADX INFO: renamed from: a */
    public final d850 f125718a;

    public krs(d850 d850Var) {
        this.f125718a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krs) && wj50.m88271j(this.f125718a, ((krs) obj).f125718a);
    }

    public final int hashCode() {
        d850 d850Var = this.f125718a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
