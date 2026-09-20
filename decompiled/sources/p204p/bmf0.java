package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bmf0 implements emf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f28518a;

    public bmf0(d850 d850Var) {
        this.f28518a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmf0) && wj50.m88271j(this.f28518a, ((bmf0) obj).f28518a);
    }

    public final int hashCode() {
        d850 d850Var = this.f28518a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
