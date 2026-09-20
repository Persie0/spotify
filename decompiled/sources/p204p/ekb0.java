package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ekb0 implements fkb0 {

    /* JADX INFO: renamed from: a */
    public final d850 f60422a;

    public ekb0(d850 d850Var) {
        this.f60422a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekb0) && wj50.m88271j(this.f60422a, ((ekb0) obj).f60422a);
    }

    public final int hashCode() {
        d850 d850Var = this.f60422a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
