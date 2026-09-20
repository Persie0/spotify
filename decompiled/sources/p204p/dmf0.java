package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dmf0 implements emf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f50524a;

    public dmf0(d850 d850Var) {
        this.f50524a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmf0) && wj50.m88271j(this.f50524a, ((dmf0) obj).f50524a);
    }

    public final int hashCode() {
        d850 d850Var = this.f50524a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
