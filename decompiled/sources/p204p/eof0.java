package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f61418a;

    public eof0(d850 d850Var) {
        this.f61418a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eof0) && wj50.m88271j(this.f61418a, ((eof0) obj).f61418a);
    }

    public final int hashCode() {
        d850 d850Var = this.f61418a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
