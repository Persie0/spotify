package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f201249a;

    public rof0(d850 d850Var) {
        this.f201249a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rof0) && wj50.m88271j(this.f201249a, ((rof0) obj).f201249a);
    }

    public final int hashCode() {
        d850 d850Var = this.f201249a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
