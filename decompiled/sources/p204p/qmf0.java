package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qmf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f190216a;

    public qmf0(d850 d850Var) {
        this.f190216a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmf0) && wj50.m88271j(this.f190216a, ((qmf0) obj).f190216a);
    }

    public final int hashCode() {
        d850 d850Var = this.f190216a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
