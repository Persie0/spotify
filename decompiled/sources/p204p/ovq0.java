package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ovq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final d850 f170549a;

    public ovq0(d850 d850Var) {
        this.f170549a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovq0) && wj50.m88271j(this.f170549a, ((ovq0) obj).f170549a);
    }

    public final int hashCode() {
        d850 d850Var = this.f170549a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
