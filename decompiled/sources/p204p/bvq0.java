package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final d850 f31418a;

    public bvq0(d850 d850Var) {
        this.f31418a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvq0) && wj50.m88271j(this.f31418a, ((bvq0) obj).f31418a);
    }

    public final int hashCode() {
        d850 d850Var = this.f31418a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
