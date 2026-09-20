package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class znf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f284487a;

    public znf0(d850 d850Var) {
        this.f284487a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znf0) && wj50.m88271j(this.f284487a, ((znf0) obj).f284487a);
    }

    public final int hashCode() {
        d850 d850Var = this.f284487a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
