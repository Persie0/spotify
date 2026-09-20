package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wa91 extends db91 {

    /* JADX INFO: renamed from: a */
    public final d850 f249421a;

    public wa91(d850 d850Var) {
        this.f249421a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa91) && wj50.m88271j(this.f249421a, ((wa91) obj).f249421a);
    }

    public final int hashCode() {
        d850 d850Var = this.f249421a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
