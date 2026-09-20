package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class slf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f210414a;

    public slf0(d850 d850Var) {
        this.f210414a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slf0) && wj50.m88271j(this.f210414a, ((slf0) obj).f210414a);
    }

    public final int hashCode() {
        d850 d850Var = this.f210414a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
