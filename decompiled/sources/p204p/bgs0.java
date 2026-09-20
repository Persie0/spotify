package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final d850 f26994a;

    public bgs0(d850 d850Var) {
        this.f26994a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgs0) && wj50.m88271j(this.f26994a, ((bgs0) obj).f26994a);
    }

    public final int hashCode() {
        d850 d850Var = this.f26994a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
