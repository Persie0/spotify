package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nvr0 extends bwr0 {

    /* JADX INFO: renamed from: a */
    public final d850 f158953a;

    public nvr0(d850 d850Var) {
        this.f158953a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvr0) && wj50.m88271j(this.f158953a, ((nvr0) obj).f158953a);
    }

    public final int hashCode() {
        d850 d850Var = this.f158953a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
