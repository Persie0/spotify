package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cmf0 implements emf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f39663a;

    public cmf0(d850 d850Var) {
        this.f39663a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmf0) && wj50.m88271j(this.f39663a, ((cmf0) obj).f39663a);
    }

    public final int hashCode() {
        d850 d850Var = this.f39663a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
