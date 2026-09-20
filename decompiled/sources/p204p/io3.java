package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class io3 implements olm0 {

    /* JADX INFO: renamed from: a */
    public final d850 f104108a;

    public io3(d850 d850Var) {
        this.f104108a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io3) && wj50.m88271j(this.f104108a, ((io3) obj).f104108a);
    }

    public final int hashCode() {
        d850 d850Var = this.f104108a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
