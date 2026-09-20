package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class koa0 extends loa0 {

    /* JADX INFO: renamed from: a */
    public final rma0 f124714a;

    public koa0(rma0 rma0Var) {
        this.f124714a = rma0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof koa0) && wj50.m88271j(this.f124714a, ((koa0) obj).f124714a);
    }

    public final int hashCode() {
        rma0 rma0Var = this.f124714a;
        if (rma0Var == null) {
            return 0;
        }
        return rma0Var.hashCode();
    }
}
