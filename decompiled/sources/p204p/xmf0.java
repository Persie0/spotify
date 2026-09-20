package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xmf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f263359a;

    public xmf0(d850 d850Var) {
        this.f263359a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmf0) && wj50.m88271j(this.f263359a, ((xmf0) obj).f263359a);
    }

    public final int hashCode() {
        d850 d850Var = this.f263359a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
