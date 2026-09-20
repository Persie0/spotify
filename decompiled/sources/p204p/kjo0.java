package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kjo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final d850 f123388a;

    public kjo0(d850 d850Var) {
        this.f123388a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjo0) && wj50.m88271j(this.f123388a, ((kjo0) obj).f123388a);
    }

    public final int hashCode() {
        d850 d850Var = this.f123388a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
