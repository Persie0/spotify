package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xlf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f263140a;

    public xlf0(d850 d850Var) {
        this.f263140a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlf0) && wj50.m88271j(this.f263140a, ((xlf0) obj).f263140a);
    }

    public final int hashCode() {
        d850 d850Var = this.f263140a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
