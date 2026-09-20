package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f114101a;

    public jnf0(d850 d850Var) {
        this.f114101a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnf0) && wj50.m88271j(this.f114101a, ((jnf0) obj).f114101a);
    }

    public final int hashCode() {
        d850 d850Var = this.f114101a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
