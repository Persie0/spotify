package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gpf0 implements hpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f83180a;

    public gpf0(d850 d850Var) {
        this.f83180a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpf0) && wj50.m88271j(this.f83180a, ((gpf0) obj).f83180a);
    }

    public final int hashCode() {
        d850 d850Var = this.f83180a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
