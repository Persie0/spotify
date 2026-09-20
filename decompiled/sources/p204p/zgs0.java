package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final d850 f282705a;

    public zgs0(d850 d850Var) {
        this.f282705a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgs0) && wj50.m88271j(this.f282705a, ((zgs0) obj).f282705a);
    }

    public final int hashCode() {
        d850 d850Var = this.f282705a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
