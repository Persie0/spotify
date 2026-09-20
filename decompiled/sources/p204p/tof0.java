package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tof0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f222252a;

    public tof0(d850 d850Var) {
        this.f222252a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tof0) && wj50.m88271j(this.f222252a, ((tof0) obj).f222252a);
    }

    public final int hashCode() {
        d850 d850Var = this.f222252a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
