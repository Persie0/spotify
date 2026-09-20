package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class itq0 extends jjf1 {

    /* JADX INFO: renamed from: d */
    public final d850 f105672d;

    public itq0(d850 d850Var) {
        this.f105672d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itq0) && wj50.m88271j(this.f105672d, ((itq0) obj).f105672d);
    }

    public final int hashCode() {
        d850 d850Var = this.f105672d;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
