package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fpf0 implements hpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f71842a;

    public fpf0(d850 d850Var) {
        this.f71842a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpf0) && wj50.m88271j(this.f71842a, ((fpf0) obj).f71842a);
    }

    public final int hashCode() {
        d850 d850Var = this.f71842a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
