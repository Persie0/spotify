package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mjo0 extends ujo0 {

    /* JADX INFO: renamed from: a */
    public final d850 f144298a;

    public mjo0(d850 d850Var) {
        this.f144298a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjo0) && wj50.m88271j(this.f144298a, ((mjo0) obj).f144298a);
    }

    public final int hashCode() {
        d850 d850Var = this.f144298a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
