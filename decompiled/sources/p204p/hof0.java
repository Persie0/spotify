package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f93529a;

    public hof0(d850 d850Var) {
        this.f93529a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hof0) && wj50.m88271j(this.f93529a, ((hof0) obj).f93529a);
    }

    public final int hashCode() {
        d850 d850Var = this.f93529a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
