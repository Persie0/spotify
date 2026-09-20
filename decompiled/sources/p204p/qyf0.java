package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qyf0 implements tyf0 {

    /* JADX INFO: renamed from: a */
    public final d850 f193895a;

    public qyf0(d850 d850Var) {
        this.f193895a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qyf0) && wj50.m88271j(this.f193895a, ((qyf0) obj).f193895a);
    }

    public final int hashCode() {
        d850 d850Var = this.f193895a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
