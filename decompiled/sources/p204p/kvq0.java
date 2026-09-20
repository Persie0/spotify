package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final d850 f126929a;

    public kvq0(d850 d850Var) {
        this.f126929a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvq0) && wj50.m88271j(this.f126929a, ((kvq0) obj).f126929a);
    }

    public final int hashCode() {
        d850 d850Var = this.f126929a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
