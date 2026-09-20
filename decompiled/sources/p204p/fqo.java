package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fqo extends gqo {

    /* JADX INFO: renamed from: a */
    public final pzy0 f72241a;

    public fqo(pzy0 pzy0Var) {
        this.f72241a = pzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqo) && wj50.m88271j(this.f72241a, ((fqo) obj).f72241a);
    }

    public final int hashCode() {
        pzy0 pzy0Var = this.f72241a;
        if (pzy0Var == null) {
            return 0;
        }
        return pzy0Var.hashCode();
    }
}
