package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ehs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final d850 f59658a;

    public ehs0(d850 d850Var) {
        this.f59658a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehs0) && wj50.m88271j(this.f59658a, ((ehs0) obj).f59658a);
    }

    public final int hashCode() {
        d850 d850Var = this.f59658a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
